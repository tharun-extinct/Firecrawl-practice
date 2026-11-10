package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ei5 {
    public static final ai5 g;

    static {
        g = (ih5.v && ih5.n && !v8.g()) ? new ai5((byte) 1) : new ai5((byte) 0);
    }

    public static int g(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new ci5(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
                break;
            }
            i2 += (127 - cCharAt) >>> 31;
            i++;
        }
        if (i2 >= length) {
            return i2;
        }
        t94.y(((long) i2) + 4294967296L);
        return 0;
    }

    public static int n(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return y(b, bArr[i]);
        }
        if (i3 == 2) {
            return r(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int r(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x01a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x010b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static boolean v(byte[] bArr, int i, int i2) {
        boolean z;
        long j;
        int i3;
        long j2;
        int i4;
        long j3;
        byte bV;
        long j4;
        byte bV2;
        long j5;
        int i5 = i;
        ?? N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        N = -1;
        switch (g.g) {
            case 0:
                z = false;
                while (i5 < i2 && bArr[i5] >= 0) {
                    i5++;
                }
                if (i5 >= i2) {
                    N = z;
                } else {
                    while (i5 < i2) {
                        int i6 = i5 + 1;
                        byte b = bArr[i5];
                        if (b >= 0) {
                            i5 = i6;
                        } else if (b < -32) {
                            if (i6 >= i2) {
                                N = b;
                            } else if (b >= -62) {
                                i5 += 2;
                                if (bArr[i6] > -65) {
                                }
                            }
                        } else if (b < -16) {
                            if (i6 >= i2 - 1) {
                                N = n(bArr, i6, i2);
                            } else {
                                int i7 = i5 + 2;
                                byte b2 = bArr[i6];
                                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                    i5 += 3;
                                    if (bArr[i7] > -65) {
                                    }
                                }
                            }
                        } else if (i6 >= i2 - 2) {
                            N = n(bArr, i6, i2);
                        } else {
                            int i8 = i5 + 2;
                            byte b3 = bArr[i6];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                    int i9 = i5 + 3;
                                    if (bArr[i8] <= -65) {
                                        i5 += 4;
                                        if (bArr[i9] > -65) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    N = z;
                }
                if (N == 0) {
                    return true;
                }
                return z;
            default:
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j6 = i5;
                int i10 = (int) (((long) i2) - j6);
                long j7 = 1;
                if (i10 < 16) {
                    j = j6;
                    j2 = 1;
                    i3 = 0;
                    z = false;
                } else {
                    int i11 = 8 - (((int) j6) & 7);
                    j = j6;
                    i3 = 0;
                    z = false;
                    long j8 = j;
                    while (true) {
                        if (i3 < i11) {
                            long j9 = j8 + 1;
                            if (ih5.v(bArr, j8) < 0) {
                                j2 = 1;
                            } else {
                                i3++;
                                j8 = j9;
                            }
                        } else {
                            while (true) {
                                int i12 = i3 + 8;
                                if (i12 <= i10) {
                                    j2 = j7;
                                    if ((ih5.t(ih5.x + j8, bArr) & (-9187201950435737472L)) == 0) {
                                        j8 += 8;
                                        j7 = j2;
                                        i3 = i12;
                                    }
                                } else {
                                    j2 = j7;
                                }
                            }
                            while (true) {
                                if (i3 < i10) {
                                    long j10 = j8 + j2;
                                    if (ih5.v(bArr, j8) >= 0) {
                                        i3++;
                                        j8 = j10;
                                    }
                                } else {
                                    i3 = i10;
                                }
                            }
                        }
                    }
                }
                int i13 = i10 - i3;
                long j11 = j + ((long) i3);
                while (true) {
                    ?? r2 = z;
                    while (i13 > 0) {
                        long j12 = j11 + j2;
                        byte bV3 = ih5.v(bArr, j11);
                        if (bV3 >= 0) {
                            i13--;
                            j11 = j12;
                            r2 = bV3;
                        } else {
                            j11 = j12;
                            r2 = bV3;
                            if (i13 == 0) {
                                N = z;
                            } else {
                                i4 = i13 - 1;
                                if (r2 < -32) {
                                    if (i4 == 0) {
                                        N = r2;
                                    } else {
                                        i13 -= 2;
                                        if (r2 >= -62) {
                                            j3 = j11 + j2;
                                            if (ih5.v(bArr, j11) > -65) {
                                                j11 = j3;
                                            }
                                        }
                                    }
                                } else if (r2 < -16) {
                                    if (i4 < 2) {
                                        N = ai5.j(bArr, r2, j11, i4);
                                    } else {
                                        i13 -= 3;
                                        long j13 = j11 + j2;
                                        bV = ih5.v(bArr, j11);
                                        if (bV > -65 && ((r2 != -32 || bV >= -96) && (r2 != -19 || bV < -96))) {
                                            j11 += 2;
                                            if (ih5.v(bArr, j13) > -65) {
                                            }
                                        }
                                    }
                                } else if (i4 < 3) {
                                    N = ai5.j(bArr, r2, j11, i4);
                                } else {
                                    i13 -= 4;
                                    j4 = j11 + j2;
                                    bV2 = ih5.v(bArr, j11);
                                    if (bV2 <= -65) {
                                        if ((((bV2 + 112) + (r2 << 28)) >> 30) == 0) {
                                            j5 = j11 + 2;
                                            if (ih5.v(bArr, j4) <= -65) {
                                                j11 += 3;
                                                if (ih5.v(bArr, j5) > -65) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i13 == 0) {
                        N = z;
                    } else {
                        i4 = i13 - 1;
                        if (r2 < -32) {
                            if (i4 == 0) {
                                N = r2;
                            } else {
                                i13 -= 2;
                                if (r2 >= -62) {
                                    j3 = j11 + j2;
                                    if (ih5.v(bArr, j11) > -65) {
                                        j11 = j3;
                                    }
                                }
                            }
                        } else if (r2 < -16) {
                            if (i4 < 2) {
                                N = ai5.j(bArr, r2, j11, i4);
                            } else {
                                i13 -= 3;
                                long j14 = j11 + j2;
                                bV = ih5.v(bArr, j11);
                                if (bV > -65) {
                                }
                            }
                        } else if (i4 < 3) {
                            N = ai5.j(bArr, r2, j11, i4);
                        } else {
                            i13 -= 4;
                            j4 = j11 + j2;
                            bV2 = ih5.v(bArr, j11);
                            if (bV2 <= -65) {
                                if ((((bV2 + 112) + (r2 << 28)) >> 30) == 0) {
                                    j5 = j11 + 2;
                                    if (ih5.v(bArr, j4) <= -65) {
                                        j11 += 3;
                                        if (ih5.v(bArr, j5) > -65) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (N == 0) {
                    return true;
                }
                return z;
        }
    }

    public static int y(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
