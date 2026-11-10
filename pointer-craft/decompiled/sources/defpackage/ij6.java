package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ij6 implements a36 {
    public final WeakReference j;
    public final dj6 t = new dj6(this);

    public ij6(si6 si6Var) {
        this.j = new WeakReference(si6Var);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        si6 si6Var = (si6) this.j.get();
        boolean zCancel = this.t.cancel(z);
        if (!zCancel || si6Var == null) {
            return zCancel;
        }
        si6Var.g = null;
        si6Var.y = null;
        si6Var.r.t(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.t.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.t.j instanceof l46;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.t.isDone();
    }

    public final void r(Throwable th) {
        k76 k76Var = new k76(th);
        sp2 sp2Var = wh6.w;
        dj6 dj6Var = this.t;
        if (sp2Var.E(dj6Var, null, k76Var)) {
            wh6.n(dj6Var);
        }
    }

    public final String toString() {
        return this.t.toString();
    }

    @Override // defpackage.a36
    public final void y(Runnable runnable, Executor executor) {
        this.t.y(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.t.get(j, timeUnit);
    }
}
