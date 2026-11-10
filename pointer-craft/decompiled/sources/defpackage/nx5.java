package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nx5 extends qx5 {
    public final /* synthetic */ qx5 c;
    public final transient int q;
    public final transient int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx5(qx5 qx5Var, int i, int i2) {
        super((byte) 0);
        this.c = qx5Var;
        this.q = i;
        this.w = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zq2.G(i, this.w);
        return this.c.get(i + this.q);
    }

    @Override // defpackage.fx5
    public final int n() {
        return this.c.n() + this.q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }

    @Override // defpackage.fx5
    public final Object[] v() {
        return this.c.v();
    }

    @Override // defpackage.qx5, java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final qx5 subList(int i, int i2) {
        zq2.I(i, i2, this.w);
        int i3 = this.q;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.fx5
    public final int y() {
        return this.c.n() + this.q + this.w;
    }
}
