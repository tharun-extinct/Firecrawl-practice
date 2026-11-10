package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class nj1 extends o73 {
    public final nc5 g;
    public final my1 j;
    public final ho4 l;
    public final cc5 n;
    public final cc5 r;
    public final oj1 t;
    public final ek1 v;
    public final dm1 x;
    public final cc5 y;

    public nj1(nc5 nc5Var, cc5 cc5Var, cc5 cc5Var2, cc5 cc5Var3, ek1 ek1Var, dm1 dm1Var, ho4 ho4Var, my1 my1Var, oj1 oj1Var) {
        this.g = nc5Var;
        this.y = cc5Var;
        this.r = cc5Var2;
        this.n = cc5Var3;
        this.v = ek1Var;
        this.x = dm1Var;
        this.l = ho4Var;
        this.j = my1Var;
        this.t = oj1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nj1)) {
            return false;
        }
        nj1 nj1Var = (nj1) obj;
        return nj1Var.g == this.g && yf2.p(nj1Var.y, this.y) && yf2.p(nj1Var.r, this.r) && yf2.p(nj1Var.n, this.n) && nj1Var.v.equals(this.v) && yf2.p(nj1Var.x, this.x) && nj1Var.l == this.l && nj1Var.j == this.j && yf2.p(nj1Var.t, this.t);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        cc5 cc5Var = this.y;
        int iHashCode2 = (iHashCode + (cc5Var != null ? cc5Var.hashCode() : 0)) * 31;
        cc5 cc5Var2 = this.r;
        int iHashCode3 = (iHashCode2 + (cc5Var2 != null ? cc5Var2.hashCode() : 0)) * 31;
        cc5 cc5Var3 = this.n;
        return this.l.hashCode() + (this.t.hashCode() * 31) + ((this.j.hashCode() + ((this.x.hashCode() + ((this.v.hashCode() + ((iHashCode3 + (cc5Var3 != null ? cc5Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        dk1 dk1Var = (dk1) i73Var;
        dk1Var.o = this.g;
        dk1Var.f = this.y;
        dk1Var.k = this.r;
        dk1Var.d = this.n;
        dk1Var.e = this.v;
        dk1Var.A = this.x;
        dk1Var.B = this.l;
        dk1Var.C = this.j;
        dk1Var.D = this.t;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new dk1(this.g, this.y, this.r, this.n, this.v, this.x, this.l, this.j, this.t);
    }
}
