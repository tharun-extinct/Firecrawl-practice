package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cq5 {
    public static final ha3 g;
    public static final aq5[] y;

    static {
        ha3 ha3Var = new ha3(8);
        aq5.g.getClass();
        bq5 bq5Var = zp5.l;
        ha3Var.t(1, bq5Var);
        bq5 bq5Var2 = zp5.x;
        ha3Var.t(2, bq5Var2);
        bq5 bq5Var3 = zp5.y;
        ha3Var.t(4, bq5Var3);
        bq5 bq5Var4 = zp5.n;
        ha3Var.t(8, bq5Var4);
        bq5 bq5Var5 = zp5.j;
        ha3Var.t(16, bq5Var5);
        bq5 bq5Var6 = zp5.v;
        ha3Var.t(32, bq5Var6);
        bq5 bq5Var7 = zp5.t;
        ha3Var.t(64, bq5Var7);
        bq5 bq5Var8 = zp5.r;
        ha3Var.t(128, bq5Var8);
        g = ha3Var;
        y = new aq5[]{bq5Var, bq5Var2, bq5Var3, bq5Var7, bq5Var5, bq5Var6, bq5Var4, zp5.a, bq5Var8};
    }

    public static final void g(xy2 xy2Var, tc2 tc2Var, long j, int i, int i2) {
        if (xq2.m(j, -1L)) {
            return;
        }
        xy2Var.r(tc2Var.y, (int) ((j >>> 48) & 65535));
        xy2Var.r(tc2Var.r, (int) ((j >>> 32) & 65535));
        xy2Var.r(tc2Var.n, i - ((int) ((j >>> 16) & 65535)));
        xy2Var.r(tc2Var.v, i2 - ((int) (j & 65535)));
    }
}
