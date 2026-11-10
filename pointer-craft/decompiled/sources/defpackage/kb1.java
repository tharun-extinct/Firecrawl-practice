package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kb1 implements nb1 {
    @Override // defpackage.nb1
    public final List g(String str) throws UnknownHostException {
        str.getClass();
        ys3 ys3Var = ys3.g;
        ys3.g.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return pr.j0(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    public final String toString() {
        return "Dns.SYSTEM";
    }

    @Override // defpackage.nb1
    public final jz2 y(mb1 mb1Var) {
        ys3 ys3Var = ys3.g;
        ys3.g.getClass();
        return new jz2(b35.q, zb2.y, mb1Var);
    }
}
