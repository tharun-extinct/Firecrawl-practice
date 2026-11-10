package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kr implements Collection {
    public final /* synthetic */ mr j;

    public kr(mr mrVar) {
        this.j = mrVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.j.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.j.g(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.j.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lr(this.j);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        mr mrVar = this.j;
        int iG = mrVar.g(obj);
        if (iG < 0) {
            return false;
        }
        mrVar.l(iG);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        mr mrVar = this.j;
        int i = mrVar.a;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(mrVar.t(i2))) {
                mrVar.l(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        mr mrVar = this.j;
        int i = mrVar.a;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(mrVar.t(i2))) {
                mrVar.l(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.j.a;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        mr mrVar = this.j;
        int i = mrVar.a;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = mrVar.t(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        mr mrVar = this.j;
        int i = mrVar.a;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = mrVar.t(i2);
        }
        return objArr;
    }
}
