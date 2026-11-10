package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ff6 {
    public static ha2 g;

    public static final ha2 g() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.SaveAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(19.0f, 12.0f);
        kq3Var.w(7.0f);
        kq3Var.x(5.0f, 19.0f);
        kq3Var.w(-7.0f);
        kq3Var.x(3.0f, 12.0f);
        kq3Var.w(7.0f);
        kq3Var.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kq3Var.v(14.0f);
        kq3Var.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kq3Var.w(-7.0f);
        kq3Var.v(-2.0f);
        kq3Var.g();
        kq3Var.j(13.0f, 12.67f);
        kq3Var.l(2.59f, -2.58f);
        kq3Var.x(17.0f, 11.5f);
        kq3Var.l(-5.0f, 5.0f);
        kq3Var.l(-5.0f, -5.0f);
        kq3Var.l(1.41f, -1.41f);
        kq3Var.x(11.0f, 12.67f);
        kq3Var.x(11.0f, 3.0f);
        kq3Var.v(2.0f);
        kq3Var.w(9.67f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static final long r(long j, long j2) {
        int iN;
        int iX = u75.x(j);
        int iV = u75.v(j);
        if ((u75.x(j2) < u75.v(j)) && (u75.x(j) < u75.v(j2))) {
            if ((u75.x(j2) <= u75.x(j)) && (u75.v(j) <= u75.v(j2))) {
                iX = u75.x(j2);
                iV = iX;
            } else {
                if ((u75.x(j) <= u75.x(j2)) && (u75.v(j2) <= u75.v(j))) {
                    iN = u75.n(j2);
                } else {
                    int iX2 = u75.x(j2);
                    if (iX >= u75.v(j2) || iX2 > iX) {
                        iV = u75.x(j2);
                    } else {
                        iX = u75.x(j2);
                        iN = u75.n(j2);
                    }
                }
                iV -= iN;
            }
        } else if (iV > u75.x(j2)) {
            iX -= u75.n(j2);
            iN = u75.n(j2);
            iV -= iN;
        }
        return sp2.y(iX, iV);
    }

    public static final j73 y(j73 j73Var, boolean z, ja3 ja3Var, m94 m94Var, boolean z2, o94 o94Var, xy1 xy1Var) {
        j73 j73VarN;
        if (m94Var != null) {
            j73VarN = new y95(z, ja3Var, m94Var, z2, o94Var, xy1Var);
        } else if (m94Var == null) {
            j73VarN = new y95(z, ja3Var, null, z2, o94Var, xy1Var);
        } else {
            g73 g73Var = g73.g;
            j73VarN = ja3Var != null ? db2.g(g73Var, ja3Var, m94Var).n(new y95(z, ja3Var, null, z2, o94Var, xy1Var)) : m50.F(g73Var, new di4(m94Var, z, z2, o94Var, xy1Var, (byte) 1));
        }
        return j73Var.n(j73VarN);
    }
}
