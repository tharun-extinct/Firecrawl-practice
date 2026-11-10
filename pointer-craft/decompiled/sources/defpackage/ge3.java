package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ge3 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ qp3 t;

    public /* synthetic */ ge3(qp3 qp3Var, byte b) {
        this.j = b;
        this.t = qp3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        qp3 qp3Var = this.t;
        switch (b) {
            case 0:
                qp3Var.e((int) (((qe2) obj).g >> 32));
                break;
            default:
                qp3Var.e(((Integer) obj).intValue());
                break;
        }
        return og5Var;
    }
}
