package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class p34 {
    public final jc0 a;
    public final bi6 b;
    public final HostnameVerifier c;
    public int f;
    public final l34 g;
    public final X509TrustManager h;
    public final Proxy i;
    public final int j;
    public final int l;
    public final v92 m;
    public final tl1 n;
    public final hb6 o;
    public final boolean p;
    public final bi6 q;
    public final int r;
    public final ProxySelector s;
    public final bi6 t;
    public final SocketFactory u;
    public final rr v;
    public final nb1 w;
    public final int x;
    public final ArrayList y;
    public final SSLSocketFactory z;

    public p34(l34 l34Var, ArrayList arrayList, int i, tl1 tl1Var, rr rrVar, int i2, int i3, int i4, bi6 bi6Var, jc0 jc0Var, v92 v92Var, bi6 bi6Var2, nb1 nb1Var, HostnameVerifier hostnameVerifier, Proxy proxy, bi6 bi6Var3, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, hb6 hb6Var) {
        bi6Var.getClass();
        jc0Var.getClass();
        v92Var.getClass();
        bi6Var2.getClass();
        nb1Var.getClass();
        hostnameVerifier.getClass();
        bi6Var3.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.g = l34Var;
        this.y = arrayList;
        this.r = i;
        this.n = tl1Var;
        this.v = rrVar;
        this.x = i2;
        this.l = i3;
        this.j = i4;
        this.t = bi6Var;
        this.a = jc0Var;
        this.m = v92Var;
        this.q = bi6Var2;
        this.w = nb1Var;
        this.c = hostnameVerifier;
        this.i = proxy;
        this.b = bi6Var3;
        this.s = proxySelector;
        this.p = z;
        this.u = socketFactory;
        this.z = sSLSocketFactory;
        this.h = x509TrustManager;
        this.o = hb6Var;
    }

    public static p34 g(p34 p34Var, int i, tl1 tl1Var, rr rrVar, int i2) {
        int i3 = (i2 & 1) != 0 ? p34Var.r : i;
        tl1 tl1Var2 = (i2 & 2) != 0 ? p34Var.n : tl1Var;
        rr rrVar2 = (i2 & 4) != 0 ? p34Var.v : rrVar;
        int i4 = p34Var.x;
        int i5 = p34Var.l;
        int i6 = p34Var.j;
        bi6 bi6Var = p34Var.t;
        jc0 jc0Var = p34Var.a;
        v92 v92Var = p34Var.m;
        bi6 bi6Var2 = p34Var.q;
        nb1 nb1Var = p34Var.w;
        HostnameVerifier hostnameVerifier = p34Var.c;
        Proxy proxy = p34Var.i;
        bi6 bi6Var3 = p34Var.b;
        ProxySelector proxySelector = p34Var.s;
        boolean z = p34Var.p;
        SocketFactory socketFactory = p34Var.u;
        SSLSocketFactory sSLSocketFactory = p34Var.z;
        X509TrustManager x509TrustManager = p34Var.h;
        hb6 hb6Var = p34Var.o;
        rrVar2.getClass();
        bi6Var.getClass();
        jc0Var.getClass();
        v92Var.getClass();
        bi6Var2.getClass();
        nb1Var.getClass();
        hostnameVerifier.getClass();
        bi6Var3.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new p34(p34Var.g, p34Var.y, i3, tl1Var2, rrVar2, i4, i5, i6, bi6Var, jc0Var, v92Var, bi6Var2, nb1Var, hostnameVerifier, proxy, bi6Var3, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, hb6Var);
    }

    public final z74 y(rr rrVar) {
        rrVar.getClass();
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        int i = this.r;
        if (i >= size) {
            l0.z("Check failed.");
            return null;
        }
        this.f++;
        tl1 tl1Var = this.n;
        if (tl1Var != null) {
            r34 r34VarX = tl1Var.y.x();
            a92 a92Var = (a92) rrVar.r;
            r34VarX.getClass();
            a92Var.getClass();
            a92 a92Var2 = r34VarX.a.t;
            if (a92Var.v != a92Var2.v || !yf2.p(a92Var.n, a92Var2.n)) {
                uo1.s(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.f != 1) {
                uo1.s(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        p34 p34VarG = g(this, i2, null, rrVar, 2097146);
        ra0 ra0Var = (ra0) arrayList.get(i);
        z74 z74VarY = ra0Var.y(p34VarG);
        if (z74VarY == null) {
            throw new NullPointerException("interceptor " + ra0Var + " returned null");
        }
        if (tl1Var == null || i2 >= arrayList.size() || p34VarG.f == 1) {
            return z74VarY;
        }
        uo1.s(ra0Var, " must call proceed() exactly once", "network interceptor ");
        return null;
    }
}
