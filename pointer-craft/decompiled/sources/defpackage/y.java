package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y {
    public static final byte[] g;
    public static final long[] y;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(od0.g);
        bytes.getClass();
        g = bytes;
        y = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String g(long j, c70 c70Var) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c70Var.x(j2) == 13) {
                String strO = c70Var.o(j2, od0.g);
                c70Var.k(2L);
                return strO;
            }
        }
        String strO2 = c70Var.o(j, od0.g);
        c70Var.k(1L);
        return strO2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009e A[LOOP:0: B:8:0x0019->B:49:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[SYNTHETIC] */
    public static final int y(c70 c70Var, sm3 sm3Var, boolean z) {
        int i;
        int i2;
        int i3;
        mh4 mh4Var;
        int i4;
        mh4 mh4Var2 = c70Var.j;
        if (mh4Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = mh4Var2.g;
        int i5 = mh4Var2.y;
        int i6 = mh4Var2.r;
        int[] iArr = sm3Var.t;
        mh4 mh4Var3 = mh4Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (mh4Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            mh4Var3 = mh4Var3.x;
                            mh4Var3.getClass();
                            int i16 = mh4Var3.y;
                            byte[] bArr2 = mh4Var3.g;
                            i2 = mh4Var3.r;
                            if (mh4Var3 == mh4Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                mh4Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        mh4Var3.getClass();
                        mh4 mh4Var4 = mh4Var3.x;
                        mh4Var4.getClass();
                        i3 = mh4Var4.y;
                        byte[] bArr3 = mh4Var4.g;
                        i4 = mh4Var4.r;
                        if (mh4Var4 != mh4Var2) {
                            mh4Var = mh4Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            mh4Var = null;
                        }
                    } else {
                        mh4Var = mh4Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        mh4Var3 = mh4Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    mh4Var3 = mh4Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
