package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ab5 implements ya5 {
    public final ac3 g;
    public ib0 r;
    public final pb3 y = new pb3(Boolean.FALSE);

    public ab5(ac3 ac3Var) {
        this.g = ac3Var;
    }

    @Override // defpackage.ya5
    public final void dismiss() {
        this.y.r.setValue(Boolean.FALSE);
    }

    @Override // defpackage.ya5
    public final void g() {
        ib0 ib0Var = this.r;
        if (ib0Var != null) {
            ib0Var.s(null);
        }
    }

    @Override // defpackage.ya5
    public final boolean isVisible() {
        pb3 pb3Var = this.y;
        return ((Boolean) pb3Var.y.getValue()).booleanValue() || ((Boolean) pb3Var.r.getValue()).booleanValue();
    }

    @Override // defpackage.ya5
    public final pb3 r() {
        return this.y;
    }

    @Override // defpackage.ya5
    public final Object y(ub3 ub3Var, zz4 zz4Var) {
        za5 za5Var = new za5(this, new yz(this, null, (byte) 3), ub3Var, null);
        ac3 ac3Var = this.g;
        ac3Var.getClass();
        Object objB = k33.B(new jf2(ub3Var, ac3Var, za5Var, null, (byte) 1), zz4Var);
        return objB == px0.j ? objB : og5.g;
    }
}
