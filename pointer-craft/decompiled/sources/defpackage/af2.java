package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class af2 implements s73 {
    public final qf a;
    public ib0 c;
    public final ox0 j;
    public final Object m;
    public byte q;
    public final ym0 t;
    public long w;

    public af2(s95 s95Var) {
        ym0 ym0Var = new ym0((byte) 27);
        this.j = s95Var;
        this.t = ym0Var;
        this.a = new qf(new qd(this, (byte) 20));
        this.m = new Object();
        this.q = (byte) 5;
    }

    @Override // defpackage.fx0
    public final fx0 E(ex0 ex0Var) {
        return a11.f(this, ex0Var);
    }

    @Override // defpackage.s73
    public final Object I(mu0 mu0Var, xy1 xy1Var) {
        return this.a.I(mu0Var, xy1Var);
    }

    @Override // defpackage.fx0
    public final fx0 b(fx0 fx0Var) {
        return a11.k(this, fx0Var);
    }

    @Override // defpackage.fx0
    public final Object d(bz1 bz1Var, Object obj) {
        return bz1Var.l(obj, this);
    }

    public final void g() {
        synchronized (this.m) {
            ib0 ib0Var = this.c;
            if (ib0Var != null) {
                ib0Var.s(null);
            }
        }
    }

    @Override // defpackage.fx0
    public final dx0 h(ex0 ex0Var) {
        return a11.p(this, ex0Var);
    }
}
