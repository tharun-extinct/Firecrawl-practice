package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bm1 extends am1 implements k41 {
    public final Executor a;

    public bm1(Executor executor) {
        Method method;
        this.a = executor;
        Method method2 = mp0.g;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = mp0.g) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.hx0
    public final void L(fx0 fx0Var, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            v70.a(fx0Var, k33.v("The task was rejected", e));
            x21 x21Var = na1.g;
            c21.a.L(fx0Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bm1) && ((bm1) obj).a == this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.hx0
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.k41
    public final ya1 u(long j, Runnable runnable, fx0 fx0Var) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                v70.a(fx0Var, k33.v("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new xa1(scheduledFutureSchedule) : o11.p.u(j, runnable, fx0Var);
    }

    @Override // defpackage.k41
    public final void w(long j, ib0 ib0Var) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            i26 i26Var = new i26((Object) this, (Object) ib0Var, (byte) 11);
            fx0 fx0Var = ib0Var.q;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(i26Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                v70.a(fx0Var, k33.v("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            ib0Var.d(new ab0(scheduledFutureSchedule));
        } else {
            o11.p.w(j, ib0Var);
        }
    }
}
