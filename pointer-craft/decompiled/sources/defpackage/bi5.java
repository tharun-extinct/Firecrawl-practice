package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bi5 extends aq2 {
    public final /* synthetic */ byte y;

    public /* synthetic */ bi5(byte b) {
        this.y = b;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    @Override // defpackage.aq2
    public final String q(byte[] bArr, int i, int i2) throws ig2 {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.y) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw ig2.g();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || sp2.h(b6)) {
                                    throw ig2.g();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw ig2.g();
                                    }
                                    b4 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!sp2.h(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !sp2.h(b7) && !sp2.h(b8)) {
                                            int i10 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw ig2.g();
                                }
                                if (i3 < i5 - 1) {
                                    throw ig2.g();
                                }
                                int i11 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!sp2.h(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || sp2.h(b9)))) {
                                    throw ig2.g();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw ig2.g();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw ig2.g();
                        }
                        if (b >= -16) {
                            if (i3 < i5 - 1) {
                                throw ig2.g();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (sp2.h(b3)) {
                            }
                            throw ig2.g();
                        }
                        if (i3 < i5 - 2) {
                            throw ig2.g();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!sp2.h(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw ig2.g();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = gf2.g;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw ig2.g();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x023c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x018a  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fe  */
    @Override // defpackage.aq2
    public final int w(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        int i5;
        char cCharAt2;
        char cCharAt3;
        int i6;
        int i7;
        char cCharAt4;
        char c = 2048;
        char c2 = 128;
        char c3 = 55296;
        switch (this.y) {
            case 0:
                int length = str.length();
                int i8 = i2 + i;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i9 + i;
                    if (i10 >= i8 || (cCharAt3 = str.charAt(i9)) >= 128) {
                        if (i9 == length) {
                            return i + length;
                        }
                        i3 = i + i9;
                        while (i9 < length) {
                            cCharAt = str.charAt(i9);
                            if (cCharAt >= 128 && i3 < i8) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt < 2048 || i3 > i8 - 2) {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i8 - 3) {
                                    if (i3 > i8 - 4) {
                                        if (55296 > cCharAt && cCharAt <= 57343 && ((i4 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new di5(i9, length);
                                        }
                                        l0.l(cCharAt, i3);
                                        return 0;
                                    }
                                    i5 = i9 + 1;
                                    if (i5 != str.length()) {
                                        cCharAt2 = str.charAt(i5);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i9 = i5;
                                        } else {
                                            i9 = i5;
                                        }
                                    }
                                    throw new di5(i9 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                                i9++;
                            } else {
                                int i13 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            }
                            i9++;
                        }
                        return i3;
                    }
                    bArr[i10] = (byte) cCharAt3;
                    i9++;
                }
                if (i9 == length) {
                    return i + length;
                }
                i3 = i + i9;
                while (i9 < length) {
                    cCharAt = str.charAt(i9);
                    if (cCharAt >= 128) {
                        if (cCharAt < 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i15 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i15] = (byte) ((cCharAt & '?') | 128);
                            }
                            if (i3 > i8 - 4) {
                                if (55296 > cCharAt) {
                                }
                                l0.l(cCharAt, i3);
                                return 0;
                            }
                            i5 = i9 + 1;
                            if (i5 != str.length()) {
                                cCharAt2 = str.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                    bArr[i3] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArr[i3 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i16 = i3 + 3;
                                    bArr[i3 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i3 += 4;
                                    bArr[i16] = (byte) ((codePoint2 & 63) | 128);
                                    i9 = i5;
                                } else {
                                    i9 = i5;
                                }
                            }
                            throw new di5(i9 - 1, length);
                        }
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                        if (i3 > i8 - 4) {
                            if (55296 > cCharAt) {
                            }
                            l0.l(cCharAt, i3);
                            return 0;
                        }
                        i5 = i9 + 1;
                        if (i5 != str.length()) {
                            cCharAt2 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                int codePoint3 = Character.toCodePoint(cCharAt, cCharAt2);
                                bArr[i3] = (byte) ((codePoint3 >>> 18) | 240);
                                bArr[i3 + 1] = (byte) (((codePoint3 >>> 12) & 63) | 128);
                                int i19 = i3 + 3;
                                bArr[i3 + 2] = (byte) (((codePoint3 >>> 6) & 63) | 128);
                                i3 += 4;
                                bArr[i19] = (byte) ((codePoint3 & 63) | 128);
                                i9 = i5;
                            } else {
                                i9 = i5;
                            }
                        }
                        throw new di5(i9 - 1, length);
                    }
                    if (cCharAt < 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i110 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i110] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i111 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i111] = (byte) ((cCharAt & '?') | 128);
                        }
                        if (i3 > i8 - 4) {
                            if (55296 > cCharAt) {
                            }
                            l0.l(cCharAt, i3);
                            return 0;
                        }
                        i5 = i9 + 1;
                        if (i5 != str.length()) {
                            cCharAt2 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                int codePoint4 = Character.toCodePoint(cCharAt, cCharAt2);
                                bArr[i3] = (byte) ((codePoint4 >>> 18) | 240);
                                bArr[i3 + 1] = (byte) (((codePoint4 >>> 12) & 63) | 128);
                                int i112 = i3 + 3;
                                bArr[i3 + 2] = (byte) (((codePoint4 >>> 6) & 63) | 128);
                                i3 += 4;
                                bArr[i112] = (byte) ((codePoint4 & 63) | 128);
                                i9 = i5;
                            } else {
                                i9 = i5;
                            }
                        }
                        throw new di5(i9 - 1, length);
                    }
                    if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i113 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i113] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i114 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i114] = (byte) ((cCharAt & '?') | 128);
                    }
                    if (i3 > i8 - 4) {
                        if (55296 > cCharAt) {
                        }
                        l0.l(cCharAt, i3);
                        return 0;
                    }
                    i5 = i9 + 1;
                    if (i5 != str.length()) {
                        cCharAt2 = str.charAt(i5);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint5 = Character.toCodePoint(cCharAt, cCharAt2);
                            bArr[i3] = (byte) ((codePoint5 >>> 18) | 240);
                            bArr[i3 + 1] = (byte) (((codePoint5 >>> 12) & 63) | 128);
                            int i115 = i3 + 3;
                            bArr[i3 + 2] = (byte) (((codePoint5 >>> 6) & 63) | 128);
                            i3 += 4;
                            bArr[i115] = (byte) ((codePoint5 & 63) | 128);
                            i9 = i5;
                        } else {
                            i9 = i5;
                        }
                    }
                    throw new di5(i9 - 1, length);
                    i9++;
                }
                return i3;
            default:
                long j = i;
                long j2 = ((long) i2) + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i20 = 0;
                while (i20 < length2 && (cCharAt4 = str.charAt(i20)) < 128) {
                    jh5.a(bArr, j, (byte) cCharAt4);
                    i20++;
                    j++;
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt5 = str.charAt(i20);
                        if (cCharAt5 >= c2 || j >= j2) {
                            if (cCharAt5 >= c || j > j2 - 2) {
                                i6 = i20;
                                if ((cCharAt5 >= c3 && 57343 >= cCharAt5) || j > j2 - 3) {
                                    if (j > j2 - 4) {
                                        if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i7 = i6 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i7)))) {
                                            throw new di5(i6, length2);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                    }
                                    i20 = i6 + 1;
                                    if (i20 != length2) {
                                        char cCharAt6 = str.charAt(i20);
                                        if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                            int codePoint6 = Character.toCodePoint(cCharAt5, cCharAt6);
                                            jh5.a(bArr, j, (byte) ((codePoint6 >>> 18) | 240));
                                            jh5.a(bArr, j + 1, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                            long j3 = j + 3;
                                            jh5.a(bArr, j + 2, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                            j += 4;
                                            jh5.a(bArr, j3, (byte) ((codePoint6 & 63) | 128));
                                        }
                                    } else {
                                        i20 = i6;
                                    }
                                    throw new di5(i20 - 1, length2);
                                }
                                jh5.a(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
                                long j4 = j + 2;
                                jh5.a(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | c2));
                                j += 3;
                                jh5.a(bArr, j4, (byte) ((cCharAt5 & '?') | 128));
                            } else {
                                i6 = i20;
                                long j5 = j + 1;
                                jh5.a(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
                                j += 2;
                                jh5.a(bArr, j5, (byte) ((cCharAt5 & '?') | c2));
                            }
                            i20 = i6;
                        } else {
                            jh5.a(bArr, j, (byte) cCharAt5);
                            j++;
                        }
                        i20++;
                        c = 2048;
                        c2 = 128;
                        c3 = 55296;
                    }
                }
                return (int) j;
        }
    }
}
