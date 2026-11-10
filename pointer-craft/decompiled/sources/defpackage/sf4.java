package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class sf4 extends o73 {
    public final gg4 g;
    public final tb j;
    public final boolean l;
    public final bq1 n;
    public final boolean r;
    public final ja3 v;
    public final s60 x;
    public final um3 y;

    public sf4(tb tbVar, s60 s60Var, bq1 bq1Var, ja3 ja3Var, um3 um3Var, gg4 gg4Var, boolean z, boolean z2) {
        this.g = gg4Var;
        this.y = um3Var;
        this.r = z;
        this.n = bq1Var;
        this.v = ja3Var;
        this.x = s60Var;
        this.l = z2;
        this.j = tbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sf4.class != obj.getClass()) {
            return false;
        }
        sf4 sf4Var = (sf4) obj;
        return this.g.equals(sf4Var.g) && this.y == sf4Var.y && this.r == sf4Var.r && yf2.p(this.n, sf4Var.n) && yf2.p(this.v, sf4Var.v) && yf2.p(this.x, sf4Var.x) && this.l == sf4Var.l && yf2.p(this.j, sf4Var.j);
    }

    public final int hashCode() {
        int iL = xi3.l(xi3.l((this.y.hashCode() + (this.g.hashCode() * 31)) * 31, 31, this.r), 31, false);
        bq1 bq1Var = this.n;
        int iHashCode = (iL + (bq1Var != null ? bq1Var.hashCode() : 0)) * 31;
        ja3 ja3Var = this.v;
        int iHashCode2 = (iHashCode + (ja3Var != null ? ja3Var.hashCode() : 0)) * 31;
        s60 s60Var = this.x;
        int iL2 = xi3.l((iHashCode2 + (s60Var != null ? s60Var.hashCode() : 0)) * 31, 31, this.l);
        tb tbVar = this.j;
        return iL2 + (tbVar != null ? tbVar.hashCode() : 0);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ja3 ja3Var = this.v;
        ((tf4) i73Var).V0(this.j, this.x, this.n, ja3Var, this.y, this.g, this.l, this.r);
    }

    @Override // defpackage.o73
    public final i73 l() {
        tf4 tf4Var = new tf4();
        tf4Var.k = this.g;
        tf4Var.d = this.y;
        tf4Var.e = this.r;
        tf4Var.A = this.n;
        tf4Var.B = this.v;
        tf4Var.C = this.x;
        tf4Var.D = this.l;
        tf4Var.E = this.j;
        return tf4Var;
    }
}
