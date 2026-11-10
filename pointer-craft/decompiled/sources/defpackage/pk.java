package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pk implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ga1 t;

    public /* synthetic */ pk(ga1 ga1Var, byte b) {
        this.j = b;
        this.t = ga1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        ga1 ga1Var = this.t;
        switch (b) {
            case 0:
                return Boolean.valueOf(ga1Var.g.d() > 0.2f);
            case 1:
                return Boolean.valueOf(ga1Var.g.d() >= 1.0f);
            default:
                ga1Var.y.setValue(Boolean.FALSE);
                return og5.g;
        }
    }
}
