package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes2.dex */
public final class m34 extends m82 implements ul1 {
    public p82 a;
    public int b;
    public int c;
    public int i;
    public final q70 j;
    public final i14 l;
    public boolean m;
    public final Socket n;
    public long p;
    public boolean q;
    public final pa4 r;
    public final ArrayList s;
    public final int t;
    public final Socket v;
    public int w;
    public final v42 x;
    public final b35 y;

    public m34(b35 b35Var, o34 o34Var, pa4 pa4Var, Socket socket, Socket socket2, v42 v42Var, i14 i14Var, q70 q70Var, int i) {
        b35Var.getClass();
        pa4Var.getClass();
        socket.getClass();
        socket2.getClass();
        i14Var.getClass();
        q70Var.getClass();
        this.y = b35Var;
        this.r = pa4Var;
        this.n = socket;
        this.v = socket2;
        this.x = v42Var;
        this.l = i14Var;
        this.j = q70Var;
        this.t = i;
        this.b = 1;
        this.s = new ArrayList();
        this.p = Long.MAX_VALUE;
    }

    public static void n(hj3 hj3Var, pa4 pa4Var, IOException iOException) {
        pa4Var.getClass();
        iOException.getClass();
        if (pa4Var.y.type() != Proxy.Type.DIRECT) {
            t5 t5Var = pa4Var.g;
            t5Var.j.connectFailed(t5Var.t.l(), pa4Var.y.address(), iOException);
        }
        fa4 fa4Var = hj3Var.D;
        synchronized (fa4Var) {
            ((LinkedHashSet) fa4Var.t).add(pa4Var);
        }
    }

    @Override // defpackage.ul1
    public final void cancel() {
        ws5.r(this.n);
    }

    @Override // defpackage.m82
    public final void g(p82 p82Var, pl4 pl4Var) {
        pl4Var.getClass();
        synchronized (this) {
            this.b = (pl4Var.g & 8) != 0 ? pl4Var.y[3] : Integer.MAX_VALUE;
        }
    }

    @Override // defpackage.ul1
    public final void j() {
        synchronized (this) {
            this.m = true;
        }
    }

