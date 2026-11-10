package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class q30 extends e {
    public final Thread q;
    public final el1 w;

    public q30(fx0 fx0Var, Thread thread, el1 el1Var) {
        super(fx0Var, true);
        this.q = thread;
        this.w = el1Var;
    }

    @Override // defpackage.nh2
    public final void B(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.q;
        if (yf2.p(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
