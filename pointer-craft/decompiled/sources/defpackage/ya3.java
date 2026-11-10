package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class ya3 {
    public int j;
    public int l;
    public int x;
    public long[] g = ee4.g;
    public Object[] y = og0.p;
    public long[] r = og0.o;
    public int n = Integer.MAX_VALUE;
    public int v = Integer.MAX_VALUE;

    public ya3(int i) {
        if (i >= 0) {
            x(ee4.n(i));
        } else {
            cf6.l("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[LOOP:0: B:5:0x0012->B:17:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[EDGE_INSN: B:24:0x0054->B:18:0x0054 BREAK  A[LOOP:0: B:5:0x0012->B:17:0x0051], SYNTHETIC] */
    public final boolean a(Collection collection) {
        collection.getClass();
        Object[] objArr = this.y;
        int i = this.l;
        long[] jArr = this.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!cj0.f0(collection, objArr[i5])) {
                                t(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this.l;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ya3)) {
            return false;
        }
        ya3 ya3Var = (ya3) obj;
        if (ya3Var.l != this.l) {
            return false;
        }
        Object[] objArr = this.y;
        long[] jArr = this.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !ya3Var.r(objArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    public final boolean g(Object obj) {
        int i = this.l;
        int iN = n(obj);
        this.y[iN] = obj;
        long[] jArr = this.r;
        int i2 = this.n;
        jArr[iN] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iN) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.n = iN;
        if (this.v == Integer.MAX_VALUE) {
            this.v = iN;
        }
        return this.l != i;
    }

    public final int hashCode() {
        int iHashCode = (this.x * 31) + this.l;
        Object[] objArr = this.y;
        long[] jArr = this.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!yf2.p(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return iHashCode;
    }

    public final boolean j(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.x;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.g;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (yf2.p(this.y[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            t(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void l(Object obj) {
        int iN = n(obj);
        this.y[iN] = obj;
        long[] jArr = this.r;
        int i = this.n;
        jArr[iN] = (((long) i) & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((((long) iN) & 2147483647L) << 31) | (jArr[i] & (-4611686016279904257L));
        }
        this.n = iN;
        if (this.v == Integer.MAX_VALUE) {
            this.v = iN;
        }
    }

    public final int n(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.x;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr2 = this.g;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr2[i9] >>> i10);
            long j5 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i7) & i6;
                int i11 = i2;
                if (yf2.p(this.y[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iV = v(i4);
                long j8 = 255;
                if (this.j != 0 || ((this.g[iV >> 3] >> ((iV & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j5;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.x;
                    if (i13 > 8) {
                        c = 31;
                        j3 = 128;
                        if (Long.compare((((long) this.l) * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.g;
                            if (jArr3 == null) {
                                i = 0;
                                j = j5;
                                j2 = 255;
                            } else {
                                int i14 = this.x;
                                Object[] objArr = this.y;
                                long[] jArr4 = this.r;
                                long[] jArr5 = new long[i14];
                                Arrays.fill(jArr5, 0, i14, 9223372034707292159L);
                                i = 0;
                                int i15 = (i14 + 7) >> 3;
                                int i16 = 0;
                                while (i16 < i15) {
                                    long j9 = j8;
                                    long j10 = jArr3[i16] & (-9187201950435737472L);
                                    int i17 = i16;
                                    jArr3[i17] = ((~j10) + (j10 >>> 7)) & (-72340172838076674L);
                                    i16 = i17 + 1;
                                    j8 = j9;
                                }
                                j2 = j8;
                                int length = jArr3.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr3[i19] = (jArr3[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[i18] = jArr3[0];
                                int i20 = 0;
                                while (i20 != i14) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j11 = (jArr3[i21] >> i22) & j2;
                                    if (j11 != 128 && j11 == 254) {
                                        Object obj2 = objArr[i20];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                        int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i24 = i23 >>> 7;
                                        int iV2 = v(i24);
                                        int i25 = i24 & i14;
                                        if (((iV2 - i25) & i14) / 8 == ((i20 - i25) & i14) / 8) {
                                            int i26 = i14;
                                            Object[] objArr2 = objArr;
                                            jArr3[i21] = (jArr3[i21] & (~(j2 << i22))) | (((long) (i23 & 127)) << i22);
                                            if (jArr5[i20] == 9223372034707292159L) {
                                                long j12 = i20;
                                                jArr5[i20] = j12 | (j12 << 32);
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i20++;
                                            i14 = i26;
                                            objArr = objArr2;
                                        } else {
                                            int i27 = i14;
                                            Object[] objArr3 = objArr;
                                            int i28 = iV2 >> 3;
                                            long j13 = jArr3[i28];
                                            int i29 = (iV2 & 7) << 3;
                                            if (((j13 >> i29) & j2) == 128) {
                                                jArr3[i28] = (j13 & (~(j2 << i29))) | (((long) (i23 & 127)) << i29);
                                                jArr3[i21] = (jArr3[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[iV2] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr4[iV2] = jArr4[i20];
                                                jArr4[i20] = 4611686018427387903L;
                                                int i30 = (int) ((jArr5[i20] >> 32) & 4294967295L);
                                                if (i30 != Integer.MAX_VALUE) {
                                                    jArr5[i30] = ((long) iV2) | (jArr5[i30] & (-4294967296L));
                                                    jArr5[i20] = (jArr5[i20] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr5[i20] = 9223372032559808512L | ((long) iV2);
                                                }
                                                jArr5[iV2] = (((long) i20) << 32) | 2147483647L;
                                            } else {
                                                j5 = j5;
                                                jArr3[i28] = (((long) (i23 & 127)) << i29) | (j13 & (~(j2 << i29)));
                                                Object obj3 = objArr3[iV2];
                                                objArr3[iV2] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j14 = jArr4[iV2];
                                                jArr4[iV2] = jArr4[i20];
                                                jArr4[i20] = j14;
                                                int i31 = (int) ((jArr5[i20] >> 32) & 4294967295L);
                                                if (i31 != Integer.MAX_VALUE) {
                                                    long j15 = iV2;
                                                    jArr5[i31] = (jArr5[i31] & (-4294967296L)) | j15;
                                                    jArr5[i20] = (jArr5[i20] & 4294967295L) | (j15 << 32);
                                                } else {
                                                    long j16 = iV2;
                                                    jArr5[i20] = j16 | (j16 << 32);
                                                    i31 = i20;
                                                }
                                                jArr5[iV2] = (((long) i31) << 32) | ((long) i20);
                                                i20--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i20++;
                                            i14 = i27;
                                            objArr = objArr3;
                                            j5 = j5;
                                        }
                                    } else {
                                        i20++;
                                    }
                                }
                                j = j5;
                                this.j = ee4.g(this.x) - this.l;
                                long[] jArr6 = this.r;
                                int length2 = jArr6.length;
                                for (int i32 = 0; i32 < length2; i32++) {
                                    long j17 = jArr6[i32];
                                    int i33 = (int) ((j17 >> 31) & 2147483647L);
                                    int i34 = (int) (j17 & 2147483647L);
                                    jArr6[i32] = (((j17 & (-4611686018427387904L)) | ((long) (i33 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i33] & 4294967295L)))) << 31) | ((long) (i34 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i34] & 4294967295L)));
                                }
                                int i35 = this.n;
                                if (i35 != Integer.MAX_VALUE) {
                                    this.n = (int) (jArr5[i35] & 4294967295L);
                                }
                                int i36 = this.v;
                                if (i36 != Integer.MAX_VALUE) {
                                    this.v = (int) (jArr5[i36] & 4294967295L);
                                }
                            }
                        }
                        iV = v(i4);
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j5;
                    j2 = 255;
                    int iY = ee4.y(this.x);
                    long[] jArr7 = this.g;
                    Object[] objArr4 = this.y;
                    long[] jArr8 = this.r;
                    int i37 = this.x;
                    int[] iArr = new int[i37];
                    x(iY);
                    long[] jArr9 = this.g;
                    Object[] objArr5 = this.y;
                    long[] jArr10 = this.r;
                    int i38 = this.x;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr7[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iV3 = v(i40 >>> 7);
                            jArr = jArr9;
                            long j18 = i40 & 127;
                            int i41 = iV3 >> 3;
                            int i42 = (iV3 & 7) << 3;
                            long j19 = (jArr[i41] & (~(255 << i42))) | (j18 << i42);
                            jArr[i41] = j19;
                            jArr[(((iV3 - 7) & i38) + (i38 & 7)) >> 3] = j19;
                            objArr5[iV3] = obj4;
                            jArr10[iV3] = jArr8[i39];
                            iArr[i39] = iV3;
                        } else {
                            jArr = jArr9;
                        }
                        i39++;
                        jArr7 = jArr7;
                        jArr9 = jArr;
                    }
                    long[] jArr11 = this.r;
                    int length3 = jArr11.length;
                    for (int i43 = 0; i43 < length3; i43++) {
                        long j20 = jArr11[i43];
                        int i44 = (int) ((j20 >> c) & 2147483647L);
                        int i45 = (int) (j20 & 2147483647L);
                        jArr11[i43] = (((j20 & (-4611686018427387904L)) | ((long) (i44 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i44]))) << c) | ((long) (i45 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i45]));
                    }
                    int i46 = this.n;
                    if (i46 != Integer.MAX_VALUE) {
                        this.n = iArr[i46];
                    }
                    int i47 = this.v;
                    if (i47 != Integer.MAX_VALUE) {
                        this.v = iArr[i47];
                    }
                    iV = v(i4);
                }
                this.l++;
                int i48 = this.j;
                long[] jArr12 = this.g;
                int i49 = iV >> 3;
                long j21 = jArr12[i49];
                int i50 = (iV & 7) << 3;
                if (((j21 >> i50) & j2) == j3) {
                    i = 1;
                }
                this.j = i48 - i;
                int i51 = this.x;
                long j22 = (j21 & (~(j2 << i50))) | (j << i50);
                jArr12[i49] = j22;
                jArr12[(((iV - 7) & i51) + (i51 & 7)) >> 3] = j22;
                return iV;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }

    public final boolean r(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.x;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.g;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (yf2.p(this.y[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final void t(int i) {
        this.l--;
        long[] jArr = this.g;
        int i2 = this.x;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.y[i] = null;
        long[] jArr2 = this.r;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.n = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.v = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final String toString() {
        ll2 ll2Var = new ll2(this, (byte) 8);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.y;
        long[] jArr = this.r;
        int i = this.v;
        int i2 = 0;
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) ll2Var.a(obj));
            i2++;
            i = i3;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final int v(int i) {
        int i2 = this.x;
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
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, ee4.r(i)) : 0;
        this.x = iMax;
        if (iMax == 0) {
            jArr = ee4.g;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.g = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.j = ee4.g(this.x) - this.l;
        this.y = iMax == 0 ? og0.p : new Object[iMax];
        if (iMax == 0) {
            jArr2 = og0.o;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.r = jArr2;
    }

    public final void y() {
        this.l = 0;
        long[] jArr = this.g;
        if (jArr != ee4.g) {
            pr.U(jArr, -9187201950435737472L);
            long[] jArr2 = this.g;
            int i = this.x;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        pr.T(0, this.x, null, this.y);
        pr.U(this.r, 4611686018427387903L);
        this.n = Integer.MAX_VALUE;
        this.v = Integer.MAX_VALUE;
        this.j = ee4.g(this.x) - this.l;
    }
}
