package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class dx5 extends zw5 {
    public static final dx5 q = new dx5(0, new Object[0]);
    public final transient Object[] a;
    public final transient int m;

    public dx5(int i, Object[] objArr) {
        this.a = objArr;
        this.m = i;
    }

    @Override // defpackage.ow5
    public final Object[] g() {
        return this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jd6.r(i, this.m);
        Object obj = this.a[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.ow5
    public final int n() {
        return this.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m;
    }

    @Override // defpackage.zw5, defpackage.ow5
    public final int v(Object[] objArr) {
        Object[] objArr2 = this.a;
        int i = this.m;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.ow5
    public final int y() {
        return 0;
    }
}
