package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gj6 extends qi6 {
    public static final gj6 q = new gj6(0, new Object[0]);
    public final transient Object[] a;
    public final transient int m;

    public gj6(int i, Object[] objArr) {
        this.a = objArr;
        this.m = i;
    }

    @Override // defpackage.qi6, defpackage.te6
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.a;
        int i = this.m;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yc6.n(i, this.m);
        Object obj = this.a[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.te6
    public final int n() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m;
    }

    @Override // defpackage.te6
    public final Object[] v() {
        return this.a;
    }

    @Override // defpackage.te6
    public final int y() {
        return this.m;
    }
}
