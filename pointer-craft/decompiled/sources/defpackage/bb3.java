package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bb3 implements zh2, Set, vh2 {
    public final ya3 j;
    public final ya3 t;

    public bb3(ya3 ya3Var) {
        this.j = ya3Var;
        this.t = ya3Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.t.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        ya3 ya3Var = this.t;
        int i = ya3Var.l;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ya3Var.l(it.next());
        }
        return i != ya3Var.l;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.t.y();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.j.r(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.j.r(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bb3.class != obj.getClass()) {
            return false;
        }
        return this.j.equals(((bb3) obj).j);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.j.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.j.l == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ab3(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.t.j(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        ya3 ya3Var = this.t;
        int i = ya3Var.l;
        Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = ya3Var.x;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = ya3Var.g;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j = ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                    int i10 = i2;
                    if (yf2.p(ya3Var.y[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i10;
                }
                int i11 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i7 = (i7 + i3) & i6;
                i2 = i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                ya3Var.t(iNumberOfTrailingZeros);
            }
        }
        return i != ya3Var.l;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.t.a(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.j.l;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return pw5.T(this, objArr);
    }

    public final String toString() {
        return this.j.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return pw5.S(this);
    }
}
