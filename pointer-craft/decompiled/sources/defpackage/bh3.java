package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bh3 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ gh3 t;

    public /* synthetic */ bh3(gh3 gh3Var, byte b) {
        this.j = b;
        this.t = gh3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        gh3 gh3Var = this.t;
        switch (b) {
            case 0:
                nb0 nb0Var = gh3Var.W;
                nb0Var.getClass();
                gh3Var.S0(nb0Var, gh3Var.V);
                break;
            default:
                gh3 gh3Var2 = gh3Var.D;
                if (gh3Var2 != null) {
                    gh3Var2.g1();
                }
                break;
        }
        return og5Var;
    }
}
