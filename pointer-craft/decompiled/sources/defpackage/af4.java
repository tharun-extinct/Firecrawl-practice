package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class af4 extends bf4 {
    public static final af4 l;

    static {
        ha2 ha2VarY = ue5.z;
        if (ha2VarY == null) {
            ga2 ga2Var = new ga2("Outlined.CoPresent", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = fj5.g;
            long j = jj0.y;
            cu4 cu4Var = new cu4(j);
            kq3 kq3Var = new kq3();
            kq3Var.j(21.0f, 3.0f);
            kq3Var.n(3.0f);
            kq3Var.y(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f);
            kq3Var.w(8.0f);
            kq3Var.v(2.0f);
            kq3Var.q(5.0f);
            kq3Var.v(18.0f);
            kq3Var.w(16.0f);
            kq3Var.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            kq3Var.q(5.0f);
            kq3Var.y(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f);
            kq3Var.g();
            ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
            cu4 cu4Var2 = new cu4(j);
            kq3 kq3VarJ = du4.j(13.0f, 10.0f);
            kq3VarJ.r(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
            kq3VarJ.m(-4.0f, 1.79f, -4.0f, 4.0f);
            kq3VarJ.r(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
            kq3VarJ.a(13.0f, 12.21f, 13.0f, 10.0f);
            kq3VarJ.g();
            kq3VarJ.j(7.0f, 10.0f);
            kq3VarJ.r(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
            kq3VarJ.m(2.0f, 0.9f, 2.0f, 2.0f);
            kq3VarJ.r(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
            kq3VarJ.a(7.0f, 11.1f, 7.0f, 10.0f);
            kq3VarJ.g();
            ga2.g(ga2Var, kq3VarJ.g, 0, cu4Var2);
            cu4 cu4Var3 = new cu4(j);
            kq3 kq3VarJ2 = du4.j(15.39f, 16.56f);
            kq3VarJ2.y(13.71f, 15.7f, 11.53f, 15.0f, 9.0f, 15.0f);
            kq3VarJ2.r(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
            kq3VarJ2.y(1.61f, 17.07f, 1.0f, 18.1f, 1.0f, 19.22f);
            kq3VarJ2.q(22.0f);
            kq3VarJ2.v(16.0f);
            kq3VarJ2.w(-2.78f);
            kq3VarJ2.y(17.0f, 18.1f, 16.39f, 17.07f, 15.39f, 16.56f);
            kq3VarJ2.g();
            kq3VarJ2.j(15.0f, 20.0f);
            kq3VarJ2.n(3.0f);
            kq3VarJ2.r(0.0f, -0.72f, -0.1f, -1.34f, 0.52f, -1.66f);
            kq3VarJ2.y(4.71f, 17.73f, 6.63f, 17.0f, 9.0f, 17.0f);
            kq3VarJ2.r(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f);
            kq3VarJ2.y(15.11f, 18.66f, 15.0f, 19.29f, 15.0f, 20.0f);
            kq3VarJ2.g();
            ga2.g(ga2Var, kq3VarJ2.g, 0, cu4Var3);
            ha2VarY = ga2Var.y();
            ue5.z = ha2VarY;
        }
        l = new af4("presenter", R.string.control_presenter, ha2VarY, true, pw5.d(xl4.q, xl4.w, xl4.c), 16);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof af4);
    }

    public final int hashCode() {
        return -472678447;
    }

    public final String toString() {
        return "Presenter";
    }
}
