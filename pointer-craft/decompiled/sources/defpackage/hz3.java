package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hz3 {
    public final String g;
    public final String n;
    public final String r;
    public final long y;

    public hz3(JSONObject jSONObject) {
        this.n = jSONObject.optString("billingPeriod");
        this.r = jSONObject.optString("priceCurrencyCode");
        this.g = jSONObject.optString("formattedPrice");
        this.y = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