    public final boolean l(boolean z) {
        long j;
        TimeZone timeZone = ws5.g;
        long jNanoTime = System.nanoTime();
        if (this.n.isClosed() || this.v.isClosed() || this.v.isInputShutdown() || this.v.isOutputShutdown()) {
            return false;
        }
        p82 p82Var = this.a;
        if (p82Var != null) {
            synchronized (p82Var) {
                if (p82Var.w) {
                    return false;
                }
                return p82Var.o >= p82Var.h || jNanoTime < p82Var.f;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.p;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.v;
        h34 h34Var = (h34) this.j.a;
        socket.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !h34Var.y();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void t() throws SocketException {
        this.p = System.nanoTime();
        i14 i14Var = this.l;
        if (i14Var == i14.w || i14Var == i14.c) {
            this.v.setSoTimeout(0);
            t32 t32Var = t32.q;
            hr1 hr1Var = hr1.g;
            p5 p5Var = new p5(this.y);
            q70 q70Var = this.j;
            String str = this.r.g.t.n;
            q70Var.getClass();
            str.getClass();
            p5Var.r = q70Var;
            p5Var.n = ws5.y + ' ' + str;
            p5Var.v = this;
            p5Var.g = this.t;
            p5Var.x = hr1Var;
            p82 p82Var = new p82(p5Var);
            this.a = p82Var;
            pl4 pl4Var = p82.H;
            this.b = (pl4Var.g & 8) != 0 ? pl4Var.y[3] : Integer.MAX_VALUE;
            x82 x82Var = p82Var.E;
            synchronized (x82Var) {
                try {
                    if (x82Var.m) {
                        throw new IOException("closed");
                    }
                    Logger logger = x82.w;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(ws5.n(">> CONNECTION " + g82.g.r(), new Object[0]));
                    }
                    g34 g34Var = x82Var.j;
                    fa0 fa0Var = g82.g;
                    fa0Var.getClass();
                    if (g34Var.a) {
                        throw new IllegalStateException("closed");
                    }
                    g34Var.t.D(fa0Var);
                    g34Var.y();
                    x82Var.j.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            x82 x82Var2 = p82Var.E;
            pl4 pl4Var2 = p82Var.d;
            x82Var2.getClass();
            pl4Var2.getClass();
            synchronized (x82Var2) {
                try {
                    if (x82Var2.m) {
                        throw new IOException("closed");
                    }
                    x82Var2.t(0, Integer.bitCount(pl4Var2.g) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & pl4Var2.g) == 0) {
                            z = false;
                        }
                        if (z) {
                            g34 g34Var2 = x82Var2.j;
                            if (g34Var2.a) {
                                throw new IllegalStateException("closed");
                            }
                            c70 c70Var = g34Var2.t;
                            mh4 mh4VarA = c70Var.A(2);
                            byte[] bArr = mh4VarA.g;
                            int i2 = mh4VarA.r;
                            bArr[i2] = (byte) ((i >>> 8) & 255);
                            bArr[i2 + 1] = (byte) (i & 255);
                            mh4VarA.r = i2 + 2;
                            c70Var.t += 2;
                            g34Var2.y();
                            x82Var2.j.t(pl4Var2.y[i]);
                        }
                    }
                    x82Var2.j.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iG = p82Var.d.g();
            if (iG != 65535) {
                p82Var.E.u(0, iG - 65535);
            }
            a35.y(p82Var.c.n(), p82Var.a, p82Var.F);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        pa4 pa4Var = this.r;
        sb.append(pa4Var.g.t.n);
        sb.append(':');
        sb.append(pa4Var.g.t.v);
        sb.append(", proxy=");
        sb.append(pa4Var.y);
        sb.append(" hostAddress=");
        sb.append(pa4Var.r);
        sb.append(" cipherSuite=");
        v42 v42Var = this.x;
        sb.append(v42Var != null ? v42Var.y : "none");
        sb.append(" protocol=");
        sb.append(this.l);
        sb.append('}');
        return sb.toString();
    }

    public final boolean v(t5 t5Var, List list) {
        a92 a92Var = t5Var.t;
        String str = a92Var.n;
        TimeZone timeZone = ws5.g;
        if (this.s.size() < this.b && !this.m) {
            pa4 pa4Var = this.r;
            t5 t5Var2 = pa4Var.g;
            t5 t5Var3 = pa4Var.g;
            if (t5Var2.g(t5Var)) {
                if (!yf2.p(str, t5Var3.t.n)) {
                    if (this.a != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            pa4 pa4Var2 = (pa4) it.next();
                            Proxy.Type type = pa4Var2.y.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && pa4Var.y.type() == type2 && yf2.p(pa4Var.r, pa4Var2.r)) {
                                if (t5Var.n != fj3.g) {
                                    break;
                                }
                                TimeZone timeZone2 = ws5.g;
                                a92 a92Var2 = t5Var3.t;
                                if (a92Var.v != a92Var2.v) {
                                    break;
                                }
                                boolean zP = yf2.p(str, a92Var2.n);
                                v42 v42Var = this.x;
                                if (!zP) {
                                    if (!this.q && v42Var != null) {
                                        List listG = v42Var.g();
                                        if (!listG.isEmpty()) {
                                            Object obj = listG.get(0);
                                            obj.getClass();
                                            if (!fj3.r(str, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    jc0 jc0Var = t5Var.v;
                                    jc0Var.getClass();
                                    v42Var.getClass();
                                    List listG2 = v42Var.g();
                                    str.getClass();
                                    listG2.getClass();
                                    Iterator it2 = jc0Var.g.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    fj.w(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ul1
    public final pa4 x() {
        return this.r;
    }

    @Override // defpackage.ul1
    public final void y(l34 l34Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof ox4)) {
                    if (!(this.a != null) || (iOException instanceof lq0)) {
                        this.m = true;
                        if (this.c == 0) {
                            if (iOException != null) {
                                n(l34Var.j, this.r, iOException);
                            }
                            this.w++;
                        }
                    }
                } else if (((ox4) iOException).j == kk1.c) {
                    int i = this.i + 1;
                    this.i = i;
                    if (i > 1) {
                        this.m = true;
                        this.w++;
                    }
                } else if (((ox4) iOException).j != kk1.i || !l34Var.k) {
                    this.m = true;
                    this.w++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
