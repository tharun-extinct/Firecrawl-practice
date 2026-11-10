package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class pa4 {
    public final t5 g;
    public final fa0 n;
    public final InetSocketAddress r;
    public final Proxy y;

    public pa4(t5 t5Var, Proxy proxy, InetSocketAddress inetSocketAddress, fa0 fa0Var) {
        t5Var.getClass();
        proxy.getClass();
        inetSocketAddress.getClass();
        this.g = t5Var;
        this.y = proxy;
        this.r = inetSocketAddress;
        this.n = fa0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pa4)) {
            return false;
        }
        pa4 pa4Var = (pa4) obj;
        return yf2.p(pa4Var.g, this.g) && yf2.p(pa4Var.y, this.y) && yf2.p(pa4Var.r, this.r) && yf2.p(pa4Var.n, this.n);
    }

    public final int hashCode() {
        int iHashCode = (this.r.hashCode() + ((this.y.hashCode() + ((this.g.hashCode() + 527) * 31)) * 31)) * 31;
        fa0 fa0Var = this.n;
        return iHashCode + (fa0Var != null ? fa0Var.hashCode() : 0);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        t5 t5Var = this.g;
        a92 a92Var = t5Var.t;
        a92 a92Var2 = t5Var.t;
        String str = a92Var.n;
        InetSocketAddress inetSocketAddress = this.r;
        InetAddress address = inetSocketAddress.getAddress();
        String strY = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : ss5.y(hostAddress);
        if (tx4.R(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (a92Var2.v != inetSocketAddress.getPort() || str.equals(strY)) {
            sb.append(":");
            sb.append(a92Var2.v);
        }
        if (!str.equals(strY)) {
            if (yf2.p(this.y, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strY == null) {
                sb.append("<unresolved>");
            } else if (tx4.R(strY, ':')) {
                sb.append("[");
                sb.append(strY);
                sb.append("]");
            } else {
                sb.append(strY);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        if (this.n != null) {
            sb.append(" with ECH");
        }
        return sb.toString();
    }
}
