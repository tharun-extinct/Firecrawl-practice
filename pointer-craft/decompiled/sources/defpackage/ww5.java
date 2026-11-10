package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ww5 extends zw5 {
    public final transient int a;
    public final transient int m;
    public final /* synthetic */ zw5 q;

    public ww5(zw5 zw5Var, int i, int i2) {
        this.q = zw5Var;
        this.a = i;
        this.m = i2;
    }

    @Override // defpackage.ow5
    public final Object[] g() {
        return this.q.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        jd6.r(i, this.m);
        return this.q.get(i + this.a);
    }

    @Override // defpackage.zw5, java.util.List
    /* JADX INFO: renamed from: l */
    public final zw5 subList(int i, int i2) {
        jd6.n(i, i2, this.m);
        int i3 = this.a;
        return this.q.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.ow5
    public final int n() {
        return this.q.y() + this.a + this.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m;
    }

    @Override // defpackage.ow5
    public final int y() {
        return this.q.y() + this.a;
    }
}
