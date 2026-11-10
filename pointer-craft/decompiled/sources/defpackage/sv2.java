package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class sv2 extends u0 implements RandomAccess, Serializable {
    public int a;
    public Object[] j;
    public final sv2 m;
    public final uv2 q;
    public final int t;

    public sv2(Object[] objArr, int i, int i2, sv2 sv2Var, uv2 uv2Var) {
        objArr.getClass();
        this.j = objArr;
        this.t = i;
        this.a = i2;
        this.m = sv2Var;
        this.q = uv2Var;
        ((AbstractList) this).modCount = ((AbstractList) uv2Var).modCount;
    }

    public final Object a(int i) {
        Object objA;
        ((AbstractList) this).modCount++;
        sv2 sv2Var = this.m;
        if (sv2Var != null) {
            objA = sv2Var.a(i);
        } else {
            uv2 uv2Var = uv2.m;
            objA = this.q.a(i);
        }
        this.a--;
        return objA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        j();
        l();
        int i2 = this.a;
        if (i < 0 || i > i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
        } else {
            x(this.t + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        j();
        l();
        int i2 = this.a;
        if (i < 0 || i > i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        v(this.t + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        l();
        m(this.t, this.a);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        l();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.j;
            int i = this.a;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (yf2.p(objArr[this.t + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.u0
    public final int g() {
        l();
        return this.a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        l();
        int i2 = this.a;
        if (i >= 0 && i < i2) {
            return this.j[this.t + i];
        }
        l0.p(du4.m(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        l();
        Object[] objArr = this.j;
        int i = this.a;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.t + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        l();
        for (int i = 0; i < this.a; i++) {
            if (yf2.p(this.j[this.t + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        l();
        return this.a == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (this.q.a) {
            uo1.f();
        }
    }

    public final void l() {
        if (((AbstractList) this.q).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        l();
        for (int i = this.a - 1; i >= 0; i--) {
            if (yf2.p(this.j[this.t + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        l();
        int i2 = this.a;
        if (i >= 0 && i <= i2) {
            return new a72(this, i);
        }
        l0.p(du4.m(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        sv2 sv2Var = this.m;
        if (sv2Var != null) {
            sv2Var.m(i, i2);
        } else {
            uv2 uv2Var = uv2.m;
            this.q.m(i, i2);
        }
        this.a -= i2;
    }

    public final int q(int i, int i2, Collection collection, boolean z) {
        int iQ;
        sv2 sv2Var = this.m;
        if (sv2Var != null) {
            iQ = sv2Var.q(i, i2, collection, z);
        } else {
            uv2 uv2Var = uv2.m;
            iQ = this.q.q(i, i2, collection, z);
        }
        if (iQ > 0) {
            ((AbstractList) this).modCount++;
        }
        this.a -= iQ;
        return iQ;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
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
        j();
        l();
        return q(this.t, this.a, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        j();
        l();
        return q(this.t, this.a, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        j();
        l();
        int i2 = this.a;
        if (i < 0 || i >= i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.j;
        int i3 = this.t;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        y94.z(i, i2, this.a);
        return new sv2(this.j, this.t + i, i2 - i, this, this.q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        l();
        int length = objArr.length;
        int i = this.a;
        Object[] objArr2 = this.j;
        int i2 = this.t;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        pr.O(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.a;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        l();
        return zq2.A(this.j, this.t, this.a, this);
    }

    public final void v(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        uv2 uv2Var = this.q;
        sv2 sv2Var = this.m;
        if (sv2Var != null) {
            sv2Var.v(i, collection, i2);
        } else {
            uv2 uv2Var2 = uv2.m;
            uv2Var.v(i, collection, i2);
        }
        this.j = uv2Var.j;
        this.a += i2;
    }

    public final void x(int i, Object obj) {
        ((AbstractList) this).modCount++;
        uv2 uv2Var = this.q;
        sv2 sv2Var = this.m;
        if (sv2Var != null) {
            sv2Var.x(i, obj);
        } else {
            uv2 uv2Var2 = uv2.m;
            uv2Var.x(i, obj);
        }
        this.j = uv2Var.j;
        this.a++;
    }

    @Override // defpackage.u0
    public final Object y(int i) {
        j();
        l();
        int i2 = this.a;
        if (i >= 0 && i < i2) {
            return a(this.t + i);
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
        j();
        l();
        x(this.t + this.a, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        l();
        Object[] objArr = this.j;
        int i = this.a;
        int i2 = this.t;
        return pr.S(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        j();
        l();
        int size = collection.size();
        v(this.t + this.a, collection, size);
        return size > 0;
    }
}
