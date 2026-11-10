package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class op0 implements ThreadFactory {
    public final AtomicInteger g = new AtomicInteger(0);
    public final /* synthetic */ boolean y;

    public op0(boolean z) {
        this.y = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.y ? "WM.task-" : "androidx.work-") + this.g.incrementAndGet());
    }
}
