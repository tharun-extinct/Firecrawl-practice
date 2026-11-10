package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k0 implements vw2 {
    public static final Object c;
    public static final boolean m = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger q = Logger.getLogger(k0.class.getName());
    public static final rf6 w;
    public volatile j0 a;
    public volatile Object j;
    public volatile f0 t;

    static {
        rf6 i0Var;
        try {
            i0Var = new g0(AtomicReferenceFieldUpdater.newUpdater(j0.class, Thread.class, "g"), AtomicReferenceFieldUpdater.newUpdater(j0.class, j0.class, "y"), AtomicReferenceFieldUpdater.newUpdater(k0.class, j0.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k0.class, f0.class, "t"), AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "j"));
            th = null;
        } catch (Throwable th) {
            th = th;
            i0Var = new i0();
        }
        w = i0Var;
        if (th != null) {
            q.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        c = new Object();
    }

    public static Object l(vw2 vw2Var) {
        Object obj;
        if (vw2Var instanceof k0) {
            Object obj2 = ((k0) vw2Var).j;
            if (!(obj2 instanceof c0)) {
                return obj2;
            }
            c0 c0Var = (c0) obj2;
            if (c0Var.g) {
                return c0Var.y != null ? new c0(c0Var.y, false) : c0.n;
            }
            return obj2;
        }
        boolean zIsCancelled = vw2Var.isCancelled();
        boolean z = true;
        if ((!m) && zIsCancelled) {
            return c0.n;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = vw2Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (zIsCancelled) {
                    return new c0(e, false);
                }
                return new e0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + vw2Var, e));
            } catch (ExecutionException e2) {
                return new e0(e2.getCause());
            } catch (Throwable th2) {
                return new e0(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? c : obj;
    }

    public static void n(k0 k0Var) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3 = null;
        while (true) {
            j0 j0Var = k0Var.a;
            if (w.r(k0Var, j0Var, j0.r)) {
                while (j0Var != null) {
                    Thread thread = j0Var.g;
                    if (thread != null) {
                        j0Var.g = null;
                        LockSupport.unpark(thread);
                    }
                    j0Var = j0Var.y;
                }
                do {
                    f0Var = k0Var.t;
                } while (!w.g(k0Var, f0Var, f0.n));
                while (true) {
                    f0Var2 = f0Var3;
                    f0Var3 = f0Var;
                    if (f0Var3 == null) {
                        break;
                    }
                    f0Var = f0Var3.r;
                    f0Var3.r = f0Var2;
                }
                while (f0Var2 != null) {
                    f0Var3 = f0Var2.r;
                    Runnable runnable = f0Var2.g;
                    if (runnable instanceof h0) {
                        h0 h0Var = (h0) runnable;
                        k0Var = h0Var.j;
                        if (k0Var.j == h0Var) {
                            if (w.y(k0Var, h0Var, l(h0Var.t))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        v(runnable, f0Var2.y);
                    }
                    f0Var2 = f0Var3;
                }
                return;
            }
        }
    }

    public static void v(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            q.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object x(Object obj) throws ExecutionException {
        if (obj instanceof c0) {
            Throwable th = ((c0) obj).y;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof e0) {
            throw new ExecutionException(((e0) obj).g);
        }
        if (obj == c) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        c0 c0Var;
        Object obj = this.j;
        if (!(obj == null) && !(obj instanceof h0)) {
            return false;
        }
        if (m) {
            c0Var = new c0(new CancellationException("Future.cancel() was called."), z);
        } else {
            c0Var = z ? c0.r : c0.n;
        }
        boolean z2 = false;
        while (true) {
            if (w.y(this, obj, c0Var)) {
                n(this);
                if (!(obj instanceof h0)) {
                    break;
                }
                vw2 vw2Var = ((h0) obj).t;
                if (!(vw2Var instanceof k0)) {
                    vw2Var.cancel(z);
                    break;
                }
                this = (k0) vw2Var;
                obj = this.j;
                if (!(obj == null) && !(obj instanceof h0)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.j;
                if (!(obj instanceof h0)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // defpackage.vw2
    public final void g(Runnable runnable, Executor executor) {
        executor.getClass();
        f0 f0Var = this.t;
        f0 f0Var2 = f0.n;
        if (f0Var != f0Var2) {
            f0 f0Var3 = new f0(runnable, executor);
            do {
                f0Var3.r = f0Var;
                if (w.g(this, f0Var, f0Var3)) {
                    return;
                } else {
                    f0Var = this.t;
                }
            } while (f0Var != f0Var2);
        }
        v(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        j0 j0Var = j0.r;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.j;
        if ((obj != null) && (!(obj instanceof h0))) {
            return x(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            j0 j0Var2 = this.a;
            if (j0Var2 != j0Var) {
                j0 j0Var3 = new j0();
                z = true;
                while (true) {
                    rf6 rf6Var = w;
                    rf6Var.x(j0Var3, j0Var2);
                    if (rf6Var.r(this, j0Var2, j0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                t(j0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.j;
                            if ((obj2 != null) && (!(obj2 instanceof h0))) {
                                return x(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        t(j0Var3);
                        break;
                    }
                    j0Var2 = this.a;
                    if (j0Var2 == j0Var) {
                    }
                }
            }
            return x(this.j);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.j;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof h0))) {
                return x(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z2) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(du4.i(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.j instanceof c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.j;
        return (!(obj instanceof h0)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String j() {
        Object obj = this.j;
        if (obj instanceof h0) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            vw2 vw2Var = ((h0) obj).t;
            return du4.b(sb, vw2Var == this ? "this future" : String.valueOf(vw2Var), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void r(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void t(j0 j0Var) {
        j0Var.g = null;
        while (true) {
            j0 j0Var2 = this.a;
            if (j0Var2 == j0.r) {
                return;
            }
            j0 j0Var3 = null;
            while (j0Var2 != null) {
                j0 j0Var4 = j0Var2.y;
                if (j0Var2.g != null) {
                    j0Var3 = j0Var2;
                } else if (j0Var3 != null) {
                    j0Var3.y = j0Var4;
                    if (j0Var3.g == null) {
                    }
                } else if (!w.r(this, j0Var2, j0Var4)) {
                }
                j0Var2 = j0Var4;
            }
            return;
        }
    }

    public final String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.j instanceof c0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            r(sb);
        } else {
            try {
                strJ = j();
            } catch (RuntimeException e) {
                strJ = "Exception thrown from implementation: " + e.getClass();
            }
            if (strJ != null && !strJ.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strJ);
                sb.append("]");
            } else if (isDone()) {
                r(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        j0 j0Var = j0.r;
        if (!Thread.interrupted()) {
            Object obj2 = this.j;
            if ((obj2 != null) & (!(obj2 instanceof h0))) {
                return x(obj2);
            }
            j0 j0Var2 = this.a;
            if (j0Var2 != j0Var) {
                j0 j0Var3 = new j0();
                do {
                    rf6 rf6Var = w;
                    rf6Var.x(j0Var3, j0Var2);
                    if (rf6Var.r(this, j0Var2, j0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.j;
                            } else {
                                t(j0Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof h0))));
                        return x(obj);
                    }
                    j0Var2 = this.a;
                } while (j0Var2 != j0Var);
            }
            return x(this.j);
        }
        throw new InterruptedException();
    }
}
