package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class hj3 {
    public static final List G = ws5.x(i14.w, i14.m);
    public static final List H = ws5.x(nq0.v, nq0.x);
    public final int A;
    public final int B;
    public final long C;
    public final fa4 D;
    public final b35 E;
    public final v92 F;
    public final bi6 a;
    public final SSLSocketFactory b;
    public final bi6 c;
    public final int d;
    public final int e;
    public final int f;
    public final ty g;
    public final jc0 h;
    public final SocketFactory i;
    public final boolean j;
    public final int k;
    public final bi6 l;
    public final nb1 m;
    public final zm5 n;
    public final hb6 o;
    public final List p;
    public final Proxy q;
    public final List r;
    public final X509TrustManager s;
    public final boolean t;
    public final List u;
    public final boolean v;
    public final ProxySelector w;
    public final boolean x;
    public final List y;
    public final HostnameVerifier z;

    public hj3(gj3 gj3Var) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorF;
        X509TrustManager x509TrustManagerF;
        SSLSocketFactory sSLSocketFactoryB;
        hb6 hb6VarR;
        this.g = gj3Var.t();
        this.y = ws5.q(gj3Var.b());
        this.r = ws5.q(gj3Var.p());
        this.n = gj3Var.m();
        this.v = gj3Var.d();
        this.x = gj3Var.q();
        this.l = gj3Var.g();
        this.j = gj3Var.w();
        this.t = gj3Var.c();
        this.a = gj3Var.j();
        this.m = gj3Var.a();
        this.q = gj3Var.h();
        if (gj3Var.h() != null) {
            proxySelectorF = bi3.g;
        } else {
            proxySelectorF = gj3Var.f();
            if (proxySelectorF == null && (proxySelectorF = ProxySelector.getDefault()) == null) {
                proxySelectorF = bi3.g;
            }
        }
        this.w = proxySelectorF;
        this.c = gj3Var.o();
        this.i = gj3Var.A();
        List listL = gj3Var.l();
        this.p = listL;
        this.u = gj3Var.z();
        this.z = gj3Var.i();
        this.f = gj3Var.y();
        this.k = gj3Var.v();
        this.d = gj3Var.k();
        this.e = gj3Var.E();
        this.A = gj3Var.u();
        this.B = gj3Var.D();
        this.C = gj3Var.s();
        fa4 fa4VarE = gj3Var.e();
        this.D = fa4VarE == null ? new fa4((byte) 24) : fa4VarE;
        b35 b35VarC = gj3Var.C();
        this.E = b35VarC == null ? b35.q : b35VarC;
        v92 v92VarX = gj3Var.x();
        if (v92VarX == null) {
            v92VarX = new v92((byte) 8);
            gj3Var.G(v92VarX);
        }
        this.F = v92VarX;
        if (listL != null && listL.isEmpty()) {
            this.b = null;
            this.o = null;
            this.s = null;
            this.h = jc0.r;
            sSLSocketFactoryB = null;
            hb6VarR = null;
            x509TrustManagerF = null;
            break;
        }
        Iterator it = listL.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.b = null;
                this.o = null;
                this.s = null;
                this.h = jc0.r;
                sSLSocketFactoryB = null;
                hb6VarR = null;
                x509TrustManagerF = null;
                break;
            }
            if (((nq0) it.next()).r()) {
                if (gj3Var.B() != null) {
                    sSLSocketFactoryB = gj3Var.B();
                    this.b = sSLSocketFactoryB;
                    hb6VarR = gj3Var.r();
                    hb6VarR.getClass();
                    this.o = hb6VarR;
                    x509TrustManagerF = gj3Var.F();
                    x509TrustManagerF.getClass();
                    this.s = x509TrustManagerF;
                    this.h = gj3Var.n().g(hb6VarR);
                    break;
                }
                ys3 ys3Var = ys3.g;
                ys3.g.getClass();
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                trustManagers.getClass();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        this.s = x509TrustManager;
                        ys3 ys3Var2 = ys3.g;
                        ys3Var2.getClass();
                        try {
                            SSLContext sSLContextQ = ys3Var2.q();
                            sSLContextQ.init(null, new TrustManager[]{x509TrustManager}, null);
                            SSLSocketFactory socketFactory = sSLContextQ.getSocketFactory();
                            socketFactory.getClass();
                            this.b = socketFactory;
                            hb6 hb6VarG = gb6.g(x509TrustManager);
                            this.o = hb6VarG;
                            this.h = gj3Var.n().g(hb6VarG);
                            x509TrustManagerF = x509TrustManager;
                            sSLSocketFactoryB = socketFactory;
                            hb6VarR = hb6VarG;
                            break;
                        } catch (GeneralSecurityException e) {
                            throw new AssertionError("No System TLS: " + e, e);
                        }
                    }
                }
                String string = Arrays.toString(trustManagers);
                string.getClass();
                uo1.x("Unexpected default trust managers: ".concat(string));
                throw null;
            }
        }
        List list = this.r;
        List list2 = this.y;
        list2.getClass();
        if (list2.contains(null)) {
            uo1.p(list2, "Null interceptor: ");
            throw null;
        }
        list.getClass();
        if (list.contains(null)) {
            uo1.p(list, "Null network interceptor: ");
            throw null;
        }
        List list3 = this.p;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (((nq0) it2.next()).r()) {
                    if (sSLSocketFactoryB == null) {
                        l0.z("sslSocketFactory == null");
                        throw null;
                    }
                    if (hb6VarR == null) {
                        l0.z("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManagerF != null) {
                        return;
                    }
                    l0.z("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactoryB != null) {
            l0.z("Check failed.");
            throw null;
        }
        if (hb6VarR != null) {
            l0.z("Check failed.");
            throw null;
        }
        if (x509TrustManagerF != null) {
            l0.z("Check failed.");
            throw null;
        }
        if (yf2.p(this.h, jc0.r)) {
            return;
        }
        l0.z("Check failed.");
        throw null;
    }

    public hj3() {
        this(new gj3());
    }
}
