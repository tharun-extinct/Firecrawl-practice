package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class lb3 implements zh2, Set, vh2 {
    public final ib3 j;
    public final ib3 t;

    public lb3(ib3 ib3Var) {
        this.j = ib3Var;
        this.t = ib3Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.t.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        ib3 ib3Var = this.t;
        int i = ib3Var.n;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ib3Var.m(it.next());
        }
        return i != ib3Var.n;
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
        if (obj == null || lb3.class != obj.getClass()) {
            return false;
        }
        return this.j.equals(((lb3) obj).j);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.j.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.j.l();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ab3(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.t.q(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        ib3 ib3Var = this.t;
        int i = ib3Var.n;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ib3Var.t(it.next());
        }
        return i != ib3Var.n;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:5:0x0014->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[EDGE_INSN: B:24:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x0053], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        ib3 ib3Var = this.t;
        Object[] objArr = ib3Var.y;
        int i = ib3Var.n;
        long[] jArr = ib3Var.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!cj0.f0(collection, objArr[i5])) {
                                ib3Var.w(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != ib3Var.n;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.j.n;
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
