package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class up0 implements ra4, ul1 {
    public final r34 a;
    public final eg1 b;
    public final int c;
    public m34 f;
    public final b35 g;
    public i14 h;
    public final boolean i;
    public final boolean j;
    public final int l;
    public final pa4 m;
    public final int n;
    public q70 o;
    public Socket p;
    public final List q;
    public final int r;
    public volatile boolean s;
    public final l34 t;
    public Socket u;
    public final int v;
    public final rr w;
    public final int x;
    public final o34 y;
    public v42 z;

    public up0(b35 b35Var, o34 o34Var, int i, int i2, int i3, int i4, int i5, boolean z, l34 l34Var, r34 r34Var, pa4 pa4Var, List list, rr rrVar, int i6, boolean z2, eg1 eg1Var) {
        b35Var.getClass();
        pa4Var.getClass();
        this.g = b35Var;
        this.y = o34Var;
        this.r = i;
        this.n = i2;
        this.v = i3;
        this.x = i4;
        this.l = i5;
        this.j = z;
        this.t = l34Var;
        this.a = r34Var;
        this.m = pa4Var;
        this.q = list;
        this.w = rrVar;
        this.c = i6;
        this.i = z2;
        this.b = eg1Var;
    }

    public static up0 q(up0 up0Var, pa4 pa4Var, int i, boolean z, eg1 eg1Var, int i2) {
        return new up0(up0Var.g, up0Var.y, up0Var.r, up0Var.n, up0Var.v, up0Var.x, up0Var.l, up0Var.j, up0Var.t, up0Var.a, (i2 & 1) != 0 ? up0Var.m : pa4Var, up0Var.q, up0Var.w, (i2 & 8) != 0 ? up0Var.c : i, (i2 & 16) != 0 ? up0Var.i : z, (i2 & 32) != 0 ? up0Var.b : eg1Var);
    }

    public final void a(SSLSocket sSLSocket, nq0 nq0Var) {
        i14 i14VarI;
        t5 t5Var = this.m.g;
        try {
            if (nq0Var.y) {
                ys3 ys3Var = ys3.g;
                ys3.g.n(sSLSocket, t5Var.t.n, t5Var.a, this.m.n);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            v42 v42VarG = og6.g(session);
            HostnameVerifier hostnameVerifier = t5Var.n;
            hostnameVerifier.getClass();
            boolean zVerify = hostnameVerifier.verify(t5Var.t.n, session);
            byte b = 2;
            if (!zVerify) {
                List listG = v42VarG.g();
                if (listG.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + t5Var.t.n + " not verified (no certificates)");
                }
                Object obj = listG.get(0);
                obj.getClass();
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(t5Var.t.n);
                sb.append(" not verified:\n            |    certificate: ");
                jc0 jc0Var = jc0.r;
                sb.append(ib6.x(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(cj0.w0(fj3.g(x509Certificate, 7), fj3.g(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(ux4.I(sb.toString()));
            }
            jc0 jc0Var2 = t5Var.v;
            jc0Var2.getClass();
            this.z = new v42(v42VarG.g, v42VarG.y, v42VarG.r, new lt(jc0Var2, v42VarG, t5Var, b));
            t5Var.t.n.getClass();
            Iterator it = jc0Var2.g.iterator();
            String strL = null;
            if (it.hasNext()) {
                fj.w(it.next());
                throw null;
            }
            if (nq0Var.y) {
                ys3 ys3Var2 = ys3.g;
                strL = ys3.g.l(sSLSocket);
            }
            this.u = sSLSocket;
            this.o = new q70(new ty(sSLSocket));
            if (strL != null) {
                i14.t.getClass();
                i14VarI = t32.i(strL);
            } else {
                i14VarI = i14.m;
            }
            this.h = i14VarI;
            ys3 ys3Var3 = ys3.g;
            ys3.g.getClass();
        } catch (Throwable th) {
            ys3 ys3Var4 = ys3.g;
            ys3.g.getClass();
            ws5.r(sSLSocket);
            throw th;
        }
    }

    public final up0 c(List list, SSLSocket sSLSocket, SSLException sSLException) throws fg1 {
        if (this.b != null) {
            return null;
        }
        ys3 ys3Var = ys3.g;
        eg1 eg1VarX = ys3.g.x(sSLException);
        if (eg1VarX != null) {
            HostnameVerifier hostnameVerifier = this.m.g.n;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(eg1VarX.g, sSLSocket.getSession())) {
                throw new fg1(du4.b(new StringBuilder("public_name '"), eg1VarX.g, "' not verified"), sSLException);
            }
            pa4 pa4Var = this.m;
            return q(this, new pa4(pa4Var.g, pa4Var.y, pa4Var.r, eg1VarX.y), 0, false, eg1VarX, 30);
        }
        if (!this.j) {
            return null;
        }
        if (((sSLException instanceof SSLHandshakeException) && (sSLException.getCause() instanceof CertificateException)) || (sSLException instanceof SSLPeerUnverifiedException)) {
            return null;
        }
        return w(list, sSLSocket);
    }

    @Override // defpackage.ra4
    public final void cancel() {
        this.s = true;
        Socket socket = this.p;
        if (socket != null) {
            ws5.r(socket);
        }
    }

    @Override // defpackage.ra4
    public final ra4 g() {
        return new up0(this.g, this.y, this.r, this.n, this.v, this.x, this.l, this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, this.b);
    }

    public final up0 i(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        if (this.c != -1) {
            return this;
        }
        up0 up0VarW = w(list, sSLSocket);
        if (up0VarW != null) {
            return up0VarW;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.i);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // defpackage.ra4
    public final qa4 l() {
        Socket socket;
        Socket socket2;
        if (this.p != null) {
            l0.z("TCP already connected");
            return null;
        }
        this.t.e.add(this);
        boolean z = false;
        try {
            try {
                dl1 dl1Var = this.t.m;
                pa4 pa4Var = this.m;
                InetSocketAddress inetSocketAddress = pa4Var.r;
                Proxy proxy = pa4Var.y;
                dl1Var.getClass();
                inetSocketAddress.getClass();
                proxy.getClass();
                this.m.getClass();
                t();
                z = true;
                qa4 qa4Var = new qa4(this, (Throwable) null, 6);
                this.t.e.remove(this);
                return qa4Var;
            } catch (IOException e) {
                pa4 pa4Var2 = this.m;
                if (pa4Var2.g.l == null && pa4Var2.y.type() != Proxy.Type.DIRECT) {
                    t5 t5Var = this.m.g;
                    t5Var.j.connectFailed(t5Var.t.l(), this.m.y.address(), e);
                }
                dl1 dl1Var2 = this.t.m;
                pa4 pa4Var3 = this.m;
                InetSocketAddress inetSocketAddress2 = pa4Var3.r;
                Proxy proxy2 = pa4Var3.y;
                dl1Var2.getClass();
                inetSocketAddress2.getClass();
                proxy2.getClass();
                this.m.getClass();
                qa4 qa4Var2 = new qa4(this, e, 2);
                this.t.e.remove(this);
                if (!z && (socket2 = this.p) != null) {
                    ws5.r(socket2);
                }
                return qa4Var2;
            }
        } catch (Throwable th) {
            this.t.e.remove(this);
            if (!z && (socket = this.p) != null) {
                ws5.r(socket);
            }
            throw th;
        }
    }

    public final qa4 m() throws IOException {
        rr rrVar = this.w;
        rrVar.getClass();
        pa4 pa4Var = this.m;
        String str = "CONNECT " + ws5.m(pa4Var.g.t, true) + " HTTP/1.1";
        q70 q70Var = this.o;
        if (q70Var == null) {
            yf2.Y("socket");
            throw null;
        }
        f82 f82Var = new f82(null, this, q70Var);
        q70 q70Var2 = this.o;
        if (q70Var2 == null) {
            yf2.Y("socket");
            throw null;
        }
        ((h34) q70Var2.a).j.r().l(this.r);
        q70 q70Var3 = this.o;
        if (q70Var3 == null) {
            yf2.Y("socket");
            throw null;
        }
        ((g34) q70Var3.m).j.r().l(this.n);
        f82Var.q((c52) rrVar.n, str);
        f82Var.y();
        y74 y74VarA = f82Var.a(false);
        y74VarA.getClass();
        y74VarA.g = rrVar;
        z74 z74VarG = y74VarA.g();
        int i = z74VarG.m;
        long jV = ws5.v(z74VarG);
        if (jV != -1) {
            c82 c82VarM = f82Var.m((a92) z74VarG.j.r, jV);
            ws5.j(c82VarM, Integer.MAX_VALUE);
            c82VarM.close();
        }
        if (i == 200) {
            return new qa4(this, (Throwable) null, 6);
        }
        if (i != 407) {
            uo1.t(xi3.j("Unexpected response code for CONNECT: ", i));
            return null;
        }
        pa4Var.g.x.getClass();
        uo1.t("Failed to authenticate with proxy");
        return null;
    }

    @Override // defpackage.ra4
    public final m34 n() {
        fa4 fa4Var = this.t.j.D;
        pa4 pa4Var = this.m;
        synchronized (fa4Var) {
            pa4Var.getClass();
            ((LinkedHashSet) fa4Var.t).remove(pa4Var);
        }
        m34 m34Var = this.f;
        m34Var.getClass();
        this.m.getClass();
        p84 p84VarN = this.a.n(this, this.q);
        if (p84VarN != null) {
            return p84VarN.g;
        }
        synchronized (m34Var) {
            o34 o34Var = this.y;
            TimeZone timeZone = ws5.g;
            o34Var.n.add(m34Var);
            o34Var.y.l(o34Var.r, 0L);
            this.t.g(m34Var);
        }
        this.t.m.getClass();
        return m34Var;
    }

    @Override // defpackage.ra4
    public final qa4 r() throws Throwable {
        Socket socket = this.p;
        if (socket == null) {
            l0.u("TCP not connected");
            return null;
        }
        if (v()) {
            l0.z("already connected");
            return null;
        }
        List list = this.m.g.m;
        this.t.e.add(this);
        boolean z = false;
        try {
            try {
                if (this.w != null) {
                    qa4 qa4VarM = m();
                    if (qa4VarM.r != null) {
                        this.t.e.remove(this);
                        Socket socket2 = this.u;
                        if (socket2 != null) {
                            ws5.r(socket2);
                        }
                        ws5.r(socket);
                        return qa4VarM;
                    }
                }
                t5 t5Var = this.m.g;
                if (t5Var.r != null) {
                    q70 q70Var = this.o;
                    if (q70Var == null) {
                        yf2.Y("socket");
                        throw null;
                    }
                    if (((h34) q70Var.a).t.y()) {
                        q70 q70Var2 = this.o;
                        if (q70Var2 == null) {
                            yf2.Y("socket");
                            throw null;
                        }
                        if (((g34) q70Var2.m).t.y()) {
                            this.t.m.getClass();
                            t5 t5Var2 = this.m.g;
                            SSLSocketFactory sSLSocketFactory = t5Var2.r;
                            a92 a92Var = t5Var2.t;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, a92Var.n, a92Var.v, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            up0 up0VarI = i(list, sSLSocket);
                            nq0 nq0Var = (nq0) list.get(up0VarI.c);
                            nq0Var.g(sSLSocket, up0VarI.i);
                            try {
                                a(sSLSocket, nq0Var);
                                this.t.m.getClass();
                            } catch (SSLException e) {
                                up0VarI.c(list, sSLSocket, e);
                                throw e;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.u = socket;
                List list2 = t5Var.a;
                i14 i14Var = i14.c;
                if (!list2.contains(i14Var)) {
                    i14Var = i14.m;
                }
                this.h = i14Var;
                b35 b35Var = this.g;
                o34 o34Var = this.y;
                pa4 pa4Var = this.m;
                Socket socket3 = this.u;
                socket3.getClass();
                v42 v42Var = this.z;
                i14 i14Var2 = this.h;
                i14Var2.getClass();
                q70 q70Var3 = this.o;
                if (q70Var3 == null) {
                    yf2.Y("socket");
                    throw null;
                }
                m34 m34Var = new m34(b35Var, o34Var, pa4Var, socket, socket3, v42Var, i14Var2, q70Var3, this.l);
                this.f = m34Var;
                m34Var.t();
                dl1 dl1Var = this.t.m;
                pa4 pa4Var2 = this.m;
                InetSocketAddress inetSocketAddress = pa4Var2.r;
                Proxy proxy = pa4Var2.y;
                dl1Var.getClass();
                inetSocketAddress.getClass();
                proxy.getClass();
                try {
                    qa4 qa4Var = new qa4(this, (Throwable) null, 6);
                    this.t.e.remove(this);
                    return qa4Var;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    dl1 dl1Var2 = this.t.m;
                    pa4 pa4Var3 = this.m;
                    InetSocketAddress inetSocketAddress2 = pa4Var3.r;
                    Proxy proxy2 = pa4Var3.y;
                    dl1Var2.getClass();
                    inetSocketAddress2.getClass();
                    proxy2.getClass();
                    this.m.getClass();
                    qa4 qa4Var2 = new qa4(this, (up0) null, e);
                    this.t.e.remove(this);
                    if (!z) {
                        Socket socket4 = this.u;
                        if (socket4 != null) {
                            ws5.r(socket4);
                        }
                        ws5.r(socket);
                    }
                    return qa4Var2;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    this.t.e.remove(this);
                    if (!z) {
                        Socket socket5 = this.u;
                        if (socket5 != null) {
                            ws5.r(socket5);
                        }
                        ws5.r(socket);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void t() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.m.y.type();
        int i = type == null ? -1 : tp0.g[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.m.g.y.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.m.y);
        }
        this.p = socketCreateSocket;
        if (this.s) {
            uo1.t("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.x);
        try {
            ys3 ys3Var = ys3.g;
            ys3.g.v(socketCreateSocket, this.m.r, this.v);
            try {
                this.o = new q70(new ty(socketCreateSocket));
            } catch (NullPointerException e) {
                if (yf2.p(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.m.r);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // defpackage.ra4
    public final boolean v() {
        return this.h != null;
    }

    public final up0 w(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        int i = this.c;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            nq0 nq0Var = (nq0) list.get(i2);
            nq0Var.getClass();
            if (nq0Var.g && (((strArr = nq0Var.n) == null || us5.x(strArr, sSLSocket.getEnabledProtocols(), hc3.y)) && ((strArr2 = nq0Var.r) == null || us5.x(strArr2, sSLSocket.getEnabledCipherSuites(), jf0.r)))) {
                return q(this, null, i2, i != -1, null, 39);
            }
        }
        return null;
    }

    @Override // defpackage.ul1
    public final pa4 x() {
        return this.m;
    }

    @Override // defpackage.ul1
    public final void j() {
    }

    @Override // defpackage.ul1
    public final void y(l34 l34Var, IOException iOException) {
    }
}
