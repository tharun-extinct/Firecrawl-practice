package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sn2 implements my1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ ob3 m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    public /* synthetic */ sn2(boolean z, xy1 xy1Var, ob3 ob3Var, ob3 ob3Var2) {
        this.j = (byte) 3;
        this.a = z;
        this.t = xy1Var;
        this.m = ob3Var;
        this.q = ob3Var2;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj = this.q;
        ob3 ob3Var = this.m;
        Object obj2 = this.t;
        boolean z = this.a;
        switch (b) {
            case 0:
                gx3 gx3Var = (gx3) obj2;
                my1 my1Var = (my1) obj;
                ob3Var.setValue(Boolean.FALSE);
                gx3Var.getClass();
                if (z && !gx3Var.g) {
                    gx3Var.n.l("layout_item_copy", null);
                } else {
                    my1Var.g();
                }
                break;
            case 1:
                gx3 gx3Var2 = (gx3) obj2;
                my1 my1Var2 = (my1) obj;
                ob3Var.setValue(Boolean.FALSE);
                gx3Var2.getClass();
                if (z && !gx3Var2.g) {
                    gx3Var2.n.l("layout_item_backup", null);
                } else {
                    my1Var2.g();
                }
                break;
            case 2:
                gx3 gx3Var3 = (gx3) obj2;
                my1 my1Var3 = (my1) obj;
                ob3Var.setValue(Boolean.FALSE);
                gx3Var3.getClass();
                if (z && !gx3Var3.g) {
                    gx3Var3.n.l("layout_item_delete", null);
                } else {
                    my1Var3.g();
                }
                break;
            default:
                xy1 xy1Var = (xy1) obj2;
                ob3 ob3Var2 = (ob3) obj;
                if (z && (((wn4) ob3Var.getValue()).y.length() <= 0 || ((wn4) ob3Var.getValue()).g.length() <= 0)) {
                    ob3Var2.setValue(Boolean.TRUE);
                } else {
                    xy1Var.a((wn4) ob3Var.getValue());
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ sn2(gx3 gx3Var, boolean z, ob3 ob3Var, my1 my1Var, byte b) {
        this.j = b;
        this.t = gx3Var;
        this.a = z;
        this.m = ob3Var;
        this.q = my1Var;
    }
}
