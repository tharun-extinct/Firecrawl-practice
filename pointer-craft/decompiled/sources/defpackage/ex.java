package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ex {
    public static final cx v = new cx(-1, false, false);
    public static final byte[] x = {13, 10};
    public final boolean g;
    public final int n;
    public final int r;
    public final boolean y;

    static {
        new ex(-1, true, false);
        new ex(76, false, true);
        new ex(64, false, true);
    }

    public ex(int i, boolean z, boolean z2) {
        this.g = z;
        this.y = z2;
        this.r = i;
        if (z && z2) {
            l0.u("Failed requirement.");
            throw null;
        }
        this.n = i / 4;
    }

    public static byte[] g(ex exVar, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        int length = str.length();
        exVar.getClass();
        y94.p(0, length, str.length());
        byte[] bytes = str.substring(0, length).getBytes(od0.n);
        bytes.getClass();
        int length2 = bytes.length;
        boolean z = exVar.y;
        y94.p(0, length2, bytes.length);
        int i5 = 1;
        int i6 = -2;
        if (length2 == 0) {
            i2 = 0;
        } else {
            if (length2 == 1) {
                l0.u(xi3.j("Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: ", length2));
                return null;
            }
            if (z) {
                i = length2;
                for (int i7 = 0; i7 < length2; i7++) {
                    int i8 = fx.y[bytes[i7] & 255];
                    if (i8 < 0) {
                        if (i8 == -2) {
                            i -= length2 - i7;
                            break;
                        }
                        i--;
                    }
                }
            } else if (bytes[length2 - 1] == 61) {
                i = length2 - 1;
                if (bytes[length2 - 2] == 61) {
                    i = length2 - 2;
                }
            } else {
                i = length2;
            }
            i2 = (int) ((((long) i) * 6) / 8);
        }
        byte[] bArr = new byte[i2];
        int[] iArr = exVar.g ? fx.n : fx.y;
        int i9 = -8;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -8;
        while (true) {
            i5 = i5;
            if (i10 >= length2) {
                i3 = 0;
                break;
            }
            if (i13 == i9) {
                i4 = 8;
                int i14 = i10 + 3;
                if (i14 < length2) {
                    int i15 = i10 + 4;
                    int i16 = (iArr[bytes[i10] & 255] << 18) | (iArr[bytes[i10 + 1] & 255] << 12) | (iArr[bytes[i10 + 2] & 255] << 6) | iArr[bytes[i14] & 255];
                    if (i16 >= 0) {
                        bArr[i12] = (byte) (i16 >> 16);
                        int i17 = i12 + 2;
                        bArr[i12 + 1] = (byte) (i16 >> 8);
                        i12 += 3;
                        bArr[i17] = (byte) i16;
                        i10 = i15;
                    }
                }
                i6 = -2;
                i9 = -8;
            } else {
                i4 = 8;
            }
            int i18 = bytes[i10] & 255;
            int i19 = iArr[i18];
            if (i19 >= 0) {
                c = '=';
                i10++;
                i11 = (i11 << 6) | i19;
                int i20 = i13 + 6;
                if (i20 >= 0) {
                    bArr[i12] = (byte) (i11 >>> i20);
                    i11 &= (i5 << i20) - 1;
                    i13 -= 2;
                    i12++;
                } else {
                    i13 = i20;
                }
            } else {
                if (i19 == -2) {
                    if (i13 == -8) {
                        l0.u(xi3.j("Redundant pad character at index ", i10));
                        return null;
                    }
                    if (i13 == -6) {
                        i10++;
                    } else if (i13 != -4) {
                        if (i13 != -2) {
                            l0.z("Unreachable");
                            return null;
                        }
                        i10++;
                    } else {
                        int i21 = i10 + 1;
                        if (z) {
                            while (i21 < length2) {
                                if (fx.y[bytes[i21] & 255] != -1) {
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (i21 == length2 || bytes[i21] != 61) {
                            l0.u(xi3.j("Missing one pad character at index ", i21));
                            return null;
                        }
                        i10 = i21 + 1;
                    }
                    i3 = i5;
                    i6 = -2;
                    break;
                }
                c = '=';
                if (!z) {
                    char c2 = (char) i18;
                    a11.x(i4);
                    String string = Integer.toString(i18, i4);
                    string.getClass();
                    throw new IllegalArgumentException("Invalid symbol '" + c2 + "'(" + string + ") at index " + i10);
                }
                i10++;
            }
            i6 = -2;
            i9 = -8;
        }
        if (i13 == i6) {
            l0.u("The last unit of input does not have enough bits");
            return null;
        }
        if (i13 != -8 && i3 == 0) {
            l0.u("The padding option is set to PRESENT, but the input is not properly padded");
            return null;
        }
        if (i11 != 0) {
            l0.u("The pad bits must be zeros");
            return null;
        }
        if (z) {
            while (i10 < length2) {
                if (fx.y[bytes[i10] & 255] != -1) {
                    break;
                }
                i10++;
            }
        }
        if (i10 >= length2) {
            if (i12 == i2) {
                return bArr;
            }
            l0.z("Check failed.");
            return null;
        }
        int i22 = bytes[i10] & 255;
        StringBuilder sb = new StringBuilder("Symbol '");
        sb.append((char) i22);
        sb.append("'(");
        a11.x(8);
        String string2 = Integer.toString(i22, 8);
        string2.getClass();
        sb.append(string2);
        sb.append(") at index ");
        l0.u(xi3.m(sb, i10 - 1, " is prohibited after the pad character"));
        return null;
    }

    public static String y(ex exVar, byte[] bArr) {
        int i;
        int length = bArr.length;
        exVar.getClass();
        y94.p(0, length, bArr.length);
        int iR = exVar.r(length);
        byte[] bArr2 = new byte[iR];
        y94.p(0, length, bArr.length);
        int iR2 = exVar.r(length);
        if (iR < 0) {
            l0.p(xi3.j("destination offset: 0, destination size: ", iR));
            return null;
        }
        if (iR2 < 0 || iR2 > iR) {
            l0.p(du4.m(iR, iR2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
            return null;
        }
        byte[] bArr3 = exVar.g ? fx.r : fx.g;
        int i2 = exVar.y ? exVar.n : Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i3 + 2;
            if (i >= length) {
                break;
            }
            int iMin = Math.min((length - i3) / 3, i2);
            for (int i5 = 0; i5 < iMin; i5++) {
                int i6 = bArr[i3] & 255;
                int i7 = i3 + 2;
                int i8 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i9 = (i8 << 8) | (i6 << 16) | (bArr[i7] & 255);
                bArr2[i4] = bArr3[i9 >>> 18];
                bArr2[i4 + 1] = bArr3[(i9 >>> 12) & 63];
                int i10 = i4 + 3;
                bArr2[i4 + 2] = bArr3[(i9 >>> 6) & 63];
                i4 += 4;
                bArr2[i10] = bArr3[i9 & 63];
            }
            if (iMin == i2 && i3 != length) {
                int i11 = i4 + 1;
                byte[] bArr4 = x;
                bArr2[i4] = bArr4[0];
                i4 += 2;
                bArr2[i11] = bArr4[1];
            }
        }
        int i12 = length - i3;
        if (i12 == 1) {
            int i13 = (bArr[i3] & 255) << 4;
            bArr2[i4] = bArr3[i13 >>> 6];
            bArr2[i4 + 1] = bArr3[i13 & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            i3++;
        } else if (i12 == 2) {
            int i14 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr2[i4] = bArr3[i14 >>> 12];
            bArr2[i4 + 1] = bArr3[(i14 >>> 6) & 63];
            bArr2[i4 + 2] = bArr3[i14 & 63];
            bArr2[i4 + 3] = 61;
            i3 = i;
        }
        if (i3 == length) {
            return new String(bArr2, od0.n);
        }
        l0.z("Check failed.");
        return null;
    }

    public final int r(int i) {
        int i2 = (i / 3) * 4;
        if (i % 3 != 0) {
            i2 += 4;
        }
        if (i2 < 0) {
            l0.u("Input is too big");
            return 0;
        }
        if (this.y) {
            i2 += ((i2 - 1) / this.r) * 2;
        }
        if (i2 >= 0) {
            return i2;
        }
        l0.u("Input is too big");
        return 0;
    }
}
