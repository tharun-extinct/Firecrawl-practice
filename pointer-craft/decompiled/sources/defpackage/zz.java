package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zz implements ya5 {
    public final ac3 g;
    public ib0 n;
    public final pb3 r;
    public final tp3 y;

    public zz(ac3 ac3Var) {
        this.g = ac3Var;
        Boolean bool = Boolean.FALSE;
        this.y = kq2.M(bool);
        this.r = new pb3(bool);
    }

    @Override // defpackage.ya5
    public final void dismiss() {
        this.y.setValue(Boolean.FALSE);
    }

    @Override // defpackage.ya5
    public final void g() {
        ib0 ib0Var = this.n;
        if (ib0Var != null) {
            ib0Var.s(null);
        }
    }

    @Override // defpackage.ya5
    public final boolean isVisible() {
        return ((Boolean) this.y.getValue()).booleanValue();
    }

    @Override // defpackage.ya5
    public final pb3 r() {
        return this.r;
    }

    @Override // defpackage.ya5
    public final Object y(ub3 ub3Var, zz4 zz4Var) {
        mu0 mu0Var = null;
        xz xzVar = new xz(this, new yz(this, mu0Var, (byte) 0), null);
        ac3 ac3Var = this.g;
        ac3Var.getClass();
        Object objB = k33.B(new jf2(ub3Var, ac3Var, xzVar, mu0Var, (byte) 1), zz4Var);
        return objB == px0.j ? objB : og5.g;
    }
}
