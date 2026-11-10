package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class od5 {
    public static final od5 v = new od5(0, 0, new Object[0], null);
    public int g;
    public Object[] n;
    public final cm1 r;
    public int y;

    public od5(int i, int i2, Object[] objArr, cm1 cm1Var) {
        this.g = i;
        this.y = i2;
        this.r = cm1Var;
        this.n = objArr;
    }

    public static od5 a(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, cm1 cm1Var) {
        if (i3 > 30) {
            return new od5(0, 0, new Object[]{obj, obj2, obj3, obj4}, cm1Var);
        }
        int iU = aq2.u(i, i3);
        int iU2 = aq2.u(i2, i3);
        if (iU != iU2) {
            return new od5((1 << iU) | (1 << iU2), 0, iU < iU2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, cm1Var);
        }
        return new od5(0, 1 << iU, new Object[]{a(i, obj, obj2, i2, obj3, obj4, i3 + 5, cm1Var)}, cm1Var);
    }

    public final od5 b(int i, int i2, sr3 sr3Var) {
        sr3Var.v(sr3Var.q - 1);
        sr3Var.a = k(i);
        Object[] objArr = this.n;
        if (objArr.length == 2) {
            return null;
        }
        if (this.r != sr3Var.j) {
            return new od5(i2 ^ this.g, this.y, aq2.C(i, objArr), sr3Var.j);
        }
        this.n = aq2.C(i, objArr);
        this.g ^= i2;
        return this;
    }

    public final od5 c(int i, Object obj, int i2, sr3 sr3Var) {
        od5 od5VarC;
        int iU = 1 << aq2.u(i, i2);
        if (j(iU)) {
            int iX = x(iU);
            if (yf2.p(obj, this.n[iX])) {
                return b(iX, iU, sr3Var);
            }
        } else if (t(iU)) {
            int iZ = z(iU);
            od5 od5VarU = u(iZ);
            if (i2 == 30) {
                ke2 ke2VarG = xs2.G(xs2.K(0, od5VarU.n.length), 2);
                int i3 = ke2VarG.j;
                int i4 = ke2VarG.t;
                int i5 = ke2VarG.a;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!yf2.p(obj, od5VarU.n[i3])) {
                            if (i3 == i4) {
                                od5VarC = od5VarU;
                                break;
                            }
                            i3 += i5;
                        } else {
                            od5VarC = od5VarU.m(i3, sr3Var);
                            break;
                        }
                    }
                } else {
                    od5VarC = od5VarU;
                    break;
                }
            } else {
                od5VarC = od5VarU.c(i, obj, i2 + 5, sr3Var);
            }
            return s(od5VarU, od5VarC, iZ, iU, sr3Var.j);
        }
        return this;
    }

    public final od5 f(int i, int i2, od5 od5Var) {
        Object[] objArr = od5Var.n;
        if (objArr.length != 2 || od5Var.y != 0) {
            Object[] objArr2 = this.n;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = od5Var;
            return new od5(this.g, this.y, objArrCopyOf, null);
        }
        if (this.n.length == 1) {
            od5Var.g = this.y;
            return od5Var;
        }
        int iX = x(i2);
        Object[] objArr3 = this.n;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        pr.O(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        pr.O(objArrCopyOf2, objArrCopyOf2, iX + 2, iX, i);
        objArrCopyOf2[iX] = obj;
        objArrCopyOf2[iX + 1] = obj2;
        return new od5(this.g ^ i2, this.y ^ i2, objArrCopyOf2, null);
    }

    public final Object[] g(int i, int i2, int i3, Object obj, Object obj2, int i4, cm1 cm1Var) {
        Object obj3 = this.n[i];
        od5 od5VarA = a(obj3 != null ? obj3.hashCode() : 0, obj3, k(i), i3, obj, obj2, i4 + 5, cm1Var);
        int iZ = z(i2);
        int i5 = iZ + 1;
        Object[] objArr = this.n;
        Object[] objArr2 = new Object[objArr.length - 1];
        pr.Q(objArr, objArr2, 0, i, 6);
        pr.O(objArr, objArr2, i, i + 2, i5);
        objArr2[iZ - 1] = od5VarA;
        pr.O(objArr, objArr2, iZ, i5, objArr.length);
        return objArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r13.y = f(r11, r4, (defpackage.od5) r13.y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sv1 h(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od5.h(int, int, java.lang.Object, java.lang.Object):sv1");
    }

    public final od5 i(int i, Object obj, Object obj2, int i2, sr3 sr3Var) {
        sr3 sr3Var2;
        od5 od5VarI;
        int iU = 1 << aq2.u(i, i2);
        if (j(iU)) {
            int iX = x(iU);
            return (yf2.p(obj, this.n[iX]) && yf2.p(obj2, k(iX))) ? b(iX, iU, sr3Var) : this;
        }
        if (!t(iU)) {
            return this;
        }
        int iZ = z(iU);
        od5 od5VarU = u(iZ);
        if (i2 == 30) {
            ke2 ke2VarG = xs2.G(xs2.K(0, od5VarU.n.length), 2);
            int i3 = ke2VarG.j;
            int i4 = ke2VarG.t;
            int i5 = ke2VarG.a;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!yf2.p(obj, od5VarU.n[i3]) || !yf2.p(obj2, od5VarU.k(i3))) {
                        if (i3 == i4) {
                            od5VarI = od5VarU;
                            break;
                        }
                        i3 += i5;
                    } else {
                        od5VarI = od5VarU.m(i3, sr3Var);
                        break;
                    }
                }
            } else {
                od5VarI = od5VarU;
                break;
            }
            sr3Var2 = sr3Var;
        } else {
            sr3Var2 = sr3Var;
            od5VarI = od5VarU.i(i, obj, obj2, i2 + 5, sr3Var2);
        }
        return s(od5VarU, od5VarI, iZ, iU, sr3Var2.j);
    }

    public final boolean j(int i) {
        return (this.g & i) != 0;
    }

    public final Object k(int i) {
        return this.n[i + 1];
    }

    public final Object l(int i, int i2, Object obj) {
        int iU = 1 << aq2.u(i, i2);
        if (j(iU)) {
            int iX = x(iU);
            if (yf2.p(obj, this.n[iX])) {
                return k(iX);
            }
            return null;
        }
        if (!t(iU)) {
            return null;
        }
        od5 od5VarU = u(z(iU));
        if (i2 != 30) {
            return od5VarU.l(i, i2 + 5, obj);
        }
        ke2 ke2VarG = xs2.G(xs2.K(0, od5VarU.n.length), 2);
        int i3 = ke2VarG.j;
        int i4 = ke2VarG.t;
        int i5 = ke2VarG.a;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!yf2.p(obj, od5VarU.n[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return od5VarU.k(i3);
    }

    public final od5 m(int i, sr3 sr3Var) {
        sr3Var.v(sr3Var.q - 1);
        sr3Var.a = k(i);
        Object[] objArr = this.n;
        if (objArr.length == 2) {
            return null;
        }
        if (this.r != sr3Var.j) {
            return new od5(0, 0, aq2.C(i, objArr), sr3Var.j);
        }
        this.n = aq2.C(i, objArr);
        return this;
    }

    public final boolean n(int i, int i2, Object obj) {
        int iU = 1 << aq2.u(i, i2);
        if (j(iU)) {
            return yf2.p(obj, this.n[x(iU)]);
        }
        if (!t(iU)) {
            return false;
        }
        od5 od5VarU = u(z(iU));
        return i2 == 30 ? od5VarU.r(obj) : od5VarU.n(i, i2 + 5, obj);
    }

    public final od5 o(int i, int i2, Object obj) {
        od5 od5VarO;
        int iU = 1 << aq2.u(i, i2);
        if (j(iU)) {
            int iX = x(iU);
            if (!yf2.p(obj, this.n[iX])) {
                return this;
            }
            Object[] objArr = this.n;
            if (objArr.length != 2) {
                return new od5(this.g ^ iU, this.y, aq2.C(iX, objArr), null);
            }
        } else {
            if (!t(iU)) {
                return this;
            }
            int iZ = z(iU);
            od5 od5VarU = u(iZ);
            if (i2 == 30) {
                ke2 ke2VarG = xs2.G(xs2.K(0, od5VarU.n.length), 2);
                int i3 = ke2VarG.j;
                int i4 = ke2VarG.t;
                int i5 = ke2VarG.a;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!yf2.p(obj, od5VarU.n[i3])) {
                            if (i3 == i4) {
                                od5VarO = od5VarU;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = od5VarU.n;
                            if (objArr2.length != 2) {
                                od5VarO = new od5(0, 0, aq2.C(i3, objArr2), null);
                                break;
                            }
                            od5VarO = null;
                            break;
                        }
                    }
                } else {
                    od5VarO = od5VarU;
                    break;
                }
            } else {
                od5VarO = od5VarU.o(i, i2 + 5, obj);
            }
            if (od5VarO != null) {
                return od5VarU != od5VarO ? f(iZ, iU, od5VarO) : this;
            }
            Object[] objArr3 = this.n;
            if (objArr3.length != 1) {
                return new od5(this.g, this.y ^ iU, aq2.D(iZ, objArr3), null);
            }
        }
        return null;
    }

    public final od5 p(int i, od5 od5Var, cm1 cm1Var) {
        Object[] objArr = this.n;
        if (objArr.length == 1 && od5Var.n.length == 2 && od5Var.y == 0) {
            od5Var.g = this.y;
            return od5Var;
        }
        if (this.r == cm1Var) {
            objArr[i] = od5Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = od5Var;
        return new od5(this.g, this.y, objArrCopyOf, cm1Var);
    }

    public final od5 q(int i, Object obj, Object obj2, int i2, sr3 sr3Var) {
        sr3 sr3Var2;
        od5 od5VarQ;
        int iU = 1 << aq2.u(i, i2);
        boolean zJ = j(iU);
        cm1 cm1Var = this.r;
        if (zJ) {
            int iX = x(iU);
            if (!yf2.p(obj, this.n[iX])) {
                sr3Var.v(sr3Var.q + 1);
                cm1 cm1Var2 = sr3Var.j;
                if (cm1Var != cm1Var2) {
                    return new od5(this.g ^ iU, this.y | iU, g(iX, iU, i, obj, obj2, i2, cm1Var2), cm1Var2);
                }
                this.n = g(iX, iU, i, obj, obj2, i2, cm1Var2);
                this.g ^= iU;
                this.y |= iU;
                return this;
            }
            sr3Var.a = k(iX);
            if (k(iX) == obj2) {
                return this;
            }
            if (cm1Var == sr3Var.j) {
                this.n[iX + 1] = obj2;
                return this;
            }
            sr3Var.m++;
            Object[] objArr = this.n;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iX + 1] = obj2;
            return new od5(this.g, this.y, objArrCopyOf, sr3Var.j);
        }
        if (!t(iU)) {
            sr3Var.v(sr3Var.q + 1);
            cm1 cm1Var3 = sr3Var.j;
            int iX2 = x(iU);
            Object[] objArr2 = this.n;
            if (cm1Var != cm1Var3) {
                return new od5(this.g | iU, this.y, aq2.z(objArr2, iX2, obj, obj2), cm1Var3);
            }
            this.n = aq2.z(objArr2, iX2, obj, obj2);
            this.g |= iU;
            return this;
        }
        int iZ = z(iU);
        od5 od5VarU = u(iZ);
        if (i2 == 30) {
            ke2 ke2VarG = xs2.G(xs2.K(0, od5VarU.n.length), 2);
            int i3 = ke2VarG.j;
            int i4 = ke2VarG.t;
            int i5 = ke2VarG.a;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!yf2.p(obj, od5VarU.n[i3])) {
                        if (i3 == i4) {
                            sr3Var.v(sr3Var.q + 1);
                            od5VarQ = new od5(0, 0, aq2.z(od5VarU.n, 0, obj, obj2), sr3Var.j);
                            break;
                        }
                        i3 += i5;
                    } else {
                        sr3Var.a = od5VarU.k(i3);
                        if (od5VarU.r != sr3Var.j) {
                            sr3Var.m++;
                            Object[] objArr3 = od5VarU.n;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            od5VarQ = new od5(0, 0, objArrCopyOf2, sr3Var.j);
                            break;
                        }
                        od5VarU.n[i3 + 1] = obj2;
                        od5VarQ = od5VarU;
                        break;
                    }
                }
            } else {
                sr3Var.v(sr3Var.q + 1);
                od5VarQ = new od5(0, 0, aq2.z(od5VarU.n, 0, obj, obj2), sr3Var.j);
                break;
            }
            sr3Var2 = sr3Var;
        } else {
            sr3Var2 = sr3Var;
            od5VarQ = od5VarU.q(i, obj, obj2, i2 + 5, sr3Var2);
        }
        return od5VarU == od5VarQ ? this : p(iZ, od5VarQ, sr3Var2.j);
    }

    public final boolean r(Object obj) {
        ke2 ke2VarG = xs2.G(xs2.K(0, this.n.length), 2);
        int i = ke2VarG.j;
        int i2 = ke2VarG.t;
        int i3 = ke2VarG.a;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!yf2.p(obj, this.n[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final od5 s(od5 od5Var, od5 od5Var2, int i, int i2, cm1 cm1Var) {
        cm1 cm1Var2 = this.r;
        if (od5Var2 != null) {
            return (cm1Var2 == cm1Var || od5Var != od5Var2) ? p(i, od5Var2, cm1Var) : this;
        }
        Object[] objArr = this.n;
        if (objArr.length == 1) {
            return null;
        }
        if (cm1Var2 != cm1Var) {
            return new od5(this.g, this.y ^ i2, aq2.D(i, objArr), cm1Var);
        }
        this.n = aq2.D(i, objArr);
        this.y ^= i2;
        return this;
    }

    public final boolean t(int i) {
        return (this.y & i) != 0;
    }

    public final od5 u(int i) {
        Object obj = this.n[i];
        obj.getClass();
        return (od5) obj;
    }

    public final boolean v(od5 od5Var) {
        if (this == od5Var) {
            return true;
        }
        if (this.y == od5Var.y && this.g == od5Var.g) {
            int length = this.n.length;
            for (int i = 0; i < length; i++) {
                if (this.n[i] == od5Var.n[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final od5 w(od5 od5Var, int i, i51 i51Var, sr3 sr3Var) {
        od5 od5Var2;
        Object[] objArr;
        od5 od5VarA;
        if (this == od5Var) {
            i51Var.g += y();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            cm1 cm1Var = sr3Var.j;
            int i3 = od5Var.y;
            Object[] objArr2 = this.n;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + od5Var.n.length);
            int length = this.n.length;
            ke2 ke2VarG = xs2.G(xs2.K(0, od5Var.n.length), 2);
            int i4 = ke2VarG.j;
            int i5 = ke2VarG.t;
            int i6 = ke2VarG.a;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (r(od5Var.n[i4])) {
                        i51Var.g++;
                    } else {
                        Object[] objArr3 = od5Var.n;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.n.length) {
                if (length == od5Var.n.length) {
                    return od5Var;
                }
                return length == objArrCopyOf.length ? new od5(0, 0, objArrCopyOf, cm1Var) : new od5(0, 0, Arrays.copyOf(objArrCopyOf, length), cm1Var);
            }
        } else {
            int i7 = this.y | od5Var.y;
            int i8 = this.g;
            int i9 = od5Var.g;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (yf2.p(this.n[x(iLowestOneBit)], od5Var.n[od5Var.x(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                aw3.y("Check failed.");
            }
            if (yf2.p(this.r, sr3Var.j) && this.g == i12 && this.y == i7) {
                od5Var2 = this;
            } else {
                od5Var2 = new od5(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = od5Var2.n;
                int length2 = (objArr4.length - 1) - i14;
                if (t(iLowestOneBit2)) {
                    od5VarA = u(z(iLowestOneBit2));
                    if (od5Var.t(iLowestOneBit2)) {
                        od5VarA = od5VarA.w(od5Var.u(od5Var.z(iLowestOneBit2)), i + 5, i51Var, sr3Var);
                        objArr = objArr4;
                    } else if (od5Var.j(iLowestOneBit2)) {
                        int iX = od5Var.x(iLowestOneBit2);
                        Object obj = od5Var.n[iX];
                        Object objK = od5Var.k(iX);
                        int i15 = sr3Var.q;
                        objArr = objArr4;
                        od5VarA = od5VarA.q(obj != null ? obj.hashCode() : i2, obj, objK, i + 5, sr3Var);
                        if (sr3Var.q == i15) {
                            i51Var.g++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (od5Var.t(iLowestOneBit2)) {
                        od5 od5VarU = od5Var.u(od5Var.z(iLowestOneBit2));
                        if (j(iLowestOneBit2)) {
                            int iX2 = x(iLowestOneBit2);
                            Object obj2 = this.n[iX2];
                            int i16 = i + 5;
                            if (od5VarU.n(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                i51Var.g++;
                                od5VarA = od5VarU;
                            } else {
                                od5VarA = od5VarU.q(obj2 != null ? obj2.hashCode() : 0, obj2, k(iX2), i16, sr3Var);
                            }
                        } else {
                            od5VarA = od5VarU;
                        }
                    } else {
                        int iX3 = x(iLowestOneBit2);
                        Object obj3 = this.n[iX3];
                        Object objK2 = k(iX3);
                        int iX4 = od5Var.x(iLowestOneBit2);
                        Object obj4 = od5Var.n[iX4];
                        od5VarA = a(obj3 != null ? obj3.hashCode() : 0, obj3, objK2, obj4 != null ? obj4.hashCode() : 0, obj4, od5Var.k(iX4), i + 5, sr3Var.j);
                    }
                }
                objArr[length2] = od5VarA;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (od5Var.j(iLowestOneBit3)) {
                    int iX5 = od5Var.x(iLowestOneBit3);
                    Object[] objArr5 = od5Var2.n;
                    objArr5[i18] = od5Var.n[iX5];
                    objArr5[i18 + 1] = od5Var.k(iX5);
                    if (j(iLowestOneBit3)) {
                        i51Var.g++;
                    }
                } else {
                    int iX6 = x(iLowestOneBit3);
                    Object[] objArr6 = od5Var2.n;
                    objArr6[i18] = this.n[iX6];
                    objArr6[i18 + 1] = k(iX6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!v(od5Var2)) {
                return od5Var.v(od5Var2) ? od5Var : od5Var2;
            }
        }
        return this;
    }

    public final int x(int i) {
        return Integer.bitCount(this.g & (i - 1)) * 2;
    }

    public final int y() {
        if (this.y == 0) {
            return this.n.length / 2;
        }
        int iBitCount = Integer.bitCount(this.g);
        int length = this.n.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += u(i).y();
        }
        return iBitCount;
    }

    public final int z(int i) {
        return (this.n.length - 1) - Integer.bitCount(this.y & (i - 1));
    }
}
