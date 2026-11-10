package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r06 extends a06 {
    public static final r06 q = new r06(0, new Object[0]);
    public final transient Object[] a;
    public final transient int m;

    public r06(int i, Object[] objArr) {
        this.a = objArr;
        this.m = i;
    }

    @Override // defpackage.a06, defpackage.tz5
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.a;
        int i = this.m;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jr2.G(i, this.m);
        Object obj = this.a[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.tz5
    public final Object[] l() {
        return this.a;
    }

    @Override // defpackage.tz5
    public final int n() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m;
    }

    @Override // defpackage.tz5
    public final boolean x() {
        return false;
    }

    @Override // defpackage.tz5
    public final int y() {
        return this.m;
    }
}
