package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ni2 extends o73 {
    public final xy1 g;
    public final xy1 y;

    public ni2(xy1 xy1Var, xy1 xy1Var2) {
        this.g = xy1Var;
        this.y = xy1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni2)) {
            return false;
        }
        ni2 ni2Var = (ni2) obj;
        return this.g == ni2Var.g && this.y == ni2Var.y;
    }

    public final int hashCode() {
        xy1 xy1Var = this.g;
        int iHashCode = (xy1Var != null ? xy1Var.hashCode() : 0) * 31;
        xy1 xy1Var2 = this.y;
        return iHashCode + (xy1Var2 != null ? xy1Var2.hashCode() : 0);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        pi2 pi2Var = (pi2) i73Var;
        pi2Var.o = this.g;
        pi2Var.f = this.y;
    }

    @Override // defpackage.o73
    public final i73 l() {
        pi2 pi2Var = new pi2();
        pi2Var.o = this.g;
        pi2Var.f = this.y;
        return pi2Var;
    }
}
