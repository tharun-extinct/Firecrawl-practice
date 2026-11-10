package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class l34 implements Cloneable {
    public final o34 a;
    public m34 b;
    public Object c;
    public volatile tl1 d;
    public final CopyOnWriteArrayList e;
    public boolean f;
    public boolean h;
    public wl1 i;
    public final hj3 j;
    public volatile boolean k;
    public volatile dl1 m;
    public boolean o;
    public tl1 p;
    public final k34 q;
    public boolean s;
    public final rr t;
    public boolean u;
    public final AtomicBoolean w;
    public boolean z;

    static {
        AtomicReferenceFieldUpdater.newUpdater(l34.class, dl1.class, "m");
    }

    public l34(hj3 hj3Var, rr rrVar) {
        this.j = hj3Var;
        this.t = rrVar;
        this.a = (o34) hj3Var.F.t;
        hj3Var.n.getClass();
        this.m = dl1.g;
        k34 k34Var = new k34(this);
        k34Var.l(hj3Var.f);
        this.q = k34Var;
        this.w = new AtomicBoolean();
        this.f = true;
        this.e = new CopyOnWriteArrayList();
        new AtomicReference((bi6) rrVar.x);
    }

    public final Object clone() {
        return new l34(this.j, this.t);
    }

    public final void g(m34 m34Var) {
        m34Var.getClass();
        TimeZone timeZone = ws5.g;
        if (this.b != null) {
            l0.z("Check failed.");
        } else {
            this.b = m34Var;
            m34Var.s.add(new j34(this, this.c));
        }
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f) {
                this.f = false;
                if (!this.u && !this.z && !this.h && !this.o) {
                    z = true;
                }
            }
        }
        return z ? y(iOException) : iOException;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004d  */
    public final IOException l(tl1 tl1Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        tl1Var.getClass();
        if (tl1Var.equals(this.d)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.u) {
                            if (z) {
                                this.u = false;
                            }
                            if (z2) {
                                this.z = false;
                            }
                            if (z4) {
                                this.h = false;
                            }
                            if (z3) {
                                this.o = false;
                            }
                            if (this.u) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = true;
                            }
                            boolean z8 = z5;
                            z5 = z7;
                            z6 = z8;
                        } else if ((!z2 && this.z) || ((z4 && this.h) || (z3 && this.o))) {
                            if (z) {
                                this.u = false;
                            }
                            if (z2) {
                                this.z = false;
                            }
                            if (z4) {
                                this.h = false;
                            }
                            if (z3) {
                                this.o = false;
                            }
                            if (this.u || this.z || this.h || this.o) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && !this.f) {
                                z5 = true;
                            }
                            boolean z9 = z5;
                            z5 = z7;
                            z6 = z9;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = !z2 ? false : false;
                }
            }
            if (z5) {
                this.d = null;
                m34 m34Var = this.b;
                if (m34Var != null) {
                    synchronized (m34Var) {
                        m34Var.c++;
                    }
                }
            }
            if (z6) {
                return y(iOException);
            }
        }
        return iOException;
    }

    public final void n(ua0 ua0Var) {
        if (!this.w.compareAndSet(false, true)) {
            l0.z("Already Executed");
            return;
        }
        ys3 ys3Var = ys3.g;
        this.c = ys3.g.j();
        this.m.getClass();
        ty tyVar = this.j.g;
        i34 i34Var = new i34(this, ua0Var);
        tyVar.getClass();
        ty.w(tyVar, i34Var, null, 6);
    }

    public final void r() {
        if (this.k) {
            return;
        }
        this.k = true;
        tl1 tl1Var = this.d;
        if (tl1Var != null) {
            tl1Var.r.cancel();
        }
        Iterator it = this.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ra4) it.next()).cancel();
        }
        this.m.getClass();
    }

    public final Socket t() {
        m34 m34Var = this.b;
        m34Var.getClass();
        TimeZone timeZone = ws5.g;
        ArrayList arrayList = m34Var.s;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (yf2.p(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            l0.z("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.b = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        m34Var.p = System.nanoTime();
        o34 o34Var = this.a;
        ConcurrentLinkedQueue concurrentLinkedQueue = o34Var.n;
        TimeZone timeZone2 = ws5.g;
        if (!m34Var.m) {
            o34Var.y.l(o34Var.r, 0L);
            return null;
        }
        m34Var.m = true;
        concurrentLinkedQueue.remove(m34Var);
        if (concurrentLinkedQueue.isEmpty()) {
            a35 a35Var = o34Var.y;
            synchronized (a35Var.g) {
                if (a35Var.g()) {
                    a35Var.g.r(a35Var);
                }
            }
        }
        return m34Var.v;
    }

    public final void v(boolean z) {
        tl1 tl1Var;
        synchronized (this) {
            if (!this.f) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (tl1Var = this.d) != null) {
            tl1Var.r.cancel();
            tl1Var.g.l(tl1Var, true, true, true, true, null);
        }
        this.p = null;
    }

    public final z74 x() {
        ArrayList arrayList = new ArrayList();
        hj0.a0(arrayList, this.j.y);
        arrayList.add(new ra0((byte) 4));
        arrayList.add(new ra0((byte) 2));
        arrayList.add(new ra0((byte) 3));
        arrayList.add(ra0.r);
        hj0.a0(arrayList, this.j.r);
        arrayList.add(ra0.y);
        rr rrVar = this.t;
        hj3 hj3Var = this.j;
        try {
            try {
                z74 z74VarY = new p34(this, arrayList, 0, null, rrVar, hj3Var.k, hj3Var.d, hj3Var.e, hj3Var.l, hj3Var.h, hj3Var.F, hj3Var.a, hj3Var.m, hj3Var.z, hj3Var.q, hj3Var.c, hj3Var.w, hj3Var.v, hj3Var.i, hj3Var.b, hj3Var.s, hj3Var.o).y(this.t);
                if (this.k) {
                    us5.r(z74VarY);
                    throw new IOException("Canceled");
                }
                j(null);
                return z74VarY;
            } catch (IOException e) {
                IOException iOExceptionJ = j(e);
                iOExceptionJ.getClass();
                throw iOExceptionJ;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                j(null);
            }
            throw th;
        }
    }

    public final IOException y(IOException iOException) {
        IOException interruptedIOException;
        Socket socketT;
        TimeZone timeZone = ws5.g;
        m34 m34Var = this.b;
        if (m34Var != null) {
            synchronized (m34Var) {
                socketT = t();
            }
            if (this.b == null) {
                if (socketT != null) {
                    ws5.r(socketT);
                }
                this.m.getClass();
            } else if (socketT != null) {
                l0.z("Check failed.");
                return null;
            }
        }
        if (!this.s && this.q.t()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        dl1 dl1Var = this.m;
        if (iOException == null) {
            dl1Var.getClass();
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        dl1Var.getClass();
        return interruptedIOException;
    }
}
