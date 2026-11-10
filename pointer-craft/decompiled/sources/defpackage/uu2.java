package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class uu2 extends hx0 implements k41 {
    public final /* synthetic */ k41 a;
    public final Object c;
    public final hx0 m;
    public final int q;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final zx2 w;
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(uu2.class, "runningWorkers$volatile");
    public static final /* synthetic */ long b = qr.g.objectFieldOffset(uu2.class.getDeclaredField("runningWorkers$volatile"));

    /* JADX WARN: Multi-variable type inference failed */
    public uu2(hx0 hx0Var, int i2) {
        k41 k41Var = hx0Var instanceof k41 ? (k41) hx0Var : null;
        this.a = k41Var == null ? p11.g : k41Var;
        this.m = hx0Var;
        this.q = i2;
        this.w = new zx2();
        this.c = new Object();
    }

    @Override // defpackage.hx0
    public final void L(fx0 fx0Var, Runnable runnable) {
        Runnable runnableS;
        this.w.g(runnable);
        if (qr.g.getIntVolatile(this, b) >= this.q || !T() || (runnableS = S()) == null) {
            return;
        }
        try {
            pw5.L(this.m, this, new tu2(this, runnableS, (byte) 0));
        } catch (Throwable th) {
            i.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.hx0
    public final void P(fx0 fx0Var, Runnable runnable) {
        Runnable runnableS;
        this.w.g(runnable);
        if (qr.g.getIntVolatile(this, b) >= this.q || !T() || (runnableS = S()) == null) {
            return;
        }
        try {
            this.m.P(this, new tu2(this, runnableS, (byte) 0));
        } catch (Throwable th) {
            i.decrementAndGet(this);
            throw th;
        }
    }

    public final Runnable S() {
        while (true) {
            Runnable runnable = (Runnable) this.w.r();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.c) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.w.y() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean T() {
        synchronized (this.c) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
            if (qr.g.getIntVolatile(this, b) >= this.q) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.hx0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append(".limitedParallelism(");
        return fj.x(sb, this.q, ')');
    }

    @Override // defpackage.k41
    public final ya1 u(long j, Runnable runnable, fx0 fx0Var) {
        return this.a.u(j, runnable, fx0Var);
    }

    @Override // defpackage.k41
    public final void w(long j, ib0 ib0Var) {
        this.a.w(j, ib0Var);
    }
}
