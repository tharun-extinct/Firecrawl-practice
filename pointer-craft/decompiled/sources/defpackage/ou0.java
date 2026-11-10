package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class ou0 extends ix {
    public transient mu0 a;
    public final fx0 t;

    public ou0(mu0 mu0Var) {
        this(mu0Var, mu0Var != null ? mu0Var.v() : null);
    }

    @Override // defpackage.mu0
    public fx0 v() {
        fx0 fx0Var = this.t;
        fx0Var.getClass();
        return fx0Var;
    }

    @Override // defpackage.ix
    public void z() {
        Unsafe unsafe;
        long j;
        mu0 mu0Var = this.a;
        if (mu0Var != null && mu0Var != this) {
            dx0 dx0VarH = v().h(f73.t);
            dx0VarH.getClass();
            ia1 ia1Var = (ia1) mu0Var;
            do {
                unsafe = qr.g;
                j = ia1.i;
            } while (unsafe.getObjectVolatile(ia1Var, j) == pw5.x);
            Object objectVolatile = unsafe.getObjectVolatile(ia1Var, j);
            ib0 ib0Var = objectVolatile instanceof ib0 ? (ib0) objectVolatile : null;
            if (ib0Var != null) {
                ib0Var.b();
            }
        }
        this.a = gl0.t;
    }

    public ou0(mu0 mu0Var, fx0 fx0Var) {
        super(mu0Var);
        this.t = fx0Var;
    }
}
