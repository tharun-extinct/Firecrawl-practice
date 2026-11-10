package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class pr5 {
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ AtomicIntegerFieldUpdater n;
    public static final /* synthetic */ AtomicIntegerFieldUpdater r;
    public static final /* synthetic */ long v;
    public static final /* synthetic */ long x;
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(pr5.class, Object.class, "lastScheduledTask$volatile");
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    public final AtomicReferenceArray g = new AtomicReferenceArray(128);
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = qr.g;
        l = unsafe.objectFieldOffset(pr5.class.getDeclaredField("lastScheduledTask$volatile"));
        r = AtomicIntegerFieldUpdater.newUpdater(pr5.class, "producerIndex$volatile");
        j = unsafe.objectFieldOffset(pr5.class.getDeclaredField("producerIndex$volatile"));
        x = unsafe.objectFieldOffset(pr5.class.getDeclaredField("consumerIndex$volatile"));
        n = AtomicIntegerFieldUpdater.newUpdater(pr5.class, "blockingTasksInBuffer$volatile");
        v = unsafe.objectFieldOffset(pr5.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final v25 g(v25 v25Var) {
        if (y() == 127) {
            return v25Var;
        }
        if (v25Var.t) {
            n.incrementAndGet(this);
        }
        int intVolatile = qr.g.getIntVolatile(this, j) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.g;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, v25Var);
                r.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final v25 n(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.g;
        v25 v25Var = (v25) atomicReferenceArray.get(i2);
        if (v25Var == null || v25Var.t != z || !ei3.w(atomicReferenceArray, i2, v25Var)) {
            return null;
        }
        if (z) {
            n.decrementAndGet(this);
        }
        return v25Var;
    }

    public final v25 r() {
        v25 v25Var;
        while (true) {
            Unsafe unsafe = qr.g;
            long j2 = x;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            if (intVolatile - unsafe.getIntVolatile(this, j) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            pr5 pr5Var = this;
            if (unsafe.compareAndSwapInt(pr5Var, j2, intVolatile, intVolatile + 1) && (v25Var = (v25) pr5Var.g.getAndSet(i, null)) != null) {
                if (v25Var.t) {
                    n.decrementAndGet(pr5Var);
                }
                return v25Var;
            }
            this = pr5Var;
        }
    }

    public final int y() {
        return qr.g.getIntVolatile(this, j) - qr.g.getIntVolatile(this, x);
    }
}
