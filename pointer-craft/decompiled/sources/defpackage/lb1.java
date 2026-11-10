package defpackage;

import java.io.EOFException;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes2.dex */
public final class lb1 {
    public final InetAddress g;
    public final String y;

    public lb1(String str, InetAddress inetAddress) throws EOFException {
        inetAddress.getClass();
        this.g = inetAddress;
        String strY = ss5.y(str);
        if (strY != null) {
            this.y = strY;
        } else {
            l0.u("unexpected hostname: ".concat(str));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lb1)) {
            return false;
        }
        lb1 lb1Var = (lb1) obj;
        return lb1Var.y.equals(this.y) && yf2.p(lb1Var.g, this.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + (this.y.hashCode() * 31);
    }

    public final String toString() {
        return this.y + '/' + this.g.getHostAddress();
    }
}
