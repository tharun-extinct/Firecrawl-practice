package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class j33 {
    public static final vf1 g = new vf1(new sx1((byte) 22), (byte) 1);

    public static final void g(rj0 rj0Var, e83 e83Var, un4 un4Var, mf5 mf5Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(904511636);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (h02Var.x(rj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(e83Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.x(un4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.x(mf5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.j(nm0Var) ? 16384 : 8192;
        }
        if (h02Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            h02Var.S();
            if ((i & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
            }
            h02Var.s();
            m94 m94VarG = k94.g(0.0f, 7, 0L, false);
            long j = rj0Var.g;
            boolean zV = h02Var.v(j);
            Object objK = h02Var.K();
            if (zV || objK == oo0.g) {
                objK = new x75(j, jj0.y(0.4f, j));
                h02Var.i0(objK);
            }
            og0.r(new m14[]{tj0.g.g(rj0Var), g.g(e83Var), db2.g.g(m94VarG), vn4.g.g(un4Var), y75.g.g((x75) objK), of5.g.g(mf5Var)}, ue5.m0(-1750539308, new m90(mf5Var, nm0Var, b), h02Var), h02Var, 56);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new cc(rj0Var, e83Var, un4Var, mf5Var, nm0Var, i, (byte) 1);
        }
    }

    public static final void y(rj0 rj0Var, un4 un4Var, mf5 mf5Var, nm0 nm0Var, h02 h02Var, int i) {
        h02Var.Z(-449719819);
        int i2 = (h02Var.x(rj0Var) ? 4 : 2) | i | (h02Var.x(un4Var) ? 32 : 16) | (h02Var.x(mf5Var) ? 256 : 128);
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            h02Var.S();
            if ((i & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
            }
            h02Var.s();
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            g(rj0Var, (e83) h02Var.a(g), un4Var, mf5Var, nm0Var, h02Var, (i4 & 7168) | i3 | (i4 & 896) | 24576);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new k71(rj0Var, un4Var, mf5Var, nm0Var, i, (byte) 3);
        }
    }
}
