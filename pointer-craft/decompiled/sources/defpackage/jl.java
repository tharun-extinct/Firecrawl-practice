package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class jl implements Executor {
    public Runnable a;
    public final /* synthetic */ byte j;
    public final Object m;
    public final Executor q;
    public final ArrayDeque t;

    public jl(Executor executor) {
        this.j = (byte) 1;
        executor.getClass();
        this.q = executor;
        this.t = new ArrayDeque();
        this.m = new Object();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.j) {
            case 0:
                synchronized (this.m) {
                    try {
                        this.t.add(new va(this, runnable, (byte) 1));
                        if (this.a == null) {
                            g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.m) {
                    this.t.offer(new nl0(runnable, this, (byte) 7));
                    if (this.a == null) {
                        g();
                    }
                    break;
                }
                return;
        }
    }

    public final void g() {
        switch (this.j) {
            case 0:
                synchronized (this.m) {
                    try {
                        Runnable runnable = (Runnable) this.t.poll();
                        this.a = runnable;
                        if (runnable != null) {
                            ((dp1) this.q).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.m) {
                    Object objPoll = this.t.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.a = runnable2;
                    if (objPoll != null) {
                        this.q.execute(runnable2);
                    }
                    break;
                }
                return;
        }
    }

    public jl(dp1 dp1Var) {
        this.j = (byte) 0;
        this.m = new Object();
        this.t = new ArrayDeque();
        this.q = dp1Var;
    }
}
