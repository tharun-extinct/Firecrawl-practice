package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f82 implements vl1 {
    public static final c52 x;
    public final hj3 g;
    public byte n;
    public final q70 r;
    public final de0 v;
    public final ul1 y;

    static {
        c52 c52Var = c52.t;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        if (strArr.length % 2 != 0) {
            l0.u("Expected alternating header names and values");
            return;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                l0.u("Headers cannot be null");
                return;
            }
            strArr2[i2] = tx4.q0(strArr[i2]).toString();
        }
        int iH = br2.h(0, strArr2.length - 1, 2);
        if (iH >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                ec6.t(str);
                ec6.a(str2, str);
                if (i == iH) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        x = new c52(strArr2);
    }

    public f82(hj3 hj3Var, ul1 ul1Var, q70 q70Var) {
        q70Var.getClass();
        this.g = hj3Var;
        this.y = ul1Var;
        this.r = q70Var;
        this.v = new de0((h34) q70Var.a);
    }

    @Override // defpackage.vl1
    public final y74 a(boolean z) {
        de0 de0Var = this.v;
        byte b = this.n;
        if (b != 0 && b != 1 && b != 2 && b != 3) {
            up.j("state: ", this.n);
            return null;
        }
        try {
            String strU = ((h34) de0Var.a).u(de0Var.t);
            de0Var.t -= (long) strU.length();
            ld1 ld1VarY = kg6.y(strU);
            int i = ld1VarY.y;
            y74 y74Var = new y74();
            y74Var.y = (i14) ld1VarY.r;
            y74Var.r = i;
            y74Var.n = (String) ld1VarY.n;
            y74Var.x = ec6.x(de0Var.j());
            if (z && i == 100) {
                return null;
            }
            if (i == 100) {
                this.n = (byte) 3;
                return y74Var;
            }
            if (102 > i || i >= 200) {
                this.n = (byte) 4;
                return y74Var;
            }
            this.n = (byte) 3;
            return y74Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.y.x().g.t.x()), e);
        }
    }

    @Override // defpackage.vl1
    public final void cancel() {
        this.y.cancel();
    }

    @Override // defpackage.vl1
    public final hu4 g(z74 z74Var) {
        rr rrVar = z74Var.j;
        if (!y82.g(z74Var)) {
            return m((a92) rrVar.r, 0L);
        }
        String strG = z74Var.w.g("Transfer-Encoding");
        if (strG == null) {
            strG = null;
        }
        if ("chunked".equalsIgnoreCase(strG)) {
            a92 a92Var = (a92) rrVar.r;
            if (this.n == 4) {
                this.n = (byte) 5;
                return new b82(this, a92Var);
            }
            up.j("state: ", this.n);
            return null;
        }
        long jV = ws5.v(z74Var);
        if (jV != -1) {
            return m((a92) rrVar.r, jV);
        }
        a92 a92Var2 = (a92) rrVar.r;
        if (this.n != 4) {
            up.j("state: ", this.n);
            return null;
        }
        this.n = (byte) 5;
        this.y.j();
        a92Var2.getClass();
        return new e82(this, a92Var2);
    }

    @Override // defpackage.vl1
    public final bq4 j(rr rrVar, long j) {
        if ("chunked".equalsIgnoreCase(((c52) rrVar.n).g("Transfer-Encoding"))) {
            if (this.n == 1) {
                this.n = (byte) 2;
                return new a82(this);
            }
            up.j("state: ", this.n);
            return null;
        }
        if (j == -1) {
            l0.z("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.n == 1) {
            this.n = (byte) 2;
            return new d82(this);
        }
        up.j("state: ", this.n);
        return null;
    }

    @Override // defpackage.vl1
    public final long l(z74 z74Var) {
        if (!y82.g(z74Var)) {
            return 0L;
        }
        String strG = z74Var.w.g("Transfer-Encoding");
        if (strG == null) {
            strG = null;
        }
        if ("chunked".equalsIgnoreCase(strG)) {
            return -1L;
        }
        return ws5.v(z74Var);
    }

    public final c82 m(a92 a92Var, long j) {
        if (this.n == 4) {
            this.n = (byte) 5;
            return new c82(this, a92Var, j);
        }
        up.j("state: ", this.n);
        return null;
    }

    @Override // defpackage.vl1
    public final void n() {
        ((g34) this.r.m).flush();
    }

    public final void q(c52 c52Var, String str) {
        if (this.n != 0) {
            up.j("state: ", this.n);
            return;
        }
        q70 q70Var = this.r;
        g34 g34Var = (g34) q70Var.m;
        g34Var.J(str);
        g34Var.J("\r\n");
        int size = c52Var.size();
        int i = 0;
        while (true) {
            g34 g34Var2 = (g34) q70Var.m;
            if (i >= size) {
                g34Var2.J("\r\n");
                this.n = (byte) 1;
                return;
            } else {
                g34Var2.J(ec6.v(c52Var, i));
                g34Var2.J(": ");
                g34Var2.J(ec6.l(c52Var, i));
                g34Var2.J("\r\n");
                i++;
            }
        }
    }

    @Override // defpackage.vl1
    public final boolean r() {
        return this.n == 6;
    }

    @Override // defpackage.vl1
    public final void t(rr rrVar) {
        Proxy.Type type = this.y.x().y.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(rrVar.y);
        sb.append(' ');
        a92 a92Var = (a92) rrVar.r;
        if (yf2.p(a92Var.g, "https") || type != Proxy.Type.HTTP) {
            String strY = a92Var.y();
            String strN = a92Var.n();
            if (strN != null) {
                strY = strY + '?' + strN;
            }
            sb.append(strY);
        } else {
            sb.append(a92Var);
        }
        sb.append(" HTTP/1.1");
        q((c52) rrVar.n, sb.toString());
    }

    @Override // defpackage.vl1
    public final vt4 v() {
        return this.r;
    }

    @Override // defpackage.vl1
    public final ul1 x() {
        return this.y;
    }

    @Override // defpackage.vl1
    public final void y() {
        ((g34) this.r.m).flush();
    }
}
