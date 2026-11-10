package defpackage;

import java.io.IOException;
import java.net.SocketException;

/* JADX INFO: loaded from: classes2.dex */
public final class tl1 {
    public final l34 g;
    public boolean n;
    public final vl1 r;
    public final wl1 y;

    public tl1(l34 l34Var, wl1 wl1Var, vl1 vl1Var) {
        wl1Var.getClass();
        this.g = l34Var;
        this.y = wl1Var;
        this.r = vl1Var;
    }

    public static IOException g(tl1 tl1Var, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            tl1Var.v(iOException);
        }
        if (z3) {
            dl1 dl1Var = tl1Var.g.m;
            if (iOException != null) {
                dl1Var.getClass();
            } else {
                dl1Var.getClass();
            }
        }
        if (z2) {
            dl1 dl1Var2 = tl1Var.g.m;
            if (iOException != null) {
                dl1Var2.getClass();
            } else {
                dl1Var2.getClass();
            }
        }
        return tl1Var.g.l(tl1Var, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public final y74 n(boolean z) throws IOException {
        try {
            y74 y74VarA = this.r.a(z);
            if (y74VarA == null) {
                return y74VarA;
            }
            y74VarA.c = this;
            return y74VarA;
        } catch (IOException e) {
            this.g.m.getClass();
            v(e);
            throw e;
        }
    }

    public final q34 r(z74 z74Var) throws IOException {
        tl1 tl1Var;
        try {
            String strG = z74Var.w.g("Content-Type");
            if (strG == null) {
                strG = null;
            }
            long jL = this.r.l(z74Var);
            tl1Var = this;
            try {
                return new q34(strG, jL, new h34(new sl1(tl1Var, this.r.g(z74Var), jL, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                tl1Var.g.m.getClass();
                tl1Var.v(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            tl1Var = this;
        }
    }

    public final void v(IOException iOException) {
        this.n = true;
        this.r.x().y(this.g, iOException);
    }

    public final rk4 x() throws SocketException {
        l34 l34Var = this.g;
        if (l34Var.s) {
            l0.z("Check failed.");
            return null;
        }
        l34Var.s = true;
        l34Var.q.t();
        synchronized (l34Var) {
            if (l34Var.d == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (l34Var.h || l34Var.o) {
                throw new IllegalStateException("Check failed.");
            }
            if (l34Var.u) {
                throw new IllegalStateException("Check failed.");
            }
            if (!l34Var.z) {
                throw new IllegalStateException("Check failed.");
            }
            l34Var.z = false;
            l34Var.h = true;
            l34Var.o = true;
        }
        ul1 ul1VarX = this.r.x();
        ul1VarX.getClass();
        m34 m34Var = (m34) ul1VarX;
        m34Var.v.setSoTimeout(0);
        m34Var.j();
        return new rk4(this);
    }

    public final m34 y() {
        ul1 ul1VarX = this.r.x();
        m34 m34Var = ul1VarX instanceof m34 ? (m34) ul1VarX : null;
        if (m34Var != null) {
            return m34Var;
        }
        l0.z("no connection for CONNECT tunnels");
        return null;
    }
}
