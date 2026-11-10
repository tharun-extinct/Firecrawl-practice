package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class sh0 extends o73 {
    public final ja3 g;
    public final my1 l;
    public final boolean n;
    public final boolean r;
    public final String v;
    public final o94 x;
    public final hb2 y;

    public sh0(ja3 ja3Var, hb2 hb2Var, boolean z, boolean z2, String str, o94 o94Var, my1 my1Var) {
        this.g = ja3Var;
        this.y = hb2Var;
        this.r = z;
        this.n = z2;
        this.v = str;
        this.x = o94Var;
        this.l = my1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sh0.class != obj.getClass()) {
            return false;
        }
        sh0 sh0Var = (sh0) obj;
        return yf2.p(this.g, sh0Var.g) && yf2.p(this.y, sh0Var.y) && this.r == sh0Var.r && this.n == sh0Var.n && yf2.p(this.v, sh0Var.v) && yf2.p(this.x, sh0Var.x) && this.l == sh0Var.l;
    }

    public final int hashCode() {
        ja3 ja3Var = this.g;
        int iHashCode = (ja3Var != null ? ja3Var.hashCode() : 0) * 31;
        hb2 hb2Var = this.y;
        int iL = xi3.l(xi3.l((iHashCode + (hb2Var != null ? hb2Var.hashCode() : 0)) * 31, 31, this.r), 31, this.n);
        String str = this.v;
        int iHashCode2 = (iL + (str != null ? str.hashCode() : 0)) * 31;
        o94 o94Var = this.x;
        return this.l.hashCode() + ((iHashCode2 + (o94Var != null ? Integer.hashCode(o94Var.g) : 0)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((vh0) i73Var).f1(this.g, this.y, this.r, this.n, this.v, this.x, this.l);
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new vh0(this.g, this.y, this.r, this.n, this.v, this.x, this.l);
    }
}
