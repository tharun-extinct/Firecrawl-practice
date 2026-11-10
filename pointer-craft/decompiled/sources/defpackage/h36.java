package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class h36 extends t16 implements a36 {
    public ScheduledFuture b;
    public a36 i;

    public static void a(h36 h36Var) {
        m16 m16Var = null;
        while (true) {
            h36Var.getClass();
            for (r16 r16VarN = t16.c.n(h36Var); r16VarN != null; r16VarN = r16VarN.y) {
                Thread thread = r16VarN.g;
                if (thread != null) {
                    r16VarN.g = null;
                    LockSupport.unpark(thread);
                }
            }
            a36 a36Var = h36Var.i;
            if ((h36Var.j instanceof i16) & (a36Var != null)) {
                Object obj = h36Var.j;
                a36Var.cancel((obj instanceof i16) && ((i16) obj).g);
            }
            ScheduledFuture scheduledFuture = h36Var.b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            h36Var.i = null;
            h36Var.b = null;
            m16 m16Var2 = m16Var;
            m16 m16VarR = t16.c.r(h36Var);
            m16 m16Var3 = m16Var2;
            while (m16VarR != null) {
                m16 m16Var4 = m16VarR.r;
                m16VarR.r = m16Var3;
                m16Var3 = m16VarR;
                m16VarR = m16Var4;
            }
            while (m16Var3 != null) {
                Runnable runnable = m16Var3.g;
                m16 m16Var5 = m16Var3.r;
                Objects.requireNonNull(runnable);
                if (runnable instanceof j16) {
                    j16 j16Var = (j16) runnable;
                    h36Var = j16Var.j;
                    if (h36Var.j != j16Var) {
                        continue;
                    } else if (t16.c.j(h36Var, j16Var, j(j16Var.t))) {
                        m16Var = m16Var5;
                    }
                } else {
                    Executor executor = m16Var3.y;
                    Objects.requireNonNull(executor);
                    m(runnable, executor);
                }
                m16Var3 = m16Var5;
            }
            return;
        }
    }

    public static Object j(a36 a36Var) {
        Object obj;
        Throwable thN;
        if (a36Var instanceof h36) {
            Object i16Var = ((h36) a36Var).j;
            if (i16Var instanceof i16) {
                i16 i16Var2 = (i16) i16Var;
                if (i16Var2.g) {
                    Throwable th = i16Var2.y;
                    i16Var = th != null ? new i16(th, false) : i16.n;
                }
            }
            Objects.requireNonNull(i16Var);
            return i16Var;
        }
        if ((a36Var instanceof t16) && (thN = ((t16) a36Var).n()) != null) {
            return new l16(thN);
        }
        boolean zIsCancelled = a36Var.isCancelled();
        boolean z = true;
        if ((!t16.w) && zIsCancelled) {
            i16 i16Var3 = i16.n;
            Objects.requireNonNull(i16Var3);
            return i16Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = a36Var.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new l16(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new l16(e);
            } catch (CancellationException e3) {
                return !zIsCancelled ? new l16(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(a36Var)), e3)) : new i16(e3, false);
            } catch (ExecutionException e4) {
                return zIsCancelled ? new i16(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(a36Var)), e4), false) : new l16(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (zIsCancelled) {
            return new i16(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(a36Var))), false);
        }
        return obj == null ? t16.m : obj;
    }

    public static boolean l(Object obj) {
        return !(obj instanceof j16);
    }

    public static void m(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            t16.q.g().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    public static Object v(Object obj) throws ExecutionException {
        if (obj instanceof i16) {
            Throwable th = ((i16) obj).y;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof l16) {
            throw new ExecutionException(((l16) obj).g);
        }
        if (obj == t16.m) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        i16 i16Var;
        Object obj = this.j;
        if (!(obj instanceof j16) && !(obj == null)) {
            return false;
        }
        if (t16.w) {
            i16Var = new i16(new CancellationException("Future.cancel() was called."), z);
        } else {
            i16Var = z ? i16.r : i16.n;
            Objects.requireNonNull(i16Var);
        }
        boolean z2 = false;
        while (true) {
            if (t16.c.j(this, obj, i16Var)) {
                a(this);
                if (obj instanceof j16) {
                    a36 a36Var = ((j16) obj).t;
                    if (a36Var instanceof h36) {
                        this = (h36) a36Var;
                        obj = this.j;
                        if ((obj == null) | (obj instanceof j16)) {
                            z2 = true;
                        }
                    } else {
                        a36Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.j;
            if (l(obj)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        r16 r16Var = r16.r;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.j;
        if ((obj != null) && l(obj)) {
            return v(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            r16 r16Var2 = this.a;
            if (r16Var2 != r16Var) {
                r16 r16Var3 = new r16();
                while (true) {
                    qc6 qc6Var = t16.c;
                    qc6Var.v(r16Var3, r16Var2);
                    if (qc6Var.t(this, r16Var2, r16Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                r(r16Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.j;
                            if ((obj2 != null) && l(obj2)) {
                                return v(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        r(r16Var3);
                        break;
                    }
                    long j4 = j3;
                    r16Var2 = this.a;
                    if (r16Var2 != r16Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.j;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.j;
            if ((obj4 != null) && l(obj4)) {
                return v(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == j2 || nanos2 > 1000;
            if (jConvert > j2) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
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
        return this.j instanceof i16;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.j;
        return (obj != null) & l(obj);
    }

    @Override // defpackage.t16
    public final Throwable n() {
        if (!(this instanceof h36)) {
            return null;
        }
        Object obj = this.j;
        if (obj instanceof l16) {
            return ((l16) obj).g;
        }
        return null;
    }

    public final void t(StringBuilder sb) {
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
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.j instanceof i16) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            t(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.j;
            if (obj instanceof j16) {
                sb.append(", setFuture=[");
                a36 a36Var = ((j16) obj).t;
                try {
                    if (a36Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(a36Var);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = x();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                t(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String x() {
        a36 a36Var = this.i;
        ScheduledFuture scheduledFuture = this.b;
        if (a36Var == null) {
            return null;
        }
        String strI = du4.i("inputFuture=[", a36Var.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strI + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strI;
    }

    @Override // defpackage.a36
    public final void y(Runnable runnable, Executor executor) {
        m16 m16Var;
        m16 m16Var2 = m16.n;
        if (executor == null) {
            l0.q("Executor was null.");
            return;
        }
        if (!isDone() && (m16Var = this.t) != m16Var2) {
            m16 m16Var3 = new m16(runnable, executor);
            do {
                m16Var3.r = m16Var;
                if (t16.c.l(this, m16Var, m16Var3)) {
                    return;
                } else {
                    m16Var = this.t;
                }
            } while (m16Var != m16Var2);
        }
        m(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        r16 r16Var = r16.r;
        if (!Thread.interrupted()) {
            Object obj2 = this.j;
            if ((obj2 != null) & l(obj2)) {
                return v(obj2);
            }
            r16 r16Var2 = this.a;
            if (r16Var2 != r16Var) {
                r16 r16Var3 = new r16();
                do {
                    qc6 qc6Var = t16.c;
                    qc6Var.v(r16Var3, r16Var2);
                    if (qc6Var.t(this, r16Var2, r16Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.j;
                            } else {
                                r(r16Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & l(obj)));
                        return v(obj);
                    }
                    r16Var2 = this.a;
                } while (r16Var2 != r16Var);
            }
            Object obj3 = this.j;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        throw new InterruptedException();
    }
}
