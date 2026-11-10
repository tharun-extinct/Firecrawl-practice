package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class c72 implements List, vh2 {
    public final xa3 j = new xa3(16);
    public final la3 t = new la3(16);
    public int a = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a = -1;
        this.j.n();
        this.t.y = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof i73) && indexOf((i73) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((i73) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final long g() {
        long jG = dh6.g(Float.POSITIVE_INFINITY, false, false);
        int i = this.a + 1;
        int i2 = this.j.y - 1;
        if (i > i2) {
            return jG;
        }
        while (i >= 0) {
            la3 la3Var = this.t;
            if (i >= la3Var.y) {
                break;
            }
            long j = la3Var.g[i];
            if (qe6.g(j, jG) < 0) {
                jG = j;
            }
            if ((qe6.r(jG) < 0.0f && qe6.v(jG)) || i == i2) {
                return jG;
            }
            i++;
        }
        cf6.t("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objL = this.j.l(i);
        objL.getClass();
        return (i73) objL;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof i73)) {
            return -1;
        }
        i73 i73Var = (i73) obj;
        xa3 xa3Var = this.j;
        int i = xa3Var.y - 1;
        if (i < 0) {
            return -1;
        }
        int i2 = 0;
        while (!yf2.p(xa3Var.l(i2), i73Var)) {
            if (i2 == i) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.j.t();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a72(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof i73) {
            i73 i73Var = (i73) obj;
            xa3 xa3Var = this.j;
            for (int i = xa3Var.y - 1; -1 < i; i--) {
                if (yf2.p(xa3Var.l(i), i73Var)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new a72(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.j.y;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new b72(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pw5.S(this);
    }

    public final void y(int i, int i2) {
        la3 la3Var;
        int i3;
        if (i >= i2) {
            return;
        }
        this.j.w(i, i2);
        if (i < 0 || i > (i3 = (la3Var = this.t).y) || i2 < 0 || i2 > i3) {
            cf6.t("Index must be between 0 and size");
            throw null;
        }
        if (i2 < i) {
            cf6.l("The end index must be < start index");
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = la3Var.g;
                pr.N(jArr, jArr, i, i2, i3);
            }
            la3Var.y -= i2 - i;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pw5.T(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new a72(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
