package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class nq0 {
    public static final nq0 v;
    public static final nq0 x;
    public final boolean g;
    public final String[] n;
    public final String[] r;
    public final boolean y;

    static {
        jf0 jf0Var = jf0.p;
        jf0 jf0Var2 = jf0.u;
        jf0 jf0Var3 = jf0.z;
        jf0 jf0Var4 = jf0.q;
        jf0 jf0Var5 = jf0.c;
        jf0 jf0Var6 = jf0.w;
        jf0 jf0Var7 = jf0.i;
        jf0 jf0Var8 = jf0.s;
        jf0 jf0Var9 = jf0.b;
        List listD = pw5.d(jf0Var, jf0Var2, jf0Var3, jf0Var4, jf0Var5, jf0Var6, jf0Var7, jf0Var8, jf0Var9);
        List listD2 = pw5.d(jf0Var, jf0Var2, jf0Var3, jf0Var4, jf0Var5, jf0Var6, jf0Var7, jf0Var8, jf0Var9, jf0.a, jf0.m, jf0.j, jf0.t, jf0.x, jf0.l, jf0.v);
        mq0 mq0Var = new mq0();
        jf0[] jf0VarArr = (jf0[]) listD.toArray(new jf0[0]);
        mq0Var.y((jf0[]) Arrays.copyOf(jf0VarArr, jf0VarArr.length));
        x95 x95Var = x95.a;
        x95 x95Var2 = x95.m;
        mq0Var.r(x95Var, x95Var2);
        mq0Var.n = true;
        mq0Var.g();
        mq0 mq0Var2 = new mq0();
        jf0[] jf0VarArr2 = (jf0[]) listD2.toArray(new jf0[0]);
        mq0Var2.y((jf0[]) Arrays.copyOf(jf0VarArr2, jf0VarArr2.length));
        mq0Var2.r(x95Var, x95Var2);
        mq0Var2.n = true;
        v = mq0Var2.g();
        mq0 mq0Var3 = new mq0();
        jf0[] jf0VarArr3 = (jf0[]) listD2.toArray(new jf0[0]);
        mq0Var3.y((jf0[]) Arrays.copyOf(jf0VarArr3, jf0VarArr3.length));
        mq0Var3.r(x95Var, x95Var2, x95.q, x95.w);
        mq0Var3.n = true;
        mq0Var3.g();
        x = new nq0(false, false, null, null);
    }

    public nq0(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.g = z;
        this.y = z2;
        this.r = strArr;
        this.n = strArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nq0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        nq0 nq0Var = (nq0) obj;
        boolean z = nq0Var.g;
        boolean z2 = this.g;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.r, nq0Var.r) && Arrays.equals(this.n, nq0Var.n) && this.y == nq0Var.y;
        }
        return true;
    }

    public final void g(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.r;
        if (strArr != null) {
            enabledCipherSuites = us5.a(strArr, enabledCipherSuites, jf0.r);
        }
        String[] strArr2 = this.n;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = us5.a(enabledProtocols2, strArr2, hc3.y);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        fu1 fu1Var = jf0.r;
        byte[] bArr = us5.g;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (fu1Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.g;
        if (!z2) {
            l0.u("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            l0.u("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            l0.u("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            l0.u("At least one TLS version is required");
            return;
        }
        nq0 nq0Var = new nq0(z2, this.y, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (nq0Var.n() != null) {
            sSLSocket.setEnabledProtocols(nq0Var.n);
        }
        if (nq0Var.y() != null) {
            sSLSocket.setEnabledCipherSuites(nq0Var.r);
        }
    }

    public final int hashCode() {
        if (!this.g) {
            return 17;
        }
        String[] strArr = this.r;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.n;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.y ? 1 : 0);
    }

    public final ArrayList n() {
        String[] strArr = this.n;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            x95.t.getClass();
            arrayList.add(aj6.z(str));
        }
        return arrayList;
    }

    public final boolean r() {
        return this.g;
    }

    public final String toString() {
        if (!this.g) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(y(), "[all enabled]") + ", tlsVersions=" + Objects.toString(n(), "[all enabled]") + ", supportsTlsExtensions=" + this.y + ')';
    }

    public final ArrayList y() {
        String[] strArr = this.r;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(jf0.y.u(str));
        }
        return arrayList;
    }
}
