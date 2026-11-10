package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class hh2 implements vw2 {
    public final ol4 j = new ol4();

    public hh2(fh2 fh2Var) {
        fh2Var.A(new gh2(this, (byte) 0));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.j.cancel(z);
    }

    @Override // defpackage.vw2
    public final void g(Runnable runnable, Executor executor) {
        this.j.g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.j.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.j.j instanceof c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.j.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.j.get(j, timeUnit);
    }
}
