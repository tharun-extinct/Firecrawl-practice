package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ha3 extends he2 {
    public int x;

    public ha3(int i) {
        this.g = ee4.g;
        this.y = pe2.g;
        this.r = og0.p;
        if (i >= 0) {
            x(ee4.n(i));
        } else {
            cf6.l("Capacity must be a positive value.");
            throw null;
        }
    }

    public final Object j(int i) {
        this.v--;
        long[] jArr = this.g;
        int i2 = this.n;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.r;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final Object l(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.n;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.g;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.y[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return j(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final int n(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i3 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.n;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr2 = this.g;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j4 = ((jArr2[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr2[i10] >>> i11);
            long j5 = i6;
            int i13 = i9;
            int i14 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i15 = i3;
                int i16 = i14;
                if (this.y[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i15;
                i14 = i16;
            }
            int i17 = i3;
            int i18 = i14;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iV = v(i5);
                long j8 = 255;
                if (this.x != 0 || ((this.g[iV >> 3] >> ((iV & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i19 = this.n;
                    if (i19 > 8) {
                        j3 = 128;
                        if (Long.compare((((long) this.v) * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.g;
                            int i20 = this.n;
                            int[] iArr2 = this.y;
                            Object[] objArr2 = this.r;
                            int i21 = (i20 + 7) >> 3;
                            int i22 = i18;
                            while (i22 < i21) {
                                long j9 = j8;
                                long j10 = jArr3[i22] & (-9187201950435737472L);
                                jArr3[i22] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i22++;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int iZ = pr.Z(jArr3);
                            int i23 = iZ - 1;
                            long j11 = 72057594037927935L;
                            jArr3[i23] = (jArr3[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iZ] = jArr3[i18];
                            int i24 = i18;
                            while (i24 != i20) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j12 = (jArr3[i25] >> i26) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i24]) * i17;
                                    int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i28 = i27 >>> 7;
                                    int iV2 = v(i28);
                                    int i29 = i28 & i20;
                                    if (((iV2 - i29) & i20) / 8 == ((i24 - i29) & i20) / 8) {
                                        long j13 = j11;
                                        jArr3[i25] = (((long) (i27 & 127)) << i26) | ((~(j << i26)) & jArr3[i25]);
                                        jArr3[jArr3.length - i12] = (jArr3[i18] & j13) | Long.MIN_VALUE;
                                        i24++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i30 = iV2 >> 3;
                                        long j15 = jArr3[i30];
                                        int i31 = (iV2 & 7) << 3;
                                        if (((j15 >> i31) & j) == 128) {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i30] = ((~(j << i31)) & j15) | (((long) (i27 & 127)) << i31);
                                            jArr3[i25] = (jArr3[i25] & (~(j << i26))) | (128 << i26);
                                            iArr[iV2] = iArr[i24];
                                            iArr[i24] = i18;
                                            objArr[iV2] = objArr[i24];
                                            objArr[i24] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i30] = (((long) (i27 & 127)) << i31) | ((~(j << i31)) & j15);
                                            int i32 = iArr[iV2];
                                            iArr[iV2] = iArr[i24];
                                            iArr[i24] = i32;
                                            Object obj = objArr[iV2];
                                            objArr[iV2] = objArr[i24];
                                            objArr[i24] = obj;
                                            i24--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i18] & j14) | Long.MIN_VALUE;
                                        i24++;
                                        j11 = j14;
                                        i12 = i12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i24++;
                                }
                            }
                            i2 = i12;
                            this.x = ee4.g(this.n) - this.v;
                        }
                        iV = v(i5);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iY = ee4.y(this.n);
                    long[] jArr4 = this.g;
                    int[] iArr3 = this.y;
                    Object[] objArr3 = this.r;
                    int i33 = this.n;
                    x(iY);
                    long[] jArr5 = this.g;
                    int[] iArr4 = this.y;
                    Object[] objArr4 = this.r;
                    int i34 = this.n;
                    int i35 = i18;
                    while (i35 < i33) {
                        if (((jArr4[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            int i36 = iArr3[i35];
                            int iHashCode3 = Integer.hashCode(i36) * i17;
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iV3 = v(i37 >>> 7);
                            long j16 = i37 & 127;
                            int i38 = iV3 >> 3;
                            int i39 = (iV3 & 7) << 3;
                            jArr = jArr5;
                            long j17 = (jArr5[i38] & (~(255 << i39))) | (j16 << i39);
                            jArr[i38] = j17;
                            jArr[(((iV3 - 7) & i34) + (i34 & 7)) >> 3] = j17;
                            iArr4[iV3] = i36;
                            objArr4[iV3] = objArr3[i35];
                        } else {
                            jArr = jArr5;
                        }
                        i35++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iV = v(i5);
                }
                this.v++;
                int i40 = this.x;
                long[] jArr6 = this.g;
                int i41 = iV >> 3;
                long j18 = jArr6[i41];
                int i42 = (iV & 7) << 3;
                if (((j18 >> i42) & j) != j3) {
                    i2 = i18;
                }
                this.x = i40 - i2;
                int i43 = this.n;
                long j19 = (j18 & (~(j << i42))) | (j2 << i42);
                jArr6[i41] = j19;
                jArr6[(((iV - 7) & i43) + (i43 & 7)) >> 3] = j19;
                return iV;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i17;
        }
    }

    public final void r() {
        this.v = 0;
        long[] jArr = this.g;
        if (jArr != ee4.g) {
            pr.U(jArr, -9187201950435737472L);
            long[] jArr2 = this.g;
            int i = this.n;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        pr.T(0, this.n, null, this.r);
        this.x = ee4.g(this.n) - this.v;
    }

    public final void t(int i, Object obj) {
        int iN = n(i);
        this.y[iN] = i;
        this.r[iN] = obj;
    }

    public final int v(int i) {
        int i2 = this.n;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.g;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void x(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ee4.r(i)) : 0;
        this.n = iMax;
        if (iMax == 0) {
            jArr = ee4.g;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.g = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.x = ee4.g(this.n) - this.v;
        this.y = new int[iMax];
        this.r = new Object[iMax];
    }

    public /* synthetic */ ha3() {
        this(6);
    }
}
