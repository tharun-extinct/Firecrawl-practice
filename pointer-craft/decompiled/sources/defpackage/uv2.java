package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class uv2 extends u0 implements RandomAccess, Serializable {
    public static final uv2 m;
    public boolean a;
    public Object[] j;
    public int t;

    static {
        uv2 uv2Var = new uv2(0);
        uv2Var.a = true;
        m = uv2Var;
    }

    public uv2(int i) {
        if (i >= 0) {
            this.j = new Object[i];
        } else {
            l0.u("capacity must be non-negative.");
            throw null;
        }
    }

    public final Object a(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.j;
        Object obj = objArr[i];
        pr.O(objArr, objArr, i, i + 1, this.t);
        Object[] objArr2 = this.j;
        int i2 = this.t - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.t--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        int i2 = this.t;
        if (i < 0 || i > i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        j(i, 1);
        this.j[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        l();
        int i2 = this.t;
        if (i < 0 || i > i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        v(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        m(0, this.t);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.j;
            int i = this.t;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (yf2.p(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.u0
    public final int g() {
        return this.t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.t;
        if (i >= 0 && i < i2) {
            return this.j[i];
        }
        l0.p(du4.m(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.j;
        int i = this.t;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.t; i++) {
            if (yf2.p(this.j[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.t == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        int i3 = this.t + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.j;
        if (i3 > objArrCopyOf.length) {
            int length = objArrCopyOf.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            this.j = objArrCopyOf;
        }
        pr.O(objArrCopyOf, objArrCopyOf, i + i2, i, this.t);
        this.t += i2;
    }

    public final void l() {
        if (this.a) {
            uo1.f();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.t - 1; i >= 0; i--) {
            if (yf2.p(this.j[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.t;
        if (i >= 0 && i <= i2) {
            return new tv2(this, i);
        }
        l0.p(du4.m(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.j;
        pr.O(objArr, objArr, i, i + i2, this.t);
        Object[] objArr2 = this.j;
        int i3 = this.t;
        zq2.d(objArr2, i3 - i2, i3);
        this.t -= i2;
    }

    public final int q(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.j;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.j;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        pr.O(objArr, objArr, i + i4, i2 + i, this.t);
        Object[] objArr3 = this.j;
        int i7 = this.t;
        zq2.d(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.t -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            y(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        l();
        return q(0, this.t, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        l();
        return q(0, this.t, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        int i2 = this.t;
        if (i < 0 || i >= i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.j;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        y94.z(i, i2, this.t);
        return new sv2(this.j, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.t;
        Object[] objArr2 = this.j;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        pr.O(objArr2, objArr, 0, 0, i);
        int i2 = this.t;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return zq2.A(this.j, 0, this.t, this);
    }

    public final void v(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        j(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.j[i + i3] = it.next();
        }
    }

    public final void x(int i, Object obj) {
        ((AbstractList) this).modCount++;
        j(i, 1);
        this.j[i] = obj;
    }

    @Override // defpackage.u0
    public final Object y(int i) {
        l();
        int i2 = this.t;
        if (i >= 0 && i < i2) {
            return a(i);
        }
        l0.p(du4.m(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        int i = this.t;
        ((AbstractList) this).modCount++;
        j(i, 1);
        this.j[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return pr.S(this.j, 0, this.t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        l();
        int size = collection.size();
        v(this.t, collection, size);
        return size > 0;
    }
}
