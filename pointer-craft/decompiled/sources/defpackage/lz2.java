package defpackage;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lz2 {
    public long g;
    public final Object r;
    public final Object y;

    public lz2() {
        this.y = new xj5();
        this.r = new xj5();
    }

    public static lz2 n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new lz2(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new lz2(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String y(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public void g(long j, long j2) {
        ((xj5) this.y).g(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((xj5) this.r).g(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public boolean r(String str) {
        return System.currentTimeMillis() > this.g + 604800000 || !str.equals((String) this.r);
    }

    public lz2(String str, String str2, long j) {
        this.y = str;
        this.r = str2;
        this.g = j;
    }
}
