package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nd1 {
    public static final md1 g;
    public static final md1 y;

    static {
        int i = 3;
        mu0 mu0Var = null;
        g = new md1(i, mu0Var, (byte) 0);
        y = new md1(i, mu0Var, (byte) 1);
    }

    public static final boolean g(um3 um3Var, float f) {
        if (um3Var == um3.t) {
            return f <= 30.0f;
        }
        return f > 30.0f && f <= 90.0f;
    }

    public static final void n(cd1 cd1Var, xc1 xc1Var) {
        dg6.n(cd1Var, new h((Object) xc1Var, (byte) 18));
    }

    public static final long r(long j) {
        return d06.g(Float.isNaN(vj5.n(j)) ? 0.0f : vj5.n(j), Float.isNaN(vj5.v(j)) ? 0.0f : vj5.v(j));
    }

    public static j73 y(j73 j73Var, qd1 qd1Var, um3 um3Var, boolean z, ja3 ja3Var, boolean z2, cz1 cz1Var, boolean z3, int i) {
        if ((i & 8) != 0) {
            ja3Var = null;
        }
        return j73Var.n(new jd1(qd1Var, um3Var, z, ja3Var, z2, g, cz1Var, (i & 128) != 0 ? false : z3));
    }
}
