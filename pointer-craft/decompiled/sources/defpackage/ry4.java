package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class ry4 implements Collection, vh2 {
    public final ya3 j = tm3.g();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.j.g(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.j.y();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.j.r(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.j.r(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.j.l == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new bb3(this.j).iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.j.j(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.j.j(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.j.a(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.j.l;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return pw5.S(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pw5.T(this, objArr);
    }
}
