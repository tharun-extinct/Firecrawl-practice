package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class as5 extends o73 {
    public final da1 g;
    public final Object r;
    public final bz1 y;

    public as5(da1 da1Var, bz1 bz1Var, Object obj) {
        this.g = da1Var;
        this.y = bz1Var;
        this.r = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || as5.class != obj.getClass()) {
            return false;
        }
        as5 as5Var = (as5) obj;
        return this.g == as5Var.g && yf2.p(this.r, as5Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + xi3.l(this.g.hashCode() * 31, 31, false);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        cs5 cs5Var = (cs5) i73Var;
        cs5Var.o = this.g;
        cs5Var.f = this.y;
    }

    @Override // defpackage.o73
    public final i73 l() {
        cs5 cs5Var = new cs5();
        cs5Var.o = this.g;
        cs5Var.f = this.y;
        return cs5Var;
    }
}
