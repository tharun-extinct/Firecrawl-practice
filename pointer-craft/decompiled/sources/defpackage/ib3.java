package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ib3 {
    public long[] g;
    public int n;
    public int r;
    public lb3 v;
    public int x;
    public Object[] y;

    public ib3(int i) {
        this.g = ee4.g;
        this.y = og0.p;
        if (i >= 0) {
            x(ee4.n(i));
        } else {
            cf6.l("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a(ib3 ib3Var) {
        ib3Var.getClass();
        Object[] objArr = ib3Var.y;
        long[] jArr = ib3Var.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        m(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ib3)) {
            return false;
        }
        ib3 ib3Var = (ib3) obj;
        if (ib3Var.n != this.n) {
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
                        if ((255 & j) < 128 && !ib3Var.r(objArr[(i << 3) + i3])) {
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
        int i = this.n;
        this.y[n(obj)] = obj;
        return this.n != i;
    }

    public final int hashCode() {
        Object[] objArr = this.y;
        long[] jArr = this.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i << 3) + i3];
                        iHashCode += obj != null ? obj.hashCode() : 0;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final boolean j() {
        return this.n != 0;
    }

    public final boolean l() {
        return this.n == 0;
    }

    public final void m(Object obj) {
        this.y[n(obj)] = obj;
    }

    public final int n(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        Object[] objArr;
        int i = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.r;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.g;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr2[i8] >>> i9);
            long j5 = i4;
            int i10 = i4;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j7) >> 3)) & i5;
                int i11 = i;
                if (yf2.p(this.y[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iV = v(i3);
                long j8 = 255;
                if (this.x != 0 || ((this.g[iV >> 3] >> ((iV & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.r;
                    if (i13 > 8) {
                        int i14 = 8;
                        if (Long.compare((((long) this.n) * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.g;
                            int i15 = this.r;
                            Object[] objArr2 = this.y;
                            int i16 = (i15 + 7) >> 3;
                            int i17 = 0;
                            j3 = 128;
                            while (i17 < i16) {
                                long j9 = j8;
                                long j10 = jArr3[i17] & (-9187201950435737472L);
                                jArr3[i17] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i17++;
                                i14 = i14;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i18 = i14;
                            int iZ = pr.Z(jArr3);
                            int i19 = iZ - 1;
                            long j11 = 72057594037927935L;
                            jArr3[i19] = (jArr3[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iZ] = jArr3[0];
                            int i20 = 0;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j12 = (jArr3[i21] >> i22) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i20];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 >>> 7;
                                    int iV2 = v(i24);
                                    int i25 = i24 & i15;
                                    if (((iV2 - i25) & i15) / i18 == ((i20 - i25) & i15) / i18) {
                                        long j13 = j11;
                                        jArr3[i21] = (((long) (i23 & 127)) << i22) | ((~(j << i22)) & jArr3[i21]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i20++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i26 = iV2 >> 3;
                                        long j15 = jArr3[i26];
                                        int i27 = (iV2 & 7) << 3;
                                        if (((j15 >> i27) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i26] = ((~(j << i27)) & j15) | (((long) (i23 & 127)) << i27);
                                            jArr3[i21] = (jArr3[i21] & (~(j << i22))) | (128 << i22);
                                            objArr[iV2] = objArr[i20];
                                            objArr[i20] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i26] = (((long) (i23 & 127)) << i27) | ((~(j << i27)) & j15);
                                            Object obj3 = objArr[iV2];
                                            objArr[iV2] = objArr[i20];
                                            objArr[i20] = obj3;
                                            i20--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j14) | Long.MIN_VALUE;
                                        i20++;
                                        j11 = j14;
                                        i18 = i18;
                                        i15 = i15;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i20++;
                                }
                            }
                            this.x = ee4.g(this.r) - this.n;
                        }
                        iV = v(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iY = ee4.y(this.r);
                    long[] jArr4 = this.g;
                    Object[] objArr3 = this.y;
                    int i28 = this.r;
                    x(iY);
                    long[] jArr5 = this.g;
                    Object[] objArr4 = this.y;
                    int i29 = this.r;
                    int i30 = 0;
                    while (i30 < i28) {
                        if (((jArr4[i30 >> 3] >> ((i30 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i30];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i31 = iHashCode3 ^ (iHashCode3 << 16);
                            int iV3 = v(i31 >>> 7);
                            long j16 = i31 & 127;
                            int i32 = iV3 >> 3;
                            int i33 = (iV3 & 7) << 3;
                            jArr = jArr5;
                            long j17 = (jArr5[i32] & (~(255 << i33))) | (j16 << i33);
                            jArr[i32] = j17;
                            jArr[(((iV3 - 7) & i29) + (i29 & 7)) >> 3] = j17;
                            objArr4[iV3] = obj4;
                        } else {
                            jArr = jArr5;
                        }
                        i30++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iV = v(i3);
                }
                this.n++;
                int i34 = this.x;
                long[] jArr6 = this.g;
                int i35 = iV >> 3;
                long j18 = jArr6[i35];
                int i36 = (iV & 7) << 3;
                this.x = i34 - (((j18 >> i36) & j) == j3 ? 1 : 0);
                int i37 = this.r;
                long j19 = (j18 & (~(j << i36))) | (j2 << i36);
                jArr6[i35] = j19;
                jArr6[(((iV - 7) & i37) + (i37 & 7)) >> 3] = j19;
                return iV;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    public final boolean q(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.r;
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
            w(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final boolean r(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.r;
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

    public final void t(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.r;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.g;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (yf2.p(this.y[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i += 8;
                i5 = i6 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            w(iNumberOfTrailingZeros);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[DONT_INVERT, PHI: r7
  0x0067: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x002a, B:19:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0069 A[LOOP:0: B:5:0x001c->B:21:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[EDGE_INSN: B:26:0x006c->B:22:0x006c BREAK  A[LOOP:0: B:5:0x001c->B:21:0x0069], SYNTHETIC] */
    public final String toString() {
        ll2 ll2Var = new ll2(this, (byte) 15);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.y;
        long[] jArr = this.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb.append((CharSequence) ll2Var.a(obj));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final int v(int i) {
        int i2 = this.r;
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

    public final void w(int i) {
        this.n--;
        long[] jArr = this.g;
        int i2 = this.r;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.y[i] = null;
    }

    public final void x(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ee4.r(i)) : 0;
        this.r = iMax;
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
        this.x = ee4.g(this.r) - this.n;
        this.y = iMax == 0 ? og0.p : new Object[iMax];
    }

    public final void y() {
        this.n = 0;
        long[] jArr = this.g;
        if (jArr != ee4.g) {
            pr.U(jArr, -9187201950435737472L);
            long[] jArr2 = this.g;
            int i = this.r;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        pr.T(0, this.r, null, this.y);
        this.x = ee4.g(this.r) - this.n;
    }

    public /* synthetic */ ib3() {
        this(6);
    }
}
