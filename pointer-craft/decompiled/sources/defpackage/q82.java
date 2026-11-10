package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class q82 implements vl1 {
    public final m34 g;
    public volatile w82 n;
    public final p82 r;
    public final i14 v;
    public volatile boolean x;
    public final p34 y;
    public static final List l = ws5.w(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List j = ws5.w(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    public q82(hj3 hj3Var, m34 m34Var, p34 p34Var, p82 p82Var) {
        p82Var.getClass();
        this.g = m34Var;
        this.y = p34Var;
        this.r = p82Var;
        List list = hj3Var.u;
        i14 i14Var = i14.c;
        this.v = list.contains(i14Var) ? i14Var : i14.w;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    @Override // defpackage.vl1
    public final y74 a(boolean z) throws IOException {
        c52 c52Var;
        boolean z2;
        w82 w82Var = this.n;
        if (w82Var == null) {
            uo1.t("stream wasn't created");
            return null;
        }
        synchronized (w82Var) {
            while (true) {
                if (!w82Var.w.isEmpty() || w82Var.l() != null) {
                    break;
                }
                if (!z) {
                    w82Var.t.getClass();
                    t82 t82Var = w82Var.b;
                    z2 = t82Var.a || t82Var.j;
                }
                if (z2) {
                    w82Var.s.j();
                }
                try {
                    try {
                        w82Var.wait();
                        if (z2) {
                            w82Var.s.m();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        w82Var.s.m();
                    }
                    throw th;
                }
            }
            if (w82Var.w.isEmpty()) {
                IOException iOException = w82Var.z;
                if (iOException != null) {
                    throw iOException;
                }
                kk1 kk1VarL = w82Var.l();
                kk1VarL.getClass();
                throw new ox4(kk1VarL);
            }
            Object objRemoveFirst = w82Var.w.removeFirst();
            objRemoveFirst.getClass();
            c52Var = (c52) objRemoveFirst;
        }
        i14 i14Var = this.v;
        ArrayList arrayList = new ArrayList(20);
        int size = c52Var.size();
        ld1 ld1VarY = null;
        for (int i = 0; i < size; i++) {
            String strV = ec6.v(c52Var, i);
            String strL = ec6.l(c52Var, i);
            if (strV.equals(":status")) {
                ld1VarY = kg6.y("HTTP/1.1 ".concat(strL));
            } else if (!j.contains(strV)) {
                arrayList.add(strV);
                arrayList.add(tx4.q0(strL).toString());
            }
        }
        if (ld1VarY == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        y74 y74Var = new y74();
        y74Var.y = i14Var;
        y74Var.r = ld1VarY.y;
        y74Var.n = (String) ld1VarY.n;
        y74Var.x = ec6.x(new c52((String[]) arrayList.toArray(new String[0])));
        if (z && y74Var.r == 100) {
            return null;
        }
        return y74Var;
    }

    @Override // defpackage.vl1
    public final void cancel() {
        this.x = true;
        w82 w82Var = this.n;
        if (w82Var != null) {
            w82Var.x(kk1.i);
        }
    }

    @Override // defpackage.vl1
    public final hu4 g(z74 z74Var) {
        w82 w82Var = this.n;
        w82Var.getClass();
        return w82Var.i;
    }

    @Override // defpackage.vl1
    public final bq4 j(rr rrVar, long j2) {
        w82 w82Var = this.n;
        w82Var.getClass();
        return w82Var.b;
    }

    @Override // defpackage.vl1
    public final long l(z74 z74Var) {
        if (y82.g(z74Var)) {
            return ws5.v(z74Var);
        }
        return 0L;
    }

    @Override // defpackage.vl1
    public final void n() {
        this.r.E.flush();
    }

    @Override // defpackage.vl1
    public final boolean r() {
        boolean z;
        w82 w82Var = this.n;
        if (w82Var != null) {
            synchronized (w82Var) {
                u82 u82Var = w82Var.i;
                z = u82Var.t && u82Var.m.y();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vl1
    public final void t(rr rrVar) throws IOException {
        int i;
        w82 w82Var;
        boolean z;
        if (this.n != null) {
            return;
        }
        boolean z2 = ((d74) rrVar.v) != null;
        c52 c52Var = (c52) rrVar.n;
        ArrayList arrayList = new ArrayList(c52Var.size() + 4);
        arrayList.add(new b52(b52.x, rrVar.y));
        fa0 fa0Var = b52.l;
        a92 a92Var = (a92) rrVar.r;
        a92Var.getClass();
        String strY = a92Var.y();
        String strN = a92Var.n();
        if (strN != null) {
            strY = strY + '?' + strN;
        }
        arrayList.add(new b52(fa0Var, strY));
        String strG = c52Var.g("Host");
        if (strG != null) {
            arrayList.add(new b52(b52.t, strG));
        }
        arrayList.add(new b52(b52.j, a92Var.g));
        int size = c52Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strV = ec6.v(c52Var, i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strV.toLowerCase(locale);
            lowerCase.getClass();
            if (!l.contains(lowerCase) || (lowerCase.equals("te") && ec6.l(c52Var, i2).equals("trailers"))) {
                arrayList.add(new b52(lowerCase, ec6.l(c52Var, i2)));
            }
        }
        p82 p82Var = this.r;
        p82Var.getClass();
        boolean z3 = !z2;
        synchronized (p82Var.E) {
            synchronized (p82Var) {
                try {
                    if (p82Var.q > 1073741823) {
                        p82Var.a(kk1.c);
                    }
                    if (p82Var.w) {
                        throw new lq0();
                    }
                    i = p82Var.q;
                    p82Var.q = i + 2;
                    w82Var = new w82(i, p82Var, z3, false, null);
                    z = !z2 || p82Var.B >= p82Var.C || w82Var.m >= w82Var.q;
                    if (w82Var.t()) {
                        p82Var.t.put(Integer.valueOf(i), w82Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            p82Var.E.w(z3, i, arrayList);
        }
        if (z) {
            p82Var.E.flush();
        }
        this.n = w82Var;
        boolean z4 = this.x;
        w82 w82Var2 = this.n;
        if (z4) {
            w82Var2.getClass();
            w82Var2.x(kk1.i);
            uo1.t("Canceled");
        } else {
            w82Var2.getClass();
            w82Var2.s.l(this.y.l);
            w82 w82Var3 = this.n;
            w82Var3.getClass();
            w82Var3.p.l(this.y.j);
        }
    }

    @Override // defpackage.vl1
    public final vt4 v() {
        w82 w82Var = this.n;
        w82Var.getClass();
        return w82Var;
    }

    @Override // defpackage.vl1
    public final ul1 x() {
        return this.g;
    }

    @Override // defpackage.vl1
    public final void y() {
        w82 w82Var = this.n;
        w82Var.getClass();
        w82Var.b.close();
    }
}
