package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p83 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ m70 t;

    public /* synthetic */ p83(m70 m70Var, byte b) {
        this.j = b;
        this.t = m70Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        m70 m70Var = this.t;
        switch (b) {
            case 0:
                return (q83) ld0.g(m70Var.p());
            default:
                return (lb5) ld0.g(m70Var.p());
        }
    }
}
