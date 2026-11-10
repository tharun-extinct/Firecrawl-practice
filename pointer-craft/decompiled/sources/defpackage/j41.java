package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class j41 implements wt4 {
    public final i41 g;
    public wt4 y;

    public j41(i41 i41Var) {
        this.g = i41Var;
    }

    @Override // defpackage.wt4
    public final boolean g(SSLSocket sSLSocket) {
        return this.g.g(sSLSocket);
    }

    @Override // defpackage.wt4
    public final void n(SSLSocket sSLSocket, String str, List list, fa0 fa0Var) {
        wt4 wt4VarV = v(sSLSocket);
        if (wt4VarV != null) {
            wt4VarV.n(sSLSocket, str, list, fa0Var);
        }
    }

    @Override // defpackage.wt4
    public final String r(SSLSocket sSLSocket) {
        wt4 wt4VarV = v(sSLSocket);
        if (wt4VarV != null) {
            return wt4VarV.r(sSLSocket);
        }
        return null;
    }

    public final synchronized wt4 v(SSLSocket sSLSocket) {
        try {
            if (this.y == null && this.g.g(sSLSocket)) {
                this.y = this.g.r(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.y;
    }

    @Override // defpackage.wt4
    public final boolean y() {
        return true;
    }
}
