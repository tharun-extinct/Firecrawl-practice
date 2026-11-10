package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v45 {
    public static final String g = ay4.L("H", 10);

    public static long g(k85 k85Var, j51 j51Var, ku1 ku1Var) {
        gd gdVarY = y(k85Var, j51Var, ku1Var, 1, false);
        return (((long) js2.n(gdVarY.g.g())) << 32) | (((long) js2.n(gdVarY.x)) & 4294967295L);
    }

    public static final gd y(k85 k85Var, j51 j51Var, ku1 ku1Var, int i, boolean z) {
        String strQ0 = cj0.q0(xs2.K(0, i), "\n", null, null, new vy3((byte) 18), 30);
        pi1 pi1Var = pi1.j;
        return new gd(new kd(strQ0, k85Var, pi1Var, pi1Var, ku1Var, j51Var, z), i, 1, zs0.y(0, 0, 0, 0, 15));
    }
}
