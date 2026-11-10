package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pr4 {
    public int a;
    public final re2 b;
    public int c;
    public boolean f;
    public final mr4 g;
    public int h;
    public int i;
    public int j;
    public ga3 k;
    public int l;
    public int m;
    public ArrayList n;
    public int o;
    public final re2 p;
    public int q;
    public Object[] r;
    public final re2 s;
    public int t;
    public ha3 u;
    public HashMap v;
    public int w;
    public ha3 x;
    public int[] y;
    public int z;

    public pr4(mr4 mr4Var) {
        this.g = mr4Var;
        int[] iArr = mr4Var.j;
        this.y = iArr;
        Object[] objArr = mr4Var.a;
        this.r = objArr;
        this.n = mr4Var.b;
        this.v = mr4Var.s;
        this.x = mr4Var.p;
        int i = mr4Var.t;
        this.l = i;
        this.j = (iArr.length / 5) - i;
        int i2 = mr4Var.m;
        this.m = i2;
        this.q = objArr.length - i2;
        this.w = i;
        this.b = new re2();
        this.s = new re2();
        this.p = new re2();
        this.h = i;
        this.o = -1;
    }

    public static void d(pr4 pr4Var) {
        int i = pr4Var.o;
        int iS = pr4Var.s(i);
        int[] iArr = pr4Var.y;
        int i2 = (iS * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        pr4Var.S(pr4Var.D(iArr, i));
    }

    public static int j(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final void A(int i) {
        c02 c02Var;
        int i2;
        c02 c02Var2;
        int i3;
        int i4;
        int i5 = this.j;
        int i6 = this.l;
        if (i6 != i) {
            if (!this.n.isEmpty()) {
                int iC = c() - this.j;
                ArrayList arrayList = this.n;
                if (i6 < i) {
                    for (int iY = or4.y(arrayList, i6, iC); iY < this.n.size() && (i3 = (c02Var2 = (c02) this.n.get(iY)).g) < 0 && (i4 = i3 + iC) < i; iY++) {
                        c02Var2.g = i4;
                    }
                } else {
                    for (int iY2 = or4.y(arrayList, i, iC); iY2 < this.n.size() && (i2 = (c02Var = (c02) this.n.get(iY2)).g) >= 0; iY2++) {
                        c02Var.g = -(iC - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.y;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    pr.M(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    pr.M(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iC2 = c();
            if (i6 >= iC2) {
                qo0.g("Check failed");
            }
            while (i6 < iC2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.y[i10];
                int i12 = i11 > -2 ? i11 : (i() + i11) - (-2);
                if (i12 >= i) {
                    i12 = -((i() - i12) - (-2));
                }
                if (i12 != i11) {
                    this.y[i10] = i12;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.l = i;
    }

    public final void B(int i, int i2) {
        int i3 = this.q;
        int i4 = this.m;
        int i5 = this.w;
        if (i4 != i) {
            Object[] objArr = this.r;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, i());
        if (i5 != iMin) {
            int length = this.r.length - i3;
            if (iMin < i5) {
                int iS = s(iMin);
                int iS2 = s(i5);
                int i7 = this.l;
                while (iS < iS2) {
                    int i8 = (iS * 5) + 4;
                    int i9 = this.y[i8];
                    if (i9 < 0) {
                        qo0.g("Unexpected anchor value, expected a positive anchor");
                    }
                    this.y[i8] = -((length - i9) + 1);
                    iS++;
                    if (iS == i7) {
                        iS += this.j;
                    }
                }
            } else {
                int iS3 = s(i5);
                int iS4 = s(iMin);
                while (iS3 < iS4) {
                    int i10 = (iS3 * 5) + 4;
                    int i11 = this.y[i10];
                    if (i11 >= 0) {
                        qo0.g("Unexpected anchor value, expected a negative anchor");
                    }
                    this.y[i10] = i11 + length + 1;
                    iS3++;
                    if (iS3 == this.l) {
                        iS3 += this.j;
                    }
                }
            }
            this.w = iMin;
        }
        this.m = i;
    }

    public final Object C(int i) {
        int iS = s(i);
        int[] iArr = this.y;
        if ((iArr[(iS * 5) + 1] & 1073741824) != 0) {
            return this.r[l(x(iArr, iS))];
        }
        return null;
    }

    public final int D(int[] iArr, int i) {
        int i2 = iArr[(s(i) * 5) + 2];
        return i2 > -2 ? i2 : (i() + i2) - (-2);
    }

    public final Object E(Object obj) {
        if (this.c > 0) {
            f(1, this.o);
        }
        Object[] objArr = this.r;
        int i = this.t;
        this.t = i + 1;
        Object obj2 = objArr[l(i)];
        if (this.t > this.a) {
            qo0.g("Writing to an invalid slot");
        }
        this.r[l(this.t - 1)] = obj;
        return obj2;
    }

    public final void F() {
        int i;
        ga3 ga3Var = this.k;
        if (ga3Var != null) {
            while (ga3Var.y != 0) {
                int iA = mq2.A(ga3Var);
                int iS = s(iA);
                int iZ = iA + 1;
                int iZ2 = z(iA) + iA;
                while (true) {
                    if (iZ >= iZ2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.y[(s(iZ) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iZ += z(iZ);
                    }
                }
                int[] iArr = this.y;
                int i2 = (iS * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iD = D(iArr, iA);
                    if (iD >= 0) {
                        mq2.r(ga3Var, iD);
                    }
                }
            }
        }
    }

    public final boolean G() {
        if (this.c != 0) {
            qo0.g("Cannot remove group while inserting");
        }
        int i = this.z;
        int i2 = this.t;
        int iX = x(this.y, s(i));
        int iK = K();
        N(this.o);
        ga3 ga3Var = this.k;
        if (ga3Var != null) {
            while (true) {
                int i3 = ga3Var.y;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    cf6.a("IntList is empty.");
                    throw null;
                }
                if (ga3Var.g[0] < i) {
                    break;
                }
                mq2.A(ga3Var);
            }
        }
        boolean zH = H(i, this.z - i);
        I(iX, this.t - iX, i - 1);
        this.z = i;
        this.t = i2;
        this.i -= iK;
        return zH;
    }

    public final boolean H(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.n;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.v;
                int i3 = i + i2;
                int iY = or4.y(this.n, i3, c() - this.j);
                if (iY >= this.n.size()) {
                    iY--;
                }
                int i4 = iY + 1;
                int i5 = 0;
                while (iY >= 0) {
                    c02 c02Var = (c02) this.n.get(iY);
                    int iR = r(c02Var);
                    if (iR < i) {
                        break;
                    }
                    if (iR < i3) {
                        c02Var.g = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iY + 1;
                        }
                        i4 = iY;
                    }
                    iY--;
                }
                z = i4 < i5;
                if (z) {
                    this.n.subList(i4, i5).clear();
                }
            }
            this.l = i;
            this.j += i2;
            int i6 = this.w;
            if (i6 > i) {
                this.w = Math.max(i, i6 - i2);
            }
            int i7 = this.h;
            if (i7 >= this.l) {
                this.h = i7 - i2;
            }
            int i8 = this.o;
            if (i8 >= 0 && (this.y[(s(i8) * 5) + 1] & 67108864) != 0) {
                S(i8);
            }
        }
        return z;
    }

    public final void I(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.q;
            int i5 = i + i2;
            B(i5, i3);
            this.m = i;
            this.q = i4 + i2;
            Arrays.fill(this.r, i, i5, (Object) null);
            int i6 = this.a;
            if (i6 >= i) {
                this.a = i6 - i2;
            }
        }
    }

    public final Object J(int i, int i2, Object obj) {
        int iM = M(this.y, s(i));
        int iX = x(this.y, s(i + 1));
        int i3 = iM + i2;
        if (i3 < iM || i3 >= iX) {
            qo0.g("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iL = l(i3);
        Object[] objArr = this.r;
        Object obj2 = objArr[iL];
        objArr[iL] = obj;
        return obj2;
    }

    public final int K() {
        int iS = s(this.z);
        int i = this.z;
        int[] iArr = this.y;
        int i2 = iS * 5;
        int i3 = iArr[i2 + 3] + i;
        this.z = i3;
        this.t = x(iArr, s(i3));
        int i4 = this.y[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void L() {
        int i = this.h;
        this.z = i;
        this.t = x(this.y, s(i));
    }

    public final int M(int[] iArr, int i) {
        if (i >= c()) {
            return this.r.length - this.q;
        }
        int iN = or4.n(iArr, i);
        return iN < 0 ? (this.r.length - this.q) + iN + 1 : iN;
    }

    public final j02 N(int i) {
        c02 c02VarQ;
        HashMap map = this.v;
        if (map == null || (c02VarQ = Q(i)) == null) {
            return null;
        }
        return (j02) map.get(c02VarQ);
    }

    public final void O() {
        if (this.c != 0) {
            qo0.g("Key must be supplied when inserting");
        }
        l76 l76Var = oo0.g;
        P(0, l76Var, false, l76Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(int i, Object obj, boolean z, Object obj2) {
        int i2;
        int i3 = this.o;
        Object[] objArr = this.c > 0;
        this.p.r(this.i);
        l76 l76Var = oo0.g;
        if (objArr == true) {
            int i4 = this.z;
            int iX = x(this.y, s(i4));
            o(1);
            this.t = iX;
            this.a = iX;
            int iS = s(i4);
            int i5 = obj != l76Var ? 1 : 0;
            int i6 = (z || obj2 == l76Var) ? 0 : 1;
            int iJ = j(iX, this.m, this.q, this.r.length);
            if (iJ >= 0 && this.w < i4) {
                iJ = -(((this.r.length - this.q) - iJ) + 1);
            }
            int[] iArr = this.y;
            int i7 = this.o;
            int i8 = iS * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iJ;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                f(i9, i4);
                Object[] objArr2 = this.r;
                int i10 = this.t;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.t = i10;
            }
            this.i = 0;
            i2 = i4 + 1;
            this.o = i4;
            this.z = i2;
            if (i3 >= 0) {
                N(i3);
            }
        } else {
            this.b.r(i3);
            this.s.r((c() - this.j) - this.h);
            int i11 = this.z;
            int iS2 = s(i11);
            if (!yf2.p(obj2, l76Var)) {
                if (z) {
                    T(this.z, obj2);
                } else {
                    R(obj2);
                }
            }
            this.t = M(this.y, iS2);
            this.a = x(this.y, s(this.z + 1));
            int[] iArr2 = this.y;
            int i12 = iS2 * 5;
            this.i = iArr2[i12 + 1] & 67108863;
            this.o = i11;
            this.z = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.h = i2;
    }

    public final c02 Q(int i) {
        ArrayList arrayList;
        int iR;
        if (i < 0 || i >= i() || (iR = or4.r((arrayList = this.n), i, i())) < 0) {
            return null;
        }
        return (c02) arrayList.get(iR);
    }

    public final void R(Object obj) {
        int iS = s(this.z);
        int i = (iS * 5) + 1;
        if ((this.y[i] & 268435456) == 0) {
            qo0.g("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.r;
        int[] iArr = this.y;
        objArr[l(Integer.bitCount(iArr[i] >> 29) + x(iArr, iS))] = obj;
    }

    public final void S(int i) {
        if (i >= 0) {
            ga3 ga3Var = this.k;
            if (ga3Var == null) {
                ga3Var = new ga3();
                this.k = ga3Var;
            }
            mq2.r(ga3Var, i);
        }
    }

    public final void T(int i, Object obj) {
        int iS = s(i);
        int[] iArr = this.y;
        if (iS >= iArr.length || (iArr[(iS * 5) + 1] & 1073741824) == 0) {
            qo0.g("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.r[l(x(this.y, iS))] = obj;
    }

    public final void a() {
        if (this.c <= 0) {
            aw3.y("Unbalanced begin/end insert");
        }
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            if (this.p.y != this.b.y) {
                qo0.g("startGroup/endGroup mismatch while inserting");
            }
            this.h = (c() - this.j) - this.s.y();
        }
    }

    public final Object b(int i) {
        int iS = s(i);
        int[] iArr = this.y;
        int i2 = (iS * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return oo0.g;
        }
        return this.r[Integer.bitCount(iArr[i2] >> 29) + x(iArr, iS)];
    }

    public final int c() {
        return this.y.length / 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(mr4 mr4Var, int i) {
        if (this.c <= 0) {
            qo0.g("Check failed");
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0 && this.z == 0 && this.g.t == 0) {
            int[] iArr = mr4Var.j;
            int i2 = iArr[(i * 5) + 3];
            int i3 = mr4Var.t;
            if (i2 == i3) {
                int[] iArr2 = this.y;
                Object[] objArr3 = this.r;
                ArrayList arrayList = this.n;
                HashMap map = this.v;
                ha3 ha3Var = this.x;
                Object[] objArr4 = mr4Var.a;
                int i4 = mr4Var.m;
                HashMap map2 = mr4Var.s;
                ha3 ha3Var2 = mr4Var.p;
                this.y = iArr;
                this.r = objArr4;
                this.n = mr4Var.b;
                this.l = i3;
                this.j = (iArr.length / 5) - i3;
                this.m = i4;
                this.q = objArr4.length - i4;
                this.w = i3;
                this.v = map2;
                this.x = ha3Var2;
                mr4Var.j = iArr2;
                mr4Var.t = objArr2 == true ? 1 : 0;
                mr4Var.a = objArr3;
                mr4Var.m = objArr == true ? 1 : 0;
                mr4Var.b = arrayList;
                mr4Var.s = map;
                mr4Var.p = ha3Var;
                return;
            }
        }
        pr4 pr4VarV = mr4Var.v();
        try {
            zq2.f(pr4VarV, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            pr4VarV.v(z);
        }
    }

    public final void f(int i, int i2) {
        if (i > 0) {
            B(this.t, i2);
            int i3 = this.m;
            int i4 = this.q;
            if (i4 < i) {
                Object[] objArr = this.r;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.r = objArr2;
                i4 = i7;
            }
            int i9 = this.a;
            if (i9 >= i3) {
                this.a = i9 + i;
            }
            this.m = i3 + i;
            this.q = i4 - i;
        }
    }

    public final void g(int i) {
        if (i < 0) {
            qo0.g("Cannot seek backwards");
        }
        if (this.c > 0) {
            aw3.y("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.z + i;
        int i3 = this.o;
        if (i2 < i3 || i2 > this.h) {
            qo0.g("Cannot seek outside the current group (" + i3 + "-" + this.h + ")");
        }
        this.z = i2;
        int iX = x(this.y, s(i2));
        this.t = iX;
        this.a = iX;
    }

    public final boolean h(int i, int i2) {
        int iC;
        int iZ;
        if (i2 == this.o) {
            iC = this.h;
        } else {
            re2 re2Var = this.b;
            if (i2 > re2Var.g(0)) {
                iZ = z(i2);
            } else {
                int[] iArr = re2Var.g;
                int iMin = Math.min(iArr.length, re2Var.y);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iZ = z(i2);
                } else {
                    iC = (c() - this.j) - this.s.g[i3];
                }
            }
            iC = iZ + i2;
        }
        return i > i2 && i < iC;
    }

    public final int i() {
        return c() - this.j;
    }

    public final boolean k(int i) {
        return (this.y[(s(i) * 5) + 1] & 1073741824) != 0;
    }

    public final int l(int i) {
        return (this.q * (i < this.m ? 0 : 1)) + i;
    }

    public final void m(int i) {
        boolean z = false;
        if (!(this.c <= 0)) {
            qo0.g("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.o;
        if (i2 != i) {
            if (i >= i2 && i < this.h) {
                z = true;
            }
            if (!z) {
                qo0.g("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.z;
            int i4 = this.t;
            int i5 = this.a;
            this.z = i;
            O();
            this.z = i3;
            this.t = i4;
            this.a = i5;
        }
    }

    public final void n() {
        int i = this.c;
        this.c = i + 1;
        if (i == 0) {
            this.s.r((c() - this.j) - this.h);
        }
    }

    public final void o(int i) {
        if (i > 0) {
            int i2 = this.z;
            A(i2);
            int i3 = this.l;
            int i4 = this.j;
            int[] iArr = this.y;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                pr.M(0, 0, i3 * 5, iArr, iArr2);
                pr.M((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.y = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.h;
            if (i7 >= i3) {
                this.h = i7 + i;
            }
            int i8 = i3 + i;
            this.l = i8;
            this.j = i4 - i;
            int iJ = j(i5 > 0 ? x(iArr, s(i2 + i)) : 0, this.w >= i3 ? this.m : 0, this.q, this.r.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.y[(i9 * 5) + 4] = iJ;
            }
            int i10 = this.w;
            if (i10 >= i3) {
                this.w = i10 + i;
            }
        }
    }

    public final int p(int i) {
        return this.y[s(i) * 5];
    }

    public final void q(int i, int i2, int i3) {
        if (i >= this.l) {
            i = -((i() - i) + 2);
        }
        while (i3 < i2) {
            this.y[(s(i3) * 5) + 2] = i;
            int i4 = this.y[(s(i3) * 5) + 3] + i3;
            q(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int r(c02 c02Var) {
        int i = c02Var.g;
        return i < 0 ? i() + i : i;
    }

    public final int s(int i) {
        return (this.j * (i < this.l ? 0 : 1)) + i;
    }

    public final void t() {
        xa3 xa3Var;
        boolean z = this.c > 0;
        int i = this.z;
        int i2 = this.h;
        int i3 = this.o;
        int iS = s(i3);
        int i4 = this.i;
        int i5 = i - i3;
        int i6 = iS * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.y[i7] & 1073741824) != 0;
        re2 re2Var = this.p;
        if (z) {
            ha3 ha3Var = this.u;
            if (ha3Var != null && (xa3Var = (xa3) ha3Var.y(i3)) != null) {
                Object[] objArr = xa3Var.g;
                int i8 = xa3Var.y;
                for (int i9 = 0; i9 < i8; i9++) {
                    E(objArr[i9]);
                }
            }
            int[] iArr = this.y;
            iArr[i6 + 3] = i5;
            or4.x(iS, i4, iArr);
            int iY = re2Var.y();
            if (z2) {
                i4 = 1;
            }
            this.i = iY + i4;
            int iD = D(this.y, i3);
            this.o = iD;
            int i10 = iD < 0 ? i() : s(iD + 1);
            int iX = i10 >= 0 ? x(this.y, i10) : 0;
            this.t = iX;
            this.a = iX;
            return;
        }
        if (i != i2) {
            qo0.g("Expected to be at the end of a group");
        }
        int[] iArr2 = this.y;
        int i11 = i6 + 3;
        int i12 = iArr2[i11];
        int i13 = iArr2[i7] & 67108863;
        iArr2[i11] = i5;
        or4.x(iS, i4, iArr2);
        int iY2 = this.b.y();
        this.h = (c() - this.j) - this.s.y();
        this.o = iY2;
        int iD2 = D(this.y, i3);
        int iY3 = re2Var.y();
        this.i = iY3;
        if (iD2 == iY2) {
            this.i = iY3 + (z2 ? 0 : i4 - i13);
            return;
        }
        int i14 = i5 - i12;
        int i15 = z2 ? 0 : i4 - i13;
        if (i14 != 0 || i15 != 0) {
            while (iD2 != 0 && iD2 != iY2 && (i15 != 0 || i14 != 0)) {
                int iS2 = s(iD2);
                if (i14 != 0) {
                    int[] iArr3 = this.y;
                    int i16 = (iS2 * 5) + 3;
                    iArr3[i16] = iArr3[i16] + i14;
                }
                if (i15 != 0) {
                    int[] iArr4 = this.y;
                    or4.x(iS2, (iArr4[(iS2 * 5) + 1] & 67108863) + i15, iArr4);
                }
                int[] iArr5 = this.y;
                if ((iArr5[(iS2 * 5) + 1] & 1073741824) != 0) {
                    i15 = 0;
                }
                iD2 = D(iArr5, iD2);
            }
        }
        this.i += i15;
    }

    public final String toString() {
        int i = this.z;
        int i2 = this.h;
        int i3 = i();
        int i4 = this.l;
        int i5 = this.j + i4;
        StringBuilder sbS = du4.s(i, i2, "SlotWriter(current = ", " end=", " size = ");
        sbS.append(i3);
        sbS.append(" gap=");
        sbS.append(i4);
        sbS.append("-");
        return xi3.m(sbS, i5, ")");
    }

    public final Object u(int i) {
        int iS = s(i);
        int[] iArr = this.y;
        int i2 = iS * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.r[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final void v(boolean z) {
        this.f = true;
        if (z && this.b.y == 0) {
            A(i());
            B(this.r.length - this.q, this.l);
            int i = this.m;
            Arrays.fill(this.r, i, this.q + i, (Object) null);
            F();
        }
        int[] iArr = this.y;
        int i2 = this.l;
        Object[] objArr = this.r;
        int i3 = this.m;
        ArrayList arrayList = this.n;
        HashMap map = this.v;
        ha3 ha3Var = this.x;
        mr4 mr4Var = this.g;
        if (!mr4Var.c) {
            aw3.g("Unexpected writer close()");
        }
        mr4Var.c = false;
        mr4Var.j = iArr;
        mr4Var.t = i2;
        mr4Var.a = objArr;
        mr4Var.m = i3;
        mr4Var.b = arrayList;
        mr4Var.s = map;
        mr4Var.p = ha3Var;
    }

    public final void w(int i, bz1 bz1Var) {
        int i2;
        int i3;
        int i4;
        int iD = D(this.y, i);
        int i5 = i();
        int iZ = z(i) + i;
        int i6 = i;
        ia3 ia3Var = null;
        ga3 ga3Var = null;
        while (i6 < iZ) {
            int iX = x(this.y, s(i6));
            int i7 = i6 + 1;
            int iX2 = x(this.y, s(i7));
            while (iX < iX2) {
                Object obj = this.r[l(iX)];
                if (obj instanceof l02) {
                    l02 l02Var = (l02) obj;
                    if (!(l02Var instanceof l02)) {
                        l02Var = null;
                    }
                    if (l02Var == null) {
                        qo0.y("Inconsistent composition");
                        l0.x();
                        return;
                    }
                    int i8 = l02Var.y;
                    if (i8 >= 0) {
                        int iZ2 = z(i6) + i6;
                        int i9 = i7;
                        int i10 = 0;
                        while (i9 < iZ2 && i10 < i8) {
                            int iS = s(i9);
                            int i11 = iD;
                            int[] iArr = this.y;
                            int i12 = iS * 5;
                            i9 = iArr[i12 + 3] + i9;
                            if (i9 < iZ2 && (iArr[i12 + 1] & 536870912) == 0) {
                                i10++;
                            }
                            iD = i11;
                        }
                        i4 = iD;
                        if (ia3Var == null) {
                            int[] iArr2 = pe2.g;
                            ia3Var = new ia3();
                        }
                        if (ga3Var == null) {
                            ga3Var = new ga3();
                        }
                        ia3Var.g(i9);
                        ga3Var.g(i9);
                        ga3Var.g(iX);
                    }
                    iX++;
                    iD = i4;
                }
                i4 = iD;
                bz1Var.l(Integer.valueOf(iX), obj);
                iX++;
                iD = i4;
            }
            int i13 = iD;
            iD = i7 < i5 ? D(this.y, i7) : -1;
            if (iD != i6) {
                int iD2 = i13;
                while (true) {
                    if (ga3Var == null || ia3Var == null || !ia3Var.l(i6)) {
                        i2 = i5;
                    } else {
                        int i14 = ga3Var.y;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = i5;
                            int iR = ga3Var.r(i18);
                            if (iR == i6) {
                                int iR2 = ga3Var.r(i18 + 1);
                                bz1Var.l(Integer.valueOf(iR2), this.r[l(iR2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                ga3Var.x(i17, iR);
                                i17 += 2;
                                ga3Var.x(i20, ga3Var.r(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            bz1Var = bz1Var;
                            i5 = i19;
                        }
                        i2 = i5;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = ga3Var.y) || i14 < 0 || i14 > i3) {
                                cf6.t("Index must be between 0 and size");
                                throw null;
                            }
                            if (i14 < i17) {
                                cf6.l("The end index must be < start index");
                                throw null;
                            }
                            if (i14 != i17) {
                                if (i14 < i3) {
                                    int[] iArr3 = ga3Var.g;
                                    pr.M(i17, i14, i3, iArr3, iArr3);
                                }
                                ga3Var.y -= i14 - i17;
                            }
                        }
                    }
                    if (i6 == i || iD2 == iD) {
                        break;
                    }
                    i6 = iD2;
                    i5 = i2;
                    iD2 = D(this.y, iD2);
                    bz1Var = bz1Var;
                }
            } else {
                i2 = i5;
            }
            i6 = i7;
            i5 = i2;
        }
    }

    public final int x(int[] iArr, int i) {
        if (i >= c()) {
            return this.r.length - this.q;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.r.length - this.q) + i2 + 1 : i2;
    }

    public final c02 y(int i) {
        ArrayList arrayList = this.n;
        int iR = or4.r(arrayList, i, i());
        if (iR >= 0) {
            return (c02) arrayList.get(iR);
        }
        if (i > this.l) {
            i = -(i() - i);
        }
        c02 c02Var = new c02(i);
        arrayList.add(-(iR + 1), c02Var);
        return c02Var;
    }

    public final int z(int i) {
        return this.y[(s(i) * 5) + 3];
    }
}
