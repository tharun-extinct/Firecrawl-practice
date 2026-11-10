package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vr0 {
    public static final ha3 g;

    static {
        c94 c94Var = wj0.v;
        int i = c94Var.r;
        sr0 sr0Var = new sr0(c94Var, c94Var, 1);
        int i2 = c94Var.r;
        ij3 ij3Var = wj0.k;
        int i3 = (ij3Var.r << 6) | i2;
        ur0 ur0Var = new ur0(c94Var, ij3Var, 0);
        int i4 = (i2 << 6) | ij3Var.r;
        ur0 ur0Var2 = new ur0(ij3Var, c94Var, 0);
        ha3 ha3Var = ie2.g;
        ha3 ha3Var2 = new ha3();
        ha3Var2.t(i | (i << 6), sr0Var);
        ha3Var2.t(i3, ur0Var);
        ha3Var2.t(i4, ur0Var2);
        g = ha3Var2;
    }
}
