package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p21 implements du2 {
    public final Object a;
    public final /* synthetic */ byte j = 0;
    public final Object t;

    public p21(n21 n21Var, du2 du2Var) {
        this.t = n21Var;
        this.a = du2Var;
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        byte b = this.j;
        Object obj = this.a;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                n21 n21Var = (n21) obj2;
                switch (o21.g[vt2Var.ordinal()]) {
                    case 1:
                        n21Var.i(gu2Var);
                        break;
                    case 2:
                        n21Var.x(gu2Var);
                        break;
                    case 3:
                        n21Var.a(gu2Var);
                        break;
                    case 4:
                        break;
                    case 5:
                        n21Var.y(gu2Var);
                        break;
                    case 6:
                        n21Var.t(gu2Var);
                        break;
                    case 7:
                        l0.u("ON_ANY must not been send by anybody");
                        break;
                    default:
                        uo1.g();
                        break;
                }
                du2 du2Var = (du2) obj;
                if (du2Var != null) {
                    du2Var.b(gu2Var, vt2Var);
                }
                break;
            default:
                nj3 nj3Var = (nj3) obj2;
                int i = sj3.g[vt2Var.ordinal()];
                if (i == 1) {
                    nj3Var.l(true);
                    break;
                } else if (i == 2) {
                    nj3Var.l(false);
                    break;
                } else if (i == 3) {
                    nj3Var.v();
                    ((ju2) obj).x(this);
                    break;
                }
                break;
        }
    }

    public p21(nj3 nj3Var, tj3 tj3Var, ju2 ju2Var) {
        this.t = nj3Var;
        this.a = ju2Var;
    }
}
