package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hj6 extends ri6 {
    public static final hj6 c = new hj6(0, new Object[0]);
    public final transient Object[] q;
    public final transient boolean w;

    /* JADX WARN: Multi-variable type inference failed */
    public hj6(int i, Object[] objArr) {
        super((byte) 1);
        this.q = objArr;
        this.w = i;
    }

    @Override // defpackage.ri6, defpackage.fx5
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.q;
        boolean z = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, z ? 1 : 0);
        return z ? 1 : 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        v13.N(i, this.w ? 1 : 0);
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
        return this.w ? 1 : 0;
    }

    @Override // defpackage.fx5
    public final Object[] v() {
        return this.q;
    }

    @Override // defpackage.fx5
    public final int y() {
        return this.w ? 1 : 0;
    }
}
