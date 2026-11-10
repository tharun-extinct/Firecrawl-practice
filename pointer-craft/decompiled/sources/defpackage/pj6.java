package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pj6 extends qi6 {
    public final transient Object[] a;
    public final transient boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public pj6(int i, Object[] objArr) {
        this.a = objArr;
        this.m = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yc6.n(i, 1);
        Object obj = this.a[i + i + (this.m ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }
}
