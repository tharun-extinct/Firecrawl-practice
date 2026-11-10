package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class jl1 extends el1 implements k41 {
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ int s = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = qr.g;
        b = unsafe.objectFieldOffset(jl1.class.getDeclaredField("_queue$volatile"));
        c = unsafe.objectFieldOffset(jl1.class.getDeclaredField("_delayed$volatile"));
        i = unsafe.objectFieldOffset(jl1.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override // defpackage.hx0
    public final void L(fx0 fx0Var, Runnable runnable) {
        X(runnable);
    }

    @Override // defpackage.el1
    public final long V() {
        Unsafe unsafe;
        jl1 jl1Var;
        Unsafe unsafe2;
        Runnable runnable;
        hl1 hl1Var;
        ky2 ky2Var = c93.i;
        long j = b;
        if (!W()) {
            Y();
            loop0: while (true) {
                unsafe = qr.g;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    jl1Var = this;
                } else if (objectVolatile instanceof by2) {
                    by2 by2Var = (by2) objectVolatile;
                    Object objN = by2Var.n();
                    if (objN != by2.x) {
                        Runnable runnable2 = (Runnable) objN;
                        jl1Var = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    by2 by2VarR = by2Var.r();
                    while (true) {
                        Unsafe unsafe3 = qr.g;
                        jl1Var = this;
                        if (unsafe3.compareAndSwapObject(jl1Var, b, objectVolatile, by2VarR) || unsafe3.getObjectVolatile(jl1Var, j) != objectVolatile) {
                            break;
                        }
                        this = jl1Var;
                    }
                    this = jl1Var;
                } else {
                    jl1Var = this;
                    if (objectVolatile != ky2Var) {
                        do {
                            unsafe2 = qr.g;
                            if (unsafe2.compareAndSwapObject(jl1Var, b, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(jl1Var, j) == objectVolatile);
                        this = jl1Var;
                    }
                }
                unsafe2 = unsafe;
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            dr drVar = jl1Var.q;
            if (((drVar == null || drVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(jl1Var, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof by2) {
                        long longVolatile = unsafe2.getLongVolatile((by2) objectVolatile2, by2.j);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == ky2Var) {
                        return Long.MAX_VALUE;
                    }
                }
                il1 il1Var = (il1) unsafe.getObjectVolatile(jl1Var, c);
                if (il1Var != null) {
                    synchronized (il1Var) {
                        hl1[] hl1VarArr = il1Var.g;
                        hl1Var = hl1VarArr != null ? hl1VarArr[0] : null;
                    }
                    if (hl1Var != null) {
                        long jNanoTime = hl1Var.j - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void X(Runnable runnable) {
        Y();
        if (!Z(runnable)) {
            o11.p.X(runnable);
            return;
        }
        Thread threadA0 = a0();
        if (Thread.currentThread() != threadA0) {
            LockSupport.unpark(threadA0);
        }
    }

    public final void Y() {
        hl1 hl1VarR;
        il1 il1Var = (il1) qr.g.getObjectVolatile(this, c);
        if (il1Var == null || il1Var.y() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (il1Var) {
                try {
                    hl1[] hl1VarArr = il1Var.g;
                    hl1VarR = null;
                    hl1 hl1Var = hl1VarArr != null ? hl1VarArr[0] : null;
                    if (hl1Var != null) {
                        if (jNanoTime - hl1Var.j >= 0 ? Z(hl1Var) : false) {
                            hl1VarR = il1Var.r(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (hl1VarR != null);
    }

    public final boolean Z(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            Unsafe unsafe4 = qr.g;
            long j = b;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (unsafe4.getIntVolatile(this, i) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = qr.g;
                    if (unsafe.compareAndSwapObject(this, b, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof by2) {
                by2 by2Var = (by2) objectVolatile;
                int iG = by2Var.g(runnable);
                if (iG == 0) {
                    return true;
                }
                if (iG == 1) {
                    by2 by2VarR = by2Var.r();
                    do {
                        unsafe2 = qr.g;
                        if (unsafe2.compareAndSwapObject(this, b, objectVolatile, by2VarR)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iG == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == c93.i) {
                    return false;
                }
                by2 by2Var2 = new by2(8, true);
                by2Var2.g((Runnable) objectVolatile);
                by2Var2.g(runnable);
                do {
                    unsafe3 = qr.g;
                    if (unsafe3.compareAndSwapObject(this, b, objectVolatile, by2Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public abstract Thread a0();

    public final boolean b0() {
        dr drVar = this.q;
        if (drVar != null ? drVar.isEmpty() : true) {
            Unsafe unsafe = qr.g;
            il1 il1Var = (il1) unsafe.getObjectVolatile(this, c);
            if (il1Var != null && il1Var.y() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, b);
            if (objectVolatile != null) {
                if (objectVolatile instanceof by2) {
                    long longVolatile = unsafe.getLongVolatile((by2) objectVolatile, by2.j);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == c93.i) {
                }
            }
            return true;
        }
        return false;
    }

    public void c0(long j, hl1 hl1Var) {
        o11.p.d0(j, hl1Var);
    }

    public final void d0(long j, hl1 hl1Var) {
        jl1 jl1Var;
        int iY;
        Unsafe unsafe;
        Thread threadA0;
        long j2 = c;
        Unsafe unsafe2 = qr.g;
        if (unsafe2.getIntVolatile(this, i) == 1) {
            jl1Var = this;
            iY = 1;
        } else {
            il1 il1Var = (il1) unsafe2.getObjectVolatile(this, j2);
            if (il1Var == null) {
                il1 il1Var2 = new il1();
                il1Var2.r = j;
                while (true) {
                    unsafe = qr.g;
                    jl1Var = this;
                    if (unsafe.compareAndSwapObject(jl1Var, c, (Object) null, il1Var2) || unsafe.getObjectVolatile(jl1Var, j2) != null) {
                        break;
                    } else {
                        this = jl1Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(jl1Var, j2);
                objectVolatile.getClass();
                il1Var = (il1) objectVolatile;
                unsafe2 = unsafe;
            } else {
                jl1Var = this;
            }
            iY = hl1Var.y(j, il1Var, jl1Var);
        }
        if (iY != 0) {
            if (iY == 1) {
                jl1Var.c0(j, hl1Var);
                return;
            } else {
                if (iY == 2) {
                    return;
                }
                l0.z("unexpected result");
                return;
            }
        }
        il1 il1Var3 = (il1) unsafe2.getObjectVolatile(jl1Var, j2);
        hl1 hl1Var2 = null;
        if (il1Var3 != null) {
            synchronized (il1Var3) {
                hl1[] hl1VarArr = il1Var3.g;
                hl1Var2 = hl1VarArr != null ? hl1VarArr[0] : null;
            }
        }
        if (hl1Var2 != hl1Var || Thread.currentThread() == (threadA0 = jl1Var.a0())) {
            return;
        }
        LockSupport.unpark(threadA0);
    }

    @Override // defpackage.el1
    public void shutdown() {
        ky2 ky2Var;
        Unsafe unsafe;
        hl1 hl1VarR;
        w85.g.set(null);
        qr.g.putIntVolatile(this, i, 1);
        ky2 ky2Var2 = c93.i;
        long j = b;
        loop0: while (true) {
            Object objectVolatile = qr.g.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = qr.g;
                    ky2Var = ky2Var2;
                    if (unsafe2.compareAndSwapObject(this, b, (Object) null, ky2Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        ky2Var2 = ky2Var;
                    }
                }
                ky2Var2 = ky2Var;
            } else {
                ky2Var = ky2Var2;
                if (objectVolatile instanceof by2) {
                    ((by2) objectVolatile).y();
                    break;
                }
                if (objectVolatile == ky2Var) {
                    break;
                }
                by2 by2Var = new by2(8, true);
                by2Var.g((Runnable) objectVolatile);
                do {
                    unsafe = qr.g;
                    if (unsafe.compareAndSwapObject(this, b, objectVolatile, by2Var)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                ky2Var2 = ky2Var;
            }
        }
        while (V() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            il1 il1Var = (il1) qr.g.getObjectVolatile(this, c);
            if (il1Var == null) {
                return;
            }
            synchronized (il1Var) {
                hl1VarR = il1Var.y() > 0 ? il1Var.r(0) : null;
            }
            if (hl1VarR == null) {
                return;
            } else {
                c0(jNanoTime, hl1VarR);
            }
        }
    }

    @Override // defpackage.k41
    public final void w(long j, ib0 ib0Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            fl1 fl1Var = new fl1(this, j2 + jNanoTime, ib0Var);
            d0(jNanoTime, fl1Var);
            ib0Var.d(new bb0(fl1Var, (byte) 1));
        }
    }
}
