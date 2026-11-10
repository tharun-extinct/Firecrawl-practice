package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class ab0 implements cb0 {
    public final ScheduledFuture j;

    public ab0(ScheduledFuture scheduledFuture) {
        this.j = scheduledFuture;
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.j + ']';
    }

    @Override // defpackage.cb0
    public final void y(Throwable th) {
        this.j.cancel(false);
    }
}
