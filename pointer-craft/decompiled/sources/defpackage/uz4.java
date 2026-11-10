package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class uz4 {
    public static final vf1 g = new vf1(new lc3((byte) 13), (byte) 0);

    public static final void g(j73 j73Var, cn4 cn4Var, long j, long j2, float f, float f2, z40 z40Var, bz1 bz1Var, h02 h02Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j73Var = g73.g;
        }
        if ((i2 & 2) != 0) {
            cn4Var = yf2.b;
        }
        if ((i2 & 4) != 0) {
            j = ((rj0) h02Var.a(tj0.g)).b;
        }
        if ((i2 & 8) != 0) {
            j2 = tj0.y(j, h02Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            z40Var = null;
        }
        vf1 vf1Var = g;
        float f3 = f + ((vb1) h02Var.a(vf1Var)).j;
        og0.r(new m14[]{du4.t(j2, mt0.g), vf1Var.g(new vb1(f3))}, ue5.m0(421772006, new qz4(j73Var, cn4Var, j, f3, z40Var, f2, bz1Var), h02Var), h02Var, 56);
    }

    public static final void n(my1 my1Var, j73 j73Var, boolean z, cn4 cn4Var, long j, long j2, float f, float f2, z40 z40Var, ja3 ja3Var, nm0 nm0Var, h02 h02Var, int i, int i2) {
        j73 j73Var2 = (i2 & 2) != 0 ? g73.g : j73Var;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        long j3 = (i2 & 16) != 0 ? ((rj0) h02Var.a(tj0.g)).b : j;
        long jY = (i2 & 32) != 0 ? tj0.y(j3, h02Var) : j2;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        float f4 = (i2 & 128) != 0 ? 0.0f : f2;
        z40 z40Var2 = (i2 & 256) != 0 ? null : z40Var;
        ja3 ja3Var2 = (i2 & 512) == 0 ? ja3Var : null;
        if (ja3Var2 == null) {
            h02Var.X(-1701037204);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = du4.n(h02Var);
            }
            ja3Var2 = (ja3) objK;
        } else {
            h02Var.X(2023337163);
        }
        h02Var.b(false);
        ja3 ja3Var3 = ja3Var2;
        vf1 vf1Var = g;
        float f5 = ((vb1) h02Var.a(vf1Var)).j + f3;
        og0.r(new m14[]{du4.t(jY, mt0.g), vf1Var.g(new vb1(f5))}, ue5.m0(849208527, new rz4(j73Var2, cn4Var, j3, f5, z40Var2, ja3Var3, z2, my1Var, f4, nm0Var), h02Var), h02Var, 56);
    }

    public static final void r(boolean z, xy1 xy1Var, j73 j73Var, boolean z2, cn4 cn4Var, long j, long j2, z40 z40Var, ja3 ja3Var, nm0 nm0Var, h02 h02Var, int i) {
        ja3 ja3Var2;
        if (ja3Var == null) {
            h02Var.X(643421417);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = du4.n(h02Var);
            }
            h02Var.b(false);
            ja3Var2 = (ja3) objK;
        } else {
            h02Var.X(-533434450);
            h02Var.b(false);
            ja3Var2 = ja3Var;
        }
        vf1 vf1Var = g;
        float f = ((vb1) h02Var.a(vf1Var)).j + 0.0f;
        og0.r(new m14[]{du4.t(j2, mt0.g), vf1Var.g(new vb1(f))}, ue5.m0(-1839065134, new tz4(j73Var, cn4Var, j, f, z40Var, z, ja3Var2, z2, xy1Var, nm0Var), h02Var), h02Var, 56);
    }

    public static final j73 v(j73 j73Var, cn4 cn4Var, long j, z40 z40Var, float f) {
        cn4 cn4Var2;
        j73 j73VarN;
        j73 y40Var = g73.g;
        if (f > 0.0f) {
            cn4Var2 = cn4Var;
            j73VarN = yf2.N(y40Var, 0.0f, 0.0f, 0.0f, f, cn4Var2, 124895);
        } else {
            cn4Var2 = cn4Var;
            j73VarN = y40Var;
        }
        j73 j73VarN2 = j73Var.n(j73VarN);
        if (z40Var != null) {
            y40Var = new y40(z40Var.g, z40Var.y, cn4Var2);
        }
        return y94.h(og0.a(j73VarN2.n(y40Var), j, cn4Var2), cn4Var2);
    }

    public static final long x(long j, float f, h02 h02Var) {
        rj0 rj0Var = (rj0) h02Var.a(tj0.g);
        boolean zBooleanValue = ((Boolean) h02Var.a(tj0.y)).booleanValue();
        long j2 = rj0Var.b;
        int i = jj0.t;
        if (tf5.g(j, j2) && zBooleanValue) {
            return vb1.y(f, 0.0f) ? j2 : ra.c(jj0.y(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, rj0Var.z), j2);
        }
        return j;
    }

    public static final void y(boolean z, my1 my1Var, j73 j73Var, boolean z2, cn4 cn4Var, long j, float f, z40 z40Var, ja3 ja3Var, nm0 nm0Var, h02 h02Var, int i, int i2) {
        ja3 ja3Var2;
        boolean z3 = (i2 & 8) != 0 ? true : z2;
        long jY = tj0.y(j, h02Var);
        float f2 = (i2 & 256) != 0 ? 0.0f : f;
        z40 z40Var2 = (i2 & 512) != 0 ? null : z40Var;
        if (ja3Var == null) {
            h02Var.X(1528143336);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = du4.n(h02Var);
            }
            h02Var.b(false);
            ja3Var2 = (ja3) objK;
        } else {
            h02Var.X(-227800369);
            h02Var.b(false);
            ja3Var2 = ja3Var;
        }
        vf1 vf1Var = g;
        float f3 = ((vb1) h02Var.a(vf1Var)).j + 0.0f;
        og0.r(new m14[]{du4.t(jY, mt0.g), vf1Var.g(new vb1(f3))}, ue5.m0(1508735219, new sz4(j73Var, cn4Var, j, f3, z40Var2, z, ja3Var2, z3, my1Var, f2, nm0Var), h02Var), h02Var, 56);
    }
}
