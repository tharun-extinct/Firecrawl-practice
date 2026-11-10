package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class is3 extends u0 implements Collection {
    public aj6 a;
    public int j;
    public Object[] m;
    public Object[] q;
    public x0 t;
    public int w;

    public is3(x0 x0Var, Object[] objArr, Object[] objArr2, int i) {
        objArr2.getClass();
        this.j = i;
        this.t = x0Var;
        this.a = new aj6((byte) 23);
        this.m = objArr;
        this.q = objArr2;
        this.w = x0Var.g();
    }

    public static void v(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(w0 w0Var, int i, l2 l2Var) {
        int iE = e(w0Var, this.q, i, l2Var);
        if (iE == i) {
            return i;
        }
        Object obj = l2Var.g;
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iE, i, (Object) null);
        G(objArr);
        this.w -= i - iE;
        return iE;
    }

    public final Object[] B(Object[] objArr, int i, int i2, l2 l2Var) {
        int iY = xz5.y(i2, i);
        if (i == 0) {
            Object obj = objArr[iY];
            Object[] objArrW = w(objArr);
            pr.O(objArr, objArrW, iY, iY + 1, 32);
            objArrW[31] = l2Var.g;
            l2Var.g = obj;
            return objArrW;
        }
        int iY2 = objArr[31] == null ? xz5.y(D() - 1, i) : 31;
        Object[] objArrW2 = w(objArr);
        int i3 = i - 5;
        int i4 = iY + 1;
        if (i4 <= iY2) {
            while (true) {
                Object obj2 = objArrW2[iY2];
                obj2.getClass();
                objArrW2[iY2] = B((Object[]) obj2, i3, 0, l2Var);
                if (iY2 == i4) {
                    break;
                }
                iY2--;
            }
        }
        Object obj3 = objArrW2[iY];
        obj3.getClass();
        objArrW2[iY] = B((Object[]) obj3, i3, i2, l2Var);
        return objArrW2;
    }

    public final Object C(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.w - i;
        Object[] objArr2 = this.q;
        if (i4 == 1) {
            Object obj = objArr2[0];
            u(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrW = w(objArr2);
        pr.O(objArr2, objArrW, i3, i3 + 1, i4);
        objArrW[i4 - 1] = null;
        F(objArr);
        G(objArrW);
        this.w = (i + i4) - 1;
        this.j = i2;
        return obj2;
    }

    public final int D() {
        int i = this.w;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] E(Object[] objArr, int i, int i2, Object obj, l2 l2Var) {
        int iY = xz5.y(i2, i);
        Object[] objArrW = w(objArr);
        if (i != 0) {
            Object obj2 = objArrW[iY];
            obj2.getClass();
            objArrW[iY] = E((Object[]) obj2, i - 5, i2, obj, l2Var);
            return objArrW;
        }
        if (objArrW != objArr) {
            ((AbstractList) this).modCount++;
        }
        l2Var.g = objArrW[iY];
        objArrW[iY] = obj;
        return objArrW;
    }

    public final void F(Object[] objArr) {
        if (objArr != this.m) {
            this.t = null;
            this.m = objArr;
        }
    }

    public final void G(Object[] objArr) {
        if (objArr != this.q) {
            this.t = null;
            this.q = objArr;
        }
    }

    public final void H(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrI;
        if (i3 < 1) {
            l0.z("Check failed.");
            return;
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

    public final int I() {
        int i = this.w;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    public final void a(int i, Object obj, Object[] objArr) {
        int I = I();
        Object[] objArrW = w(this.q);
        Object[] objArr2 = this.q;
        if (I >= 32) {
            Object obj2 = objArr2[31];
            pr.O(objArr2, objArrW, i + 1, i, 31);
            objArrW[i] = obj;
            f(objArr, objArrW, b(obj2));
            return;
        }
        pr.O(objArr2, objArrW, i + 1, i, I);
        objArrW[i] = obj;
        F(objArr);
        G(objArrW);
        this.w++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        fz5.y(i, g());
        if (i == g()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iD = D();
        if (i >= iD) {
            a(i - iD, obj, this.m);
            return;
        }
        l2 l2Var = new l2(null);
        Object[] objArr = this.m;
        objArr.getClass();
        a(0, l2Var.g, l(objArr, this.j, i, obj, l2Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrI;
        collection.getClass();
        fz5.y(i, this.w);
        if (i == this.w) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.w - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.q;
            Object[] objArrW = w(objArr);
            pr.O(objArr, objArrW, size2 + 1, i3, I());
            v(objArrW, i3, collection.iterator());
            G(objArrW);
            this.w = collection.size() + this.w;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int I = I();
        int size3 = collection.size() + this.w;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= D()) {
            objArrI = i();
            collection2 = collection;
            H(collection2, i, this.q, I, objArr2, size, objArrI);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.q;
            if (size3 > I) {
                int i4 = size3 - I;
                Object[] objArrC = c(i4, objArr3);
                j(collection2, i, i4, objArr2, size, objArrC);
                objArr2 = objArr2;
                objArrI = objArrC;
            } else {
                objArrI = i();
                int i5 = I - size3;
                pr.O(objArr3, objArrI, 0, i5, I);
                int i6 = 32 - i5;
                Object[] objArrC2 = c(i6, this.q);
                int i7 = size - 1;
                objArr2[i7] = objArrC2;
                j(collection2, i, i6, objArr2, i7, objArrC2);
                collection2 = collection2;
            }
        }
        F(o(this.m, i2, objArr2));
        G(objArrI);
        this.w = collection2.size() + this.w;
        return true;
    }

    public final Object[] b(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.a;
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

    public final int d(w0 w0Var, Object[] objArr, int i, int i2, l2 l2Var, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = l2Var.g;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrI = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) w0Var.a(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrI = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : i();
                    i2 = 0;
                }
                objArrI[i2] = obj2;
                i2++;
            }
        }
        l2Var.g = objArrI;
        if (objArr2 != objArrI) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int e(w0 w0Var, Object[] objArr, int i, l2 l2Var) {
        Object[] objArrW = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) w0Var.a(obj)).booleanValue()) {
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
        l2Var.g = objArrW;
        return i2;
    }

    public final void f(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.w >> 5;
        int i2 = this.j;
        if (i > (1 << i2)) {
            F(k(this.j + 5, b(objArr), objArr2));
            G(objArr3);
            this.j += 5;
            this.w++;
            return;
        }
        if (objArr == null) {
            F(objArr2);
            G(objArr3);
            this.w++;
        } else {
            F(k(i2, objArr, objArr2));
            G(objArr3);
            this.w++;
        }
    }

    @Override // defpackage.u0
    public final int g() {
        return this.w;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        fz5.g(i, g());
        if (D() <= i) {
            objArr = this.q;
        } else {
            Object[] objArr2 = this.m;
            objArr2.getClass();
            for (int i2 = this.j; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[xz5.y(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            l0.z("Check failed.");
            return null;
        }
        if (i2 < 0) {
            l0.z("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrW = w(objArr);
        int iY = xz5.y(i, i2);
        int i3 = i2 - 5;
        objArrW[iY] = h((Object[]) objArrW[iY], i, i3, it);
        while (true) {
            iY++;
            if (iY >= 32 || !it.hasNext()) {
                break;
            }
            objArrW[iY] = h((Object[]) objArrW[iY], 0, i3, it);
        }
        return objArrW;
    }

    public final Object[] i() {
        Object[] objArr = new Object[33];
        objArr[32] = this.a;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.m == null) {
            l0.z("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        q0 q0VarQ = q(D() >> 5);
        int i5 = i3;
        Object[] objArrC = objArr2;
        while (q0VarQ.j - 1 != i4) {
            Object[] objArr3 = (Object[]) q0VarQ.previous();
            pr.O(objArr3, objArrC, 0, 32 - i2, 32);
            objArrC = c(i2, objArr3);
            i5--;
            objArr[i5] = objArrC;
        }
        Object[] objArr4 = (Object[]) q0VarQ.previous();
        int iD = i3 - (((D() >> 5) - 1) - i4);
        if (iD < i3) {
            objArr2 = objArr[iD];
            objArr2.getClass();
        }
        H(collection, i, objArr4, 32, objArr, iD, objArr2);
    }

    public final Object[] k(int i, Object[] objArr, Object[] objArr2) {
        int iY = xz5.y(g() - 1, i);
        Object[] objArrW = w(objArr);
        if (i == 5) {
            objArrW[iY] = objArr2;
            return objArrW;
        }
        objArrW[iY] = k(i - 5, (Object[]) objArrW[iY], objArr2);
        return objArrW;
    }

    public final Object[] l(Object[] objArr, int i, int i2, Object obj, l2 l2Var) {
        Object obj2;
        int iY = xz5.y(i2, i);
        if (i == 0) {
            l2Var.g = objArr[31];
            Object[] objArrW = w(objArr);
            pr.O(objArr, objArrW, iY + 1, iY, 31);
            objArrW[iY] = obj;
            return objArrW;
        }
        Object[] objArrW2 = w(objArr);
        int i3 = i - 5;
        Object obj3 = objArrW2[iY];
        obj3.getClass();
        objArrW2[iY] = l((Object[]) obj3, i3, i2, obj, l2Var);
        while (true) {
            iY++;
            if (iY >= 32 || (obj2 = objArrW2[iY]) == null) {
                break;
            }
            objArrW2[iY] = l((Object[]) obj2, i3, 0, l2Var.g, l2Var);
        }
        return objArrW2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        fz5.y(i, this.w);
        return new ms3(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.a;
    }

    public final x0 n() {
        x0 gs3Var = this.t;
        if (gs3Var == null) {
            Object[] objArr = this.m;
            Object[] objArr2 = this.q;
            this.a = new aj6((byte) 23);
            if (objArr == null) {
                gs3Var = objArr2.length == 0 ? qr4.t : new qr4(Arrays.copyOf(objArr2, this.w));
            } else {
                gs3Var = new gs3(objArr, objArr2, this.w, this.j);
            }
            this.t = gs3Var;
        }
        return gs3Var;
    }

    public final Object[] o(Object[] objArr, int i, Object[][] objArr2) {
        er erVar = new er(objArr2);
        int i2 = i >> 5;
        int i3 = this.j;
        Object[] objArrH = i2 < (1 << i3) ? h(objArr, i, i3, erVar) : w(objArr);
        while (erVar.hasNext()) {
            this.j += 5;
            objArrH = b(objArrH);
            int i4 = this.j;
            h(objArrH, 1 << i4, i4, erVar);
        }
        return objArrH;
    }

    public final Object[] p(Object[] objArr, int i, int i2, l2 l2Var) {
        Object[] objArrP;
        int iY = xz5.y(i2 - 1, i);
        if (i == 5) {
            l2Var.g = objArr[iY];
            objArrP = null;
        } else {
            Object obj = objArr[iY];
            obj.getClass();
            objArrP = p((Object[]) obj, i - 5, i2, l2Var);
        }
        if (objArrP == null && iY == 0) {
            return null;
        }
        Object[] objArrW = w(objArr);
        objArrW[iY] = objArrP;
        return objArrW;
    }

    public final q0 q(int i) {
        if (this.m == null) {
            l0.z("Required value was null.");
            return null;
        }
        int iD = D() >> 5;
        fz5.y(i, iD);
        int i2 = this.j;
        Object[] objArr = this.m;
        if (i2 == 0) {
            objArr.getClass();
            return new d70(i, objArr);
        }
        objArr.getClass();
        return new md5(objArr, i, iD, i2 / 5);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        is3 is3Var;
        int i;
        collection.getClass();
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        w0 w0Var = new w0(collection, (byte) 1);
        int I = I();
        Object[] objArrS = null;
        l2 l2Var = new l2(null);
        if (this.m != null) {
            q0 q0VarQ = q(0);
            int iE = 32;
            while (iE == 32 && q0VarQ.hasNext()) {
                iE = e(w0Var, (Object[]) q0VarQ.next(), 32, l2Var);
            }
            if (iE == 32) {
                int iA = A(w0Var, I, l2Var);
                if (iA == 0) {
                    u(this.m, this.w, this.j);
                }
                if (iA != I) {
                    is3Var = this;
                } else {
                    is3Var = this;
                }
            } else {
                int i2 = (q0VarQ.j - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iD = iE;
                while (q0VarQ.hasNext()) {
                    iD = d(w0Var, (Object[]) q0VarQ.next(), 32, iD, l2Var, arrayList2, arrayList);
                }
                is3Var = this;
                int iD2 = is3Var.d(w0Var, is3Var.q, I, iD, l2Var, arrayList2, arrayList);
                Object obj = l2Var.g;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iD2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrH = is3Var.m;
                if (zIsEmpty) {
                    objArrH.getClass();
                } else {
                    objArrH = is3Var.h(objArrH, i2, is3Var.j, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    l0.z("Check failed.");
                    return false;
                }
                if (size == 0) {
                    is3Var.j = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = is3Var.j;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        is3Var.j = i - 5;
                        Object[] objArr2 = objArrH[0];
                        objArr2.getClass();
                        objArrH = objArr2;
                    }
                    objArrS = is3Var.s(objArrH, i3, i);
                }
                is3Var.F(objArrS);
                is3Var.G(objArr);
                is3Var.w = size + iD2;
            }
            z = true;
        } else if (A(w0Var, I, l2Var) != I) {
            is3Var = this;
            z = true;
        } else {
            is3Var = this;
        }
        if (z) {
            ((AbstractList) is3Var).modCount++;
        }
        return z;
    }

    public final Object[] s(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            l0.z("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int iY = xz5.y(i, i2);
        Object obj = objArr[iY];
        obj.getClass();
        Object objS = s((Object[]) obj, i, i2 - 5);
        if (iY < 31) {
            int i3 = iY + 1;
            if (objArr[i3] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrI = i();
                pr.O(objArr, objArrI, 0, 0, i3);
                objArr = objArrI;
            }
        }
        if (objS == objArr[iY]) {
            return objArr;
        }
        Object[] objArrW = w(objArr);
        objArrW[iY] = objS;
        return objArrW;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        fz5.g(i, g());
        if (D() > i) {
            l2 l2Var = new l2(null);
            Object[] objArr = this.m;
            objArr.getClass();
            F(E(objArr, this.j, i, obj, l2Var));
            return l2Var.g;
        }
        Object[] objArrW = w(this.q);
        if (objArrW != this.q) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrW[i2];
        objArrW[i2] = obj;
        G(objArrW);
        return obj2;
    }

    public final void u(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            F(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            G(objArr);
            this.w = i;
            this.j = i2;
            return;
        }
        l2 l2Var = new l2(null);
        objArr.getClass();
        Object[] objArrP = p(objArr, i2, i, l2Var);
        objArrP.getClass();
        Object obj = l2Var.g;
        obj.getClass();
        G((Object[]) obj);
        this.w = i;
        if (objArrP[1] == null) {
            F((Object[]) objArrP[0]);
            this.j = i2 - 5;
        } else {
            F(objArrP);
            this.j = i2;
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
        fz5.g(i, g());
        ((AbstractList) this).modCount++;
        int iD = D();
        if (i >= iD) {
            return C(this.m, iD, this.j, i - iD);
        }
        l2 l2Var = new l2(this.q[0]);
        Object[] objArr = this.m;
        objArr.getClass();
        C(B(objArr, this.j, i, l2Var), iD, this.j, 0);
        return l2Var.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int I = I();
        if (I < 32) {
            Object[] objArrW = w(this.q);
            objArrW[I] = obj;
            G(objArrW);
            this.w = g() + 1;
        } else {
            f(this.m, this.q, b(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        Iterator it = collection.iterator();
        if (32 - I >= collection.size()) {
            Object[] objArrW = w(this.q);
            v(objArrW, I, it);
            G(objArrW);
            this.w = collection.size() + this.w;
            return true;
        }
        int size = ((collection.size() + I) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrW2 = w(this.q);
        v(objArrW2, I, it);
        objArr[0] = objArrW2;
        for (int i = 1; i < size; i++) {
            Object[] objArrI = i();
            v(objArrI, 0, it);
            objArr[i] = objArrI;
        }
        F(o(this.m, D(), objArr));
        Object[] objArrI2 = i();
        v(objArrI2, 0, it);
        G(objArrI2);
        this.w = collection.size() + this.w;
        return true;
    }
}
