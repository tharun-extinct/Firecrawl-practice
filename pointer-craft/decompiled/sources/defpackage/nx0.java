package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class nx0 implements Executor, Closeable {
    public static final ky2 b;
    public static final /* synthetic */ AtomicLongFieldUpdater i;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long s;
    public static final /* synthetic */ long u;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final long a;
    public final k74 c;
    private volatile /* synthetic */ long controlState$volatile;
    public final int j;
    public final String m;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final b32 q;
    public final int t;
    public final b32 w;

    static {
        Unsafe unsafe = qr.g;
        u = unsafe.objectFieldOffset(nx0.class.getDeclaredField("parkedWorkersStack$volatile"));
        i = AtomicLongFieldUpdater.newUpdater(nx0.class, "controlState$volatile");
        p = unsafe.objectFieldOffset(nx0.class.getDeclaredField("controlState$volatile"));
        s = unsafe.objectFieldOffset(nx0.class.getDeclaredField("_isTerminated$volatile"));
        b = new ky2("NOT_IN_STACK", (byte) 2);
    }

    public nx0(int i2, int i3, long j, String str) {
        this.j = i2;
        this.t = i3;
        this.a = j;
        this.m = str;
        if (i2 < 1) {
            l0.t(du4.w(i2, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i3 < i2) {
            l0.t(du4.m(i3, i2, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i3 > 2097150) {
            l0.t(du4.w(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            t94.x("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.q = new b32();
        this.w = new b32();
        this.c = new k74((i2 + 1) * 2);
        this.controlState$volatile = ((long) i2) << 42;
    }

    public static /* synthetic */ void t(nx0 nx0Var, Runnable runnable, int i2) {
        nx0Var.x(runnable, false, (i2 & 4) == 0);
    }

    public final void a(lx0 lx0Var, int i2, int i3) {
        while (true) {
            long longVolatile = qr.g.getLongVolatile(this, u);
            int i4 = (int) (2097151 & longVolatile);
            long j = (2097152 + longVolatile) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object objR = lx0Var.r();
                    while (true) {
                        if (objR == b) {
                            i4 = -1;
                            break;
                        }
                        if (objR == null) {
                            i4 = 0;
                            break;
                        }
                        lx0 lx0Var2 = (lx0) objR;
                        int iY = lx0Var2.y();
                        if (iY != 0) {
                            i4 = iY;
                            break;
                        }
                        objR = lx0Var2.r();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                nx0 nx0Var = this;
                if (qr.g.compareAndSwapLong(nx0Var, u, longVolatile, j | ((long) i4))) {
                    return;
                } else {
                    this = nx0Var;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int longVolatile;
        v25 v25VarG;
        Unsafe unsafe = qr.g;
        if (unsafe.compareAndSwapInt(this, s, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            lx0 lx0Var = threadCurrentThread instanceof lx0 ? (lx0) threadCurrentThread : null;
            if (lx0Var == null || lx0Var.i != this) {
                lx0Var = null;
            }
            synchronized (this.c) {
                longVolatile = (int) (unsafe.getLongVolatile(this, p) & 2097151);
            }
            if (1 <= longVolatile) {
                int i2 = 1;
                while (true) {
                    Object objY = this.c.y(i2);
                    objY.getClass();
                    lx0 lx0Var2 = (lx0) objY;
                    if (lx0Var2 != lx0Var) {
                        while (lx0Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(lx0Var2);
                            lx0Var2.join(10000L);
                        }
                        pr5 pr5Var = lx0Var2.j;
                        b32 b32Var = this.w;
                        pr5Var.getClass();
                        v25 v25Var = (v25) qr.g.getAndSetObject(pr5Var, pr5.l, (Object) null);
                        if (v25Var != null) {
                            b32Var.g(v25Var);
                        }
                        while (true) {
                            v25 v25VarR = pr5Var.r();
                            if (v25VarR == null) {
                                break;
                            } else {
                                b32Var.g(v25VarR);
                            }
                        }
                    }
                    if (i2 == longVolatile) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            b32 b32Var2 = this.w;
            while (true) {
                by2 by2Var = (by2) qr.g.getObjectVolatile(b32Var2, zx2.y);
                if (by2Var.y()) {
                    break;
                } else {
                    fj.m(b32Var2, by2Var, by2Var.r());
                }
            }
            b32 b32Var3 = this.q;
            while (true) {
                by2 by2Var2 = (by2) qr.g.getObjectVolatile(b32Var3, zx2.y);
                if (by2Var2.y()) {
                    break;
                } else {
                    fj.m(b32Var3, by2Var2, by2Var2.r());
                }
            }
            while (true) {
                if (lx0Var != null) {
                    v25VarG = lx0Var.g(true);
                    if (v25VarG == null) {
                        v25VarG = (v25) this.q.r();
                        if (v25VarG == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    v25VarG = (v25) this.q.r();
                    if (v25VarG == null && (v25VarG = (v25) this.w.r()) == null) {
                        break;
                    }
                }
                try {
                    v25VarG.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (lx0Var != null) {
                lx0Var.j(mx0.q);
            }
            Unsafe unsafe2 = qr.g;
            unsafe2.putLongVolatile(this, u, 0L);
            unsafe2.putLongVolatile(this, p, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        t(this, runnable, 6);
    }

    public final boolean i() {
        nx0 nx0Var;
        ky2 ky2Var;
        int iY;
        while (true) {
            Unsafe unsafe = qr.g;
            long j = u;
            long longVolatile = unsafe.getLongVolatile(this, j);
            lx0 lx0Var = (lx0) this.c.y((int) (2097151 & longVolatile));
            if (lx0Var == null) {
                lx0Var = null;
                nx0Var = this;
            } else {
                long j2 = (2097152 + longVolatile) & (-2097152);
                Object objR = lx0Var.r();
                while (true) {
                    ky2Var = b;
                    if (objR == ky2Var) {
                        iY = -1;
                        break;
                    }
                    if (objR == null) {
                        iY = 0;
                        break;
                    }
                    lx0 lx0Var2 = (lx0) objR;
                    iY = lx0Var2.y();
                    if (iY != 0) {
                        break;
                    }
                    objR = lx0Var2.r();
                    unsafe = unsafe;
                    this = this;
                }
                if (iY >= 0) {
                    nx0 nx0Var2 = this;
                    boolean zCompareAndSwapLong = unsafe.compareAndSwapLong(nx0Var2, j, longVolatile, j2 | ((long) iY));
                    nx0Var = nx0Var2;
                    if (zCompareAndSwapLong) {
                        lx0Var.l(ky2Var);
                    }
                    this = nx0Var;
                } else {
                    continue;
                }
            }
            if (lx0Var == null) {
                return false;
            }
            if (lx0.b.compareAndSet(lx0Var, -1, 0)) {
                LockSupport.unpark(lx0Var);
                return true;
            }
            this = nx0Var;
        }
    }

    public final boolean isTerminated() {
        return qr.g.getIntVolatile(this, s) == 1;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        k74 k74Var = this.c;
        int iG = k74Var.g();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iG; i7++) {
            lx0 lx0Var = (lx0) k74Var.y(i7);
            if (lx0Var != null) {
                pr5 pr5Var = lx0Var.j;
                pr5Var.getClass();
                Object objectVolatile = qr.g.getObjectVolatile(pr5Var, pr5.l);
                int iY = pr5Var.y();
                if (objectVolatile != null) {
                    iY++;
                }
                int iOrdinal = lx0Var.a.ordinal();
                if (iOrdinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iY);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iY);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i4++;
                } else if (iOrdinal == 3) {
                    i5++;
                    if (iY > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iY);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        uo1.g();
                        return null;
                    }
                    i6++;
                }
            }
        }
        long longVolatile = qr.g.getLongVolatile(this, p);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.m);
        sb4.append('@');
        sb4.append(a11.z(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.j;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.t);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.q.y());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.w.y());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & longVolatile));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & longVolatile) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((longVolatile & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean w(long j) {
        int i2 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.j;
        if (i2 < i3) {
            int iY = y();
            if (iY == 1 && i3 > 1) {
                y();
            }
            if (iY > 0) {
                return true;
            }
        }
        return false;
    }

    public final void x(Runnable runnable, boolean z, boolean z2) {
        v25 z25Var;
        mx0 mx0Var;
        d35.x.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof v25) {
            z25Var = (v25) runnable;
            z25Var.j = jNanoTime;
            z25Var.t = z;
        } else {
            z25Var = new z25(runnable, jNanoTime, z);
        }
        boolean z3 = z25Var.t;
        long jAddAndGet = z3 ? i.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        lx0 lx0Var = threadCurrentThread instanceof lx0 ? (lx0) threadCurrentThread : null;
        if (lx0Var == null || lx0Var.i != this) {
            lx0Var = null;
        }
        if (lx0Var != null && (mx0Var = lx0Var.a) != mx0.q && (z25Var.t || mx0Var != mx0.t)) {
            lx0Var.c = true;
            pr5 pr5Var = lx0Var.j;
            if (z2) {
                z25Var = pr5Var.g(z25Var);
            } else {
                pr5Var.getClass();
                v25 v25Var = (v25) qr.g.getAndSetObject(pr5Var, pr5.l, z25Var);
                z25Var = v25Var == null ? null : pr5Var.g(v25Var);
            }
        }
        if (z25Var != null) {
            if (!(z25Var.t ? this.w.g(z25Var) : this.q.g(z25Var))) {
                throw new RejectedExecutionException(du4.b(new StringBuilder(), this.m, " was terminated"));
            }
        }
        if (z3) {
            if (i() || w(jAddAndGet)) {
                return;
            }
            i();
            return;
        }
        if (i() || w(qr.g.getLongVolatile(this, p))) {
            return;
        }
        i();
    }

    public final int y() {
        synchronized (this.c) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                Unsafe unsafe = qr.g;
                long j = p;
                long longVolatile = unsafe.getLongVolatile(this, j);
                int i2 = (int) (longVolatile & 2097151);
                int i3 = i2 - ((int) ((longVolatile & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.j) {
                    return 0;
                }
                if (i2 >= this.t) {
                    return 0;
                }
                int longVolatile2 = ((int) (unsafe.getLongVolatile(this, j) & 2097151)) + 1;
                if (longVolatile2 <= 0 || this.c.y(longVolatile2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                lx0 lx0Var = new lx0(this, longVolatile2);
                this.c.r(longVolatile2, lx0Var);
                if (longVolatile2 != ((int) (atomicLongFieldUpdater.incrementAndGet(this) & 2097151))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i3 + 1;
                lx0Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
