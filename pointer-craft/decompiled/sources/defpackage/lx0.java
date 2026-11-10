package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class lx0 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(lx0.class, "workerCtl$volatile");
    public static final /* synthetic */ long s = qr.g.objectFieldOffset(lx0.class.getDeclaredField("workerCtl$volatile"));
    public mx0 a;
    public boolean c;
    public final /* synthetic */ nx0 i;
    private volatile int indexInArray;
    public final pr5 j;
    public long m;
    private volatile Object nextParkedWorker;
    public long q;
    public final u54 t;
    public int w;
    private volatile /* synthetic */ int workerCtl$volatile;

    public lx0(nx0 nx0Var, int i) {
        this.i = nx0Var;
        setDaemon(true);
        setContextClassLoader(nx0.class.getClassLoader());
        this.j = new pr5();
        this.t = new u54();
        this.a = mx0.m;
        this.nextParkedWorker = nx0.b;
        int iNanoTime = (int) System.nanoTime();
        this.w = iNanoTime == 0 ? 42 : iNanoTime;
        x(i);
    }

    public final v25 g(boolean z) {
        v25 v25VarV;
        v25 v25VarV2;
        long j;
        mx0 mx0Var = this.a;
        nx0 nx0Var = this.i;
        v25 v25Var = null;
        pr5 pr5Var = this.j;
        mx0 mx0Var2 = mx0.j;
        if (mx0Var != mx0Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = nx0.i;
            do {
                j = atomicLongFieldUpdater.get(nx0Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    pr5Var.getClass();
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pr5.y;
                        Unsafe unsafe = qr.g;
                        v25 v25Var2 = (v25) unsafe.getObjectVolatile(pr5Var, pr5.l);
                        if (v25Var2 == null || !v25Var2.t) {
                            int intVolatile = unsafe.getIntVolatile(pr5Var, pr5.x);
                            int intVolatile2 = unsafe.getIntVolatile(pr5Var, pr5.j);
                            while (intVolatile != intVolatile2 && qr.g.getIntVolatile(pr5Var, pr5.v) != 0) {
                                intVolatile2--;
                                v25 v25VarN = pr5Var.n(intVolatile2, true);
                                if (v25VarN != null) {
                                    v25Var = v25VarN;
                                    break;
                                }
                            }
                            break;
                        }
                        if (ei3.q(pr5Var, v25Var2)) {
                            v25Var = v25Var2;
                            break;
                        }
                    }
                    if (v25Var != null) {
                        return v25Var;
                    }
                    v25 v25Var3 = (v25) nx0Var.w.r();
                    return v25Var3 == null ? t(1) : v25Var3;
                }
            } while (!nx0.i.compareAndSet(nx0Var, j, j - 4398046511104L));
            this.a = mx0Var2;
        }
        if (z) {
            boolean z2 = n(nx0Var.j * 2) == 0;
            if (z2 && (v25VarV2 = v()) != null) {
                return v25VarV2;
            }
            pr5Var.getClass();
            v25 v25VarR = (v25) qr.g.getAndSetObject(pr5Var, pr5.l, (Object) null);
            if (v25VarR == null) {
                v25VarR = pr5Var.r();
            }
            if (v25VarR != null) {
                return v25VarR;
            }
            if (!z2 && (v25VarV = v()) != null) {
                return v25VarV;
            }
        } else {
            v25 v25VarV3 = v();
            if (v25VarV3 != null) {
                return v25VarV3;
            }
        }
        return t(3);
    }

    public final boolean j(mx0 mx0Var) {
        mx0 mx0Var2 = this.a;
        boolean z = mx0Var2 == mx0.j;
        if (z) {
            nx0.i.addAndGet(this.i, 4398046511104L);
        }
        if (mx0Var2 != mx0Var) {
            this.a = mx0Var;
        }
        return z;
    }

    public final void l(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final int n(int i) {
        int i2 = this.w;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.w = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final Object r() {
        return this.nextParkedWorker;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (!this.i.isTerminated()) {
                    mx0 mx0Var = this.a;
                    mx0 mx0Var2 = mx0.q;
                    if (mx0Var == mx0Var2) {
                        break loop0;
                    }
                    v25 v25VarG = g(this.c);
                    long j = 0;
                    if (v25VarG != null) {
                        this.q = 0L;
                        nx0 nx0Var = this.i;
                        this.m = 0L;
                        if (this.a == mx0.a) {
                            this.a = mx0.t;
                        }
                        if (!v25VarG.t) {
                            try {
                                v25VarG.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (j(mx0.t) && !nx0Var.i() && !nx0Var.w(qr.g.getLongVolatile(nx0Var, nx0.p))) {
                            nx0Var.i();
                        }
                        try {
                            v25VarG.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        nx0.i.addAndGet(nx0Var, -2097152L);
                        if (this.a == mx0Var2) {
                            break;
                        }
                        this.a = mx0.m;
                        break;
                    }
                    this.c = false;
                    if (this.q == 0) {
                        Object obj = this.nextParkedWorker;
                        ky2 ky2Var = nx0.b;
                        if (obj != ky2Var) {
                            qr.g.putIntVolatile(this, s, -1);
                            while (this.nextParkedWorker != nx0.b) {
                                Unsafe unsafe = qr.g;
                                long j2 = s;
                                if (unsafe.getIntVolatile(this, j2) != -1 || this.i.isTerminated()) {
                                    break;
                                }
                                mx0 mx0Var3 = this.a;
                                mx0 mx0Var4 = mx0.q;
                                if (mx0Var3 == mx0Var4) {
                                    break;
                                }
                                j(mx0.a);
                                Thread.interrupted();
                                if (this.m == j) {
                                    this.m = System.nanoTime() + this.i.a;
                                }
                                LockSupport.parkNanos(this.i.a);
                                if (System.nanoTime() - this.m >= j) {
                                    this.m = j;
                                    nx0 nx0Var2 = this.i;
                                    synchronized (nx0Var2.c) {
                                        try {
                                            if (!nx0Var2.isTerminated()) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = nx0.i;
                                                if (((int) (atomicLongFieldUpdater.get(nx0Var2) & 2097151)) > nx0Var2.j && unsafe.compareAndSwapInt(this, j2, -1, 1)) {
                                                    int i = this.indexInArray;
                                                    x(0);
                                                    nx0Var2.a(this, i, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(nx0Var2) & 2097151);
                                                    if (andDecrement != i) {
                                                        Object objY = nx0Var2.c.y(andDecrement);
                                                        objY.getClass();
                                                        lx0 lx0Var = (lx0) objY;
                                                        nx0Var2.c.r(i, lx0Var);
                                                        lx0Var.x(i);
                                                        nx0Var2.a(lx0Var, andDecrement, i);
                                                    }
                                                    nx0Var2.c.r(andDecrement, null);
                                                    this.a = mx0Var4;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                j = 0;
                            }
                        } else {
                            nx0 nx0Var3 = this.i;
                            if (this.nextParkedWorker == ky2Var) {
                                while (true) {
                                    Unsafe unsafe2 = qr.g;
                                    long j3 = nx0.u;
                                    long longVolatile = unsafe2.getLongVolatile(nx0Var3, j3);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = nx0Var3.c.y((int) (longVolatile & 2097151));
                                    nx0 nx0Var4 = nx0Var3;
                                    if (unsafe2.compareAndSwapLong(nx0Var4, j3, longVolatile, ((longVolatile + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        nx0Var3 = nx0Var4;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            j(mx0.a);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.q);
                            this.q = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        j(mx0.q);
    }

    public final v25 t(int i) {
        int i2;
        long j;
        v25 v25VarR;
        long j2;
        long j3;
        Unsafe unsafe;
        AtomicLongFieldUpdater atomicLongFieldUpdater = nx0.i;
        nx0 nx0Var = this.i;
        int i3 = (int) (atomicLongFieldUpdater.get(nx0Var) & 2097151);
        v25 v25Var = null;
        if (i3 < 2) {
            return null;
        }
        int iN = n(i3);
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (i4 < i3) {
            iN++;
            if (iN > i3) {
                iN = 1;
            }
            lx0 lx0Var = (lx0) nx0Var.c.y(iN);
            if (lx0Var == null || lx0Var == this) {
                i2 = i3;
            } else {
                pr5 pr5Var = lx0Var.j;
                pr5Var.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    Unsafe unsafe2 = qr.g;
                    j = 0;
                    int intVolatile = unsafe2.getIntVolatile(pr5Var, pr5.x);
                    int intVolatile2 = unsafe2.getIntVolatile(pr5Var, pr5.j);
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i3;
                                if (qr.g.getIntVolatile(pr5Var, pr5.v) == 0) {
                                }
                            } else {
                                i2 = i3;
                            }
                            int i5 = intVolatile + 1;
                            v25 v25VarN = pr5Var.n(intVolatile, z);
                            if (v25VarN != null) {
                                v25VarR = v25VarN;
                                break;
                            }
                            intVolatile = i5;
                            i3 = i2;
                        } else {
                            i2 = i3;
                        }
                        v25VarR = v25Var;
                        break;
                    }
                } else {
                    v25VarR = pr5Var.r();
                    i2 = i3;
                    j = 0;
                }
                u54 u54Var = this.t;
                if (v25VarR == null) {
                    j2 = -1;
                    long j4 = pr5.l;
                    while (true) {
                        v25 v25Var2 = (v25) qr.g.getObjectVolatile(pr5Var, j4);
                        if (v25Var2 != null) {
                            if (((v25Var2.t ? 1 : 2) & i) != 0) {
                                d35.x.getClass();
                                pr5 pr5Var2 = pr5Var;
                                long jNanoTime = System.nanoTime() - v25Var2.j;
                                long j5 = d35.y;
                                if (jNanoTime < j5) {
                                    j3 = j5 - jNanoTime;
                                    break;
                                }
                                do {
                                    unsafe = qr.g;
                                    if (unsafe.compareAndSwapObject(pr5Var2, pr5.l, v25Var2, (Object) null)) {
                                        u54Var.j = v25Var2;
                                        j3 = -1;
                                        break;
                                    }
                                } while (unsafe.getObjectVolatile(pr5Var2, j4) == v25Var2);
                                pr5Var = pr5Var2;
                            }
                        }
                        j3 = -2;
                        break;
                    }
                } else {
                    u54Var.j = v25VarR;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    v25 v25Var3 = (v25) u54Var.j;
                    u54Var.j = null;
                    return v25Var3;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i4++;
            i3 = i2;
            v25Var = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.q = jMin;
        return null;
    }

    public final v25 v() {
        int iN = n(2);
        nx0 nx0Var = this.i;
        b32 b32Var = nx0Var.w;
        b32 b32Var2 = nx0Var.q;
        if (iN == 0) {
            v25 v25Var = (v25) b32Var2.r();
            return v25Var != null ? v25Var : (v25) b32Var.r();
        }
        v25 v25Var2 = (v25) b32Var.r();
        return v25Var2 != null ? v25Var2 : (v25) b32Var2.r();
    }

    public final void x(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.i.m);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final int y() {
        return this.indexInArray;
    }
}
