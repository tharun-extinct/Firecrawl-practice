package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sy5 extends qx5 {
    public final transient int c;
    public final transient Object[] q;
    public final transient boolean w;

    /* JADX WARN: Multi-variable type inference failed */
    public sy5(Object[] objArr, int i, int i2) {
        super((byte) 0);
        this.q = objArr;
        this.w = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zq2.G(i, this.c);
        Object obj = this.q[i + i + (this.w ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
