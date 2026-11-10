package defpackage;

import android.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e11 {
    public static final /* synthetic */ int n = 0;
    public final String g;
    public final long r;
    public final long y;

    public e11(long j, long j2, String str) {
        jr2.t(str);
        this.g = str;
        this.r = j;
        this.y = j2;
    }

    public static e11 g(String str) {
        jr2.m(str);
        Map mapN = yy5.n(str);
        long jN = n("iat", mapN);
        return new e11((n("exp", mapN) - jN) * 1000, jN * 1000, str);
    }

    public static long n(String str, Map map) {
        jr2.m(map);
        jr2.t(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public static e11 y(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new e11(jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"), jSONObject.getString("token"));
        } catch (JSONException e) {
            Log.e("e11", "Could not deserialize token: " + e.getMessage());
            return null;
        }
    }

    public final long r() {
        return this.y + this.r;
    }
}
