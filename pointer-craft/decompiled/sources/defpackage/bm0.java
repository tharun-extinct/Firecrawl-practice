package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bm0 implements my1 {
    public final /* synthetic */ ob3 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 t;

    public /* synthetic */ bm0(my1 my1Var, ob3 ob3Var, byte b) {
        this.j = b;
        this.t = my1Var;
        this.a = ob3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.a;
        my1 my1Var = this.t;
        switch (b) {
            case 0:
                my1Var.g();
                ob3Var.setValue(Boolean.FALSE);
                break;
            case 1:
                my1Var.g();
                ob3Var.setValue(Boolean.FALSE);
                break;
            case 2:
                my1Var.g();
                ob3Var.setValue(Boolean.FALSE);
                break;
            case 3:
                ob3Var.setValue(Boolean.FALSE);
                my1Var.g();
                break;
            default:
                ob3Var.setValue(Boolean.FALSE);
                my1Var.g();
                break;
        }
        return og5Var;
    }
}
