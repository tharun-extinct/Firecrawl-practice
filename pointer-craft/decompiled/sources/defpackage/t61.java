package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t61 implements my1 {
    public final /* synthetic */ g61 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ xy1 t;

    public /* synthetic */ t61(g61 g61Var, xy1 xy1Var) {
        this.j = (byte) 3;
        this.a = g61Var;
        this.t = xy1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        xy1 xy1Var = this.t;
        g61 g61Var = this.a;
        switch (b) {
            case 0:
                xy1Var.a(g61Var.t);
                break;
            case 1:
                xy1Var.a(g61Var.t);
                break;
            case 2:
                xy1Var.a(g61Var.t);
                break;
            default:
                if (g61Var != null) {
                    xy1Var.a(g61Var);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ t61(xy1 xy1Var, g61 g61Var, byte b) {
        this.j = b;
        this.t = xy1Var;
        this.a = g61Var;
    }
}
