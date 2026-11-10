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

/* JADX INFO: loaded from: classes.dex */
public class wh6 implements a36 {
    public static final Object c;
    public static final boolean m = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger q = Logger.getLogger(wh6.class.getName());
    public static final sp2 w;
    public volatile vf6 a;
    public volatile Object j;
    public volatile v86 t;

    static {
        sp2 ue6Var;
        try {
            ue6Var = new ub6(AtomicReferenceFieldUpdater.newUpdater(vf6.class, Thread.class, "g"), AtomicReferenceFieldUpdater.newUpdater(vf6.class, vf6.class, "y"), AtomicReferenceFieldUpdater.newUpdater(wh6.class, vf6.class, "a"), AtomicReferenceFieldUpdater.newUpdater(wh6.class, v86.class, "t"), AtomicReferenceFieldUpdater.newUpdater(wh6.class, Object.class, "j"));
            th = null;
        } catch (Throwable th) {
            th = th;
            ue6Var = new ue6();
        }
        Throwable th2 = th;
        w = ue6Var;
        if (th2 != null) {
            q.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        c = new Object();
    }

    public static final Object j(Object obj) throws ExecutionException {
        if (obj instanceof l46) {
            Throwable th = ((l46) obj).g;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof k76) {
            throw new ExecutionException(((k76) obj).g);
        }
        if (obj == c) {
            return null;
        }
        return obj;
    }

    public static void n(wh6 wh6Var) {
        vf6 vf6Var;
        sp2 sp2Var;
        v86 v86Var;
        v86 v86Var2;
        v86 v86Var3;
        do {
            vf6Var = wh6Var.a;
            sp2Var = w;
        } while (!sp2Var.F(wh6Var, vf6Var, vf6.r));
        while (true) {
            v86Var = null;
            if (vf6Var == null) {
                break;
            }
            Thread thread = vf6Var.g;
            if (thread != null) {
                vf6Var.g = null;
                LockSupport.unpark(thread);
            }
            vf6Var = vf6Var.y;
        }
        do {
            v86Var2 = wh6Var.t;
        } while (!sp2Var.D(wh6Var, v86Var2, v86.n));
        while (true) {
            v86Var3 = v86Var;
            v86Var = v86Var2;
            if (v86Var == null) {
                break;
            }
            v86Var2 = v86Var.r;
            v86Var.r = v86Var3;
        }
        while (v86Var3 != null) {
            Runnable runnable = v86Var3.g;
            v86 v86Var4 = v86Var3.r;
            x(runnable, v86Var3.y);
            v86Var3 = v86Var4;
        }
    }

    public static void x(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            q.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        l46 l46Var;
        Object obj = this.j;
        if (obj != null) {
            return false;
        }
        if (m) {
            l46Var = new l46(new CancellationException("Future.cancel() was called."));
        } else {
            l46Var = z ? l46.y : l46.r;
        }
        if (!w.E(this, obj, l46Var)) {
            return false;
        }
        n(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.j;
        if (obj != null) {
            return j(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            vf6 vf6Var = this.a;
            vf6 vf6Var2 = vf6.r;
            if (vf6Var != vf6Var2) {
                vf6 vf6Var3 = new vf6();
                while (true) {
                    sp2 sp2Var = w;
                    sp2Var.B(vf6Var3, vf6Var);
                    if (sp2Var.F(this, vf6Var, vf6Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                l(vf6Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.j;
                            if (obj2 != null) {
                                return j(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        l(vf6Var3);
                        break;
                    }
                    vf6Var = this.a;
                    if (vf6Var == vf6Var2) {
                    }
                }
            }
            return j(this.j);
        }
        while (nanos > 0) {
            Object obj3 = this.j;
            if (obj3 != null) {
                return j(obj3);
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
            boolean z = true;
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
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
        return this.j instanceof l46;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.j != null;
    }

    public final void l(vf6 vf6Var) {
        vf6Var.g = null;
        while (true) {
            vf6 vf6Var2 = this.a;
            if (vf6Var2 != vf6.r) {
                vf6 vf6Var3 = null;
                while (vf6Var2 != null) {
                    vf6 vf6Var4 = vf6Var2.y;
                    if (vf6Var2.g != null) {
                        vf6Var3 = vf6Var2;
                    } else if (vf6Var3 != null) {
                        vf6Var3.y = vf6Var4;
                        if (vf6Var3.g == null) {
                        }
                    } else if (!w.F(this, vf6Var2, vf6Var4)) {
                    }
                    vf6Var2 = vf6Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String r() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.j instanceof l46) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            v(sb);
        } else {
            try {
                strConcat = r();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                v(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void v(StringBuilder sb) {
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

    @Override // defpackage.a36
    public final void y(Runnable runnable, Executor executor) {
        executor.getClass();
        v86 v86Var = this.t;
        v86 v86Var2 = v86.n;
        if (v86Var != v86Var2) {
            v86 v86Var3 = new v86(runnable, executor);
            do {
                v86Var3.r = v86Var;
                if (w.D(this, v86Var, v86Var3)) {
                    return;
                } else {
                    v86Var = this.t;
                }
            } while (v86Var != v86Var2);
        }
        x(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.j;
            if (obj2 != null) {
                return j(obj2);
            }
            vf6 vf6Var = this.a;
            vf6 vf6Var2 = vf6.r;
            if (vf6Var != vf6Var2) {
                vf6 vf6Var3 = new vf6();
                do {
                    sp2 sp2Var = w;
                    sp2Var.B(vf6Var3, vf6Var);
                    if (sp2Var.F(this, vf6Var, vf6Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.j;
                            } else {
                                l(vf6Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return j(obj);
                    }
                    vf6Var = this.a;
                } while (vf6Var != vf6Var2);
            }
            return j(this.j);
        }
        throw new InterruptedException();
    }
}
