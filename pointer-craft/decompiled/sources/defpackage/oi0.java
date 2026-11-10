package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class oi0 extends ri0 {
    public final byte[] a;
    public int b = Integer.MAX_VALUE;
    public final int c;
    public int i;
    public int m;
    public int q;
    public int w;

    public oi0(byte[] bArr, int i, int i2, boolean z) {
        this.a = bArr;
        this.m = i2 + i;
        this.w = i;
        this.c = i;
    }

    @Override // defpackage.ri0
    public final String A() throws ig2 {
        int iJ = J();
        if (iJ > 0) {
            int i = this.m;
            int i2 = this.w;
            if (iJ <= i - i2) {
                String str = new String(this.a, i2, iJ, gf2.g);
                this.w += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw ig2.n();
        }
        throw ig2.v();
    }

    @Override // defpackage.ri0
    public final String B() throws ig2 {
        int iJ = J();
        if (iJ > 0) {
            int i = this.m;
            int i2 = this.w;
            if (iJ <= i - i2) {
                String strQ = fi5.g.q(this.a, i2, iJ);
                this.w += iJ;
                return strQ;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw ig2.n();
        }
        throw ig2.v();
    }

    @Override // defpackage.ri0
    public final int C() throws ig2 {
        if (v()) {
            this.i = 0;
            return 0;
        }
        int iJ = J();
        this.i = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new ig2("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.ri0
    public final int D() {
        return J();
    }

    @Override // defpackage.ri0
    public final long E() {
        return K();
    }

    @Override // defpackage.ri0
    public final boolean F(int i) throws ig2 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                N(8);
                return true;
            }
            if (i2 == 2) {
                N(J());
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
            N(4);
            return true;
        }
        int i4 = this.m - this.w;
        byte[] bArr = this.a;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.w;
                this.w = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw ig2.r();
        }
        while (i3 < 10) {
            int i6 = this.w;
            if (i6 == this.m) {
                throw ig2.v();
            }
            this.w = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw ig2.r();
        return true;
    }

    public final int H() throws ig2 {
        int i = this.w;
        if (this.m - i < 4) {
            throw ig2.v();
        }
        this.w = i + 4;
        byte[] bArr = this.a;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() throws ig2 {
        int i = this.w;
        if (this.m - i < 8) {
            throw ig2.v();
        }
        this.w = i + 8;
        byte[] bArr = this.a;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int J() {
        int i;
        int i2 = this.w;
        int i3 = this.m;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.a;
            byte b = bArr[i2];
            if (b >= 0) {
                this.w = i4;
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
                this.w = i5;
                return i;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.w;
        int i2 = this.m;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.a;
            byte b = bArr[i];
            if (b >= 0) {
                this.w = i3;
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
                this.w = i4;
                return j;
            }
        }
        return L();
    }

    public final long L() throws ig2 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.w;
            if (i2 == this.m) {
                throw ig2.v();
            }
            this.w = i2 + 1;
            byte b = this.a[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw ig2.r();
    }

    public final void M() {
        int i = this.m + this.q;
        this.m = i;
        int i2 = i - this.c;
        int i3 = this.b;
        if (i2 <= i3) {
            this.q = 0;
            return;
        }
        int i4 = i2 - i3;
        this.q = i4;
        this.m = i - i4;
    }

    public final void N(int i) throws ig2 {
        if (i >= 0) {
            int i2 = this.m;
            int i3 = this.w;
            if (i <= i2 - i3) {
                this.w = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw ig2.v();
        }
        throw ig2.n();
    }

    @Override // defpackage.ri0
    public final double b() {
        return Double.longBitsToDouble(I());
    }

    @Override // defpackage.ri0
    public final int d() {
        int iJ = J();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    @Override // defpackage.ri0
    public final long e() {
        long jK = K();
        return (-(jK & 1)) ^ (jK >>> 1);
    }

    @Override // defpackage.ri0
    public final int f() {
        return H();
    }

    @Override // defpackage.ri0
    public final void g(int i) throws ig2 {
        if (this.i != i) {
            throw new ig2("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.ri0
    public final int h() {
        return J();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // defpackage.ri0
    public final da0 i() throws ig2 {
        byte[] bArrCopyOfRange;
        int iJ = J();
        byte[] bArr = this.a;
        if (iJ > 0) {
            int i = this.m;
            int i2 = this.w;
            if (iJ <= i - i2) {
                da0 da0VarN = da0.n(bArr, i2, iJ);
                this.w += iJ;
                return da0VarN;
            }
        }
        if (iJ == 0) {
            return da0.a;
        }
        if (iJ > 0) {
            int i3 = this.m;
            int i4 = this.w;
            if (iJ <= i3 - i4) {
                int i5 = iJ + i4;
                this.w = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iJ <= 0) {
                    throw ig2.v();
                }
                if (iJ == 0) {
                    throw ig2.n();
                }
                bArrCopyOfRange = gf2.y;
            }
        } else {
            if (iJ <= 0) {
                throw ig2.v();
            }
            if (iJ == 0) {
                throw ig2.n();
            }
            bArrCopyOfRange = gf2.y;
        }
        da0 da0Var = da0.a;
        return new da0(bArrCopyOfRange);
    }

    @Override // defpackage.ri0
    public final long k() {
        return I();
    }

    @Override // defpackage.ri0
    public final void m(int i) {
        this.b = i;
        M();
    }

    @Override // defpackage.ri0
    public final int n() {
        return this.w - this.c;
    }

    @Override // defpackage.ri0
    public final long o() {
        return K();
    }

    @Override // defpackage.ri0
    public final int p() {
        return H();
    }

    @Override // defpackage.ri0
    public final int q(int i) {
        if (i < 0) {
            throw ig2.n();
        }
        int iN = n() + i;
        if (iN < 0) {
            throw new ig2("Failed to parse the message.");
        }
        int i2 = this.b;
        if (iN > i2) {
            throw ig2.v();
        }
        this.b = iN;
        M();
        return i2;
    }

    @Override // defpackage.ri0
    public final int s() {
        return J();
    }

    @Override // defpackage.ri0
    public final long u() {
        return I();
    }

    @Override // defpackage.ri0
    public final boolean v() {
        return this.w == this.m;
    }

    @Override // defpackage.ri0
    public final boolean w() {
        return K() != 0;
    }

    @Override // defpackage.ri0
    public final float z() {
        return Float.intBitsToFloat(H());
    }
}
