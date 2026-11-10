package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class xa1 implements ya1 {
    public final ScheduledFuture j;

    public xa1(ScheduledFuture scheduledFuture) {
        this.j = scheduledFuture;
    }

    @Override // defpackage.ya1
    public final void g() {
        this.j.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.j + ']';
    }
}
