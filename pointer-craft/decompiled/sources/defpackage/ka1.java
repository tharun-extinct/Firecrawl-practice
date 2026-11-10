package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ka1 extends v25 {
    public int a;

    public ka1(int i) {
        super(0L, false);
        this.a = i;
    }

    public abstract Object a();

    public abstract mu0 r();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mu0 mu0VarR = r();
            mu0VarR.getClass();
            ia1 ia1Var = (ia1) mu0VarR;
            ou0 ou0Var = ia1Var.q;
            Object obj = ia1Var.c;
            fx0 fx0VarV = ou0Var.v();
            Object objW = pw5.W(fx0VarV, obj);
            dh2 dh2Var = null;
            gg5 gg5VarB0 = objW != pw5.i ? yf2.b0(ou0Var, fx0VarV, objW) : null;
            try {
                fx0 fx0VarV2 = ou0Var.v();
                Object objA = a();
                Throwable thX = x(objA);
                if (thX == null) {
                    int i = this.a;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        dh2Var = (dh2) fx0VarV2.h(d52.m);
                    }
                }
                if (dh2Var != null && !dh2Var.y()) {
                    CancellationException cancellationExceptionK = dh2Var.k();
                    y(cancellationExceptionK);
                    ou0Var.j(js2.j(cancellationExceptionK));
                } else if (thX != null) {
                    ou0Var.j(new g84(thX));
                } else {
                    ou0Var.j(l(objA));
                }
            } finally {
                if (gg5VarB0 == null || gg5VarB0.v0()) {
                    pw5.J(fx0VarV, objW);
                }
            }
        } catch (ha1 e) {
            ae6.y(r().v(), e.j);
        } catch (Throwable th) {
            t(th);
        }
    }

    public final void t(Throwable th) {
        ae6.y(r().v(), new sx0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public Throwable x(Object obj) {
        hl0 hl0Var = obj instanceof hl0 ? (hl0) obj : null;
        if (hl0Var != null) {
            return hl0Var.g;
        }
        return null;
    }

    public Object l(Object obj) {
        return obj;
    }

    public void y(CancellationException cancellationException) {
    }
}
