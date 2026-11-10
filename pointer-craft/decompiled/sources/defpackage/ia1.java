package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia1 extends ka1 implements qx0, mu0 {
    public static final /* synthetic */ long i = qr.g.objectFieldOffset(ia1.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final Object c;
    public final hx0 m;
    public final ou0 q;
    public Object w;

    public ia1(hx0 hx0Var, ou0 ou0Var) {
        super(-1);
        this.m = hx0Var;
        this.q = ou0Var;
        this.w = pw5.v;
        this.c = pw5.Q(ou0Var.v());
    }

    @Override // defpackage.ka1
    public final Object a() {
        Object obj = this.w;
        this.w = pw5.v;
        return obj;
    }

    @Override // defpackage.mu0
    public final void j(Object obj) throws ha1 {
        Throwable thG = h84.g(obj);
        Object hl0Var = thG == null ? obj : new hl0(thG, false);
        ou0 ou0Var = this.q;
        fx0 fx0VarV = ou0Var.v();
        hx0 hx0Var = this.m;
        if (pw5.M(hx0Var, fx0VarV)) {
            this.w = hl0Var;
            this.a = 0;
            pw5.L(hx0Var, ou0Var.v(), this);
            return;
        }
        el1 el1VarG = w85.g();
        if (el1VarG.a >= 4294967296L) {
            this.w = hl0Var;
            this.a = 0;
            el1VarG.T(this);
            return;
        }
        el1VarG.U(true);
        try {
            fx0 fx0VarV2 = ou0Var.v();
            Object objW = pw5.W(fx0VarV2, this.c);
            try {
                ou0Var.j(obj);
                pw5.J(fx0VarV2, objW);
                while (el1VarG.W()) {
                }
            } catch (Throwable th) {
                pw5.J(fx0VarV2, objW);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                t(th2);
            } finally {
                el1VarG.S(true);
            }
        }
    }

    @Override // defpackage.qx0
    public final qx0 n() {
        return this.q;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.m + ", " + a11.E(this.q) + ']';
    }

    @Override // defpackage.mu0
    public final fx0 v() {
        return this.q.v();
    }

    @Override // defpackage.ka1
    public final mu0 r() {
        return this;
    }
}
