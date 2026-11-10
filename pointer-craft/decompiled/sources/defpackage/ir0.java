package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ir0 implements gr1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ qr0 t;

    public /* synthetic */ ir0(qr0 qr0Var, byte b) {
        this.j = b;
        this.t = qr0Var;
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        byte b = this.j;
        og5 og5Var = og5.g;
        qr0 qr0Var = this.t;
        switch (b) {
            case 0:
                ek2 ek2Var = (ek2) obj;
                if (ek2Var != null) {
                    ew4 ew4Var = qr0Var.e;
                    c85 c85Var = new c85(ek2Var.g, ek2Var.y, qr0Var.D);
                    ew4Var.getClass();
                    ew4Var.m(null, c85Var);
                }
                return og5Var;
            default:
                x83 x83Var = (x83) obj;
                Object objI = qr0Var.i(x83Var.g, x83Var.y, mu0Var);
                return objI == px0.j ? objI : og5Var;
        }
    }
}
