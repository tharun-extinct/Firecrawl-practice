package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zb5 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ nc5 t;

    public /* synthetic */ zb5(nc5 nc5Var, byte b) {
        this.j = b;
        this.t = nc5Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        nc5 nc5Var = this.t;
        switch (b) {
            case 0:
                return Boolean.valueOf((yf2.p(nc5Var.n.getValue(), nc5Var.g.n()) && nc5Var.j.d() == Long.MIN_VALUE && !((Boolean) nc5Var.t.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(nc5Var.y());
        }
    }
}
