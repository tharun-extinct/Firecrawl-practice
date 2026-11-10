package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class ik4 implements Executor {
    public static final Logger w = Logger.getLogger(ik4.class.getName());
    public final Executor j;
    public final ArrayDeque t = new ArrayDeque();
    public int a = 1;
    public long m = 0;
    public final tu2 q = new tu2(this);

    public ik4(Executor executor) {
        jr2.m(executor);
        this.j = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        jr2.m(runnable);
        synchronized (this.t) {
            int i = this.a;
            if (i != 4 && i != 3) {
                long j = this.m;
                boolean z = false;
                hk4 hk4Var = new hk4(runnable, (byte) 0);
                this.t.add(hk4Var);
                this.a = 2;
                try {
                    this.j.execute(this.q);
                    if (this.a != 2) {
                        return;
                    }
                    synchronized (this.t) {
                        try {
                            if (this.m == j && this.a == 2) {
                                this.a = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.t) {
                        try {
                            int i2 = this.a;
                            if ((i2 == 1 || i2 == 2) && this.t.removeLastOccurrence(hk4Var)) {
                                z = true;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.t.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.j + "}";
    }
}
