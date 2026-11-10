package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xt2 implements du2, ox0 {
    public final ju2 j;
    public final fx0 t;

    public xt2(ju2 ju2Var, fx0 fx0Var) {
        fx0Var.getClass();
        this.j = ju2Var;
        this.t = fx0Var;
        if (ju2Var.t == wt2.j) {
            v70.a(fx0Var, null);
        }
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        ju2 ju2Var = this.j;
        if (ju2Var.t.compareTo(wt2.j) <= 0) {
            ju2Var.x(this);
            v70.a(this.t, null);
        }
    }

    @Override // defpackage.ox0
    public final fx0 w() {
        return this.t;
    }
}
