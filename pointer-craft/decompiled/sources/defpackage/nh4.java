package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class nh4 extends np0 implements th3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(nh4.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long w = qr.g.objectFieldOffset(nh4.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long m;

    public nh4(long j, nh4 nh4Var, int i) {
        super(nh4Var);
        this.m = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final boolean a() {
        while (true) {
            Unsafe unsafe = qr.g;
            long j = w;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.l() && this.r() != null) {
                return false;
            }
            nh4 nh4Var = this;
            if (unsafe.compareAndSwapInt(nh4Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = nh4Var;
        }
    }

    public abstract void j(int i, fx0 fx0Var);

    public abstract int l();

    @Override // defpackage.np0
    public final boolean n() {
        return qr.g.getIntVolatile(this, w) == l() && r() != null;
    }

    public final void t() {
        if (q.incrementAndGet(this) == l()) {
            v();
        }
    }

    public final boolean x() {
        return q.addAndGet(this, -65536) == l() && r() != null;
    }
}
