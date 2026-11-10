package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class tx2 implements Collection, vh2 {
    public static final tx2 a = new tx2(pi1.j);
    public final List j;
    public final int t;

    public tx2(List list) {
        this.j = list;
        this.t = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof sx2)) {
            return false;
        }
        return this.j.contains((sx2) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.j.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tx2) {
            return this.j.equals(((tx2) obj).j);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.j.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.j.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.j.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.t;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return pw5.S(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.j + ")";
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pw5.T(this, objArr);
    }
}
