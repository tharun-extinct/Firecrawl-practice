package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class xr2 extends o73 {
    public final my1 g;
    public final boolean n;
    public final um3 r;
    public final tr2 y;

    public xr2(my1 my1Var, tr2 tr2Var, um3 um3Var, boolean z) {
        this.g = my1Var;
        this.y = tr2Var;
        this.r = um3Var;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr2)) {
            return false;
        }
        xr2 xr2Var = (xr2) obj;
        return this.g == xr2Var.g && yf2.p(this.y, xr2Var.y) && this.r == xr2Var.r && this.n == xr2Var.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xi3.l((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31, 31, this.n);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        as2 as2Var = (as2) i73Var;
        as2Var.o = this.g;
        as2Var.f = this.y;
        um3 um3Var = as2Var.k;
        um3 um3Var2 = this.r;
        if (um3Var != um3Var2) {
            as2Var.k = um3Var2;
            br2.d(as2Var);
        }
        boolean z = as2Var.d;
        boolean z2 = this.n;
        if (z == z2) {
            return;
        }
        as2Var.d = z2;
        as2Var.Q0();
        br2.d(as2Var);
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new as2(this.g, this.y, this.r, this.n);
    }
}
