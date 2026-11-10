package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g8 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ q8 t;

    public /* synthetic */ g8(q8 q8Var, byte b) {
        this.j = b;
        this.t = q8Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        q8 q8Var = this.t;
        switch (b) {
            case 0:
                return q8Var.y();
            default:
                return new fp3(q8Var.y(), q8Var.t.getValue());
        }
    }
}
