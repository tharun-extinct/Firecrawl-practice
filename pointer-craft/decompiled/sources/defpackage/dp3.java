package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dp3 extends o73 {
    public final cp3 g;
    public final float n;
    public final yt0 r;
    public final m30 v;
    public final u6 y;

    public dp3(cp3 cp3Var, u6 u6Var, yt0 yt0Var, float f, m30 m30Var) {
        this.g = cp3Var;
        this.y = u6Var;
        this.r = yt0Var;
        this.n = f;
        this.v = m30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp3)) {
            return false;
        }
        dp3 dp3Var = (dp3) obj;
        return yf2.p(this.g, dp3Var.g) && yf2.p(this.y, dp3Var.y) && yf2.p(this.r, dp3Var.r) && Float.compare(this.n, dp3Var.n) == 0 && yf2.p(this.v, dp3Var.v);
    }

    public final int hashCode() {
        int iY = fj.y(this.n, (this.r.hashCode() + ((this.y.hashCode() + xi3.l(this.g.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        m30 m30Var = this.v;
        return iY + (m30Var == null ? 0 : m30Var.hashCode());
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ep3 ep3Var = (ep3) i73Var;
        boolean z = ep3Var.f;
        cp3 cp3Var = this.g;
        boolean z2 = (z && cq4.g(ep3Var.o.n(), cp3Var.n())) ? false : true;
        ep3Var.o = cp3Var;
        ep3Var.f = true;
        ep3Var.k = this.y;
        ep3Var.d = this.r;
        ep3Var.e = this.n;
        ep3Var.A = this.v;
        if (z2) {
            c93.B(ep3Var);
        }
        c93.A(ep3Var);
    }

    @Override // defpackage.o73
    public final i73 l() {
        ep3 ep3Var = new ep3();
        ep3Var.o = this.g;
        ep3Var.f = true;
        ep3Var.k = this.y;
        ep3Var.d = this.r;
        ep3Var.e = this.n;
        ep3Var.A = this.v;
        return ep3Var;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.g + ", sizeToIntrinsics=true, alignment=" + this.y + ", contentScale=" + this.r + ", alpha=" + this.n + ", colorFilter=" + this.v + ")";
    }
}
