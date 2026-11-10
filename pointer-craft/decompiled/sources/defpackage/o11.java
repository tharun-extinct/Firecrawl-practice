package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class o11 extends jl1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final o11 p;
    public static final long u;

    static {
        Long l;
        o11 o11Var = new o11();
        p = o11Var;
        o11Var.U(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        u = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.jl1
    public final void X(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.X(runnable);
    }

    @Override // defpackage.jl1
    public final Thread a0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(p.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.jl1
    public final void c0(long j, hl1 hl1Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void e0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = qr.g;
            unsafe.putObjectVolatile(this, jl1.b, (Object) null);
            unsafe.putObjectVolatile(this, jl1.c, (Object) null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        w85.g.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    e0();
                    if (b0()) {
                        return;
                    }
                    a0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jV = V();
                    if (jV == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = u + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            e0();
                            if (b0()) {
                                return;
                            }
                            a0();
                            return;
                        }
                        if (jV > j2) {
                            jV = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jV > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            e0();
                            if (b0()) {
                                return;
                            }
                            a0();
                            return;
                        }
                        LockSupport.parkNanos(this, jV);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            e0();
            if (!b0()) {
                a0();
            }
            throw th;
        }
    }

    @Override // defpackage.jl1, defpackage.el1
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.hx0
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.k41
    public final ya1 u(long j, Runnable runnable, fx0 fx0Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return nh3.j;
        }
        long jNanoTime = System.nanoTime();
        gl1 gl1Var = new gl1(runnable, j2 + jNanoTime);
        d0(jNanoTime, gl1Var);
        return gl1Var;
    }
}
