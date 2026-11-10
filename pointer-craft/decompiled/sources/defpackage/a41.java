package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a41 {
    public final r11 g;
    public volatile ScheduledFuture n;
    public final ScheduledExecutorService r;
    public volatile long v = -1;
    public final Executor y;

    public a41(r11 r11Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.g = r11Var;
        this.y = executor;
        this.r = scheduledExecutorService;
    }

    public final void g() {
        if (this.n == null || this.n.isDone()) {
            return;
        }
        this.n.cancel(false);
    }

    public final void y(long j) {
        g();
        this.v = -1L;
        this.n = this.r.schedule(new z31(this, (byte) 0), Math.max(0L, j), TimeUnit.MILLISECONDS);
    }
}
