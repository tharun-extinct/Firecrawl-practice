package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class yi1 implements AutoCloseable {
    public static final yi1 j = new yi1();
    public static final AtomicInteger t = new AtomicInteger(0);

    @Override // java.lang.AutoCloseable
    public final void close() {
        t.set(0);
    }
}
