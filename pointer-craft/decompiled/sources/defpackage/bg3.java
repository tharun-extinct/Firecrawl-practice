package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bg3 extends o73 {
    public final xf3 g;
    public final ag3 y;

    public bg3(xf3 xf3Var, ag3 ag3Var) {
        this.g = xf3Var;
        this.y = ag3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg3)) {
            return false;
        }
        bg3 bg3Var = (bg3) obj;
        return yf2.p(bg3Var.g, this.g) && yf2.p(bg3Var.y, this.y);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        ag3 ag3Var = this.y;
        return iHashCode + (ag3Var != null ? ag3Var.hashCode() : 0);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        eg3 eg3Var = (eg3) i73Var;
        eg3Var.o = this.g;
        ag3 ag3Var = eg3Var.f;
        if (ag3Var.g == eg3Var) {
            ag3Var.g = null;
            ag3Var.n = null;
            ag3Var.r = og0.z;
        }
        ag3 ag3Var2 = this.y;
        if (ag3Var2 == null) {
            ag3Var = new ag3();
            eg3Var.f = ag3Var;
        } else if (ag3Var2 != ag3Var) {
            eg3Var.f = ag3Var2;
            ag3Var = ag3Var2;
        }
        if (eg3Var.h) {
            ag3Var.g = eg3Var;
            ag3Var.y = null;
            eg3Var.k = null;
            ag3Var.r = new gf(eg3Var, (byte) 22);
            ag3Var.n = eg3Var.E0();
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new eg3(this.g, this.y);
    }
}
