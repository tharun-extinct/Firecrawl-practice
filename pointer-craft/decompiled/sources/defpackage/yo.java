package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yo implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ tj3 t;

    public /* synthetic */ yo(tj3 tj3Var, byte b) {
        this.j = b;
        this.t = tj3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        tj3 tj3Var = this.t;
        switch (b) {
            case 0:
                tj3Var.y().g();
                return og5.g;
            default:
                return new rj3(tj3Var);
        }
    }
}
