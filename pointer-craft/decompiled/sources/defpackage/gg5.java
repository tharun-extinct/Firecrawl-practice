package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gg5 extends re4 {
    private volatile boolean threadLocalIsSet;
    public final ThreadLocal w;

    /* JADX WARN: Illegal instructions before constructor call */
    public gg5(mu0 mu0Var, fx0 fx0Var) {
        mb0 mb0Var = mb0.m;
        super(mu0Var, fx0Var.h(mb0Var) == null ? fx0Var.b(mb0Var) : fx0Var);
        this.w = new ThreadLocal();
        if (mu0Var.v().h(f73.t) instanceof hx0) {
            return;
        }
        Object objW = pw5.W(fx0Var, null);
        pw5.J(fx0Var, objW);
        x0(fx0Var, objW);
    }

    @Override // defpackage.re4, defpackage.nh2
    public final void G(Object obj) {
        w0();
        Object objM = gp4.M(obj);
        mu0 mu0Var = this.q;
        fx0 fx0VarV = mu0Var.v();
        Object objW = pw5.W(fx0VarV, null);
        gg5 gg5VarB0 = objW != pw5.i ? yf2.b0(mu0Var, fx0VarV, objW) : null;
        try {
            mu0Var.j(objM);
        } finally {
            if (gg5VarB0 == null || gg5VarB0.v0()) {
                pw5.J(fx0VarV, objW);
            }
        }
    }

    @Override // defpackage.re4
    public final void u0() {
        w0();
    }

    public final boolean v0() {
        boolean z = this.threadLocalIsSet && this.w.get() == null;
        this.w.remove();
        return !z;
    }

    public final void w0() {
        if (this.threadLocalIsSet) {
            fp3 fp3Var = (fp3) this.w.get();
            if (fp3Var != null) {
                pw5.J((fx0) fp3Var.j, fp3Var.t);
            }
            this.w.remove();
        }
    }

    public final void x0(fx0 fx0Var, Object obj) {
        this.threadLocalIsSet = true;
        this.w.set(new fp3(fx0Var, obj));
    }
}
