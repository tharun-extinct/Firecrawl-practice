package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class xi0 {
    public q64 g;
    public int n;
    public final int r;
    public final eg5 v;
    public final byte[] y;
    public static final Logger x = Logger.getLogger(xi0.class.getName());
    public static final boolean l = jh5.v;

    public xi0(eg5 eg5Var, int i) {
        if (i < 0) {
            l0.u("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.y = new byte[iMax];
        this.r = iMax;
        this.v = eg5Var;
    }

    public static int a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int j(int i) {
        return t(i << 3);
    }

    public static int l(String str) {
        int length;
        try {
            length = fi5.g(str);
        } catch (di5 unused) {
            length = str.getBytes(gf2.g).length;
        }
        return t(length) + length;
    }

    public static int t(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int x(int i, da0 da0Var) {
        int iJ = j(i);
        int size = da0Var.size();
        return t(size) + size + iJ;
    }

    public final void A(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iT = t(length);
            int i = iT + length;
            int i2 = this.r;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iW = fi5.g.w(str, bArr, 0, length);
                D(iW);
                c(bArr, 0, iW);
                return;
            }
            if (i > i2 - this.n) {
                m();
            }
            int iT2 = t(str.length());
            int i3 = this.n;
            byte[] bArr2 = this.y;
            try {
                if (iT2 == iT) {
                    int i4 = i3 + iT2;
                    this.n = i4;
                    int iW2 = fi5.g.w(str, bArr2, i4, i2 - i4);
                    this.n = i3;
                    n((iW2 - i3) - iT2);
                    this.n = iW2;
                } else {
                    int iG = fi5.g(str);
                    n(iG);
                    this.n = fi5.g.w(str, bArr2, this.n, iG);
                }
            } catch (di5 e) {
                this.n = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new ui0(e2);
            }
        } catch (di5 e3) {
            x.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(gf2.g);
            try {
                D(bytes.length);
                k(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new ui0(e4);
            }
        }
    }

    public final void B(int i, int i2) {
        D((i << 3) | i2);
    }

    public final void C(int i, int i2) {
        q(20);
        r(i, 0);
        n(i2);
    }

    public final void D(int i) {
        q(5);
        n(i);
    }

    public final void E(int i, long j) {
        q(20);
        r(i, 0);
        v(j);
    }

    public final void F(long j) {
        q(10);
        v(j);
    }

    public final void b(int i, da0 da0Var) throws IOException {
        B(i, 2);
        s(da0Var);
    }

    public final void c(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.n;
        int i4 = this.r;
        int i5 = i4 - i3;
        byte[] bArr2 = this.y;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.n += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.n = i4;
        m();
        if (i7 > i4) {
            this.v.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.n = i7;
        }
    }

    public final void d(int i, t0 t0Var, me4 me4Var) {
        B(i, 2);
        D(t0Var.g(me4Var));
        me4Var.l(t0Var, this.g);
    }

    public final void e(String str, int i) throws IOException {
        B(i, 2);
        A(str);
    }

    public final void f(int i) {
        if (i >= 0) {
            D(i);
        } else {
            F(i);
        }
    }

    public final void g(int i) {
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        byte[] bArr = this.y;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.n = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.n = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.n = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void h(long j) {
        q(8);
        y(j);
    }

    public final void i(int i, boolean z) {
        q(11);
        r(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.n;
        this.n = i2 + 1;
        this.y[i2] = b;
    }

    public final void k(byte[] bArr, int i, int i2) throws IOException {
        c(bArr, i, i2);
    }

    public final void m() {
        this.v.write(this.y, 0, this.n);
        this.n = 0;
    }

    public final void n(int i) {
        boolean z = l;
        byte[] bArr = this.y;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.n;
                if (i2 == 0) {
                    this.n = i3 + 1;
                    jh5.a(bArr, i3, (byte) i);
                    return;
                } else {
                    this.n = i3 + 1;
                    jh5.a(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.n;
                if (i4 == 0) {
                    this.n = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.n = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void o(int i, int i2) {
        q(20);
        r(i, 0);
        if (i2 >= 0) {
            n(i2);
        } else {
            v(i2);
        }
    }

    public final void p(int i, int i2) {
        q(14);
        r(i, 5);
        g(i2);
    }

    public final void q(int i) {
        if (this.r - this.n < i) {
            m();
        }
    }

    public final void r(int i, int i2) {
        n((i << 3) | i2);
    }

    public final void s(da0 da0Var) throws IOException {
        D(da0Var.size());
        k(da0Var.t, da0Var.x(), da0Var.size());
    }

    public final void u(int i) {
        q(4);
        g(i);
    }

    public final void v(long j) {
        boolean z = l;
        byte[] bArr = this.y;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.n;
                if (j2 == 0) {
                    this.n = i + 1;
                    jh5.a(bArr, i, (byte) j);
                    return;
                } else {
                    this.n = i + 1;
                    jh5.a(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.n;
                if (j3 == 0) {
                    this.n = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.n = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void w(byte b) {
        if (this.n == this.r) {
            m();
        }
        int i = this.n;
        this.n = i + 1;
        this.y[i] = b;
    }

    public final void y(long j) {
        int i = this.n;
        int i2 = i + 1;
        this.n = i2;
        byte[] bArr = this.y;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.n = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.n = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.n = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.n = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.n = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.n = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.n = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void z(int i, long j) {
        q(18);
        r(i, 1);
        y(j);
    }
}
