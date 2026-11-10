package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r34 {
    public final t5 a;
    public pa4 b;
    public c6 c;
    public final b35 g;
    public sa4 i;
    public final boolean j;
    public final int l;
    public final fa4 m;
    public final int n;
    public final l34 q;
    public final int r;
    public final dr s;
    public final boolean t;
    public final int v;
    public final boolean w;
    public final int x;
    public final o34 y;

    public r34(b35 b35Var, o34 o34Var, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, t5 t5Var, fa4 fa4Var, l34 l34Var, rr rrVar) {
        b35Var.getClass();
        fa4Var.getClass();
        this.g = b35Var;
        this.y = o34Var;
        this.r = i;
        this.n = i2;
        this.v = i3;
        this.x = i4;
        this.l = i5;
        this.j = z;
        this.t = z2;
        this.a = t5Var;
        this.m = fa4Var;
        this.q = l34Var;
        this.w = !yf2.p(rrVar.y, "GET");
        this.s = new dr();
    }

    public final boolean g(m34 m34Var) {
        sa4 sa4Var;
        pa4 pa4Var;
        if (this.s.isEmpty() && this.b == null) {
            if (m34Var != null) {
                synchronized (m34Var) {
                    pa4Var = null;
                    if (m34Var.w == 0 && m34Var.m && ws5.g(m34Var.r.g.t, this.a.t)) {
                        pa4Var = m34Var.r;
                    }
                }
                if (pa4Var != null) {
                    this.b = pa4Var;
                    return true;
                }
            }
            c6 c6Var = this.c;
            if ((c6Var == null || c6Var.g >= ((ArrayList) c6Var.y).size()) && (sa4Var = this.i) != null) {
                return sa4Var.g();
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003e A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0031, B:22:0x003e, B:25:0x0045), top: B:53:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0031, B:22:0x003e, B:25:0x0045), top: B:53:0x0031 }] */
    public final p84 n(up0 up0Var, List list) {
        m34 m34Var;
        boolean z;
        Socket socketT;
        o34 o34Var = this.y;
        boolean z2 = this.w;
        t5 t5Var = this.a;
        l34 l34Var = this.q;
        boolean z3 = up0Var != null && up0Var.v();
        Iterator it = o34Var.n.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                m34Var = null;
                break;
            }
            m34Var = (m34) it.next();
            m34Var.getClass();
            synchronized (m34Var) {
                if (z3) {
                    try {
                        if (!(m34Var.a != null)) {
                            z = false;
                        } else if (m34Var.v(t5Var, list)) {
                            l34Var.g(m34Var);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (m34Var.v(t5Var, list)) {
                    z = false;
                } else {
                    l34Var.g(m34Var);
                    z = true;
                }
            }
            if (z) {
                if (m34Var.l(z2)) {
                    break;
                }
                synchronized (m34Var) {
                    m34Var.m = true;
                    socketT = l34Var.t();
                }
                if (socketT != null) {
                    ws5.r(socketT);
                }
            }
        }
        if (m34Var == null) {
            return null;
        }
        if (up0Var != null) {
            this.b = up0Var.m;
            Socket socket = up0Var.u;
            if (socket != null) {
                ws5.r(socket);
            }
        }
        this.q.m.getClass();
        return new p84(m34Var);
    }

    public final up0 r(pa4 pa4Var, ArrayList arrayList) throws UnknownServiceException {
        i14 i14Var = i14.c;
        pa4Var.getClass();
        t5 t5Var = pa4Var.g;
        if (t5Var.r == null) {
            if (!t5Var.m.contains(nq0.x)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = pa4Var.g.t.n;
            ys3 ys3Var = ys3.g;
            if (!ys3.g.t(str)) {
                throw new UnknownServiceException(du4.i("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (t5Var.a.contains(i14Var)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        rr rrVar = null;
        if (pa4Var.y.type() == Proxy.Type.HTTP) {
            t5 t5Var2 = pa4Var.g;
            if (t5Var2.r != null || t5Var2.a.contains(i14Var)) {
                cp1 cp1Var = new cp1();
                cp1Var.g = pa4Var.g.t;
                cp1Var.m("CONNECT", null);
                t5 t5Var3 = pa4Var.g;
                cp1Var.j("Host", ws5.m(t5Var3.t, true));
                cp1Var.j("Proxy-Connection", "Keep-Alive");
                cp1Var.j("User-Agent", "okhttp/5.5.0");
                rrVar = new rr(cp1Var);
                a84 a84Var = b84.j;
                fa4 fa4Var = new fa4((byte) 15);
                ec6.t("Proxy-Authenticate");
                ec6.a("OkHttp-Preemptive", "Proxy-Authenticate");
                fa4Var.J("Proxy-Authenticate");
                ec6.r(fa4Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                ec6.n(fa4Var);
                a84Var.getClass();
                t5Var3.x.getClass();
            }
        }
        return new up0(this.g, this.y, this.r, this.n, this.v, this.x, this.l, this.j, this.q, this, pa4Var, arrayList, rrVar, -1, false, null);
    }

    public final ra4 y() {
        Socket socketT;
        p84 p84Var;
        up0 up0VarR;
        String hostAddress;
        int port;
        ArrayList arrayList;
        List<pa4> listA;
        boolean zContains;
        m34 m34Var = this.q.b;
        if (m34Var == null) {
            p84Var = null;
        } else {
            boolean zL = m34Var.l(this.w);
            synchronized (m34Var) {
                boolean z = m34Var.m;
                try {
                    if (!zL) {
                        m34Var.m = true;
                        socketT = this.q.t();
                    } else if (!z) {
                        a92 a92Var = m34Var.r.g.t;
                        a92 a92Var2 = this.a.t;
                        socketT = !(a92Var.v == a92Var2.v && yf2.p(a92Var.n, a92Var2.n)) ? this.q.t() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.q.b == null) {
                if (socketT != null) {
                    ws5.r(socketT);
                }
                this.q.m.getClass();
                p84Var = null;
            } else {
                if (socketT != null) {
                    l0.z("Check failed.");
                    return null;
                }
                p84Var = new p84(m34Var);
            }
        }
        if (p84Var != null) {
            return p84Var;
        }
        p84 p84VarN = n(null, null);
        if (p84VarN != null) {
            return p84VarN;
        }
        if (!this.s.isEmpty()) {
            return (ra4) this.s.removeFirst();
        }
        pa4 pa4Var = this.b;
        if (pa4Var != null) {
            this.b = null;
            up0VarR = r(pa4Var, null);
        } else {
            c6 c6Var = this.c;
            if (c6Var == null || c6Var.g >= ((ArrayList) c6Var.y).size()) {
                sa4 sa4Var = this.i;
                if (sa4Var == null) {
                    sa4Var = new sa4(this.a, this.m, this.q, this.t);
                    this.i = sa4Var;
                }
                if (!sa4Var.g()) {
                    uo1.t("exhausted all routes");
                    return null;
                }
                if (!sa4Var.g()) {
                    uo1.b();
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                while (sa4Var.x < sa4Var.v.size()) {
                    if (sa4Var.x >= sa4Var.v.size()) {
                        throw new SocketException("No route to " + sa4Var.g.t.n + "; exhausted proxy configurations: " + sa4Var.v);
                    }
                    List list = sa4Var.v;
                    int i = sa4Var.x;
                    sa4Var.x = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        a92 a92Var3 = sa4Var.g.t;
                        hostAddress = a92Var3.n;
                        port = a92Var3.v;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        t5 t5Var = sa4Var.g;
                        InetSocketAddress inetSocketAddressCreateUnresolved = InetSocketAddress.createUnresolved(hostAddress, port);
                        inetSocketAddressCreateUnresolved.getClass();
                        listA = pw5.k(new pa4(t5Var, proxy, inetSocketAddressCreateUnresolved, null));
                    } else {
                        y54 y54Var = ss5.g;
                        hostAddress.getClass();
                        if (ss5.g.n(hostAddress)) {
                            listA = pw5.k(new pa4(sa4Var.g, proxy, new InetSocketAddress(InetAddress.getByName(hostAddress), port), null));
                        } else {
                            sa4Var.r.m.getClass();
                            sa4Var.g.g.y(new mb1(hostAddress, (yf2.p(sa4Var.g.t.g, "https") || port != 80) ? port : -1));
                            List listG = sa4Var.g.g.g(hostAddress);
                            ArrayList arrayList3 = new ArrayList(dj0.Y(listG, 10));
                            Iterator it = listG.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(new pa4(sa4Var.g, proxy, new InetSocketAddress((InetAddress) it.next(), port), null));
                            }
                            if (arrayList3.isEmpty()) {
                                throw new UnknownHostException(sa4Var.g.g + " returned no addresses for " + hostAddress);
                            }
                            dl1 dl1Var = sa4Var.r.m;
                            ArrayList arrayList4 = new ArrayList(dj0.Y(arrayList3, 10));
                            int size = arrayList3.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList3.get(i2);
                                i2++;
                                arrayList4.add(((pa4) obj).r.getAddress());
                            }
                            dl1Var.getClass();
                            ArrayList arrayList5 = new ArrayList();
                            int size2 = arrayList3.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj2 = arrayList3.get(i3);
                                i3++;
                                if (((pa4) obj2).n != null) {
                                    arrayList5.add(obj2);
                                }
                            }
                            boolean zIsEmpty = arrayList5.isEmpty();
                            arrayList = arrayList5;
                            if (zIsEmpty) {
                                arrayList = arrayList3;
                            }
                            listA = arrayList;
                            if (sa4Var.n && arrayList.size() >= 2) {
                                ArrayList arrayList6 = new ArrayList();
                                ArrayList arrayList7 = new ArrayList();
                                int size3 = arrayList.size();
                                int i4 = 0;
                                while (i4 < size3) {
                                    Object obj3 = arrayList.get(i4);
                                    i4++;
                                    if (((pa4) obj3).r.getAddress() instanceof Inet6Address) {
                                        listA = arrayList;
                                        arrayList6.add(obj3);
                                    } else {
                                        listA = arrayList;
                                        arrayList7.add(obj3);
                                    }
                                }
                                listA = arrayList;
                                listA = arrayList;
                                if (!arrayList6.isEmpty() && !arrayList7.isEmpty()) {
                                    listA = arrayList;
                                    byte[] bArr = us5.g;
                                    Iterator it2 = arrayList6.iterator();
                                    Iterator it3 = arrayList7.iterator();
                                    uv2 uv2VarC = pw5.c();
                                    while (true) {
                                        if (!it2.hasNext() && !it3.hasNext()) {
                                            break;
                                        }
                                        if (it2.hasNext()) {
                                            uv2VarC.add(it2.next());
                                        }
                                        if (it3.hasNext()) {
                                            uv2VarC.add(it3.next());
                                        }
                                    }
                                    listA = pw5.a(uv2VarC);
                                }
                            }
                        }
                    }
                    listA = arrayList;
                    listA = arrayList;
                    for (pa4 pa4Var2 : listA) {
                        fa4 fa4Var = sa4Var.y;
                        synchronized (fa4Var) {
                            pa4Var2.getClass();
                            zContains = ((LinkedHashSet) fa4Var.t).contains(pa4Var2);
                        }
                        if (zContains) {
                            sa4Var.l.add(pa4Var2);
                        } else {
                            arrayList2.add(pa4Var2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                }
                if (arrayList2.isEmpty()) {
                    hj0.a0(arrayList2, sa4Var.l);
                    sa4Var.l.clear();
                }
                c6 c6Var2 = new c6();
                c6Var2.y = arrayList2;
                this.c = c6Var2;
                if (this.q.k) {
                    uo1.t("Canceled");
                    return null;
                }
                if (c6Var2.g >= arrayList2.size()) {
                    uo1.b();
                    return null;
                }
                int i5 = c6Var2.g;
                c6Var2.g = i5 + 1;
                up0VarR = r((pa4) arrayList2.get(i5), arrayList2);
            } else {
                int i6 = c6Var.g;
                ArrayList arrayList8 = (ArrayList) c6Var.y;
                if (i6 >= arrayList8.size()) {
                    uo1.b();
                    return null;
                }
                int i7 = c6Var.g;
                c6Var.g = i7 + 1;
                up0VarR = r((pa4) arrayList8.get(i7), null);
            }
        }
        p84 p84VarN2 = n(up0VarR, up0VarR.q);
        return p84VarN2 != null ? p84VarN2 : up0VarR;
    }
}
