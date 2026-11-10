package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pg5 {
    public static final pg5 x = new pg5(0, new int[0], new Object[0], false);
    public int g;
    public int n = -1;
    public Object[] r;
    public boolean v;
    public int[] y;

    public pg5(int i, int[] iArr, Object[] objArr, boolean z) {
        this.g = i;
        this.y = iArr;
        this.r = objArr;
        this.v = z;
    }

    public static pg5 r() {
        return new pg5(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pg5)) {
            return false;
        }
        pg5 pg5Var = (pg5) obj;
        int i = this.g;
        if (i == pg5Var.g) {
            int[] iArr = this.y;
            int[] iArr2 = pg5Var.y;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.r;
            Object[] objArr2 = pg5Var.r;
            int i3 = this.g;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g(int i) {
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

    public final int hashCode() {
        int i = this.g;
        int i2 = (527 + i) * 31;
        int[] iArr = this.y;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.r;
        int i6 = this.g;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void n(int i, Object obj) {
        if (!this.v) {
            uo1.f();
            return;
        }
        g(this.g + 1);
        int[] iArr = this.y;
        int i2 = this.g;
        iArr[i2] = i;
        this.r[i2] = obj;
        this.g = i2 + 1;
    }

    public final void v(fa4 fa4Var) {
        if (this.g == 0) {
            return;
        }
        fa4Var.getClass();
        for (int i = 0; i < this.g; i++) {
            int i2 = this.y[i];
            Object obj = this.r[i];
            int iX = rb6.x(i2);
            int iL = rb6.l(i2);
            if (iL == 0) {
                fa4Var.g0(iX, ((Long) obj).longValue());
            } else if (iL == 1) {
                fa4Var.Y(iX, ((Long) obj).longValue());
            } else if (iL == 2) {
                fa4Var.P(iX, (ea0) obj);
            } else if (iL == 3) {
                fa4Var.s0(iX);
                ((pg5) obj).v(fa4Var);
                fa4Var.T(iX);
            } else {
                if (iL != 5) {
                    throw new RuntimeException(hg2.r());
                }
                fa4Var.W(iX, ((Integer) obj).intValue());
            }
        }
    }

    public final int y() {
        int iB;
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int iY = 0;
        for (int i2 = 0; i2 < this.g; i2++) {
            int i3 = this.y[i2];
            int iX = rb6.x(i3);
            int iL = rb6.l(i3);
            if (iL == 0) {
                iB = yi0.B(iX, ((Long) this.r[i2]).longValue());
            } else if (iL == 1) {
                ((Long) this.r[i2]).getClass();
                iB = yi0.j(iX);
            } else if (iL != 2) {
                if (iL == 3) {
                    iY = ((pg5) this.r[i2]).y() + (yi0.d(iX) * 2) + iY;
                } else {
                    if (iL != 5) {
                        throw new IllegalStateException(hg2.r());
                    }
                    ((Integer) this.r[i2]).getClass();
                    iB = yi0.l(iX);
                }
            } else {
                iB = yi0.y(iX, (ea0) this.r[i2]);
            }
            iY = iB + iY;
        }
        this.n = iY;
        return iY;
    }
}
