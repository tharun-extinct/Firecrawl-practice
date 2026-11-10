package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class sj5 extends o73 {
    public final nc5 g;
    public final dm1 n;
    public final ek1 r;
    public final ho4 v;
    public final cc5 y;

    public sj5(nc5 nc5Var, cc5 cc5Var, ek1 ek1Var, dm1 dm1Var, ho4 ho4Var) {
        this.g = nc5Var;
        this.y = cc5Var;
        this.r = ek1Var;
        this.n = dm1Var;
        this.v = ho4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sj5) {
            sj5 sj5Var = (sj5) obj;
            return this.g == sj5Var.g && yf2.p(this.y, sj5Var.y) && this.r.equals(sj5Var.r) && yf2.p(this.n, sj5Var.n) && this.v == sj5Var.v;
        }
        return false;
    }

    public final int hashCode() {
        return this.v.hashCode() + ((this.n.hashCode() + ((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        uj5 uj5Var = (uj5) i73Var;
        uj5Var.getClass();
        uj5Var.o = this.y;
        uj5Var.f = this.r;
        uj5Var.k = this.n;
        uj5Var.d = this.v;
    }

    @Override // defpackage.o73
    public final i73 l() {
        uj5 uj5Var = new uj5();
        uj5Var.o = this.y;
        uj5Var.f = this.r;
        uj5Var.k = this.n;
        uj5Var.d = this.v;
        return uj5Var;
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.g + ", veilAnimation=" + this.y + ", enter=" + this.r + ", exit=" + this.n + ", mutableTransformState=" + this.v + ")";
    }
}
