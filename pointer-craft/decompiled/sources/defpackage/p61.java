package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p61 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ss2 t;

    public /* synthetic */ p61(ss2 ss2Var, byte b) {
        this.j = b;
        this.t = ss2Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        ss2 ss2Var = this.t;
        switch (b) {
            case 0:
                return Boolean.valueOf(ss2Var.j() > 0 || ss2Var.t() > 0);
            default:
                return Boolean.valueOf(ss2Var.j() == 0);
        }
    }
}
