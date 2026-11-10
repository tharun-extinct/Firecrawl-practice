package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class or implements Collection, Set, wh2, zh2 {
    public int a;
    public int[] j;
    public Object[] t;

    public or(int i) {
        this.j = og0.b;
        this.t = og0.p;
        if (i > 0) {
            this.j = new int[i];
            this.t = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iB;
        int i2 = this.a;
        if (obj == null) {
            iB = og0.B(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iB = og0.B(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i3 = ~iB;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.t;
            int[] iArr2 = new int[i4];
            this.j = iArr2;
            this.t = new Object[i4];
            if (i2 != this.a) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                pr.P(0, iArr.length, 6, iArr, iArr2);
                pr.Q(objArr, this.t, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.j;
            int i5 = i3 + 1;
            pr.M(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.t;
            pr.O(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.a;
        if (i2 == i6) {
            int[] iArr4 = this.j;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.t[i3] = obj;
                this.a = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.a;
        int i = this.a;
        int[] iArr = this.j;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.t;
            int[] iArr2 = new int[size];
            this.j = iArr2;
            this.t = new Object[size];
            if (i > 0) {
                pr.P(0, i, 6, iArr, iArr2);
                pr.Q(objArr, this.t, 0, this.a, 6);
            }
        }
        if (this.a != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        if (i != 0) {
            this.j = og0.b;
            this.t = og0.p;
            i = 0;
            this.a = 0;
        }
        if (i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? og0.B(this, null, 0) : og0.B(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.a != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.a;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.t[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Object g(int i) {
        int i2 = this.a;
        Object[] objArr = this.t;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.j;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                pr.M(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.t;
                pr.O(objArr2, objArr2, i, i4, i2);
            }
            this.t[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.j = iArr2;
            this.t = new Object[i5];
            if (i > 0) {
                pr.P(0, i, 6, iArr, iArr2);
                pr.Q(objArr, this.t, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                pr.M(i, i6, i2, iArr, this.j);
                pr.O(objArr, this.t, i, i6, i2);
            }
        }
        if (i2 != this.a) {
            throw new ConcurrentModificationException();
        }
        this.a = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.j;
        int i = this.a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new lr(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB = obj == null ? og0.B(this, null, 0) : og0.B(this, obj, obj.hashCode());
        if (iB < 0) {
            return false;
        }
        g(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.a - 1; -1 < i; i--) {
            if (!cj0.f0(collection, this.t[i])) {
                g(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        Object[] objArrX = zx5.x(this.a, objArr);
        pr.O(this.t, objArrX, 0, 0, this.a);
        return objArrX;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.a * 14);
        sb.append('{');
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.t[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return pr.S(this.t, 0, this.a);
    }
}
