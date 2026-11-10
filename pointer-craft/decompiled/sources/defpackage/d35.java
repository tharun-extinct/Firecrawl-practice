package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class d35 {
    public static final String g;
    public static final int n;
    public static final int r;
    public static final long v;
    public static final l76 x;
    public static final long y;

    static {
        String property;
        int i = f15.g;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        g = property;
        y = xq2.K("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = f15.g;
        if (i2 < 2) {
            i2 = 2;
        }
        r = xq2.L(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        n = xq2.L(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        v = TimeUnit.SECONDS.toNanos(xq2.K("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        x = l76.m;
    }
}
