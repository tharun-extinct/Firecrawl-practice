package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class n96 extends x46 implements RandomAccess {
    public static final Object[] m;
    public static final n96 q;
    public int a;
    public Object[] t;

    static {
        Object[] objArr = new Object[0];
        m = objArr;
        q = new n96(objArr, 0, false);
    }

    public n96(Object[] objArr, int i, boolean z) {
        super(z);
        this.t = objArr;
        this.a = i;
    }

    public static n96 v() {
        return q;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        g();
        if (i < 0 || i > (i2 = this.a)) {
            l0.p(du4.m(i, this.a, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.t;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.t, 0, objArr2, 0, i);
            System.arraycopy(this.t, i, objArr2, i3, this.a - i);
            this.t = objArr2;
        }
        this.t[i] = obj;
        this.a++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        x(i);
        return this.t[i];
    }

    @Override // defpackage.h76
    public final /* bridge */ /* synthetic */ h76 r(int i) {
        if (i >= this.a) {
            return new n96(i == 0 ? m : Arrays.copyOf(this.t, i), this.a, true);
        }
        t94.g();
        return null;
    }

    @Override // defpackage.x46, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        g();
        x(i);
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
        x(i);
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

    public final void x(int i) {
        if (i < 0 || i >= this.a) {
            l0.p(du4.m(i, this.a, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.a;
        Object[] objArrCopyOf = this.t;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(this.t, Math.max(((length * 3) / 2) + 1, 10));
            this.t = objArrCopyOf;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
