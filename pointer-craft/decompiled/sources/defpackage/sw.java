package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sw implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ us3 t;

    public /* synthetic */ sw(us3 us3Var, byte b) {
        this.j = b;
        this.t = us3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        us3 us3Var = this.t;
        ts3 ts3Var = (ts3) obj;
        switch (b) {
            case 0:
                ts3Var.j(us3Var, 0, 0, 0.0f);
                break;
            case 1:
                ts3Var.j(us3Var, 0, 0, 0.0f);
                break;
            case 2:
                ts3.m(ts3Var, us3Var, 0, 0);
                break;
            case 3:
                if (ts3Var.r() == fl2.j || ts3Var.v() == 0) {
                    ts3Var.x(us3Var);
                    us3Var.l0(je2.n(0L, us3Var.q), 0.0f, null);
                } else {
                    long jV = ((long) (ts3Var.v() - us3Var.j)) << 32;
                    ts3Var.x(us3Var);
                    us3Var.l0(je2.n(jV, us3Var.q), 0.0f, null);
                }
                break;
            case 4:
                ts3Var.getClass();
                ts3.m(ts3Var, us3Var, 0, 0);
                break;
            case 5:
                ts3Var.j(us3Var, 0, 0, 0.0f);
                break;
            case 6:
                ts3Var.j(us3Var, 0, 0, 0.0f);
                break;
            default:
                ts3.m(ts3Var, us3Var, 0, 0);
                break;
        }
        return og5Var;
    }
}
