package defpackage;

import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gb6 {
    public static ha2 l;
    public static final sj0 g = sj0.A;
    public static final in4 y = in4.i;
    public static final sj0 r = sj0.C;
    public static final float n = 0.38f;
    public static final float v = 6.0f;
    public static final float x = 1.0f;

    public static hb6 g(X509TrustManager x509TrustManager) {
        ys3 ys3Var = ys3.g;
        return ys3.g.r(x509TrustManager);
    }

    public static final wd3 y(xy1 xy1Var) {
        xd3 xd3Var = new xd3();
        xy1Var.a(xd3Var);
        boolean z = xd3Var.y;
        vd3 vd3Var = xd3Var.g;
        vd3Var.g = z;
        vd3Var.y = xd3Var.r;
        String str = xd3Var.v;
        if (str != null) {
            boolean z2 = xd3Var.x;
            boolean z3 = xd3Var.l;
            vd3Var.n = str;
            vd3Var.r = -1;
            vd3Var.v = z2;
            vd3Var.x = z3;
        } else {
            int i = xd3Var.n;
            boolean z4 = xd3Var.x;
            boolean z5 = xd3Var.l;
            vd3Var.r = i;
            vd3Var.n = null;
            vd3Var.v = z4;
            vd3Var.x = z5;
        }
        return vd3Var.g();
    }
}
