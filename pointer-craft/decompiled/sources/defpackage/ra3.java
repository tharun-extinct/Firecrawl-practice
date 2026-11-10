package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra3 implements xy1 {
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ cb3 t;

    public /* synthetic */ ra3(cb3 cb3Var) {
        this.t = cb3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        cb3 cb3Var = this.t;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                cb3Var.n.setValue(cb3Var.r());
                return og5.g;
            default:
                ((wa1) obj).getClass();
                return new fc(cb3Var);
        }
    }

    public /* synthetic */ ra3(cb3 cb3Var, x03 x03Var) {
        this.t = cb3Var;
    }
}
