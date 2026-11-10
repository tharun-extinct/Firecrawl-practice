package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cy5 extends qx5 {
    public static final cy5 c = new cy5(0, new Object[0]);
    public final transient Object[] q;
    public final transient int w;

    public cy5(int i, Object[] objArr) {
        super((byte) 0);
        this.q = objArr;
        this.w = i;
    }

    @Override // defpackage.qx5, defpackage.fx5
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.q;
        int i = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zq2.G(i, this.w);
        Object obj = this.q[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.fx5
    public final int n() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }

    @Override // defpackage.fx5
    public final Object[] v() {
        return this.q;
    }

    @Override // defpackage.fx5
    public final int y() {
        return this.w;
    }
}
