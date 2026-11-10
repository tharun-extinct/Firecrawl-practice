package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class na6 {
    public static final na6 x = new na6(0, new int[0], new Object[0], false);
    public int g;
    public int n = -1;
    public Object[] r;
    public boolean v;
    public int[] y;

    public na6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.g = i;
        this.y = iArr;
        this.r = objArr;
        this.v = z;
    }

    public static na6 y() {
        return new na6(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof na6)) {
            na6 na6Var = (na6) obj;
            int i = this.g;
            if (i == na6Var.g) {
                int[] iArr = this.y;
                int[] iArr2 = na6Var.y;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.r;
                Object[] objArr2 = na6Var.r;
                int i3 = this.g;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int g() {
        int iC;
        int i;
        int iC2;
        int i2 = this.n;
        if (i2 != -1) {
            return i2;
        }
        int iN = 0;
        for (int i3 = 0; i3 < this.g; i3++) {
            int i4 = this.y[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = i5 << 3;
                        l56 l56Var = (l56) this.r[i3];
                        int iC3 = u56.c(i7);
                        int iV = l56Var.v();
                        iN = xi3.n(iV, iV, iC3, iN);
                    } else if (i6 == 3) {
                        int iC4 = u56.c(i5 << 3);
                        iC = iC4 + iC4;
                        i = ((na6) this.r[i3]).g();
                    } else {
                        if (i6 != 5) {
                            throw new IllegalStateException(new o76());
                        }
                        ((Integer) this.r[i3]).getClass();
                        iC2 = u56.c(i5 << 3) + 4;
                    }
                } else {
                    ((Long) this.r[i3]).getClass();
                    iC2 = u56.c(i5 << 3) + 8;
                }
                iN = iC2 + iN;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.r[i3]).longValue();
                iC = u56.c(i8);
                i = u56.i(jLongValue);
            }
            iN = i + iC + iN;
        }
        this.n = iN;
        return iN;
    }

    public final int hashCode() {
        int i = this.g;
        int i2 = i + 527;
        int[] iArr = this.y;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.r;
        int i6 = this.g;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void n(et4 et4Var) throws ui0 {
        u56 u56Var = (u56) et4Var.t;
        if (this.g != 0) {
            for (int i = 0; i < this.g; i++) {
                int i2 = this.y[i];
                Object obj = this.r[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    u56Var.q(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    u56Var.v(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    l56 l56Var = (l56) obj;
                    u56Var.m((i4 << 3) | 2);
                    u56Var.m(l56Var.v());
                    l56Var.l(u56Var);
                } else if (i3 == 3) {
                    u56Var.t(i4, 3);
                    ((na6) obj).n(et4Var);
                    u56Var.t(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new o76());
                    }
                    u56Var.r(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void r(int i, Object obj) {
        if (!this.v) {
            uo1.f();
            return;
        }
        v(this.g + 1);
        int[] iArr = this.y;
        int i2 = this.g;
        iArr[i2] = i;
        this.r[i2] = obj;
        this.g = i2 + 1;
    }

    public final void v(int i) {
        int[] iArr = this.y;
        if (i > iArr.length) {
            int i2 = this.g;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.y = Arrays.copyOf(iArr, i);
            this.r = Arrays.copyOf(this.r, i);
        }
    }
}
