package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ig5 {
    public final String g;
    public final int n;
    public final String r;
    public final String y;

    public ig5(String str) {
        this.g = str;
        JSONObject jSONObject = new JSONObject(str);
        this.y = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.r = strOptString;
        this.n = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            l0.u("Product type cannot be empty.");
            throw null;
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ig5) {
            return TextUtils.equals(this.g, ((ig5) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.y);
        sb.append("', productType='");
        sb.append(this.r);
        sb.append("', statusCode=");
        return xi3.m(sb, this.n, "}");
    }
}
