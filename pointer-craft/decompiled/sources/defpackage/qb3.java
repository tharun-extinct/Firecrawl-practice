package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class qb3 implements List, wh2 {
    public final rb3 j;

    public qb3(rb3 rb3Var) {
        this.j = rb3Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.j.y(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        rb3 rb3Var = this.j;
        return rb3Var.x(rb3Var.a, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.j.j();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.j.a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.j.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sb3.g(i, this);
        return this.j.j[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.j.m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.j.a == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ua3(this, 0, (byte) 1);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        rb3 rb3Var = this.j;
        Object[] objArr = rb3Var.j;
        for (int i = rb3Var.a - 1; i >= 0; i--) {
            if (yf2.p(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ua3(this, 0, (byte) 1);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        sb3.g(i, this);
        return this.j.w(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        rb3 rb3Var = this.j;
        int i = rb3Var.a;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rb3Var.q(it.next());
        }
        return i != rb3Var.a;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        rb3 rb3Var = this.j;
        int i = rb3Var.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(rb3Var.j[i2])) {
                rb3Var.w(i2);
            }
        }
        return i != rb3Var.a;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        sb3.g(i, this);
        Object[] objArr = this.j.j;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.j.a;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        sb3.y(this, i, i2);
        return new wa3(this, i, i2, (byte) 1);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pw5.S(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pw5.T(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.j.g(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ua3(this, i, (byte) 1);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.j.x(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.j.q(obj);
    }
}
