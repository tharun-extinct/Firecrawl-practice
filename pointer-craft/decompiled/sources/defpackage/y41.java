package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class y41 extends h1 implements ScheduledFuture {
    public final ScheduledFuture i;

    public y41(x41 x41Var) {
        this.i = x41Var.g(new fa4((Object) this, (byte) 12));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.i.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.i.getDelay(timeUnit);
    }

    @Override // defpackage.h1
    public final void n() {
        ScheduledFuture scheduledFuture = this.i;
        Object obj = this.j;
        scheduledFuture.cancel((obj instanceof b1) && ((b1) obj).g);
    }
}
