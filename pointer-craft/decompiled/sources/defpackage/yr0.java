package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class yr0 implements wt4 {
    public static final wr0 g = new wr0();
    public static final boolean y;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, xr0.class.getClassLoader());
            if (Conscrypt.isAvailable() && xr0.g()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        y = z;
    }

    @Override // defpackage.wt4
    public final boolean g(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.wt4
    public final void n(SSLSocket sSLSocket, String str, List list, fa0 fa0Var) {
        if (g(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ys3 ys3Var = ys3.g;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) tg1.g(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.wt4
    public final String r(SSLSocket sSLSocket) {
        if (g(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.wt4
    public final boolean y() {
        return y;
    }
}
