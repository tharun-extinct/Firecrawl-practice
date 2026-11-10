package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uh6 extends qi6 {
    public final transient int a;
    public final transient int m;
    public final /* synthetic */ qi6 q;

    public uh6(qi6 qi6Var, int i, int i2) {
        this.q = qi6Var;
        this.a = i;
        this.m = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yc6.n(i, this.m);
        return this.q.get(i + this.a);
    }

    @Override // defpackage.te6
    public final int n() {
        return this.q.n() + this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m;
    }

    @Override // defpackage.te6
    public final Object[] v() {
        return this.q.v();
    }

    @Override // defpackage.qi6, java.util.List
    /* JADX INFO: renamed from: x */
    public final qi6 subList(int i, int i2) {
        yc6.v(i, i2, this.m);
        int i3 = this.a;
        return this.q.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.te6
    public final int y() {
        return this.q.n() + this.a + this.m;
    }
}
