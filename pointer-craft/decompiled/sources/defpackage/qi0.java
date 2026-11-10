package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qi0 extends ri0 {
    public final FileInputStream a;
    public int b;
    public int c;
    public int i;
    public final byte[] m;
    public int q;
    public int s = Integer.MAX_VALUE;
    public int w;

    public qi0(FileInputStream fileInputStream) {
        Charset charset = gf2.g;
        this.a = fileInputStream;
        this.m = new byte[4096];
        this.q = 0;
        this.c = 0;
        this.b = 0;
    }

    @Override // defpackage.ri0
    public final String A() throws ig2 {
        int iM = M();
        byte[] bArr = this.m;
        if (iM > 0) {
            int i = this.q;
            int i2 = this.c;
            if (iM <= i - i2) {
                String str = new String(bArr, i2, iM, gf2.g);
                this.c += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw ig2.n();
        }
        if (iM > this.q) {
            return new String(H(iM), gf2.g);
        }
        Q(iM);
        String str2 = new String(bArr, this.c, iM, gf2.g);
        this.c += iM;
        return str2;
    }

    @Override // defpackage.ri0
    public final String B() throws IOException {
        int iM = M();
        int i = this.c;
        int i2 = this.q;
        int i3 = i2 - i;
        byte[] bArrH = this.m;
        if (iM <= i3 && iM > 0) {
            this.c = i + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            if (iM < 0) {
                throw ig2.n();
            }
            i = 0;
            if (iM <= i2) {
                Q(iM);
                this.c = iM;
            } else {
                bArrH = H(iM);
            }
        }
        return fi5.g.q(bArrH, i, iM);
    }

    @Override // defpackage.ri0
    public final int C() throws ig2 {
        if (v()) {
            this.i = 0;
            return 0;
        }
        int iM = M();
        this.i = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new ig2("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.ri0
    public final int D() {
        return M();
    }

    @Override // defpackage.ri0
    public final long E() {
        return N();
    }

    @Override // defpackage.ri0
    public final boolean F(int i) throws ig2 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                R(8);
                return true;
            }
            if (i2 == 2) {
                R(M());
                return true;
            }
            if (i2 == 3) {
                G();
                g(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw ig2.y();
            }
            R(4);
            return true;
        }
        int i4 = this.q - this.c;
        byte[] bArr = this.m;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.c;
                this.c = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw ig2.r();
        }
        while (i3 < 10) {
            if (this.c == this.q) {
                Q(1);
            }
            int i6 = this.c;
            this.c = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw ig2.r();
        return true;
    }

    public final byte[] H(int i) throws IOException {
        byte[] bArrI = I(i);
        if (bArrI != null) {
            return bArrI;
        }
        int i2 = this.c;
        int i3 = this.q;
        int length = i3 - i2;
        this.b += i3;
        this.c = 0;
        this.q = 0;
        ArrayList arrayListJ = J(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.m, i2, bArr, 0, length);
        int size = arrayListJ.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListJ.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] I(int i) throws IOException {
        if (i == 0) {
            return gf2.y;
        }
        if (i < 0) {
            throw ig2.n();
        }
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new ig2("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.s;
        if (i4 > i5) {
            R((i5 - i2) - i3);
            throw ig2.v();
        }
        int i6 = this.q - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.a;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (ig2 e) {
                e.j = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.m, this.c, bArr, 0, i6);
        this.b += this.q;
        this.c = 0;
        this.q = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw ig2.v();
                }
                this.b += i8;
                i6 += i8;
            } catch (ig2 e2) {
                e2.j = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList J(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.a.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw ig2.v();
                }
                this.b += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() throws ig2 {
        int i = this.c;
        if (this.q - i < 4) {
            Q(4);
            i = this.c;
        }
        this.c = i + 4;
        byte[] bArr = this.m;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long L() throws ig2 {
        int i = this.c;
        if (this.q - i < 8) {
            Q(8);
            i = this.c;
        }
        this.c = i + 8;
        byte[] bArr = this.m;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int M() {
        int i;
        int i2 = this.c;
        int i3 = this.q;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.m;
            byte b = bArr[i2];
            if (b >= 0) {
                this.c = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.c = i5;
                return i;
            }
        }
        return (int) O();
    }

    public final long N() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.c;
        int i2 = this.q;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.m;
            byte b = bArr[i];
            if (b >= 0) {
                this.c = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.c = i4;
                return j;
            }
        }
        return O();
    }

    public final long O() throws ig2 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.c == this.q) {
                Q(1);
            }
            int i2 = this.c;
            this.c = i2 + 1;
            byte b = this.m[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw ig2.r();
    }

    public final void P() {
        int i = this.q + this.w;
        this.q = i;
        int i2 = this.b + i;
        int i3 = this.s;
        if (i2 <= i3) {
            this.w = 0;
            return;
        }
        int i4 = i2 - i3;
        this.w = i4;
        this.q = i - i4;
    }

    public final void Q(int i) throws ig2 {
        if (S(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.b) - this.c) {
            throw ig2.v();
        }
        throw new ig2("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void R(int i) throws ig2 {
        int i2 = this.q;
        int i3 = this.c;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.c = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.a;
        if (i < 0) {
            throw ig2.n();
        }
        int i5 = this.b;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.s;
        if (i7 > i8) {
            R((i8 - i5) - i3);
            throw ig2.v();
        }
        this.b = i6;
        this.q = 0;
        this.c = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (ig2 e) {
                    e.j = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.b += i4;
                P();
                throw th;
            }
        }
        this.b += i4;
        P();
        if (i4 >= i) {
            return;
        }
        int i9 = this.q;
        int i10 = i9 - this.c;
        this.c = i9;
        Q(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.q;
            if (i11 <= i12) {
                this.c = i11;
                return;
            } else {
                i10 += i12;
                this.c = i12;
                Q(1);
            }
        }
    }

    public final boolean S(int i) throws IOException {
        FileInputStream fileInputStream = this.a;
        int i2 = this.c;
        int i3 = i2 + i;
        int i4 = this.q;
        if (i3 <= i4) {
            l0.z(du4.w(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.b;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.s) {
            byte[] bArr = this.m;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.b + i2;
                this.b = i5;
                i4 = this.q - i2;
                this.q = i4;
                this.c = 0;
            }
            try {
                int i6 = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
                }
                if (i6 > 0) {
                    this.q += i6;
                    P();
                    if (this.q >= i) {
                        return true;
                    }
                    return S(i);
                }
            } catch (ig2 e) {
                e.j = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.ri0
    public final double b() {
        return Double.longBitsToDouble(L());
    }

    @Override // defpackage.ri0
    public final int d() {
        int iM = M();
        return (-(iM & 1)) ^ (iM >>> 1);
    }

    @Override // defpackage.ri0
    public final long e() {
        long jN = N();
        return (-(jN & 1)) ^ (jN >>> 1);
    }

    @Override // defpackage.ri0
    public final int f() {
        return K();
    }

    @Override // defpackage.ri0
    public final void g(int i) throws ig2 {
        if (this.i != i) {
            throw new ig2("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.ri0
    public final int h() {
        return M();
    }

    @Override // defpackage.ri0
    public final da0 i() throws IOException {
        int iM = M();
        int i = this.q;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr = this.m;
        if (iM <= i3 && iM > 0) {
            da0 da0VarN = da0.n(bArr, i2, iM);
            this.c += iM;
            return da0VarN;
        }
        if (iM == 0) {
            return da0.a;
        }
        if (iM < 0) {
            throw ig2.n();
        }
        byte[] bArrI = I(iM);
        if (bArrI != null) {
            return da0.n(bArrI, 0, bArrI.length);
        }
        int i4 = this.c;
        int i5 = this.q;
        int length = i5 - i4;
        this.b += i5;
        this.c = 0;
        this.q = 0;
        ArrayList arrayListJ = J(iM - length);
        byte[] bArr2 = new byte[iM];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListJ.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListJ.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        da0 da0Var = da0.a;
        return new da0(bArr2);
    }

    @Override // defpackage.ri0
    public final long k() {
        return L();
    }

    @Override // defpackage.ri0
    public final void m(int i) {
        this.s = i;
        P();
    }

    @Override // defpackage.ri0
    public final int n() {
        return this.b + this.c;
    }

    @Override // defpackage.ri0
    public final long o() {
        return N();
    }

    @Override // defpackage.ri0
    public final int p() {
        return K();
    }

    @Override // defpackage.ri0
    public final int q(int i) throws ig2 {
        if (i < 0) {
            throw ig2.n();
        }
        int i2 = this.b + this.c + i;
        if (i2 < 0) {
            throw new ig2("Failed to parse the message.");
        }
        int i3 = this.s;
        if (i2 > i3) {
            throw ig2.v();
        }
        this.s = i2;
        P();
        return i3;
    }

    @Override // defpackage.ri0
    public final int s() {
        return M();
    }

    @Override // defpackage.ri0
    public final long u() {
        return L();
    }

    @Override // defpackage.ri0
    public final boolean v() {
        return this.c == this.q && !S(1);
    }

    @Override // defpackage.ri0
    public final boolean w() {
        return N() != 0;
    }

    @Override // defpackage.ri0
    public final float z() {
        return Float.intBitsToFloat(K());
    }
}
