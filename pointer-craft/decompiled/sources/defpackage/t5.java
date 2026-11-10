package defpackage;

import java.io.EOFException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class t5 {
    public final List a;
    public final nb1 g;
    public final ProxySelector j;
    public final Proxy l;
    public final List m;
    public final HostnameVerifier n;
    public final SSLSocketFactory r;
    public final a92 t;
    public final jc0 v;
    public final bi6 x;
    public final SocketFactory y;

    public t5(String str, int i, nb1 nb1Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, jc0 jc0Var, bi6 bi6Var, Proxy proxy, List list, List list2, ProxySelector proxySelector) throws EOFException {
        str.getClass();
        nb1Var.getClass();
        socketFactory.getClass();
        bi6Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.g = nb1Var;
        this.y = socketFactory;
        this.r = sSLSocketFactory;
        this.n = hostnameVerifier;
        this.v = jc0Var;
        this.x = bi6Var;
        this.l = proxy;
        this.j = proxySelector;
        z82 z82Var = new z82();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            z82Var.r = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                l0.u("unexpected scheme: ".concat(str2));
                throw null;
            }
            z82Var.r = "https";
        }
        String strY = ss5.y(kf6.l(str, 0, 0, 7));
        if (strY == null) {
            l0.u("unexpected host: ".concat(str));
            throw null;
        }
        z82Var.x = strY;
        if (1 > i || i >= 65536) {
            l0.t(xi3.j("unexpected port: ", i));
            throw null;
        }
        z82Var.y = i;
        this.t = z82Var.a();
        this.a = ws5.q(list);
        this.m = ws5.q(list2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return this.t.equals(t5Var.t) && g(t5Var);
    }

    public final boolean g(t5 t5Var) {
        return yf2.p(this.g, t5Var.g) && yf2.p(this.x, t5Var.x) && this.a.equals(t5Var.a) && this.m.equals(t5Var.m) && yf2.p(this.j, t5Var.j) && yf2.p(this.l, t5Var.l) && yf2.p(this.r, t5Var.r) && yf2.p(this.n, t5Var.n) && yf2.p(this.v, t5Var.v) && this.t.v == t5Var.t.v;
    }

    public final int hashCode() {
        return Objects.hashCode(this.v) + ((Objects.hashCode(this.n) + ((Objects.hashCode(this.r) + ((Objects.hashCode(this.l) + ((this.j.hashCode() + ((this.m.hashCode() + ((this.a.hashCode() + ((this.x.hashCode() + ((this.g.hashCode() + xi3.x(527, 31, this.t.j)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        a92 a92Var = this.t;
        sb.append(a92Var.n);
        sb.append(':');
        sb.append(a92Var.v);
        sb.append(", ");
        Proxy proxy = this.l;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.j;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
