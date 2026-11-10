package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class lk4 implements Executor {
    public volatile Runnable m;
    public final Executor t;
    public final ArrayDeque j = new ArrayDeque();
    public final Object a = new Object();

    public lk4(Executor executor) {
        this.t = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            try {
                this.j.add(new tu2(this, runnable, (byte) 2));
                if (this.m == null) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.a) {
            try {
                Runnable runnable = (Runnable) this.j.poll();
                this.m = runnable;
                if (runnable != null) {
                    this.t.execute(this.m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
