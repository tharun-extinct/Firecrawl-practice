package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j7 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ j51 t;

    public /* synthetic */ j7(j51 j51Var, byte b) {
        this.j = b;
        this.t = j51Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        float fE;
        byte b = this.j;
        j51 j51Var = this.t;
        switch (b) {
            case 0:
                fE = j51Var.e(125.0f);
                break;
            default:
                fE = j51Var.e(100.0f);
                break;
        }
        return Float.valueOf(fE);
    }
}
