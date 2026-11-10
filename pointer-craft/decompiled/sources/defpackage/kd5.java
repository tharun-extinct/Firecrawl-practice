package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kd5 extends o73 {
    public final ca5 g;
    public final boolean n;
    public final hb2 r;
    public final o94 v;
    public final my1 x;
    public final ja3 y;

    public kd5(ca5 ca5Var, ja3 ja3Var, hb2 hb2Var, boolean z, o94 o94Var, my1 my1Var) {
        this.g = ca5Var;
        this.y = ja3Var;
        this.r = hb2Var;
        this.n = z;
        this.v = o94Var;
        this.x = my1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kd5.class != obj.getClass()) {
            return false;
        }
        kd5 kd5Var = (kd5) obj;
        return this.g == kd5Var.g && yf2.p(this.y, kd5Var.y) && yf2.p(this.r, kd5Var.r) && this.n == kd5Var.n && this.v.equals(kd5Var.v) && this.x == kd5Var.x;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        ja3 ja3Var = this.y;
        int iHashCode2 = (iHashCode + (ja3Var != null ? ja3Var.hashCode() : 0)) * 31;
        hb2 hb2Var = this.r;
        return this.x.hashCode() + du4.r(this.v.g, xi3.l(xi3.l((iHashCode2 + (hb2Var != null ? hb2Var.hashCode() : 0)) * 31, 31, false), 31, this.n), 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ld5 ld5Var = (ld5) i73Var;
        ca5 ca5Var = ld5Var.T;
        ca5 ca5Var2 = this.g;
        if (ca5Var != ca5Var2) {
            ld5Var.T = ca5Var2;
            br2.d(ld5Var);
        }
        ld5Var.f1(this.y, this.r, false, this.n, null, this.v, this.x);
    }

    @Override // defpackage.o73
    public final i73 l() {
        ld5 ld5Var = new ld5(this.y, this.r, false, this.n, null, this.v, this.x);
        ld5Var.T = this.g;
        return ld5Var;
    }
}
