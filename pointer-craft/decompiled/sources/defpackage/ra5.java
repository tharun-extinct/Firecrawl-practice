package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ra5 {
    public static final float g;

    static {
        k33.m(16.0f, 8.0f);
        g = 200.0f;
    }

    public static wa5 g(int i, h02 h02Var) {
        bo3 bo3Var = ua5.g;
        int iV = ((j51) h02Var.a(hp0.j)).V(4.0f);
        boolean zN = h02Var.n(iV);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !h02Var.n(1)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = zN | z;
        Object objK = h02Var.K();
        if (z2 || objK == oo0.g) {
            objK = new wa5(iV);
            h02Var.i0(objK);
        }
        return (wa5) objK;
    }
}
