package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ci4 extends o73 {
    public final boolean g;
    public final boolean n;
    public final hb2 r;
    public final o94 v;
    public final my1 x;
    public final ja3 y;

    public ci4(boolean z, ja3 ja3Var, hb2 hb2Var, boolean z2, o94 o94Var, my1 my1Var) {
        this.g = z;
        this.y = ja3Var;
        this.r = hb2Var;
        this.n = z2;
        this.v = o94Var;
        this.x = my1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ci4.class != obj.getClass()) {
            return false;
        }
        ci4 ci4Var = (ci4) obj;
        return this.g == ci4Var.g && yf2.p(this.y, ci4Var.y) && yf2.p(this.r, ci4Var.r) && this.n == ci4Var.n && yf2.p(this.v, ci4Var.v) && this.x == ci4Var.x;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.g) * 31;
        ja3 ja3Var = this.y;
        int iHashCode2 = (iHashCode + (ja3Var != null ? ja3Var.hashCode() : 0)) * 31;
        hb2 hb2Var = this.r;
        int iL = xi3.l(xi3.l((iHashCode2 + (hb2Var != null ? hb2Var.hashCode() : 0)) * 31, 31, false), 31, this.n);
        o94 o94Var = this.v;
        return this.x.hashCode() + ((iL + (o94Var != null ? Integer.hashCode(o94Var.g) : 0)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ei4 ei4Var = (ei4) i73Var;
        boolean z = ei4Var.T;
        boolean z2 = this.g;
        if (z != z2) {
            ei4Var.T = z2;
            br2.d(ei4Var);
        }
        ei4Var.f1(this.y, this.r, false, this.n, null, this.v, this.x);
    }

    @Override // defpackage.o73
    public final i73 l() {
        ei4 ei4Var = new ei4(this.y, this.r, false, this.n, null, this.v, this.x);
        ei4Var.T = this.g;
        return ei4Var;
    }
}
