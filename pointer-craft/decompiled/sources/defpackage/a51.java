package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a51 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ c51 t;

    public /* synthetic */ a51(c51 c51Var, byte b) {
        this.j = b;
        this.t = c51Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        c51 c51Var = this.t;
        switch (b) {
            case 0:
                h94 h94Var = (h94) v70.b(c51Var, k94.g);
                ie ieVar = c51Var.B;
                if (h94Var == null) {
                    if (ieVar != null) {
                        c51Var.R0(ieVar);
                    }
                    c51Var.B = null;
                } else if (ieVar == null) {
                    b51 b51Var = new b51(c51Var, (byte) 0);
                    a51 a51Var = new a51(c51Var, (byte) 1);
                    ve2 ve2Var = c51Var.k;
                    boolean z = c51Var.d;
                    float f = c51Var.e;
                    qe5 qe5Var = l94.g;
                    ie ieVar2 = new ie(ve2Var, z, f, b51Var, a51Var);
                    c51Var.Q0(ieVar2);
                    c51Var.B = ieVar2;
                }
                return og5.g;
            default:
                return yd6.g;
        }
    }
}
