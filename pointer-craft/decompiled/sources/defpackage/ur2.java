package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ur2 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ss2 t;

    public /* synthetic */ ur2(ss2 ss2Var, byte b) {
        this.j = b;
        this.t = ss2Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        int i;
        byte b = this.j;
        ss2 ss2Var = this.t;
        switch (b) {
            case 0:
                i = ss2Var.a().i;
                break;
            default:
                i = ((ls2) ss2Var.x.getValue()).m;
                break;
        }
        return Integer.valueOf(i);
    }
}
