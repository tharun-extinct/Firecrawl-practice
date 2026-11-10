package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class c14 extends a1 implements RandomAccess {
    public static final c14 m = new c14(new Object[0], 0, false);
    public int a;
    public Object[] t;

    public c14(Object[] objArr, int i, boolean z) {
        super(z);
        this.t = objArr;
        this.a = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        g();
        if (i < 0 || i > (i2 = this.a)) {
            l0.j(this.a, du4.p(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.t;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.t, i, objArr2, i + 1, this.a - i);
            this.t = objArr2;
        }
        this.t[i] = obj;
        this.a++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        y(i);
        return this.t[i];
    }

    @Override // defpackage.a1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        g();
        y(i);
        Object[] objArr = this.t;
        Object obj = objArr[i];
        int i2 = this.a;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.a--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        y(i);
        Object[] objArr = this.t;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    @Override // defpackage.df2
    public final df2 t(int i) {
        if (i >= this.a) {
            return new c14(Arrays.copyOf(this.t, i), this.a, true);
        }
        t94.g();
        return null;
    }

    public final void y(int i) {
        if (i < 0 || i >= this.a) {
            l0.j(this.a, du4.p(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.a;
        Object[] objArrCopyOf = this.t;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, ((i * 3) / 2) + 1);
            this.t = objArrCopyOf;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
