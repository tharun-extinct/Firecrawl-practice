package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ln2 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ qp3 t;

    public /* synthetic */ ln2(qp3 qp3Var, byte b) {
        this.j = b;
        this.t = qp3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        qp3 qp3Var = this.t;
        switch (b) {
            case 0:
                qp3Var.e(0);
                break;
            case 1:
                qp3Var.e(1);
                break;
            default:
                qp3Var.e(-1);
                break;
        }
        return og5Var;
    }
}
