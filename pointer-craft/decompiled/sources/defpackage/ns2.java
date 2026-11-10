package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ns2 implements pf4 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ gg4 r;
    public final /* synthetic */ pf4 y;

    public /* synthetic */ ns2(pf4 pf4Var, gg4 gg4Var, byte b) {
        this.g = b;
        this.r = gg4Var;
        this.y = pf4Var;
    }

    @Override // defpackage.pf4
    public final float g(float f) {
        switch (this.g) {
            case 0:
                break;
        }
        return this.y.g(f);
    }

    public final int n() {
        byte b = this.g;
        gg4 gg4Var = this.r;
        switch (b) {
            case 0:
                return ((ss2) gg4Var).t();
            default:
                return ((xo3) gg4Var).x;
        }
    }

    public final int r() {
        byte b = this.g;
        gg4 gg4Var = this.r;
        switch (b) {
            case 0:
                return ((ss2) gg4Var).j();
            default:
                return ((xo3) gg4Var).v;
        }
    }

    public final int v() {
        byte b = this.g;
        gg4 gg4Var = this.r;
        switch (b) {
            case 0:
                ms2 ms2Var = (ms2) cj0.s0(((ss2) gg4Var).a().q);
                if (ms2Var != null) {
                    return ms2Var.g;
                }
                return 0;
            default:
                return ((w33) cj0.r0(((xo3) gg4Var).q().g)).g;
        }
    }

    public final void x(int i) {
        byte b = this.g;
        gg4 gg4Var = this.r;
        switch (b) {
            case 0:
                ((ss2) gg4Var).w(i);
                break;
            default:
                xo3 xo3Var = (xo3) gg4Var;
                float fI = xo3Var.i();
                xo3Var.u(i, fI != 0.0f ? 0.0f / fI : 0.0f, true);
                break;
        }
    }

    public final int y(int i) {
        Object obj;
        byte b = this.g;
        gg4 gg4Var = this.r;
        switch (b) {
            case 0:
                ss2 ss2Var = (ss2) gg4Var;
                ls2 ls2VarA = ss2Var.a();
                if (ls2VarA.q.isEmpty()) {
                    return 0;
                }
                int iJ = ss2Var.j();
                if (i > v() || iJ > i) {
                    return ((i - ss2Var.j()) * zy5.r(ls2VarA)) - ss2Var.t();
                }
                List list = ls2VarA.q;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = list.get(i2);
                        if (((ms2) obj).g != i) {
                            i2++;
                        }
                    } else {
                        obj = null;
                    }
                }
                ms2 ms2Var = (ms2) obj;
                if (ms2Var != null) {
                    return ms2Var.i;
                }
                return 0;
            default:
                xo3 xo3Var = (xo3) gg4Var;
                return (int) (xs2.c(hc6.x(xo3Var) + ((long) k33.Z(((xo3Var.i() * (i - xo3Var.m())) - (((pp3) xo3Var.n.n).d() * xo3Var.i())) + 0.0f)), xo3Var.j, xo3Var.l) - hc6.x(xo3Var));
        }
    }
}
