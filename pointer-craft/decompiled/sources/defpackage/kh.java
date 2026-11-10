package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class kh<S> extends o73 {
    public final cc5 g;
    public final oh r;
    public final ob3 y;

    public kh(cc5 cc5Var, ob3 ob3Var, oh ohVar) {
        this.g = cc5Var;
        this.y = ob3Var;
        this.r = ohVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        return yf2.p(khVar.g, this.g) && khVar.y.equals(this.y);
    }

    public final int hashCode() {
        int iHashCode = this.r.hashCode() * 31;
        cc5 cc5Var = this.g;
        return this.y.hashCode() + ((iHashCode + (cc5Var != null ? cc5Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        nh nhVar = (nh) i73Var;
        nhVar.o = this.g;
        nhVar.f = this.y;
        nhVar.k = this.r;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new nh(this.g, this.y, this.r);
    }
}
