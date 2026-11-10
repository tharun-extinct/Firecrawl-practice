package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class gj3 {
    public int A;
    public int B;
    public int C;
    public long D;
    public fa4 E;
    public b35 F;
    public boolean a;
    public SocketFactory b;
    public ProxySelector c;
    public int d;
    public int e;
    public hb6 f;
    public HostnameVerifier h;
    public bi6 i;
    public bi6 j;
    public int k;
    public boolean l;
    public bi6 m;
    public jc0 o;
    public X509TrustManager p;
    public nb1 q;
    public SSLSocketFactory s;
    public boolean t;
    public List u;
    public zm5 v;
    public Proxy w;
    public boolean x;
    public v92 y;
    public List z;
    public ty g = new ty((byte) 5);
    public final ArrayList r = new ArrayList();
    public final ArrayList n = new ArrayList();

    public gj3() {
        TimeZone timeZone = ws5.g;
        this.v = new zm5();
        this.x = true;
        this.l = true;
        bi6 bi6Var = bi6.a;
        this.j = bi6Var;
        this.t = true;
        this.a = true;
        this.m = bi6.q;
        this.q = nb1.g;
        this.i = bi6Var;
        ys3 ys3Var = ys3.g;
        ys3.g.getClass();
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.b = socketFactory;
        this.u = hj3.H;
        this.z = hj3.G;
        this.h = fj3.g;
        this.o = jc0.r;
        this.d = 10000;
        this.e = 10000;
        this.A = 10000;
        this.C = 60000;
        this.D = 1024L;
    }

    public final SocketFactory A() {
        return this.b;
    }

    public final SSLSocketFactory B() {
        return this.s;
    }

    public final b35 C() {
        return this.F;
    }

    public final int D() {
        return this.C;
    }

    public final int E() {
        return this.A;
    }

    public final X509TrustManager F() {
        return this.p;
    }

    public final void G(v92 v92Var) {
        this.y = v92Var;
    }

    public final nb1 a() {
        return this.q;
    }

    public final ArrayList b() {
        return this.r;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.x;
    }

    public final fa4 e() {
        return this.E;
    }

    public final ProxySelector f() {
        return this.c;
    }

    public final bi6 g() {
        return this.j;
    }

    public final Proxy h() {
        return this.w;
    }

    public final HostnameVerifier i() {
        return this.h;
    }

    public final bi6 j() {
        return this.m;
    }

    public final int k() {
        return this.e;
    }

    public final List l() {
        return this.u;
    }

    public final zm5 m() {
        return this.v;
    }

    public final jc0 n() {
        return this.o;
    }

    public final bi6 o() {
        return this.i;
    }

    public final ArrayList p() {
        return this.n;
    }

    public final boolean q() {
        return this.l;
    }

    public final hb6 r() {
        return this.f;
    }

    public final long s() {
        return this.D;
    }

    public final ty t() {
        return this.g;
    }

    public final int u() {
        return this.B;
    }

    public final int v() {
        return this.d;
    }

    public final boolean w() {
        return this.t;
    }

    public final v92 x() {
        return this.y;
    }

    public final int y() {
        return this.k;
    }

    public final List z() {
        return this.z;
    }
}
