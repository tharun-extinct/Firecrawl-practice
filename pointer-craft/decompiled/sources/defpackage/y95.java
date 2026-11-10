package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class y95 extends o73 {
    public final boolean g;
    public final boolean n;
    public final hb2 r;
    public final o94 v;
    public final xy1 x;
    public final ja3 y;

    public y95(boolean z, ja3 ja3Var, hb2 hb2Var, boolean z2, o94 o94Var, xy1 xy1Var) {
        this.g = z;
        this.y = ja3Var;
        this.r = hb2Var;
        this.n = z2;
        this.v = o94Var;
        this.x = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y95.class != obj.getClass()) {
            return false;
        }
        y95 y95Var = (y95) obj;
        return this.g == y95Var.g && yf2.p(this.y, y95Var.y) && yf2.p(this.r, y95Var.r) && this.n == y95Var.n && yf2.p(this.v, y95Var.v) && this.x == y95Var.x;
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
        ba5 ba5Var = (ba5) i73Var;
        boolean z = ba5Var.T;
        boolean z2 = this.g;
        if (z != z2) {
            ba5Var.T = z2;
            br2.d(ba5Var);
        }
        ba5Var.U = this.x;
        ba5Var.f1(this.y, this.r, false, this.n, null, this.v, ba5Var.V);
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new ba5(this.g, this.y, this.r, this.n, this.v, this.x);
    }
}
