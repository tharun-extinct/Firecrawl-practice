package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pk2 implements j64, ix0 {
    public final ku0 a;
    public final fx0 j;
    public iv4 m;
    public final bz1 t;

    public pk2(fx0 fx0Var, bz1 bz1Var) {
        this.j = fx0Var;
        this.t = bz1Var;
        this.a = k33.x(fx0Var.b(this));
    }

    @Override // defpackage.fx0
    public final fx0 E(ex0 ex0Var) {
        return a11.f(this, ex0Var);
    }

    @Override // defpackage.fx0
    public final fx0 b(fx0 fx0Var) {
        return a11.k(this, fx0Var);
    }

    @Override // defpackage.fx0
    public final Object d(bz1 bz1Var, Object obj) {
        return bz1Var.l(obj, this);
    }

    @Override // defpackage.ix0
    public final void f(fx0 fx0Var, Throwable th) throws Throwable {
        wo0 wo0Var = (wo0) fx0Var.h(wo0.t);
        if (wo0Var != null) {
            yc6.r(th, new p2(wo0Var, this, (byte) 18));
        }
        ix0 ix0Var = (ix0) this.j.h(d93.t);
        if (ix0Var == null) {
            throw th;
        }
        ix0Var.f(fx0Var, th);
    }

    @Override // defpackage.j64
    public final void g() {
        iv4 iv4Var = this.m;
        if (iv4Var != null) {
            iv4Var.x(k33.v("Old job was still running!", null));
        }
        this.m = m50.T(this.a, null, this.t, 3);
    }

    @Override // defpackage.dx0
    public final ex0 getKey() {
        return d93.t;
    }

    @Override // defpackage.fx0
    public final dx0 h(ex0 ex0Var) {
        return a11.p(this, ex0Var);
    }

    @Override // defpackage.j64
    public final void n() {
        iv4 iv4Var = this.m;
        if (iv4Var != null) {
            iv4Var.K(new bw1((byte) 1));
        }
        this.m = null;
    }

    @Override // defpackage.j64
    public final void r() {
        iv4 iv4Var = this.m;
        if (iv4Var != null) {
            iv4Var.K(new bw1((byte) 1));
        }
        this.m = null;
    }
}
