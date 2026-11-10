package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rk implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ga1 t;

    public /* synthetic */ rk(ga1 ga1Var, byte b) {
        this.j = b;
        this.t = ga1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        ga1 ga1Var = this.t;
        switch (b) {
            case 0:
                ga1Var.y.setValue(Boolean.FALSE);
                return og5.g;
            default:
                return Float.valueOf(ga1Var.g.d());
        }
    }
}
