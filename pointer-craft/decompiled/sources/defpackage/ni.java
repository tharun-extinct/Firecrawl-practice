package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ni {
    public final te5 g;
    public long l;
    public final my1 n;
    public final long r;
    public final tp3 v;
    public vi x;
    public final Object y;
    public long j = Long.MIN_VALUE;
    public final tp3 t = kq2.M(Boolean.TRUE);

    public ni(Object obj, te5 te5Var, vi viVar, long j, Object obj2, long j2, my1 my1Var) {
        this.g = te5Var;
        this.y = obj2;
        this.r = j2;
        this.n = my1Var;
        this.v = kq2.M(obj);
        this.x = og0.u(viVar);
        this.l = j;
    }

    public final void g() {
        this.t.setValue(Boolean.FALSE);
        this.n.g();
    }

    public final Object y() {
        return this.g.y.a(this.x);
    }
}
