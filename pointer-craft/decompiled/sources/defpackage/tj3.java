package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class tj3 {
    public final Runnable g;
    public final o05 y = new o05(new yo(this, 1));

    public tj3(Runnable runnable) {
        this.g = runnable;
    }

    public final void g(gu2 gu2Var, oj3 oj3Var) {
        oj3Var.getClass();
        final ju2 ju2VarA = gu2Var.a();
        if (ju2VarA.t == wt2.j) {
            return;
        }
        nj3 nj3Var = new nj3(oj3Var, new pj3(gu2Var, oj3Var));
        oj3Var.g.add(nj3Var);
        nj3Var.l(false);
        kb5.t(y().r, nj3Var);
        final p21 p21Var = new p21(nj3Var, this, ju2VarA);
        ju2VarA.g(p21Var);
        oj3Var.r.add(new AutoCloseable() { // from class: qj3
            @Override // java.lang.AutoCloseable
            public final void close() {
                ju2VarA.x(p21Var);
            }
        });
    }

    public final void r(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        y().r.m(new kj3(onBackInvokedDispatcher, 0), 1);
        y().r.m(new kj3(onBackInvokedDispatcher, 1000000), 0);
    }

    public final rj3 y() {
        return (rj3) this.y.getValue();
    }
}
