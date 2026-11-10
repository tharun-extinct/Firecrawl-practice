package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class jz3 {
    public final ArrayList a;
    public final String g;
    public final String j;
    public final String l;
    public final String n;
    public final String r;
    public final ArrayList t;
    public final String v;
    public final String x;
    public final JSONObject y;

    public jz3(String str) {
        this.g = str;
        JSONObject jSONObject = new JSONObject(str);
        this.y = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.r = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.n = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            l0.u("Product id cannot be empty.");
            throw null;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            l0.u("Product type cannot be empty.");
            throw null;
        }
        this.v = jSONObject.optString("title");
        jSONObject.optString("name");
        this.x = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.l = jSONObject.optString("skuDetailsToken");
        this.j = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new iz3(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.t = arrayList;
        } else {
            this.t = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.y.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.y.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new gz3(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.a = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.a = null;
        } else {
            arrayList2.add(new gz3(jSONObjectOptJSONObject));
            this.a = arrayList2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jz3) {
            return TextUtils.equals(this.g, ((jz3) obj).g);
        }
        return false;
    }

    public final gz3 g() {
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (gz3) arrayList.get(0);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        String string = this.y.toString();
        String strValueOf = String.valueOf(this.t);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        du4.B(sb, this.g, "', parsedJson=", string, ", productId='");
        sb.append(this.r);
        sb.append("', productType='");
        sb.append(this.n);
        sb.append("', title='");
        sb.append(this.v);
        sb.append("', productDetailsToken='");
        sb.append(this.l);
        sb.append("', subscriptionOfferDetails=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
