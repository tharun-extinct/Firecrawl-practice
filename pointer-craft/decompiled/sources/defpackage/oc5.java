package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc5 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ nc5 t;

    public /* synthetic */ oc5(nc5 nc5Var, byte b) {
        this.j = b;
        this.t = nc5Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        nc5 nc5Var = this.t;
        switch (b) {
            case 0:
                return new rc5(nc5Var, (byte) 0);
            default:
                return new rc5(nc5Var, (byte) 1);
        }
    }
}
