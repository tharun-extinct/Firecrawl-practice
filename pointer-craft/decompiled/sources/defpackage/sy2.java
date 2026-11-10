package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sy2 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ r45 t;

    public /* synthetic */ sy2(r45 r45Var, byte b) {
        this.j = b;
        this.t = r45Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        r45 r45Var = this.t;
        switch (b) {
            case 0:
                r45Var.g();
                break;
            default:
                r45Var.onCancel();
                break;
        }
        return og5Var;
    }
}
