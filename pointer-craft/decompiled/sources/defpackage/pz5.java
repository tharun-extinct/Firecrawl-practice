package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pz5 {
    public static final nm0 g = new nm0(-1817534361, false, new tm0(5));
    public static final nm0 y = new nm0(1958064942, false, new at(26));
    public static final nm0 r = new nm0(1858432710, false, new at(27));

    public static boolean g(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    public static final long j(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        pf1 pf1Var = pf1.NANOSECONDS;
        if (j4 >= 0) {
            return ye6.l(j3, pf1Var);
        }
        pf1 pf1Var2 = pf1.MILLISECONDS;
        if (pf1Var.compareTo(pf1Var2) >= 0) {
            return mf1.a(x(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        aj6 aj6Var = mf1.j;
        return mf1.l(ye6.l(j5, pf1Var2), ye6.l(j6, pf1Var));
    }

    public static final long l(long j, long j2) {
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? mf1.a(x(j2)) : j(j, j2);
    }

    public static boolean n(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static boolean r(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public static final di2 v() {
        rx4 rx4Var = rx4.g;
        rx4.y.getClass();
        return new gi3();
    }

    public static final long x(long j) {
        if (j < 0) {
            aj6 aj6Var = mf1.j;
            return mf1.a;
        }
        aj6 aj6Var2 = mf1.j;
        return mf1.t;
    }

    public static boolean y(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }
}
