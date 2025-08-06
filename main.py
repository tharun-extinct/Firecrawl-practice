from firecrawl import FirecrawlApp
#from pydantic import BaseModel
from typing import List
from openai import OpenAI
from dotenv import load_dotenv
import pandas as pd
import json
import os

# Load environment variables
load_dotenv()

# Initialize Firecrawl and OpenAI once
app = FirecrawlApp(api_key=os.getenv('FIRECRAWL_API_KEY'))
client = OpenAI()

# Fields to extract
fields = ["hotel_name", "hotel_location", "hotel_rating"]

# Prompt templates
system_prompt = "You are a helpful assistant. You receive a scraped webpage, and you extract the items and return them in valid JSON. You return a list with all fields."

# Store extracted items
items = []

# Range of pages to scrape
pages = range(1, 6)  # Pages 1 to 5



# Scrape multiple pages with progress reporting and error handling
for page in pages:
    url = f"https://www.python-unlimited.com/webscraping/hotels.php?page={page}"
    print(f"Scraping page {page}...")
    try:
        # Scrape page content
        page_content = app.scrape_url(
            url=url,
            params={
                "pageOptions": {
                    "onlyMainContent": True
                }
            }
        )

        # Build user prompt
        user_prompt = f"""
The extracted webpage: {page_content}
The fields you return: {fields}
"""

        # Extract structured data via OpenAI
        response = client.chat.completions.create(
            model="gpt-4o",
            temperature=0,
            messages=[
                {"role": "system", "content": system_prompt},
                {"role": "user", "content": user_prompt}
            ]
        )

        # Only handle streaming response
        content = ""
        for chunk in response:
            delta_content = getattr(getattr(chunk.choices[0], 'delta', None), 'content', None)
            if delta_content:
                content += delta_content
        if content:
            data = json.loads(content)
        else:
            print(f"[DEBUG] No content received from streaming response on page {page}.")
            data = []

        # Normalize structure if wrapped in a dict
        if isinstance(data, dict):
            keys = list(data.keys())
            if len(keys) == 1 and isinstance(data[keys[0]], list):
                data = data[keys[0]]

        # Add to item list
        if isinstance(data, list):
            items.extend(data)
        elif isinstance(data, dict):
            items.append(data)
        print(f"✅ Page {page} scraped. {len(items)} total records so far.")
    except Exception as e:
        print(f"❌ Error scraping page {page}: {e}")

# Save to Excel and CSV
df = pd.DataFrame(items)
df.to_excel("hotels.xlsx", index=False)
df.to_csv("hotels.csv", index=False)

print(f"✅ Scraping complete. {len(items)} records saved.")
