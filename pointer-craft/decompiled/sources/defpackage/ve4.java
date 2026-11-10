package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class ve4 extends bf4 {
    public static final ve4 l;

    static {
        ha2 ha2VarY = pw5.u;
        if (ha2VarY == null) {
            ga2 ga2Var = new ga2("Outlined.BuildCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            long j = jj0.y;
            cu4 cu4Var = new cu4(j);
            kq3 kq3VarJ = du4.j(12.0f, 2.0f);
            kq3VarJ.y(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            kq3VarJ.r(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
            kq3VarJ.m(10.0f, -4.48f, 10.0f, -10.0f);
            kq3VarJ.y(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
            kq3VarJ.g();
            kq3VarJ.j(12.0f, 20.0f);
            kq3VarJ.r(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
            kq3VarJ.r(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
            kq3VarJ.m(8.0f, 3.59f, 8.0f, 8.0f);
            kq3VarJ.y(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f);
            kq3VarJ.g();
            ga2.g(ga2Var, kq3VarJ.g, 1, cu4Var);
            cu4 cu4Var2 = new cu4(j);
            kq3 kq3VarJ2 = du4.j(13.49f, 11.38f);
            kq3VarJ2.r(0.43f, -1.22f, 0.17f, -2.64f, -0.81f, -3.62f);
            kq3VarJ2.r(-1.11f, -1.11f, -2.79f, -1.3f, -4.1f, -0.59f);
            kq3VarJ2.l(2.35f, 2.35f);
            kq3VarJ2.l(-1.41f, 1.41f);
            kq3VarJ2.x(7.17f, 8.58f);
            kq3VarJ2.r(-0.71f, 1.32f, -0.52f, 2.99f, 0.59f, 4.1f);
            kq3VarJ2.r(0.98f, 0.98f, 2.4f, 1.24f, 3.62f, 0.81f);
            kq3VarJ2.l(3.41f, 3.41f);
            kq3VarJ2.r(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
            kq3VarJ2.l(1.4f, -1.4f);
            kq3VarJ2.r(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
            kq3VarJ2.x(13.49f, 11.38f);
            kq3VarJ2.g();
            ga2.g(ga2Var, kq3VarJ2.g, 1, cu4Var2);
            ha2VarY = ga2Var.y();
            pw5.u = ha2VarY;
        }
        l = new ve4("layoutoverview", R.string.menu_manage_layouts, ha2VarY);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ve4);
    }

    public final int hashCode() {
        return -1165289670;
    }

    public final String toString() {
        return "LayoutOverview";
    }
}
