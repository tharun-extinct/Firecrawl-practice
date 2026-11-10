package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class js3 extends u0 implements Collection, wh2 {
    public Object[] a;
    public Object[] c;
    public int i;
    public y0 j;
    public int m;
    public cm1 q = new cm1(13);
    public Object[] t;
    public Object[] w;

    public js3(y0 y0Var, Object[] objArr, Object[] objArr2, int i) {
        this.j = y0Var;
        this.t = objArr;
        this.a = objArr2;
        this.m = i;
        this.w = objArr;
        this.c = objArr2;
        this.i = y0Var.g();
    }

    public static void v(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(xy1 xy1Var, int i, k2 k2Var) {
        int iE = e(xy1Var, this.c, i, k2Var);
        Object obj = k2Var.j;
        if (iE == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iE, i, (Object) null);
        this.c = objArr;
        this.i -= i - iE;
        return iE;
    }

    public final boolean B(xy1 xy1Var) {
        int i;
        xy1 xy1Var2 = xy1Var;
        int iH = H();
        Object[] objArrS = null;
        k2 k2Var = new k2(null);
        boolean z = false;
        if (this.w != null) {
            r0 r0VarQ = q(0);
            int iE = 32;
            while (iE == 32 && r0VarQ.hasNext()) {
                iE = e(xy1Var2, (Object[]) r0VarQ.next(), 32, k2Var);
            }
            if (iE == 32) {
                int iA = A(xy1Var2, iH, k2Var);
                if (iA == 0) {
                    u(this.w, this.i, this.m);
                }
                if (iA != iH) {
                }
            } else {
                int i2 = (r0VarQ.j - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iD = iE;
                while (r0VarQ.hasNext()) {
                    iD = d(xy1Var2, (Object[]) r0VarQ.next(), 32, iD, k2Var, arrayList2, arrayList);
                    xy1Var2 = xy1Var;
                }
                int iD2 = d(xy1Var, this.c, iH, iD, k2Var, arrayList2, arrayList);
                Object obj = k2Var.j;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iD2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrH = this.w;
                if (zIsEmpty) {
                    objArrH.getClass();
                } else {
                    objArrH = h(objArrH, i2, this.m, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    aw3.g("invalid size");
                }
                if (size == 0) {
                    this.m = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.m;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.m = i - 5;
                        Object[] objArr2 = objArrH[0];
                        objArr2.getClass();
                        objArrH = objArr2;
                    }
                    objArrS = s(objArrH, i3, i);
                }
                this.w = objArrS;
                this.c = objArr;
                this.i = size + iD2;
            }
            z = true;
        } else if (A(xy1Var2, iH, k2Var) != iH) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] C(Object[] objArr, int i, int i2, k2 k2Var) {
        int iC = mq2.c(i2, i);
        if (i == 0) {
            Object obj = objArr[iC];
            Object[] objArrW = w(objArr);
            pr.O(objArr, objArrW, iC, iC + 1, 32);
            objArrW[31] = k2Var.j;
            k2Var.j = obj;
            return objArrW;
        }
        int iC2 = objArr[31] == null ? mq2.c(E() - 1, i) : 31;
        Object[] objArrW2 = w(objArr);
        int i3 = i - 5;
        int i4 = iC + 1;
        if (i4 <= iC2) {
            while (true) {
                Object obj2 = objArrW2[iC2];
                obj2.getClass();
                objArrW2[iC2] = C((Object[]) obj2, i3, 0, k2Var);
                if (iC2 == i4) {
                    break;
                }
                iC2--;
            }
        }
        Object obj3 = objArrW2[iC];
        obj3.getClass();
        objArrW2[iC] = C((Object[]) obj3, i3, i2, k2Var);
        return objArrW2;
    }

    public final Object D(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.i - i;
        Object[] objArr2 = this.c;
        if (i4 == 1) {
            Object obj = objArr2[0];
            u(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrW = w(objArr2);
        pr.O(objArr2, objArrW, i3, i3 + 1, i4);
        objArrW[i4 - 1] = null;
        this.w = objArr;
        this.c = objArrW;
        this.i = (i + i4) - 1;
        this.m = i2;
        return obj2;
    }

    public final int E() {
        int i = this.i;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] F(Object[] objArr, int i, int i2, Object obj, k2 k2Var) {
        int iC = mq2.c(i2, i);
        Object[] objArrW = w(objArr);
        if (i != 0) {
            Object obj2 = objArrW[iC];
            obj2.getClass();
            objArrW[iC] = F((Object[]) obj2, i - 5, i2, obj, k2Var);
            return objArrW;
        }
        if (objArrW != objArr) {
            ((AbstractList) this).modCount++;
        }
        k2Var.j = objArrW[iC];
        objArrW[iC] = obj;
        return objArrW;
    }

    public final void G(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrI;
        if (i3 < 1) {
            aw3.g("requires at least one nullBuffer");
        }
        Object[] objArrW = w(objArr);
        objArr2[0] = objArrW;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            pr.O(objArrW, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrI = objArrW;
            } else {
                objArrI = i();
                i3--;
                objArr2[i3] = objArrI;
            }
            int i7 = i2 - i6;
            pr.O(objArrW, objArr3, 0, i7, i2);
            pr.O(objArrW, objArrI, size + 1, i4, i7);
            objArr3 = objArrI;
        }
        Iterator it = collection.iterator();
        v(objArrW, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrI2 = i();
            v(objArrI2, 0, it);
            objArr2[i8] = objArrI2;
        }
        v(objArr3, 0, it);
    }

    public final int H() {
        int i = this.i;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    public final void a(int i, Object obj, Object[] objArr) {
        int iH = H();
        Object[] objArrW = w(this.c);
        Object[] objArr2 = this.c;
        if (iH >= 32) {
            Object obj2 = objArr2[31];
            pr.O(objArr2, objArrW, i + 1, i, 31);
            objArrW[i] = obj;
            f(objArr, objArrW, b(obj2));
            return;
        }
        pr.O(objArr2, objArrW, i + 1, i, iH);
        objArrW[i] = obj;
        this.w = objArr;
        this.c = objArrW;
        this.i++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        br2.t(i, g());
        if (i == g()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i >= iE) {
            a(i - iE, obj, this.w);
            return;
        }
        k2 k2Var = new k2(null);
        Object[] objArr = this.w;
        objArr.getClass();
        a(0, k2Var.j, j(objArr, this.m, i, obj, k2Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrI;
        br2.t(i, this.i);
        if (i == this.i) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.i - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.c;
            Object[] objArrW = w(objArr);
            pr.O(objArr, objArrW, size2 + 1, i3, H());
            v(objArrW, i3, collection.iterator());
            this.c = objArrW;
            this.i = collection.size() + this.i;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iH = H();
        int size3 = collection.size() + this.i;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= E()) {
            objArrI = i();
            collection2 = collection;
            G(collection2, i, this.c, iH, objArr2, size, objArrI);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.c;
            if (size3 > iH) {
                int i4 = size3 - iH;
                Object[] objArrC = c(i4, objArr3);
                l(collection2, i, i4, objArr2, size, objArrC);
                objArr2 = objArr2;
                objArrI = objArrC;
            } else {
                objArrI = i();
                int i5 = iH - size3;
                pr.O(objArr3, objArrI, 0, i5, iH);
                int i6 = 32 - i5;
                Object[] objArrC2 = c(i6, this.c);
                int i7 = size - 1;
                objArr2[i7] = objArrC2;
                l(collection2, i, i6, objArr2, i7, objArrC2);
                collection2 = collection2;
            }
        }
        this.w = o(this.w, i2, objArr2);
        this.c = objArrI;
        this.i = collection2.size() + this.i;
        return true;
    }

    public final Object[] b(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.q;
        return objArr;
    }

    public final Object[] c(int i, Object[] objArr) {
        if (m(objArr)) {
            pr.O(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrI = i();
        pr.O(objArr, objArrI, i, 0, 32 - i);
        return objArrI;
    }

    public final int d(xy1 xy1Var, Object[] objArr, int i, int i2, k2 k2Var, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = k2Var.j;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrI = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) xy1Var.a(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrI = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : i();
                    i2 = 0;
                }
                objArrI[i2] = obj2;
                i2++;
            }
        }
        k2Var.j = objArrI;
        if (objArr2 != objArrI) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int e(xy1 xy1Var, Object[] objArr, int i, k2 k2Var) {
        Object[] objArrW = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) xy1Var.a(obj)).booleanValue()) {
                if (!z) {
                    objArrW = w(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrW[i2] = obj;
                i2++;
            }
        }
        k2Var.j = objArrW;
        return i2;
    }

    public final void f(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.i;
        int i2 = i >> 5;
        int i3 = this.m;
        if (i2 > (1 << i3)) {
            this.w = k(this.m + 5, b(objArr), objArr2);
            this.c = objArr3;
            this.m += 5;
            this.i++;
            return;
        }
        if (objArr == null) {
            this.w = objArr2;
            this.c = objArr3;
            this.i = i + 1;
        } else {
            this.w = k(i3, objArr, objArr2);
            this.c = objArr3;
            this.i++;
        }
    }

    @Override // defpackage.u0
    public final int g() {
        return this.i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        br2.j(i, g());
        if (E() <= i) {
            objArr = this.c;
        } else {
            Object[] objArr2 = this.w;
            objArr2.getClass();
            for (int i2 = this.m; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[mq2.c(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            aw3.g("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            aw3.g("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrW = w(objArr);
        int iC = mq2.c(i, i2);
        int i3 = i2 - 5;
        objArrW[iC] = h((Object[]) objArrW[iC], i, i3, it);
        while (true) {
            iC++;
            if (iC >= 32 || !it.hasNext()) {
                break;
            }
            objArrW[iC] = h((Object[]) objArrW[iC], 0, i3, it);
        }
        return objArrW;
    }

    public final Object[] i() {
        Object[] objArr = new Object[33];
        objArr[32] = this.q;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr, int i, int i2, Object obj, k2 k2Var) {
        Object obj2;
        int iC = mq2.c(i2, i);
        if (i == 0) {
            k2Var.j = objArr[31];
            Object[] objArrW = w(objArr);
            pr.O(objArr, objArrW, iC + 1, iC, 31);
            objArrW[iC] = obj;
            return objArrW;
        }
        Object[] objArrW2 = w(objArr);
        int i3 = i - 5;
        Object obj3 = objArrW2[iC];
        obj3.getClass();
        objArrW2[iC] = j((Object[]) obj3, i3, i2, obj, k2Var);
        while (true) {
            iC++;
            if (iC >= 32 || (obj2 = objArrW2[iC]) == null) {
                break;
            }
            objArrW2[iC] = j((Object[]) obj2, i3, 0, k2Var.j, k2Var);
        }
        return objArrW2;
    }

    public final Object[] k(int i, Object[] objArr, Object[] objArr2) {
        int iC = mq2.c(g() - 1, i);
        Object[] objArrW = w(objArr);
        if (i == 5) {
            objArrW[iC] = objArr2;
            return objArrW;
        }
        objArrW[iC] = k(i - 5, (Object[]) objArrW[iC], objArr2);
        return objArrW;
    }

    public final void l(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.w == null) {
            l0.z("root is null");
            return;
        }
        int i4 = i >> 5;
        r0 r0VarQ = q(E() >> 5);
        int i5 = i3;
        Object[] objArrC = objArr2;
        while (r0VarQ.j - 1 != i4) {
            Object[] objArr3 = (Object[]) r0VarQ.previous();
            pr.O(objArr3, objArrC, 0, 32 - i2, 32);
            objArrC = c(i2, objArr3);
            i5--;
            objArr[i5] = objArrC;
        }
        Object[] objArr4 = (Object[]) r0VarQ.previous();
        int iE = i3 - (((E() >> 5) - 1) - i4);
        if (iE < i3) {
            objArr2 = objArr[iE];
            objArr2.getClass();
        }
        G(collection, i, objArr4, 32, objArr, iE, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        br2.t(i, this.i);
        return new ns3(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.q;
    }

    public final y0 n() {
        y0 hs3Var;
        Object[] objArr = this.w;
        if (objArr == this.t && this.c == this.a) {
            hs3Var = this.j;
        } else {
            this.q = new cm1((byte) 13);
            this.t = objArr;
            Object[] objArr2 = this.c;
            this.a = objArr2;
            if (objArr == null) {
                hs3Var = objArr2.length == 0 ? rr4.t : new rr4(Arrays.copyOf(objArr2, this.i));
            } else {
                hs3Var = new hs3(objArr, objArr2, this.i, this.m);
            }
        }
        this.j = hs3Var;
        return hs3Var;
    }

    public final Object[] o(Object[] objArr, int i, Object[][] objArr2) {
        er erVar = new er(objArr2);
        int i2 = i >> 5;
        int i3 = this.m;
        Object[] objArrH = i2 < (1 << i3) ? h(objArr, i, i3, erVar) : w(objArr);
        while (erVar.hasNext()) {
            this.m += 5;
            objArrH = b(objArrH);
            int i4 = this.m;
            h(objArrH, 1 << i4, i4, erVar);
        }
        return objArrH;
    }

    public final Object[] p(Object[] objArr, int i, int i2, k2 k2Var) {
        Object[] objArrP;
        int iC = mq2.c(i2 - 1, i);
        if (i == 5) {
            k2Var.j = objArr[iC];
            objArrP = null;
        } else {
            Object obj = objArr[iC];
            obj.getClass();
            objArrP = p((Object[]) obj, i - 5, i2, k2Var);
        }
        if (objArrP == null && iC == 0) {
            return null;
        }
        Object[] objArrW = w(objArr);
        objArrW[iC] = objArrP;
        return objArrW;
    }

    public final r0 q(int i) {
        Object[] objArr = this.w;
        if (objArr == null) {
            l0.z("Invalid root");
            return null;
        }
        int iE = E() >> 5;
        br2.t(i, iE);
        int i2 = this.m;
        return i2 == 0 ? new up4(i, objArr) : new nd5(objArr, i, iE, i2 / 5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return B(new w0(collection, (byte) 2));
    }

    public final Object[] s(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            aw3.g("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iC = mq2.c(i, i2);
        Object obj = objArr[iC];
        obj.getClass();
        Object objS = s((Object[]) obj, i, i2 - 5);
        if (iC < 31) {
            int i3 = iC + 1;
            if (objArr[i3] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrI = i();
                pr.O(objArr, objArrI, 0, 0, i3);
                objArr = objArrI;
            }
        }
        if (objS == objArr[iC]) {
            return objArr;
        }
        Object[] objArrW = w(objArr);
        objArrW[iC] = objS;
        return objArrW;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        br2.j(i, g());
        if (E() > i) {
            k2 k2Var = new k2(null);
            Object[] objArr = this.w;
            objArr.getClass();
            this.w = F(objArr, this.m, i, obj, k2Var);
            return k2Var.j;
        }
        Object[] objArrW = w(this.c);
        if (objArrW != this.c) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrW[i2];
        objArrW[i2] = obj;
        this.c = objArrW;
        return obj2;
    }

    public final void u(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.w = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.c = objArr;
            this.i = i;
            this.m = i2;
            return;
        }
        k2 k2Var = new k2(null);
        objArr.getClass();
        Object[] objArrP = p(objArr, i2, i, k2Var);
        objArrP.getClass();
        Object obj = k2Var.j;
        obj.getClass();
        this.c = (Object[]) obj;
        this.i = i;
        if (objArrP[1] == null) {
            this.w = (Object[]) objArrP[0];
            this.m = i2 - 5;
        } else {
            this.w = objArrP;
            this.m = i2;
        }
    }

    public final Object[] w(Object[] objArr) {
        if (objArr == null) {
            return i();
        }
        if (m(objArr)) {
            return objArr;
        }
        Object[] objArrI = i();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        pr.Q(objArr, objArrI, 0, length, 6);
        return objArrI;
    }

    public final int x() {
        return ((AbstractList) this).modCount;
    }

    @Override // defpackage.u0
    public final Object y(int i) {
        br2.j(i, g());
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i >= iE) {
            return D(this.w, iE, this.m, i - iE);
        }
        k2 k2Var = new k2(this.c[0]);
        Object[] objArr = this.w;
        objArr.getClass();
        D(C(objArr, this.m, i, k2Var), iE, this.m, 0);
        return k2Var.j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iH = H();
        if (iH < 32) {
            Object[] objArrW = w(this.c);
            objArrW[iH] = obj;
            this.c = objArrW;
            this.i = g() + 1;
        } else {
            f(this.w, this.c, b(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iH = H();
        Iterator it = collection.iterator();
        if (32 - iH >= collection.size()) {
            Object[] objArrW = w(this.c);
            v(objArrW, iH, it);
            this.c = objArrW;
            this.i = collection.size() + this.i;
            return true;
        }
        int size = ((collection.size() + iH) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrW2 = w(this.c);
        v(objArrW2, iH, it);
        objArr[0] = objArrW2;
        for (int i = 1; i < size; i++) {
            Object[] objArrI = i();
            v(objArrI, 0, it);
            objArr[i] = objArrI;
        }
        this.w = o(this.w, E(), objArr);
        Object[] objArrI2 = i();
        v(objArrI2, 0, it);
        this.c = objArrI2;
        this.i = collection.size() + this.i;
        return true;
    }
}
