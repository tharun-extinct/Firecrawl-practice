package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dd0 extends ad0 {
    public final er1 m;

    public dd0(er1 er1Var, fx0 fx0Var, int i, f70 f70Var) {
        super(fx0Var, i, f70Var);
        this.m = er1Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[RETURN] */
    @Override // defpackage.ad0, defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) throws Throwable {
        Object objR;
        int i = this.t;
        px0 px0Var = px0.j;
        if (i == -3) {
            fx0 fx0VarV = mu0Var.v();
            Boolean bool = Boolean.FALSE;
            on0 on0Var = new on0((byte) 7);
            fx0 fx0Var = this.j;
            fx0 fx0VarB = !((Boolean) fx0Var.d(on0Var, bool)).booleanValue() ? fx0VarV.b(fx0Var) : yf2.E(fx0VarV, fx0Var, false);
            if (yf2.p(fx0VarB, fx0VarV)) {
                Object objT = t(gr1Var, mu0Var);
                if (objT == px0Var) {
                    return objT;
                }
            } else {
                f73 f73Var = f73.t;
                if (yf2.p(fx0VarB.h(f73Var), fx0VarV.h(f73Var))) {
                    Object objV = jb6.v(fx0VarB, jb6.g(gr1Var, mu0Var.v()), pw5.Q(fx0VarB), new q(this, null, (byte) 11), mu0Var);
                    if (objV == px0Var) {
                        return objV;
                    }
                } else {
                    objR = super.r(gr1Var, mu0Var);
                    if (objR == px0Var) {
                        return objR;
                    }
                }
            }
        } else {
            objR = super.r(gr1Var, mu0Var);
            if (objR == px0Var) {
                return objR;
            }
        }
        return og5.g;
    }

    public Object t(gr1 gr1Var, mu0 mu0Var) {
        Object objR = this.m.r(gr1Var, mu0Var);
        return objR == px0.j ? objR : og5.g;
    }

    @Override // defpackage.ad0
    public final String toString() {
        return this.m + " -> " + super.toString();
    }

    @Override // defpackage.ad0
    public final Object v(ez3 ez3Var, mu0 mu0Var) {
        Object objT = t(new yj4(ez3Var), mu0Var);
        return objT == px0.j ? objT : og5.g;
    }
}
