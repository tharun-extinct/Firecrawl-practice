package defpackage;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class py0 implements ThreadFactory {
    public static final ThreadFactory v = Executors.defaultThreadFactory();
    public final AtomicLong g = new AtomicLong();
    public final StrictMode.ThreadPolicy n;
    public final byte r;
    public final String y;

    /* JADX WARN: Multi-variable type inference failed */
    public py0(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.y = str;
        this.r = i;
        this.n = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = v.newThread(new nl0(this, runnable, (byte) 3));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.y + " Thread #" + this.g.getAndIncrement());
        return threadNewThread;
    }
}
