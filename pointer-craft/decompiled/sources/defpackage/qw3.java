package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qw3 {
    public final String g;
    public final ox0 n;
    public final xy1 r;
    public final Object v = new Object();
    public volatile ow3 x;
    public final y22 y;

    public qw3(String str, y22 y22Var, xy1 xy1Var, ox0 ox0Var) {
        this.g = str;
        this.y = y22Var;
        this.r = xy1Var;
        this.n = ox0Var;
    }

    public final ow3 g(Object obj, ci2 ci2Var) {
        ow3 ow3Var;
        Context context = (Context) obj;
        context.getClass();
        ci2Var.getClass();
        ow3 ow3Var2 = this.x;
        if (ow3Var2 != null) {
            return ow3Var2;
        }
        synchronized (this.v) {
            try {
                if (this.x == null) {
                    Context applicationContext = context.getApplicationContext();
                    ux0 f73Var = this.y;
                    xy1 xy1Var = this.r;
                    applicationContext.getClass();
                    List list = (List) xy1Var.a(applicationContext);
                    ox0 ox0Var = this.n;
                    pw3 pw3Var = new pw3(applicationContext, this, (byte) 0);
                    list.getClass();
                    ao1 ao1Var = new ao1(d93.q, new p22(pw3Var, (byte) 1));
                    if (f73Var == null) {
                        f73Var = new f73((byte) 13);
                    }
                    this.x = new ow3(new ow3(new p01(ao1Var, pw5.k(new op((Object) list, (mu0) null, (byte) 5)), f73Var, ox0Var)));
                }
                ow3Var = this.x;
                ow3Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ow3Var;
    }
}
