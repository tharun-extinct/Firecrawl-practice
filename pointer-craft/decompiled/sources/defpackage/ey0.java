package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey0 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ nc5 t;

    public /* synthetic */ ey0(nc5 nc5Var, byte b) {
        this.j = b;
        this.t = nc5Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        nc5 nc5Var = this.t;
        switch (b) {
            case 0:
                return nc5Var.n.getValue();
            default:
                return nc5Var.x();
        }
    }
}
