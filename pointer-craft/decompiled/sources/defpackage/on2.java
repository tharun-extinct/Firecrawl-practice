package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class on2 implements my1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 m;
    public final /* synthetic */ gx3 t;

    public /* synthetic */ on2(gx3 gx3Var, boolean z, my1 my1Var, byte b) {
        this.j = b;
        this.t = gx3Var;
        this.a = z;
        this.m = my1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        my1 my1Var = this.m;
        boolean z = this.a;
        gx3 gx3Var = this.t;
        switch (b) {
            case 0:
                gx3Var.getClass();
                if (z && !gx3Var.g) {
                    gx3Var.n.l("layout_item", null);
                } else {
                    my1Var.g();
                }
                break;
            default:
                gx3Var.getClass();
                if (z && !gx3Var.g) {
                    gx3Var.n.l("layout_item_edit", null);
                } else {
                    my1Var.g();
                }
                break;
        }
        return og5Var;
    }
}
