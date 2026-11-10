package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hu0 {
    public final st4 g = new st4();

    public static void y(hu0 hu0Var, bz1 bz1Var, nm0 nm0Var, my1 my1Var, int i) {
        if ((i & 8) != 0) {
            nm0Var = null;
        }
        hu0Var.g.add(new nm0(-1789283891, true, new cv0(bz1Var, hu0Var, nm0Var, my1Var)));
    }

    public final void g(gu0 gu0Var, h02 h02Var, int i) {
        h02Var.Z(-798501095);
        int i2 = (h02Var.x(gu0Var) ? 4 : 2) | i | (h02Var.x(this) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            st4 st4Var = this.g;
            int size = st4Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((cz1) st4Var.get(i3)).x(gu0Var, h02Var, Integer.valueOf(i2 & 14));
            }
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ta((byte) 9, i, this, gu0Var);
        }
    }
}
