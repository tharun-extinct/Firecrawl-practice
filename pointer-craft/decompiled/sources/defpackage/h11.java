package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h11 {
    public static final h11 g = new h11();

    public final void g(ty tyVar, h02 h02Var, int i) {
        h02Var.Z(1565826668);
        int i2 = (h02Var.x(tyVar) ? 4 : 2) | i;
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            tg6.g((my1) tyVar.t, (o91) tyVar.m, ue5.m0(1163527043, new g11(tyVar, b), h02Var), h02Var, 384);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ta((byte) 10, i, this, tyVar);
        }
    }
}
