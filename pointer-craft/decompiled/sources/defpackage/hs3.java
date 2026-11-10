package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class hs3 extends y0 {
    public final int a;
    public final Object[] j;
    public final int m;
    public final Object[] t;

    public hs3(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.j = objArr;
        this.t = objArr2;
        this.a = i;
        this.m = i2;
        if (!(g() > 32)) {
            aw3.g("Trie-based persistent vector should have at least 33 elements, got " + g());
        }
        int length = objArr2.length;
    }

    public static Object[] m(Object[] objArr, int i, int i2, Object obj, k2 k2Var) {
        int iC = mq2.c(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iC == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            pr.O(objArr, objArrCopyOf, iC + 1, iC, 31);
            k2Var.j = objArr[31];
            objArrCopyOf[iC] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iC];
        obj2.getClass();
        objArrCopyOf2[iC] = m((Object[]) obj2, i3, i2, obj, k2Var);
        while (true) {
            iC++;
            if (iC >= 32 || objArrCopyOf2[iC] == null) {
                break;
            }
            Object obj3 = objArr[iC];
            obj3.getClass();
            objArrCopyOf2[iC] = m((Object[]) obj3, i3, 0, k2Var.j, k2Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] u(int i, int i2, Object obj, Object[] objArr) {
        int iC = mq2.c(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iC] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iC];
        obj2.getClass();
        objArrCopyOf[iC] = u(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    public static Object[] w(Object[] objArr, int i, int i2, k2 k2Var) {
        Object[] objArrW;
        int iC = mq2.c(i2, i);
        if (i == 5) {
            k2Var.j = objArr[iC];
            objArrW = null;
        } else {
            Object obj = objArr[iC];
            obj.getClass();
            objArrW = w((Object[]) obj, i - 5, i2, k2Var);
        }
        if (objArrW == null && iC == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iC] = objArrW;
        return objArrCopyOf;
    }

    @Override // defpackage.y0
    public final y0 a(int i, Object obj) {
        int i2 = this.a;
        br2.j(i, i2);
        int iP = p();
        Object[] objArr = this.j;
        Object[] objArr2 = this.t;
        int i3 = this.m;
        if (iP > i) {
            return new hs3(u(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new hs3(objArr, objArrCopyOf, i2, i3);
    }

    public final Object[] b(Object[] objArr, int i, int i2, k2 k2Var) {
        int iC = mq2.c(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iC == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            pr.O(objArr, objArrCopyOf, iC, iC + 1, 32);
            objArrCopyOf[31] = k2Var.j;
            k2Var.j = objArr[iC];
            return objArrCopyOf;
        }
        int iC2 = objArr[31] == null ? mq2.c(p() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iC + 1;
        if (i4 <= iC2) {
            while (true) {
                Object obj = objArrCopyOf2[iC2];
                obj.getClass();
                objArrCopyOf2[iC2] = b((Object[]) obj, i3, 0, k2Var);
                if (iC2 == i4) {
                    break;
                }
                iC2--;
            }
        }
        Object obj2 = objArrCopyOf2[iC];
        obj2.getClass();
        objArrCopyOf2[iC] = b((Object[]) obj2, i3, i2, k2Var);
        return objArrCopyOf2;
    }

    public final hs3 c(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.a;
        int i2 = i >> 5;
        int i3 = this.m;
        if (i2 <= (1 << i3)) {
            return new hs3(i(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new hs3(i(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.o
    public final int g() {
        return this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        br2.j(i, g());
        if (p() <= i) {
            objArr = this.t;
        } else {
            Object[] objArr2 = this.j;
            for (int i2 = this.m; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[mq2.c(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] i(int i, Object[] objArr, Object[] objArr2) {
        int iC = mq2.c(g() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iC] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iC] = i(i - 5, (Object[]) objArrCopyOf[iC], objArr2);
        return objArrCopyOf;
    }

    @Override // defpackage.y0
    public final y0 j(int i) {
        br2.j(i, g());
        int iP = p();
        int i2 = this.m;
        Object[] objArr = this.j;
        return i >= iP ? s(objArr, iP, i2, i - iP) : s(b(objArr, i2, i, new k2(this.t[0])), iP, i2, 0);
    }

    @Override // defpackage.y0
    public final y0 l(w0 w0Var) {
        js3 js3Var = new js3(this, this.j, this.t, this.m);
        js3Var.B(w0Var);
        return js3Var.n();
    }

    @Override // defpackage.p0, java.util.List
    public final ListIterator listIterator(int i) {
        br2.t(i, this.a);
        return new ls3(this.j, this.t, i, this.a, (this.m / 5) + 1);
    }

    @Override // defpackage.y0
    public final y0 n(Object obj) {
        int iP = p();
        int i = this.a;
        int i2 = i - iP;
        Object[] objArr = this.j;
        Object[] objArr2 = this.t;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new hs3(objArr, objArrCopyOf, i + 1, this.m);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return c(objArr, objArr2, objArr3);
    }

    public final int p() {
        return (this.a - 1) & (-32);
    }

    public final hs3 q(int i, Object obj, Object[] objArr) {
        int iP = p();
        int i2 = this.a;
        int i3 = i2 - iP;
        Object[] objArr2 = this.t;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            pr.O(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new hs3(objArr, objArrCopyOf, i2 + 1, this.m);
        }
        Object obj2 = objArr2[31];
        pr.O(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return c(objArr, objArrCopyOf, objArr3);
    }

    public final y0 s(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.a - i;
        if (i4 != 1) {
            Object[] objArr2 = this.t;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                pr.O(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new hs3(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new rr4(objArr);
        }
        k2 k2Var = new k2(null);
        Object[] objArrW = w(objArr, i2, i - 1, k2Var);
        objArrW.getClass();
        Object obj = k2Var.j;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrW[1] != null) {
            return new hs3(objArrW, objArr3, i, i2);
        }
        Object obj2 = objArrW[0];
        obj2.getClass();
        return new hs3((Object[]) obj2, objArr3, i, i2 - 5);
    }

    @Override // defpackage.y0
    public final js3 x() {
        return new js3(this, this.j, this.t, this.m);
    }

    @Override // defpackage.y0
    public final y0 y(int i, Object obj) {
        int i2 = this.a;
        br2.t(i, i2);
        if (i == i2) {
            return n(obj);
        }
        int iP = p();
        Object[] objArr = this.j;
        if (i >= iP) {
            return q(i - iP, obj, objArr);
        }
        k2 k2Var = new k2(null);
        return q(0, k2Var.j, m(objArr, this.m, i, obj, k2Var));
    }
}
