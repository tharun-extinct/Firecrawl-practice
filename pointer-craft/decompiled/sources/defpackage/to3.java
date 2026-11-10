package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class to3 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ xo3 t;

    public /* synthetic */ to3(xo3 xo3Var, byte b) {
        this.j = b;
        this.t = xo3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        int iM;
        int iA;
        byte b = this.j;
        xo3 xo3Var = this.t;
        switch (b) {
            case 0:
                return Integer.valueOf(xo3Var.m.y() ? xo3Var.p.d() : xo3Var.m());
            case 1:
                boolean zY = xo3Var.m.y();
                qp3 qp3Var = xo3Var.s;
                if (!zY) {
                    iM = xo3Var.m();
                } else if (qp3Var.d() != -1) {
                    iM = qp3Var.d();
                } else {
                    float fAbs = Math.abs(((pp3) xo3Var.n.n).d());
                    j51 j51Var = xo3Var.c;
                    yo3 yo3Var = zo3.g;
                    if (fAbs >= Math.abs(Math.min(j51Var.e(56.0f), xo3Var.c() / 2.0f) / xo3Var.c())) {
                        boolean zBooleanValue = ((Boolean) xo3Var.D.getValue()).booleanValue();
                        int i = xo3Var.v;
                        iM = zBooleanValue ? i + 1 : i;
                    } else {
                        iM = xo3Var.m();
                    }
                }
                iA = xo3Var.a(iM);
                break;
            default:
                iA = xo3Var.w();
                break;
        }
        return Integer.valueOf(iA);
    }
}
