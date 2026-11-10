package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class a76 extends x46 implements RandomAccess, f76 {
    public static final int[] m;
    public static final a76 q;
    public int a;
    public int[] t;

    static {
        int[] iArr = new int[0];
        m = iArr;
        q = new a76(iArr, 0, false);
    }

    public a76(int[] iArr, int i, boolean z) {
        super(z);
        this.t = iArr;
        this.a = i;
    }

    public static a76 x() {
        return q;
    }

    public final void a(int i) {
        if (i < 0 || i >= this.a) {
            l0.p(du4.m(i, this.a, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        g();
        if (i < 0 || i > (i2 = this.a)) {
            l0.p(du4.m(i, this.a, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.t;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.t, 0, iArr2, 0, i);
            System.arraycopy(this.t, i, iArr2, i3, this.a - i);
            this.t = iArr2;
        }
        this.t[i] = iIntValue;
        this.a++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.x46, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = m76.g;
        collection.getClass();
        if (!(collection instanceof a76)) {
            return super.addAll(collection);
        }
        a76 a76Var = (a76) collection;
        int i = a76Var.a;
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
        System.arraycopy(a76Var.t, 0, iArrCopyOf, this.a, a76Var.a);
        this.a = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.x46, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a76)) {
            return super.equals(obj);
        }
        a76 a76Var = (a76) obj;
        if (this.a == a76Var.a) {
            int[] iArr = a76Var.t;
            for (int i = 0; i < this.a; i++) {
                if (this.t[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        a(i);
        return Integer.valueOf(this.t[i]);
    }

    @Override // defpackage.x46, java.util.AbstractList, java.util.Collection, java.util.List
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

    public final void j(int i) {
        int length = this.t.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.t = new int[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.t = Arrays.copyOf(this.t, length);
    }

    public final void l(int i) {
        g();
        int i2 = this.a;
        int[] iArr = this.t;
        int length = iArr.length;
        if (i2 == length) {
            iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.t, 0, iArr, 0, this.a);
            this.t = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        iArr[i3] = i;
    }

    @Override // defpackage.h76
    public final /* bridge */ /* synthetic */ h76 r(int i) {
        if (i >= this.a) {
            return new a76(i == 0 ? m : Arrays.copyOf(this.t, i), this.a, true);
        }
        t94.g();
        return null;
    }

    @Override // defpackage.x46, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        g();
        a(i);
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
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        g();
        a(i);
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
        a(i);
        return this.t[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        l(((Integer) obj).intValue());
        return true;
    }
}
