package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zs0 {
    public static /* synthetic */ long a(long j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return t(i, i2, j);
    }

    public static final long g(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            oc2.g("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return j(i, i2, i3, i4);
    }

    public static final long j(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iR = r(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iR2 = r(i6);
        if (iR + iR2 > 31) {
            m(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iR2 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iR2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iR2 + 33));
    }

    public static final int l(int i, long j) {
        int iM = ws0.m(j);
        int iT = ws0.t(j);
        if (i < iM) {
            i = iM;
        }
        return i > iT ? iT : i;
    }

    public static final void m(int i, int i2) {
        throw new IllegalArgumentException(du4.q(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final long n(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM = ws0.m(j);
        int iT = ws0.t(j);
        if (i < iM) {
            i = iM;
        }
        if (i <= iT) {
            iT = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iA = ws0.a(j);
        int iJ = ws0.j(j);
        if (i2 < iA) {
            i2 = iA;
        }
        if (i2 <= iJ) {
            iJ = i2;
        }
        return (((long) iT) << 32) | (((long) iJ) & 4294967295L);
    }

    public static final Void q(int i) {
        throw new IllegalArgumentException(du4.w(i, "Can't represent a size of ", " in Constraints"));
    }

    public static final int r(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long t(int i, int i2, long j) {
        int iM = ws0.m(j) + i;
        if (iM < 0) {
            iM = 0;
        }
        int iT = ws0.t(j);
        if (iT != Integer.MAX_VALUE && (iT = iT + i) < 0) {
            iT = 0;
        }
        int iA = ws0.a(j) + i2;
        if (iA < 0) {
            iA = 0;
        }
        int iJ = ws0.j(j);
        return g(iM, iT, iA, (iJ == Integer.MAX_VALUE || (iJ = iJ + i2) >= 0) ? iJ : 0);
    }

    public static final long v(long j, long j2) {
        int iM = ws0.m(j);
        int iT = ws0.t(j);
        int iA = ws0.a(j);
        int iJ = ws0.j(j);
        int iM2 = ws0.m(j2);
        if (iM2 < iM) {
            iM2 = iM;
        }
        if (iM2 > iT) {
            iM2 = iT;
        }
        int iT2 = ws0.t(j2);
        if (iT2 >= iM) {
            iM = iT2;
        }
        if (iM <= iT) {
            iT = iM;
        }
        int iA2 = ws0.a(j2);
        if (iA2 < iA) {
            iA2 = iA;
        }
        if (iA2 > iJ) {
            iA2 = iJ;
        }
        int iJ2 = ws0.j(j2);
        if (iJ2 >= iA) {
            iA = iJ2;
        }
        if (iA <= iJ) {
            iJ = iA;
        }
        return g(iM2, iT, iA2, iJ);
    }

    public static final int x(int i, long j) {
        int iA = ws0.a(j);
        int iJ = ws0.j(j);
        if (i < iA) {
            i = iA;
        }
        return i > iJ ? iJ : i;
    }

    public static /* synthetic */ long y(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return g(i, i2, i3, i4);
    }
}
