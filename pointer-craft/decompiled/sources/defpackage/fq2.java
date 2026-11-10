package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fq2 extends o73 {
    public final jq2 g;
    public final um3 r;
    public final y22 y;

    public fq2(jq2 jq2Var, y22 y22Var, um3 um3Var) {
        this.g = jq2Var;
        this.y = y22Var;
        this.r = um3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq2)) {
            return false;
        }
        fq2 fq2Var = (fq2) obj;
        return yf2.p(this.g, fq2Var.g) && yf2.p(this.y, fq2Var.y) && this.r == fq2Var.r;
    }

    public final int hashCode() {
        return this.r.hashCode() + xi3.l((this.y.hashCode() + (this.g.hashCode() * 31)) * 31, 31, false);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        iq2 iq2Var = (iq2) i73Var;
        iq2Var.o = this.g;
        iq2Var.f = this.y;
        iq2Var.k = this.r;
    }

    @Override // defpackage.o73
    public final i73 l() {
        iq2 iq2Var = new iq2();
        iq2Var.o = this.g;
        iq2Var.f = this.y;
        iq2Var.k = this.r;
        return iq2Var;
    }
}
