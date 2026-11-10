package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bg4 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ fg4 t;

    public /* synthetic */ bg4(fg4 fg4Var, byte b) {
        this.j = b;
        this.t = fg4Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        fg4 fg4Var = this.t;
        switch (b) {
            case 0:
                return Boolean.valueOf(fg4Var.h);
            default:
                cu1 cu1Var = fg4Var.a0;
                if (!cu1Var.j.h) {
                    return null;
                }
                xt1 xt1VarV0 = cu1Var.V0();
                if (!xt1VarV0.g()) {
                    return null;
                }
                if (xt1VarV0.y()) {
                    return cu1Var.T0(null);
                }
                cu1 cu1VarX = ((nt1) ((ba) k33.W(cu1Var)).getFocusOwner()).x();
                if (cu1VarX != null) {
                    return cu1VarX.T0(k33.U(cu1Var));
                }
                return null;
        }
    }
}
