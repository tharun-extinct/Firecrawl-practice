package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qg5 {
    public static final qg5 x = new qg5(0, new int[0], new Object[0], false);
    public int g;
    public int n = -1;
    public Object[] r;
    public boolean v;
    public int[] y;

    public qg5(int i, int[] iArr, Object[] objArr, boolean z) {
        this.g = i;
        this.y = iArr;
        this.r = objArr;
        this.v = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qg5)) {
            return false;
        }
        qg5 qg5Var = (qg5) obj;
        int i = this.g;
        if (i == qg5Var.g) {
            int[] iArr = this.y;
            int[] iArr2 = qg5Var.y;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.r;
            Object[] objArr2 = qg5Var.r;
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

    public final void n(q64 q64Var) {
        if (this.g == 0) {
            return;
        }
        q64Var.getClass();
        xi0 xi0Var = (xi0) q64Var.t;
        for (int i = 0; i < this.g; i++) {
            int i2 = this.y[i];
            Object obj = this.r[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                xi0Var.E(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                xi0Var.z(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                xi0Var.b(i3, (da0) obj);
            } else if (i4 == 3) {
                xi0Var.B(i3, 3);
                ((qg5) obj).n(q64Var);
                xi0Var.B(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(ig2.y());
                }
                xi0Var.p(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final void r(int i, Object obj) {
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

    public final int y() {
        int iJ;
        int iA;
        int iJ2;
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.g; i3++) {
            int i4 = this.y[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.r[i3]).getClass();
                    iJ2 = xi0.j(i5) + 8;
                } else if (i6 == 2) {
                    iJ2 = xi0.x(i5, (da0) this.r[i3]);
                } else if (i6 == 3) {
                    iJ = xi0.j(i5) * 2;
                    iA = ((qg5) this.r[i3]).y();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(ig2.y());
                    }
                    ((Integer) this.r[i3]).getClass();
                    iJ2 = xi0.j(i5) + 4;
                }
                i2 = iJ2 + i2;
            } else {
                long jLongValue = ((Long) this.r[i3]).longValue();
                iJ = xi0.j(i5);
                iA = xi0.a(jLongValue);
            }
            i2 = iA + iJ + i2;
        }
        this.n = i2;
        return i2;
    }
}
