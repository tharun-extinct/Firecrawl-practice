package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class xe4 extends bf4 {
    public static final xe4 l;

    static {
        ha2 ha2VarY = xs2.g;
        if (ha2VarY == null) {
            ga2 ga2Var = new ga2("Outlined.LiveTv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = fj5.g;
            cu4 cu4Var = new cu4(jj0.y);
            kq3 kq3Var = new kq3();
            kq3Var.j(9.0f, 10.0f);
            kq3Var.w(8.0f);
            kq3Var.l(7.0f, -4.0f);
            kq3Var.g();
            kq3Var.j(21.0f, 6.0f);
            kq3Var.v(-7.58f);
            kq3Var.l(3.29f, -3.29f);
            kq3Var.x(16.0f, 2.0f);
            kq3Var.l(-4.0f, 4.0f);
            kq3Var.v(-0.03f);
            kq3Var.l(-4.0f, -4.0f);
            kq3Var.l(-0.69f, 0.71f);
            kq3Var.x(10.56f, 6.0f);
            kq3Var.x(3.0f, 6.0f);
            kq3Var.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            kq3Var.w(12.0f);
            kq3Var.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            kq3Var.v(18.0f);
            kq3Var.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            kq3Var.x(23.0f, 8.0f);
            kq3Var.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            kq3Var.g();
            kq3Var.j(21.0f, 20.0f);
            kq3Var.x(3.0f, 20.0f);
            kq3Var.x(3.0f, 8.0f);
            kq3Var.v(18.0f);
            kq3Var.w(12.0f);
            kq3Var.g();
            ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
            ha2VarY = ga2Var.y();
            xs2.g = ha2VarY;
        }
        l = new xe4("multimedia", R.string.control_multimedia, ha2VarY, true, pw5.d(xl4.q, xl4.w, xl4.c), 16);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xe4);
    }

    public final int hashCode() {
        return -1990566334;
    }

    public final String toString() {
        return "Multimedia";
    }
}
