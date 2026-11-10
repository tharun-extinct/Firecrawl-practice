package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dr extends u0 {
    public static final Object[] m = new Object[0];
    public int a;
    public int j;
    public Object[] t;

    public dr(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = m;
        } else {
            if (i <= 0) {
                l0.u(xi3.j("Illegal Capacity: ", i));
                throw null;
            }
            objArr = new Object[i];
        }
        this.t = objArr;
    }

    public final int a(int i) {
        return i < 0 ? i + this.t.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.a;
        if (i < 0 || i > i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        w();
        v(this.a + 1);
        int iQ = q(this.j + i);
        int i3 = this.a;
        if (i < ((i3 + 1) >> 1)) {
            int length = iQ == 0 ? this.t.length - 1 : iQ - 1;
            int i4 = this.j;
            int length2 = i4 == 0 ? this.t.length - 1 : i4 - 1;
            Object[] objArr = this.t;
            if (length >= i4) {
                objArr[length2] = objArr[i4];
                pr.O(objArr, objArr, i4, i4 + 1, length + 1);
            } else {
                pr.O(objArr, objArr, i4 - 1, i4, objArr.length);
                Object[] objArr2 = this.t;
                objArr2[objArr2.length - 1] = objArr2[0];
                pr.O(objArr2, objArr2, 0, 1, length + 1);
            }
            this.t[length] = obj;
            this.j = length2;
        } else {
            int iQ2 = q(i3 + this.j);
            Object[] objArr3 = this.t;
            if (iQ < iQ2) {
                pr.O(objArr3, objArr3, iQ + 1, iQ, iQ2);
            } else {
                pr.O(objArr3, objArr3, 1, 0, iQ2);
                Object[] objArr4 = this.t;
                objArr4[0] = objArr4[objArr4.length - 1];
                pr.O(objArr4, objArr4, iQ + 1, iQ, objArr4.length - 1);
            }
            this.t[iQ] = obj;
        }
        this.a++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.a;
        if (i < 0 || i > i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.a) {
            return addAll(collection);
        }
        w();
        v(collection.size() + this.a);
        int iQ = q(this.a + this.j);
        int iQ2 = q(this.j + i);
        int size = collection.size();
        if (i >= ((this.a + 1) >> 1)) {
            int i3 = iQ2 + size;
            Object[] objArr = this.t;
            if (iQ2 < iQ) {
                int i4 = size + iQ;
                if (i4 <= objArr.length) {
                    pr.O(objArr, objArr, i3, iQ2, iQ);
                } else if (i3 >= objArr.length) {
                    pr.O(objArr, objArr, i3 - objArr.length, iQ2, iQ);
                } else {
                    int length = iQ - (i4 - objArr.length);
                    pr.O(objArr, objArr, 0, length, iQ);
                    Object[] objArr2 = this.t;
                    pr.O(objArr2, objArr2, i3, iQ2, length);
                }
            } else {
                pr.O(objArr, objArr, size, 0, iQ);
                Object[] objArr3 = this.t;
                if (i3 >= objArr3.length) {
                    pr.O(objArr3, objArr3, i3 - objArr3.length, iQ2, objArr3.length);
                } else {
                    pr.O(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.t;
                    pr.O(objArr4, objArr4, i3, iQ2, objArr4.length - size);
                }
            }
            n(iQ2, collection);
            return true;
        }
        int i5 = this.j;
        int length2 = i5 - size;
        Object[] objArr5 = this.t;
        if (iQ2 < i5) {
            pr.O(objArr5, objArr5, length2, i5, objArr5.length);
            Object[] objArr6 = this.t;
            if (size >= iQ2) {
                pr.O(objArr6, objArr6, objArr6.length - size, 0, iQ2);
            } else {
                pr.O(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.t;
                pr.O(objArr7, objArr7, 0, size, iQ2);
            }
        } else if (length2 >= 0) {
            pr.O(objArr5, objArr5, length2, i5, iQ2);
        } else {
            length2 += objArr5.length;
            int i6 = iQ2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                pr.O(objArr5, objArr5, length2, i5, iQ2);
            } else {
                pr.O(objArr5, objArr5, length2, i5, i5 + length3);
                Object[] objArr8 = this.t;
                pr.O(objArr8, objArr8, 0, this.j + length3, iQ2);
            }
        }
        this.j = length2;
        n(a(iQ2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        w();
        v(this.a + 1);
        int length = this.j;
        if (length == 0) {
            length = this.t.length;
        }
        int i = length - 1;
        this.j = i;
        this.t[i] = obj;
        this.a++;
    }

    public final void addLast(Object obj) {
        w();
        v(this.a + 1);
        this.t[q(this.a + this.j)] = obj;
        this.a++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            w();
            m(this.j, q(this.a + this.j));
        }
        this.j = 0;
        this.a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.t[this.j];
        }
        l0.s("ArrayDeque is empty.");
        return null;
    }

    @Override // defpackage.u0
    public final int g() {
        return this.a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        if (i >= 0 && i < i2) {
            return this.t[q(this.j + i)];
        }
        l0.p(du4.m(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iQ = q(this.a + this.j);
        int length = this.j;
        if (length < iQ) {
            while (length < iQ) {
                if (yf2.p(obj, this.t[length])) {
                    i = this.j;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.j) < iQ) {
            return -1;
        }
        int length2 = this.t.length;
        while (length < length2) {
            if (yf2.p(obj, this.t[length])) {
                i = this.j;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iQ; i2++) {
            if (yf2.p(obj, this.t[i2])) {
                length = i2 + this.t.length;
                i = this.j;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return g() == 0;
    }

    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.t[q((g() - 1) + this.j)];
    }

    public final int l(int i) {
        if (i == this.t.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object last() {
        if (isEmpty()) {
            l0.s("ArrayDeque is empty.");
            return null;
        }
        return this.t[q((g() - 1) + this.j)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iQ = q(this.a + this.j);
        int i2 = this.j;
        if (i2 < iQ) {
            length = iQ - 1;
            if (i2 <= length) {
                while (!yf2.p(obj, this.t[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.j;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.j >= iQ) {
            do {
                iQ--;
                objArr = this.t;
                if (-1 >= iQ) {
                    length = objArr.length - 1;
                    int i3 = this.j;
                    if (i3 <= length) {
                        while (!yf2.p(obj, this.t[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.j;
                    }
                }
                return length - i;
            } while (!yf2.p(obj, objArr[iQ]));
            length = iQ + this.t.length;
            i = this.j;
            return length - i;
        }
        return -1;
    }

    public final void m(int i, int i2) {
        Object[] objArr = this.t;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.t, 0, i2, (Object) null);
        }
    }

    public final void n(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.t.length;
        while (i < length && it.hasNext()) {
            this.t[i] = it.next();
            i++;
        }
        int i2 = this.j;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.t[i3] = it.next();
        }
        this.a = collection.size() + this.a;
    }

    public final int q(int i) {
        Object[] objArr = this.t;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        y(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iQ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.t.length != 0) {
            int iQ2 = q(this.a + this.j);
            int i = this.j;
            if (i < iQ2) {
                iQ = i;
                while (true) {
                    objArr = this.t;
                    if (i >= iQ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.t[iQ] = obj;
                        iQ++;
                    }
                    i++;
                }
                Arrays.fill(objArr, iQ, iQ2, (Object) null);
            } else {
                int length = this.t.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.t;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.t[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iQ = q(i2);
                for (int i3 = 0; i3 < iQ2; i3++) {
                    Object[] objArr3 = this.t;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.t[iQ] = obj3;
                        iQ = l(iQ);
                    }
                }
                z = z2;
            }
            if (z) {
                w();
                this.a = a(iQ - this.j);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            l0.s("ArrayDeque is empty.");
            return null;
        }
        w();
        Object[] objArr = this.t;
        int i = this.j;
        Object obj = objArr[i];
        objArr[i] = null;
        this.j = l(i);
        this.a--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            l0.s("ArrayDeque is empty.");
            return null;
        }
        w();
        int iQ = q((g() - 1) + this.j);
        Object[] objArr = this.t;
        Object obj = objArr[iQ];
        objArr[iQ] = null;
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        y94.z(i, i2, this.a);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.a) {
            clear();
            return;
        }
        if (i3 == 1) {
            y(i);
            return;
        }
        w();
        int i4 = this.a - i2;
        int i5 = this.j;
        int i6 = this.j;
        if (i < i4) {
            int iQ = q((i - 1) + i5);
            int iQ2 = q((i2 - 1) + i6);
            while (i > 0) {
                int i7 = iQ + 1;
                int iMin = Math.min(i, Math.min(i7, iQ2 + 1));
                Object[] objArr = this.t;
                int i8 = iQ2 - iMin;
                int i9 = iQ - iMin;
                pr.O(objArr, objArr, i8 + 1, i9 + 1, i7);
                iQ = a(i9);
                iQ2 = a(i8);
                i -= iMin;
            }
            int iQ3 = q(this.j + i3);
            m(this.j, iQ3);
            this.j = iQ3;
        } else {
            int iQ4 = q(i5 + i2);
            int iQ5 = q(i6 + i);
            int i10 = this.a;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.t;
                i2 = Math.min(i10, Math.min(objArr2.length - iQ4, objArr2.length - iQ5));
                Object[] objArr3 = this.t;
                int i11 = iQ4 + i2;
                pr.O(objArr3, objArr3, iQ5, iQ4, i11);
                iQ4 = q(i11);
                iQ5 = q(iQ5 + i2);
            }
            int iQ6 = q(this.a + this.j);
            m(a(iQ6 - i3), iQ6);
        }
        this.a -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iQ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.t.length != 0) {
            int iQ2 = q(this.a + this.j);
            int i = this.j;
            if (i < iQ2) {
                iQ = i;
                while (true) {
                    objArr = this.t;
                    if (i >= iQ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.t[iQ] = obj;
                        iQ++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, iQ, iQ2, (Object) null);
            } else {
                int length = this.t.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.t;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.t[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iQ = q(i2);
                for (int i3 = 0; i3 < iQ2; i3++) {
                    Object[] objArr3 = this.t;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.t[iQ] = obj3;
                        iQ = l(iQ);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                w();
                this.a = a(iQ - this.j);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.a;
        if (i < 0 || i >= i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return null;
        }
        int iQ = q(this.j + i);
        Object[] objArr = this.t;
        Object obj2 = objArr[iQ];
        objArr[iQ] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.a;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iQ = q(this.a + this.j);
        int i2 = this.j;
        if (i2 < iQ) {
            pr.Q(this.t, objArr, i2, iQ, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.t;
            pr.O(objArr2, objArr, 0, this.j, objArr2.length);
            Object[] objArr3 = this.t;
            pr.O(objArr3, objArr, objArr3.length - this.j, 0, iQ);
        }
        int i3 = this.a;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public final void v(int i) {
        if (i < 0) {
            l0.z("Deque is too big.");
            return;
        }
        Object[] objArr = this.t;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == m) {
            if (i < 10) {
                i = 10;
            }
            this.t = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        pr.O(objArr, objArr2, 0, this.j, objArr.length);
        Object[] objArr3 = this.t;
        int length2 = objArr3.length;
        int i3 = this.j;
        pr.O(objArr3, objArr2, length2 - i3, 0, i3);
        this.j = 0;
        this.t = objArr2;
    }

    public final void w() {
        ((AbstractList) this).modCount++;
    }

    public final Object x() {
        if (isEmpty()) {
            return null;
        }
        return this.t[this.j];
    }

    @Override // defpackage.u0
    public final Object y(int i) {
        int i2 = this.a;
        if (i < 0 || i >= i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == g() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        w();
        int iQ = q(this.j + i);
        Object[] objArr = this.t;
        Object obj = objArr[iQ];
        int i3 = this.a >> 1;
        int i4 = this.j;
        if (i < i3) {
            if (iQ >= i4) {
                pr.O(objArr, objArr, i4 + 1, i4, iQ);
            } else {
                pr.O(objArr, objArr, 1, 0, iQ);
                Object[] objArr2 = this.t;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.j;
                pr.O(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.t;
            int i6 = this.j;
            objArr3[i6] = null;
            this.j = l(i6);
        } else {
            int iQ2 = q((g() - 1) + i4);
            Object[] objArr4 = this.t;
            if (iQ <= iQ2) {
                pr.O(objArr4, objArr4, iQ, iQ + 1, iQ2 + 1);
            } else {
                pr.O(objArr4, objArr4, iQ, iQ + 1, objArr4.length);
                Object[] objArr5 = this.t;
                objArr5[objArr5.length - 1] = objArr5[0];
                pr.O(objArr5, objArr5, 0, 1, iQ2 + 1);
            }
            this.t[iQ2] = null;
        }
        this.a--;
        return obj;
    }

    public dr() {
        this.t = m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[g()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        w();
        v(collection.size() + this.a);
        n(q(this.a + this.j), collection);
        return true;
    }
}
