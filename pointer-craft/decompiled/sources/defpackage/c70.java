package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class c70 implements r70, p70, Cloneable, ByteChannel {
    public mh4 j;
    public long t;

    public final mh4 A(int i) {
        if (i < 1 || i > 8192) {
            l0.u("unexpected capacity");
            return null;
        }
        mh4 mh4Var = this.j;
        if (mh4Var == null) {
            mh4 mh4VarY = ph4.y();
            this.j = mh4VarY;
            mh4VarY.l = mh4VarY;
            mh4VarY.x = mh4VarY;
            return mh4VarY;
        }
        mh4 mh4Var2 = mh4Var.l;
        mh4Var2.getClass();
        if (mh4Var2.r + i <= 8192 && mh4Var2.v) {
            return mh4Var2;
        }
        mh4 mh4VarY2 = ph4.y();
        mh4Var2.y(mh4VarY2);
        return mh4VarY2;
    }

    @Override // defpackage.r70
    public final int B(sm3 sm3Var) throws EOFException {
        sm3Var.getClass();
        int iY = y.y(this, sm3Var, false);
        if (iY == -1) {
            return -1;
        }
        k(sm3Var.j[iY].y());
        return iY;
    }

    public final void C(int i, byte[] bArr) {
        bArr.getClass();
        long j = i;
        ui4.g(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            mh4 mh4VarA = A(1);
            int iMin = Math.min(i - i2, 8192 - mh4VarA.r);
            int i3 = i2 + iMin;
            pr.L(mh4VarA.r, i2, i3, bArr, mh4VarA.g);
            mh4VarA.r += iMin;
            i2 = i3;
        }
        this.t += j;
    }

    public final void D(fa0 fa0Var) {
        fa0Var.getClass();
        fa0Var.w(this, fa0Var.y());
    }

    public final void E(hu4 hu4Var) {
        hu4Var.getClass();
        while (hu4Var.j(8192L, this) != -1) {
        }
    }

    public final void F(int i) {
        mh4 mh4VarA = A(1);
        byte[] bArr = mh4VarA.g;
        int i2 = mh4VarA.r;
        mh4VarA.r = i2 + 1;
        bArr[i2] = (byte) i;
        this.t++;
    }

    public final void I(long j) {
        boolean z;
        if (j == 0) {
            F(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                Q("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = y.g;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > y.y[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        mh4 mh4VarA = A(i);
        byte[] bArr2 = mh4VarA.g;
        int i2 = mh4VarA.r + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = y.g[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        mh4VarA.r += i;
        this.t += (long) i;
    }

    @Override // defpackage.p70
    public final /* bridge */ /* synthetic */ p70 J(String str) {
        Q(str);
        return this;
    }

    public final void L(long j) {
        if (j == 0) {
            F(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        mh4 mh4VarA = A(i);
        byte[] bArr = mh4VarA.g;
        int i2 = mh4VarA.r;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = y.g[(int) (15 & j)];
            j >>>= 4;
        }
        mh4VarA.r += i;
        this.t += (long) i;
    }

    public final void M(int i) {
        mh4 mh4VarA = A(4);
        byte[] bArr = mh4VarA.g;
        int i2 = mh4VarA.r;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        mh4VarA.r = i2 + 4;
        this.t += 4;
    }

    @Override // defpackage.r70
    public final String N(Charset charset) {
        charset.getClass();
        return o(this.t, charset);
    }

    public final void P(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            l0.t(xi3.j("beginIndex < 0: ", i));
            return;
        }
        if (i2 < i) {
            l0.t(du4.m(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbP = du4.p(i2, "endIndex > string.length: ", " > ");
            sbP.append(str.length());
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                mh4 mh4VarA = A(1);
                byte[] bArr = mh4VarA.g;
                int i3 = mh4VarA.r - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = mh4VarA.r;
                int i6 = (i3 + i) - i5;
                mh4VarA.r = i5 + i6;
                this.t += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    mh4 mh4VarA2 = A(2);
                    byte[] bArr2 = mh4VarA2.g;
                    int i7 = mh4VarA2.r;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    mh4VarA2.r = i7 + 2;
                    this.t += 2;
                } else if (55296 <= cCharAt2 && cCharAt2 < 56320) {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (56320 > cCharAt3 || cCharAt3 >= 57344) {
                        F(63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        mh4 mh4VarA3 = A(4);
                        byte[] bArr3 = mh4VarA3.g;
                        int i10 = mh4VarA3.r;
                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                        mh4VarA3.r = i10 + 4;
                        this.t += 4;
                        i += 2;
                    }
                } else if (56320 > cCharAt2 || cCharAt2 >= 57344) {
                    mh4 mh4VarA4 = A(3);
                    byte[] bArr4 = mh4VarA4.g;
                    int i11 = mh4VarA4.r;
                    bArr4[i11] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr4[i11 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr4[i11 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    mh4VarA4.r = i11 + 3;
                    this.t += 3;
                } else {
                    F(63);
                }
                i++;
            }
        }
    }

    public final void Q(String str) {
        str.getClass();
        P(0, str.length(), str);
    }

    public final void R(int i) {
        if (i < 128) {
            F(i);
            return;
        }
        if (i < 2048) {
            mh4 mh4VarA = A(2);
            byte[] bArr = mh4VarA.g;
            int i2 = mh4VarA.r;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            mh4VarA.r = i2 + 2;
            this.t += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            F(63);
            return;
        }
        if (i < 65536) {
            mh4 mh4VarA2 = A(3);
            byte[] bArr2 = mh4VarA2.g;
            int i3 = mh4VarA2.r;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            mh4VarA2.r = i3 + 3;
            this.t += 3;
            return;
        }
        if (i > 1114111) {
            l0.u("Unexpected code point: 0x".concat(ui4.r(i)));
            return;
        }
        mh4 mh4VarA3 = A(4);
        byte[] bArr3 = mh4VarA3.g;
        int i4 = mh4VarA3.r;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        mh4VarA3.r = i4 + 4;
        this.t += 4;
    }

    public final byte[] a() {
        return w(this.t);
    }

    public final long b() throws EOFException {
        int i;
        if (this.t == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            mh4 mh4Var = this.j;
            mh4Var.getClass();
            byte[] bArr = mh4Var.g;
            int i3 = mh4Var.y;
            int i4 = mh4Var.r;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = oy0.g;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    c70 c70Var = new c70();
                    c70Var.L(j);
                    c70Var.F(b);
                    throw new NumberFormatException("Number too large: ".concat(c70Var.f()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.j = mh4Var.g();
                ph4.g(mh4Var);
            } else {
                mh4Var.y = i3;
            }
            if (z) {
                break;
            }
        } while (this.j != null);
        this.t -= (long) i2;
        return j;
    }

    public final Object clone() {
        c70 c70Var = new c70();
        if (this.t == 0) {
            return c70Var;
        }
        mh4 mh4Var = this.j;
        mh4Var.getClass();
        mh4 mh4VarR = mh4Var.r();
        c70Var.j = mh4VarR;
        mh4VarR.l = mh4VarR;
        mh4VarR.x = mh4VarR;
        for (mh4 mh4Var2 = mh4Var.x; mh4Var2 != mh4Var; mh4Var2 = mh4Var2.x) {
            mh4 mh4Var3 = mh4VarR.l;
            mh4Var3.getClass();
            mh4Var2.getClass();
            mh4Var3.y(mh4Var2.r());
        }
        c70Var.t = this.t;
        return c70Var;
    }

    public final fa0 d(int i) {
        if (i == 0) {
            return fa0.m;
        }
        ui4.g(this.t, 0L, i);
        mh4 mh4Var = this.j;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            mh4Var.getClass();
            int i5 = mh4Var.r;
            int i6 = mh4Var.y;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            mh4Var = mh4Var.x;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        mh4 mh4Var2 = this.j;
        int i7 = 0;
        while (i2 < i) {
            mh4Var2.getClass();
            bArr[i7] = mh4Var2.g;
            i2 += mh4Var2.r - mh4Var2.y;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = mh4Var2.y;
            mh4Var2.n = true;
            i7++;
            mh4Var2 = mh4Var2.x;
        }
        return new vh4(bArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c70)) {
            return false;
        }
        long j = this.t;
        c70 c70Var = (c70) obj;
        if (j != c70Var.t) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        mh4 mh4Var = this.j;
        mh4Var.getClass();
        mh4 mh4Var2 = c70Var.j;
        mh4Var2.getClass();
        int i = mh4Var.y;
        int i2 = mh4Var2.y;
        long j2 = 0;
        while (j2 < this.t) {
            long jMin = Math.min(mh4Var.r - i, mh4Var2.r - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (mh4Var.g[i] != mh4Var2.g[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == mh4Var.r) {
                mh4Var = mh4Var.x;
                mh4Var.getClass();
                i = mh4Var.y;
            }
            if (i2 == mh4Var2.r) {
                mh4Var2 = mh4Var2.x;
                mh4Var2.getClass();
                i2 = mh4Var2.y;
            }
            j2 += jMin;
        }
        return true;
    }

    public final String f() {
        return o(this.t, od0.g);
    }

    public final short h() throws EOFException {
        if (this.t < 2) {
            throw new EOFException();
        }
        mh4 mh4Var = this.j;
        mh4Var.getClass();
        int i = mh4Var.y;
        int i2 = mh4Var.r;
        if (i2 - i < 2) {
            return (short) ((t() & 255) | ((t() & 255) << 8));
        }
        byte[] bArr = mh4Var.g;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.t -= 2;
        if (i5 == i2) {
            this.j = mh4Var.g();
            ph4.g(mh4Var);
        } else {
            mh4Var.y = i5;
        }
        return (short) i6;
    }

    public final int hashCode() {
        mh4 mh4Var = this.j;
        if (mh4Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = mh4Var.r;
            for (int i3 = mh4Var.y; i3 < i2; i3++) {
                i = (i * 31) + mh4Var.g[i3];
            }
            mh4Var = mh4Var.x;
            mh4Var.getClass();
        } while (mh4Var != this.j);
        return i;
    }

    public final fa0 i(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            up.t("byteCount: ", j);
            return null;
        }
        if (this.t < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new fa0(w(j));
        }
        fa0 fa0VarD = d((int) j);
        k(j);
        return fa0VarD;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.hu4
    public final long j(long j, c70 c70Var) {
        c70Var.getClass();
        if (j < 0) {
            up.t("byteCount < 0: ", j);
            return 0L;
        }
        long j2 = this.t;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c70Var.z(j, this);
        return j;
    }

    public final void k(long j) throws EOFException {
        while (j > 0) {
            mh4 mh4Var = this.j;
            if (mh4Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, mh4Var.r - mh4Var.y);
            long j2 = iMin;
            this.t -= j2;
            j -= j2;
            int i = mh4Var.y + iMin;
            mh4Var.y = i;
            if (i == mh4Var.r) {
                this.j = mh4Var.g();
                ph4.g(mh4Var);
            }
        }
    }

    public final String o(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            up.t("byteCount: ", j);
            return null;
        }
        if (this.t < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        mh4 mh4Var = this.j;
        mh4Var.getClass();
        int i = mh4Var.y;
        if (((long) i) + j > mh4Var.r) {
            return new String(w(j), charset);
        }
        int i2 = (int) j;
        String str = new String(mh4Var.g, i, i2, charset);
        int i3 = mh4Var.y + i2;
        mh4Var.y = i3;
        this.t -= j;
        if (i3 == mh4Var.r) {
            this.j = mh4Var.g();
            ph4.g(mh4Var);
        }
        return str;
    }

    @Override // defpackage.hu4, defpackage.bq4
    public final m95 r() {
        return m95.n;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        mh4 mh4Var = this.j;
        if (mh4Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), mh4Var.r - mh4Var.y);
        byteBuffer.put(mh4Var.g, mh4Var.y, iMin);
        int i = mh4Var.y + iMin;
        mh4Var.y = i;
        this.t -= (long) iMin;
        if (i == mh4Var.r) {
            this.j = mh4Var.g();
            ph4.g(mh4Var);
        }
        return iMin;
    }

    public final byte t() throws EOFException {
        if (this.t == 0) {
            throw new EOFException();
        }
        mh4 mh4Var = this.j;
        mh4Var.getClass();
        int i = mh4Var.y;
        int i2 = mh4Var.r;
        int i3 = i + 1;
        byte b = mh4Var.g[i];
        this.t--;
        if (i3 != i2) {
            mh4Var.y = i3;
            return b;
        }
        this.j = mh4Var.g();
        ph4.g(mh4Var);
        return b;
    }

    public final String toString() {
        long j = this.t;
        if (j <= 2147483647L) {
            return d((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.t).toString());
    }

    public final int u() throws EOFException {
        if (this.t < 4) {
            throw new EOFException();
        }
        mh4 mh4Var = this.j;
        mh4Var.getClass();
        int i = mh4Var.y;
        int i2 = mh4Var.r;
        if (i2 - i < 4) {
            return (t() & 255) | ((t() & 255) << 24) | ((t() & 255) << 16) | ((t() & 255) << 8);
        }
        byte[] bArr = mh4Var.g;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.t -= 4;
        if (i5 != i2) {
            mh4Var.y = i5;
            return i6;
        }
        this.j = mh4Var.g();
        ph4.g(mh4Var);
        return i6;
    }

    public final byte[] w(long j) throws EOFException {
        int iMin;
        if (j < 0 || j > 2147483647L) {
            up.t("byteCount: ", j);
            return null;
        }
        if (this.t < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            ui4.g(i, i2, i3);
            mh4 mh4Var = this.j;
            if (mh4Var == null) {
                iMin = -1;
            } else {
                iMin = Math.min(i3, mh4Var.r - mh4Var.y);
                byte[] bArr2 = mh4Var.g;
                int i4 = mh4Var.y;
                pr.L(i2, i4, i4 + iMin, bArr2, bArr);
                int i5 = mh4Var.y + iMin;
                mh4Var.y = i5;
                this.t -= (long) iMin;
                if (i5 == mh4Var.r) {
                    this.j = mh4Var.g();
                    ph4.g(mh4Var);
                }
            }
            if (iMin == -1) {
                throw new EOFException();
            }
            i2 += iMin;
        }
        return bArr;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            mh4 mh4VarA = A(1);
            int iMin = Math.min(i, 8192 - mh4VarA.r);
            byteBuffer.get(mh4VarA.g, mh4VarA.r, iMin);
            i -= iMin;
            mh4VarA.r += iMin;
        }
        this.t += (long) iRemaining;
        return iRemaining;
    }

    public final byte x(long j) {
        ui4.g(this.t, j, 1L);
        mh4 mh4Var = this.j;
        mh4Var.getClass();
        long j2 = this.t;
        if (j2 - j < j) {
            while (j2 > j) {
                mh4Var = mh4Var.l;
                mh4Var.getClass();
                j2 -= (long) (mh4Var.r - mh4Var.y);
            }
            return mh4Var.g[(int) ((((long) mh4Var.y) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = mh4Var.r;
            int i2 = mh4Var.y;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return mh4Var.g[(int) ((((long) i2) + j) - j3)];
            }
            mh4Var = mh4Var.x;
            mh4Var.getClass();
            j3 = j4;
        }
    }

    public final boolean y() {
        return this.t == 0;
    }

    @Override // defpackage.bq4
    public final void z(long j, c70 c70Var) {
        mh4 mh4VarY;
        c70Var.getClass();
        if (c70Var == this) {
            l0.u("source == this");
            return;
        }
        ui4.g(c70Var.t, 0L, j);
        while (j > 0) {
            mh4 mh4Var = c70Var.j;
            mh4Var.getClass();
            int i = mh4Var.r;
            mh4 mh4Var2 = c70Var.j;
            mh4Var2.getClass();
            long j2 = i - mh4Var2.y;
            int i2 = 0;
            if (j < j2) {
                mh4 mh4Var3 = this.j;
                mh4 mh4Var4 = mh4Var3 != null ? mh4Var3.l : null;
                if (mh4Var4 != null && mh4Var4.v) {
                    if ((((long) mh4Var4.r) + j) - ((long) (mh4Var4.n ? 0 : mh4Var4.y)) <= 8192) {
                        mh4 mh4Var5 = c70Var.j;
                        mh4Var5.getClass();
                        mh4Var5.n(mh4Var4, (int) j);
                        c70Var.t -= j;
                        this.t += j;
                        return;
                    }
                }
                mh4 mh4Var6 = c70Var.j;
                mh4Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > mh4Var6.r - mh4Var6.y) {
                    l0.u("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    mh4VarY = mh4Var6.r();
                } else {
                    mh4VarY = ph4.y();
                    byte[] bArr = mh4Var6.g;
                    byte[] bArr2 = mh4VarY.g;
                    int i4 = mh4Var6.y;
                    pr.L(0, i4, i4 + i3, bArr, bArr2);
                }
                mh4VarY.r = mh4VarY.y + i3;
                mh4Var6.y += i3;
                mh4 mh4Var7 = mh4Var6.l;
                mh4Var7.getClass();
                mh4Var7.y(mh4VarY);
                c70Var.j = mh4VarY;
            }
            mh4 mh4Var8 = c70Var.j;
            mh4Var8.getClass();
            long j3 = mh4Var8.r - mh4Var8.y;
            c70Var.j = mh4Var8.g();
            mh4 mh4Var9 = this.j;
            if (mh4Var9 == null) {
                this.j = mh4Var8;
                mh4Var8.l = mh4Var8;
                mh4Var8.x = mh4Var8;
            } else {
                mh4 mh4Var10 = mh4Var9.l;
                mh4Var10.getClass();
                mh4Var10.y(mh4Var8);
                mh4 mh4Var11 = mh4Var8.l;
                if (mh4Var11 == mh4Var8) {
                    l0.z("cannot compact");
                    return;
                }
                mh4Var11.getClass();
                if (mh4Var11.v) {
                    int i5 = mh4Var8.r - mh4Var8.y;
                    mh4 mh4Var12 = mh4Var8.l;
                    mh4Var12.getClass();
                    int i6 = 8192 - mh4Var12.r;
                    mh4 mh4Var13 = mh4Var8.l;
                    mh4Var13.getClass();
                    if (!mh4Var13.n) {
                        mh4 mh4Var14 = mh4Var8.l;
                        mh4Var14.getClass();
                        i2 = mh4Var14.y;
                    }
                    if (i5 <= i6 + i2) {
                        mh4 mh4Var15 = mh4Var8.l;
                        mh4Var15.getClass();
                        mh4Var8.n(mh4Var15, i5);
                        mh4Var8.g();
                        ph4.g(mh4Var8);
                    }
                }
            }
            c70Var.t -= j3;
            this.t += j3;
            j -= j3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.bq4
    public final void close() {
    }

    @Override // defpackage.bq4, java.io.Flushable
    public final void flush() {
    }
}
