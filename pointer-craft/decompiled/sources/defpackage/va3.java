package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class va3 implements List, wh2 {
    public final xa3 j;

    public va3(xa3 xa3Var) {
        this.j = xa3Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        xa3 xa3Var = this.j;
        if (i < 0 || i > (i2 = xa3Var.y)) {
            StringBuilder sbP = du4.p(i, "Index ", " must be in 0..");
            sbP.append(xa3Var.y);
            cf6.t(sbP.toString());
            throw null;
        }
        int i3 = i2 + 1;
        Object[] objArr = xa3Var.g;
        if (objArr.length < i3) {
            xa3Var.c(i3, objArr);
        }
        Object[] objArr2 = xa3Var.g;
        int i4 = xa3Var.y;
        if (i != i4) {
            pr.O(objArr2, objArr2, i + 1, i, i4);
        }
        objArr2[i] = obj;
        xa3Var.y++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        xa3 xa3Var = this.j;
        if (i < 0 || i > xa3Var.y) {
            StringBuilder sbP = du4.p(i, "Index ", " must be in 0..");
            sbP.append(xa3Var.y);
            cf6.t(sbP.toString());
            throw null;
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + xa3Var.y;
        Object[] objArr = xa3Var.g;
        if (objArr.length < size) {
            xa3Var.c(size, objArr);
        }
        Object[] objArr2 = xa3Var.g;
        if (i != xa3Var.y) {
            pr.O(objArr2, objArr2, collection.size() + i, i, xa3Var.y);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                pw5.R();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        xa3Var.y = collection.size() + xa3Var.y;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.j.n();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.j.v(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.j.v(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ni3.g(i, this);
        return this.j.l(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.j.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.j.t();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ua3(this, 0, (byte) 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        xa3 xa3Var = this.j;
        Object[] objArr = xa3Var.g;
        int i = xa3Var.y;
        if (obj == null) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            for (int i3 = i - 1; -1 < i3; i3--) {
                if (obj.equals(objArr[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ua3(this, 0, (byte) 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        ni3.g(i, this);
        return this.j.q(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        xa3 xa3Var = this.j;
        int i = xa3Var.y;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xa3Var.m(it.next());
        }
        return i != xa3Var.y;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        xa3 xa3Var = this.j;
        int i = xa3Var.y;
        Object[] objArr = xa3Var.g;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                xa3Var.q(i2);
            }
        }
        return i != xa3Var.y;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        ni3.g(i, this);
        return this.j.i(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.j.y;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        ni3.y(this, i, i2);
        return new wa3(this, i, i2, (byte) 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return pw5.T(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ua3(this, i, (byte) 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pw5.S(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.j.m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.j.g(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        xa3 xa3Var = this.j;
        int i = xa3Var.y;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xa3Var.g(it.next());
        }
        return i != xa3Var.y;
    }
}
