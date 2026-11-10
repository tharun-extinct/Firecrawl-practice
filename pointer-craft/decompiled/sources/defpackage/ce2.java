package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class ce2 extends a1 implements cf2, RandomAccess, ux3 {
    public static final ce2 m = new ce2(new int[0], 0, false);
    public int a;
    public int[] t;

    public ce2(int[] iArr, int i, boolean z) {
        super(z);
        this.t = iArr;
        this.a = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        g();
        if (i < 0 || i > (i2 = this.a)) {
            l0.j(this.a, du4.p(i, "Index:", ", Size:"));
            return;
        }
        int[] iArr = this.t;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.t, i, iArr2, i + 1, this.a - i);
            this.t = iArr2;
        }
        this.t[i] = iIntValue;
        this.a++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.a1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = ff2.g;
        collection.getClass();
        if (!(collection instanceof ce2)) {
            return super.addAll(collection);
        }
        ce2 ce2Var = (ce2) collection;
        int i = ce2Var.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.t;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            this.t = iArrCopyOf;
        }
        System.arraycopy(ce2Var.t, 0, iArrCopyOf, this.a, ce2Var.a);
        this.a = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.a1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce2)) {
            return super.equals(obj);
        }
        ce2 ce2Var = (ce2) obj;
        if (this.a != ce2Var.a) {
            return false;
        }
        int[] iArr = ce2Var.t;
        for (int i = 0; i < this.a; i++) {
            if (this.t[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(v(i));
    }

    @Override // defpackage.a1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + this.t[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.t[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void n(int i) {
        if (i < 0 || i >= this.a) {
            l0.j(this.a, du4.p(i, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.a1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        g();
        n(i);
        int[] iArr = this.t;
        int i2 = iArr[i];
        int i3 = this.a;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.a--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        g();
        if (i2 < i) {
            l0.p("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.t;
        System.arraycopy(iArr, i2, iArr, i, this.a - i2);
        this.a -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        g();
        n(i);
        int[] iArr = this.t;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    public final int v(int i) {
        n(i);
        return this.t[i];
    }

    @Override // defpackage.df2
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final ce2 t(int i) {
        if (i >= this.a) {
            return new ce2(Arrays.copyOf(this.t, i), this.a, true);
        }
        t94.g();
        return null;
    }

    public final void y(int i) {
        g();
        int i2 = this.a;
        int[] iArr = this.t;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.t = iArr2;
            iArr = iArr2;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        y(((Integer) obj).intValue());
        return true;
    }
}
