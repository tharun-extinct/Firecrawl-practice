package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mm1 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ xy1 t;

    public /* synthetic */ mm1(xy1 xy1Var, byte b) {
        this.j = b;
        this.t = xy1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        xy1 xy1Var = this.t;
        switch (b) {
            case 0:
                xy1Var.a(Boolean.FALSE);
                break;
            case 1:
                xy1Var.a("en-t-k0-windows");
                break;
            default:
                xy1Var.a(Boolean.FALSE);
                break;
        }
        return og5Var;
    }
}
