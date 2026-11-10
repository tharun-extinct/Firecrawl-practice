package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yz5 extends a06 {
    public final transient int a;
    public final transient int m;
    public final /* synthetic */ a06 q;

    public yz5(a06 a06Var, int i, int i2) {
        this.q = a06Var;
        this.a = i;
        this.m = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jr2.G(i, this.m);
        return this.q.get(i + this.a);
    }

    @Override // defpackage.a06, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final a06 subList(int i, int i2) {
        jr2.I(i, i2, this.m);
        int i3 = this.a;
        return this.q.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.tz5
    public final Object[] l() {
        return this.q.l();
    }

    @Override // defpackage.tz5
    public final int n() {
        return this.q.n() + this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m;
    }

    @Override // defpackage.tz5
    public final boolean x() {
        return true;
    }

    @Override // defpackage.tz5
    public final int y() {
        return this.q.n() + this.a + this.m;
    }
}
