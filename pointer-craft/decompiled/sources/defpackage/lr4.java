package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lr4 {
    public final re2 a;
    public boolean c;
    public final mr4 g;
    public int j;
    public int l;
    public int m;
    public Object[] n;
    public int q;
    public final int r;
    public int t;
    public final int v;
    public int w;
    public boolean x;
    public final int[] y;

    public lr4(mr4 mr4Var) {
        this.g = mr4Var;
        this.y = mr4Var.j;
        int i = mr4Var.t;
        this.r = i;
        this.n = mr4Var.a;
        this.v = mr4Var.m;
        this.j = i;
        this.t = -1;
        this.a = new re2();
    }

    public final boolean a(int i) {
        return (this.y[(i * 5) + 1] & 134217728) != 0;
    }

    public final Object b(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.n[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final Object c(int i) {
        int i2 = i * 5;
        int[] iArr = this.y;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.n[iArr[i2 + 4]] : oo0.g;
        }
        return null;
    }

    public final c02 g(int i) {
        ArrayList arrayList = this.g.b;
        int iR = or4.r(arrayList, i, this.r);
        if (iR >= 0) {
            return (c02) arrayList.get(iR);
        }
        c02 c02Var = new c02(i);
        arrayList.add(-(iR + 1), c02Var);
        return c02Var;
    }

    public final void h() {
        if (this.m <= 0) {
            int i = this.t;
            int i2 = this.l;
            int i3 = i2 * 5;
            int[] iArr = this.y;
            if (iArr[i3 + 2] != i) {
                aw3.g("Invalid slot table detected");
            }
            int i4 = this.q;
            int i5 = this.w;
            re2 re2Var = this.a;
            if (i4 == 0 && i5 == 0) {
                re2Var.r(-1);
            } else {
                re2Var.r(i4);
            }
            this.t = i2;
            this.j = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.l = i6;
            this.q = or4.n(iArr, i2);
            this.w = i2 >= this.r + (-1) ? this.v : iArr[(i6 * 5) + 4];
        }
    }

    public final int i(int i) {
        return this.y[(i * 5) + 1] & 67108863;
    }

    public final Object j(int i, int i2) {
        int[] iArr = this.y;
        int iN = or4.n(iArr, i);
        int i3 = i + 1;
        int i4 = iN + i2;
        return i4 < (i3 < this.r ? iArr[(i3 * 5) + 4] : this.v) ? this.n[i4] : oo0.g;
    }

    public final int l() {
        int i = this.l;
        if (i >= this.j) {
            return 0;
        }
        return this.y[i * 5];
    }

    public final boolean m(int i) {
        return (this.y[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean n(int i) {
        return (this.y[(i * 5) + 1] & 67108864) != 0;
    }

    public final void p(int i) {
        if (this.m != 0) {
            qo0.g("Cannot reposition while in an empty region");
        }
        this.l = i;
        int[] iArr = this.y;
        int i2 = this.r;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.t) {
            this.t = i3;
            if (i3 < 0) {
                this.j = i2;
            } else {
                this.j = iArr[(i3 * 5) + 3] + i3;
            }
            this.q = 0;
            this.w = 0;
        }
    }

    public final boolean q(int i) {
        return (this.y[(i * 5) + 1] & 1073741824) != 0;
    }

    public final void r() {
        this.x = true;
        mr4 mr4Var = this.g;
        if (mr4Var.q <= 0) {
            qo0.g("Unexpected reader close()");
        }
        mr4Var.q--;
        this.n = new Object[0];
    }

    public final int s(int i) {
        return this.y[(i * 5) + 2];
    }

    public final int t(int i) {
        return this.y[i * 5];
    }

    public final String toString() {
        int i = this.l;
        int iL = l();
        int i2 = this.t;
        int i3 = this.j;
        StringBuilder sbS = du4.s(i, iL, "SlotReader(current=", ", key=", ", parent=");
        sbS.append(i2);
        sbS.append(", end=");
        sbS.append(i3);
        sbS.append(")");
        return sbS.toString();
    }

    public final int u() {
        if (this.m != 0) {
            qo0.g("Cannot skip while in an empty region");
        }
        int i = this.l;
        int i2 = i * 5;
        int[] iArr = this.y;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.l = iArr[i2 + 3] + i;
        return i4;
    }

    public final void v() {
        if (this.m == 0) {
            if (this.l != this.j) {
                qo0.g("endGroup() not called at the end of a group");
            }
            int i = (this.t * 5) + 2;
            int[] iArr = this.y;
            int i2 = iArr[i];
            this.t = i2;
            int i3 = this.r;
            this.j = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iY = this.a.y();
            if (iY < 0) {
                this.q = 0;
                this.w = 0;
            } else {
                this.q = iY;
                this.w = i2 >= i3 + (-1) ? this.v : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object w() {
        int i;
        if (this.m > 0 || (i = this.q) >= this.w) {
            this.c = false;
            return oo0.g;
        }
        this.c = true;
        Object[] objArr = this.n;
        this.q = i + 1;
        return objArr[i];
    }

    public final Object x() {
        int i = this.l;
        if (i < this.j) {
            return y(this.y, i);
        }
        return 0;
    }

    public final Object y(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.n[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return oo0.g;
    }

    public final void z() {
        if (!(this.m == 0)) {
            qo0.g("Cannot skip the enclosing group while in an empty region");
        }
        this.l = this.j;
        this.q = 0;
        this.w = 0;
    }
}
