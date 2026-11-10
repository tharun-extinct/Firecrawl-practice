package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kk0 extends o73 {
    public final ja3 g;
    public final my1 y;

    public kk0(my1 my1Var, ja3 ja3Var) {
        this.g = ja3Var;
        this.y = my1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kk0.class != obj.getClass()) {
            return false;
        }
        kk0 kk0Var = (kk0) obj;
        return yf2.p(this.g, kk0Var.g) && this.y == kk0Var.y;
    }

    public final int hashCode() {
        ja3 ja3Var = this.g;
        return Boolean.hashCode(true) + ((this.y.hashCode() + xi3.l(xi3.l((ja3Var != null ? ja3Var.hashCode() : 0) * 961, 31, false), 29791, true)) * 923521);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        mk0 mk0Var = (mk0) i73Var;
        mk0Var.getClass();
        boolean z = !mk0Var.C;
        mk0Var.f1(this.g, null, false, true, null, null, this.y);
        if (z) {
            mk0Var.g1(false);
            mk0Var.g1(true);
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new mk0(this.y, this.g);
    }
}
