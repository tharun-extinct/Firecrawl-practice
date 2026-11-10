package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y61 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ xy1 t;

    public /* synthetic */ y61(xy1 xy1Var) {
        this.j = (byte) 2;
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
                return og5Var;
            case 1:
                xy1Var.a(null);
                return og5Var;
            default:
                return new we1(xe1.j, xy1Var);
        }
    }

    public /* synthetic */ y61(xy1 xy1Var, byte b) {
        this.j = b;
        this.t = xy1Var;
    }
}
