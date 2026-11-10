package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ni0 {
    public final byte[] g;
    public int l;
    public int r;
    public int v;
    public int y;
    public int x = Integer.MAX_VALUE;
    public int n = 0;

    public ni0(int i, byte[] bArr) {
        this.g = bArr;
        this.y = i;
    }

    public static ni0 n(int i, byte[] bArr) {
        return new ni0(i, bArr);
    }

    public final float a() {
        return Float.intBitsToFloat(i());
    }

    public final int b() throws jg2 {
        int i;
        byte bW = w();
        if (bW >= 0) {
            return bW;
        }
        int i2 = bW & 127;
        byte bW2 = w();
        if (bW2 >= 0) {
            i = bW2 << 7;
        } else {
            i2 |= (bW2 & 127) << 7;
            byte bW3 = w();
            if (bW3 >= 0) {
                i = bW3 << 14;
            } else {
                i2 |= (bW3 & 127) << 14;
                byte bW4 = w();
                if (bW4 < 0) {
                    int i3 = i2 | ((bW4 & 127) << 21);
                    byte bW5 = w();
                    int i4 = i3 | (bW5 << 28);
                    if (bW5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (w() < 0) {
                            }
                        }
                        throw new jg2("CodedInputStream encountered a malformed varint.");
                    }
                    return i4;
                }
                i = bW4 << 21;
            }
        }
        return i | i2;
    }

    public final byte[] c(int i) throws jg2 {
        if (i < 0) {
            throw new jg2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.n;
        int i3 = i2 + i;
        int i4 = this.x;
        if (i3 > i4) {
            h(i4 - i2);
            throw jg2.g();
        }
        if (i > this.y - i2) {
            throw jg2.g();
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, i2, bArr, 0, i);
        this.n += i;
        return bArr;
    }

    public final void g(int i) throws jg2 {
        if (this.v != i) {
            throw new jg2("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void h(int i) throws jg2 {
        if (i < 0) {
            throw new jg2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.n;
        int i3 = i2 + i;
        int i4 = this.x;
        if (i3 > i4) {
            h(i4 - i2);
            throw jg2.g();
        }
        if (i > this.y - i2) {
            throw jg2.g();
        }
        this.n = i3;
    }

    public final int i() throws jg2 {
        byte bW = w();
        byte bW2 = w();
        byte bW3 = w();
        return ((w() & 255) << 24) | (bW & 255) | ((bW2 & 255) << 8) | ((bW3 & 255) << 16);
    }

    public final byte[] j() throws jg2 {
        int iB = b();
        int i = this.y;
        int i2 = this.n;
        if (iB > i - i2 || iB <= 0) {
            return iB == 0 ? k33.F : c(iB);
        }
        byte[] bArr = new byte[iB];
        System.arraycopy(this.g, i2, bArr, 0, iB);
        this.n += iB;
        return bArr;
    }

    public final boolean l() {
        return b() != 0;
    }

    public final int m() {
        return b();
    }

    public final int p() throws jg2 {
        if (this.n == this.y) {
            this.v = 0;
            return 0;
        }
        int iB = b();
        this.v = iB;
        if (iB != 0) {
            return iB;
        }
        throw new jg2("Protocol message contained an invalid tag (zero).");
    }

    public final void q(np3 np3Var) throws jg2 {
        int iB = b();
        if (this.l >= 64) {
            throw new jg2("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iX = x(iB);
        this.l++;
        np3Var.n(this);
        g(0);
        this.l--;
        v(iX);
    }

    public final int r() {
        return this.n;
    }

    public final String s() throws jg2 {
        int iB = b();
        int i = this.y;
        int i2 = this.n;
        if (iB > i - i2 || iB <= 0) {
            return new String(c(iB), lf2.g);
        }
        String str = new String(this.g, i2, iB, lf2.g);
        this.n += iB;
        return str;
    }

    public final int t() {
        return b();
    }

    public final void u(int i) {
        if (i > this.n) {
            StringBuilder sbP = du4.p(i, "Position ", " is beyond current ");
            sbP.append(this.n);
            throw new IllegalArgumentException(sbP.toString());
        }
        if (i >= 0) {
            this.n = i;
        } else {
            l0.u(xi3.j("Bad position ", i));
        }
    }

    public final void v(int i) {
        this.x = i;
        int i2 = this.y + this.r;
        this.y = i2;
        if (i2 <= i) {
            this.r = 0;
            return;
        }
        int i3 = i2 - i;
        this.r = i3;
        this.y = i2 - i3;
    }

    public final byte w() throws jg2 {
        int i = this.n;
        if (i == this.y) {
            throw jg2.g();
        }
        this.n = i + 1;
        return this.g[i];
    }

    public final int x(int i) throws jg2 {
        if (i < 0) {
            throw new jg2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.n;
        int i3 = this.x;
        if (i2 > i3) {
            throw jg2.g();
        }
        this.x = i2;
        int i4 = this.y + this.r;
        this.y = i4;
        if (i4 <= i2) {
            this.r = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.r = i5;
        this.y = i4 - i5;
        return i3;
    }

    public final int y() {
        int i = this.x;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.n;
    }

    public final boolean z(int i) {
        int iP;
        int i2 = i & 7;
        if (i2 == 0) {
            b();
            return true;
        }
        if (i2 == 1) {
            w();
            w();
            w();
            w();
            w();
            w();
            w();
            w();
            return true;
        }
        if (i2 == 2) {
            h(b());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new jg2("Protocol message tag had invalid wire type.");
            }
            i();
            return true;
        }
        do {
            iP = p();
            if (iP == 0) {
                break;
            }
        } while (z(iP));
        g(((i >>> 3) << 3) | 4);
        return true;
    }
}
