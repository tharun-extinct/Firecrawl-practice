package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ww0 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ yw0 t;

    public /* synthetic */ ww0(yw0 yw0Var, byte b) {
        this.j = b;
        this.t = yw0Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        yt4 yt4Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        yw0 yw0Var = this.t;
        switch (b) {
            case 0:
                k33.S(yw0Var);
                return og5Var;
            case 1:
                yw0Var.D.v(true);
                break;
            case 2:
                yw0Var.D.g(true);
                break;
            case 3:
                yw0Var.D.r();
                break;
            case 4:
                k33.S(yw0Var);
                return og5Var;
            case 5:
                yw0Var.D.i();
                break;
            case 6:
                yw0Var.e.f.t.p.y(yw0Var.E.v);
                break;
            default:
                mt2 mt2Var = yw0Var.e;
                rt1 rt1Var = yw0Var.F;
                boolean z = yw0Var.A;
                if (!mt2Var.y()) {
                    rt1.g(rt1Var);
                } else if (!z && (yt4Var = mt2Var.r) != null) {
                    ((z41) yt4Var).y();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
