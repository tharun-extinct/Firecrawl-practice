package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nx2 {
    public static final vf1 g = new vf1(new sx1((byte) 18), (byte) 0);

    public static final void g(final jd3 jd3Var, final boolean z, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        jd3Var.getClass();
        h02Var.Z(-469043077);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(jd3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(nm0Var) ? 256 : 128;
        }
        byte b = 1;
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zJ = ((i2 & 112) == 32) | h02Var.j(jd3Var);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zJ || objK == l76Var) {
                objK = new my1() { // from class: kx2
                    @Override // defpackage.my1
                    public final Object g() {
                        boolean z2 = z;
                        jd3 jd3Var2 = jd3Var;
                        if (z2) {
                            jd3Var2.n("devicesetup", new m92((byte) 9));
                        } else {
                            jd3Var2.n(te4.l.g, new m92((byte) 10));
                        }
                        return og5.g;
                    }
                };
                h02Var.i0(objK);
            }
            my1 my1VarR = kq2.R((my1) objK, h02Var);
            boolean zJ2 = h02Var.j(jd3Var);
            Object objK2 = h02Var.K();
            if (zJ2 || objK2 == l76Var) {
                objK2 = new lx2(jd3Var, (byte) 0);
                h02Var.i0(objK2);
            }
            xy1 xy1VarS = kq2.S((xy1) objK2, h02Var);
            boolean zJ3 = h02Var.j(jd3Var);
            Object objK3 = h02Var.K();
            if (zJ3 || objK3 == l76Var) {
                objK3 = new wn(jd3Var, (byte) 2);
                h02Var.i0(objK3);
            }
            og0.y(g.g(new nf3(my1VarR, xy1VarS, kq2.R((my1) objK3, h02Var))), ue5.m0(-394273477, new ws2(nm0Var, b), h02Var), h02Var, 56);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mx2(jd3Var, z, nm0Var, i);
        }
    }
}
