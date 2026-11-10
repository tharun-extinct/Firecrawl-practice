package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class nn1 implements wl1 {
    public long a;
    public final r34 j;
    public final CopyOnWriteArrayList m;
    public final LinkedBlockingDeque q;
    public final b35 t;

    public nn1(r34 r34Var, b35 b35Var) {
        b35Var.getClass();
        this.j = r34Var;
        this.t = b35Var;
        this.a = Long.MIN_VALUE;
        this.m = new CopyOnWriteArrayList();
        this.q = new LinkedBlockingDeque();
    }

    public final void g() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            ra4 ra4Var = (ra4) it.next();
            ra4Var.cancel();
            ra4 ra4VarG = ra4Var.g();
            if (ra4VarG != null) {
                this.j.s.addLast(ra4VarG);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // defpackage.wl1
    public final m34 n() throws IOException {
        qa4 qa4VarY;
        long j;
        qa4 qa4Var;
        IOException iOException = null;
        while (true) {
            try {
                if (this.m.isEmpty() && !this.j.g(null)) {
                    break;
                }
                if (this.j.q.k) {
                    throw new IOException("Canceled");
                }
                fa4 fa4Var = this.t.g;
                long jNanoTime = System.nanoTime();
                long j2 = this.a - jNanoTime;
                if (this.m.isEmpty() || j2 <= 0) {
                    qa4VarY = y();
                    j = 250000000;
                    this.a = jNanoTime + 250000000;
                } else {
                    j = j2;
                    qa4VarY = null;
                }
                if (qa4VarY == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.m;
                    if (copyOnWriteArrayList.isEmpty() || (qa4Var = (qa4) this.q.poll(j, timeUnit)) == null) {
                        qa4VarY = null;
                    } else {
                        copyOnWriteArrayList.remove(qa4Var.g);
                        qa4VarY = qa4Var;
                    }
                    if (qa4VarY == null) {
                    }
                }
                boolean z = false;
                if (qa4VarY.y == null && qa4VarY.r == null) {
                    g();
                    if (!qa4VarY.g.v()) {
                        qa4VarY = qa4VarY.g.r();
                    }
                    if (qa4VarY.y == null && qa4VarY.r == null) {
                        z = true;
                    }
                    if (z) {
                        m34 m34VarN = qa4VarY.g.n();
                        g();
                        return m34VarN;
                    }
                }
                Throwable th = qa4VarY.r;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        kf6.g(iOException, th);
                    }
                    if (((IOException) th) instanceof fg1) {
                        break;
                    }
                }
                ra4 ra4Var = qa4VarY.y;
                if (ra4Var != null) {
                    this.j.s.addFirst(ra4Var);
                }
            } catch (Throwable th2) {
                g();
                throw th2;
            }
        }
        g();
        iOException.getClass();
        throw iOException;
    }

    @Override // defpackage.wl1
    public final r34 x() {
        return this.j;
    }

    public final qa4 y() {
        ra4 kn1Var;
        r34 r34Var = this.j;
        if (r34Var.g(null)) {
            try {
                kn1Var = r34Var.y();
            } catch (Throwable th) {
                kn1Var = new kn1(th);
            }
            if (kn1Var.v()) {
                return new qa4(kn1Var, (Throwable) null, 6);
            }
            if (kn1Var instanceof kn1) {
                return ((kn1) kn1Var).g;
            }
            this.m.add(kn1Var);
            this.t.n().l(new mn1(ws5.y + " connect " + r34Var.a.t.x(), kn1Var, this), 0L);
        }
        return null;
    }
}
