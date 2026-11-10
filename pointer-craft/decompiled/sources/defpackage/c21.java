package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c21 extends am1 implements Executor {
    public static final c21 a = new c21();
    public static final hx0 m;

    static {
        tg5 tg5Var = tg5.a;
        int i = f15.g;
        if (64 >= i) {
            i = 64;
        }
        m = tg5Var.R(xq2.L(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.hx0
    public final void P(fx0 fx0Var, Runnable runnable) throws ha1 {
        m.P(fx0Var, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        L(ni1.j, runnable);
    }

    @Override // defpackage.hx0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
