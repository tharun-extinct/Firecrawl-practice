package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class eu3 {
    public final String g;
    public final Executor n;
    public final cp1 r;
    public final Executor v;
    public final m84 x;
    public final ft5 y;

    public eu3(ro1 ro1Var, Executor executor, Executor executor2) {
        ro1Var.g();
        String str = ro1Var.r.v;
        ro1Var.g();
        ft5 ft5VarY = be2.y(ro1Var.g);
        cp1 cp1Var = new cp1(ro1Var);
        m84 m84Var = new m84();
        this.g = str;
        this.y = ft5VarY;
        this.r = cp1Var;
        this.n = executor;
        this.v = executor2;
        this.x = m84Var;
    }

    public final nj6 g(final boolean z) {
        nj6 nj6VarX = br2.x(this.v, new y11(this, new t32((byte) 21)));
        gc0 gc0Var = new gc0((Object) this, (byte) 6);
        Executor executor = this.n;
        return nj6VarX.a(executor, gc0Var).a(executor, new vy4() { // from class: cu3
            @Override // defpackage.vy4
            public final nj6 a(Object obj) {
                final b20 b20Var = new b20((Object) ((mt5) obj).g, z);
                final eu3 eu3Var = this.j;
                return br2.x(eu3Var.v, new Callable() { // from class: du3
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws JSONException, yo1, UnsupportedEncodingException {
                        eu3 eu3Var2 = eu3Var;
                        cp1 cp1Var = eu3Var2.r;
                        JSONObject jSONObject = new JSONObject();
                        b20 b20Var2 = b20Var;
                        jSONObject.put("playIntegrityToken", (String) b20Var2.g);
                        if (b20Var2.y) {
                            jSONObject.put("limited_use", true);
                        }
                        byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                        m84 m84Var = eu3Var2.x;
                        if (m84Var.y > System.currentTimeMillis()) {
                            throw new yo1("Too many attempts.");
                        }
                        String str = (String) cp1Var.n;
                        String str2 = (String) cp1Var.r;
                        String str3 = (String) cp1Var.y;
                        StringBuilder sbZ = du4.z("https://firebaseappcheck.googleapis.com/v1/projects/", str, "/apps/", str2, ":exchangePlayIntegrityToken?key=");
                        sbZ.append(str3);
                        JSONObject jSONObject2 = new JSONObject(cp1Var.a(new URL(sbZ.toString()), bytes, m84Var, true));
                        String strOptString = jSONObject2.optString("token");
                        int i = sx4.g;
                        if (TextUtils.isEmpty(strOptString)) {
                            strOptString = null;
                        }
                        String strOptString2 = jSONObject2.optString("ttl");
                        String str4 = TextUtils.isEmpty(strOptString2) ? null : strOptString2;
                        if (strOptString == null || str4 == null) {
                            throw new yo1("Unexpected server response.");
                        }
                        ok okVar = new ok();
                        okVar.g = strOptString;
                        okVar.y = str4;
                        return okVar;
                    }
                });
            }
        }).a(executor, new up((byte) 14));
    }
}
