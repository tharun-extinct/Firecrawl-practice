package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fk3 extends o73 {
    public final xy1 g;

    public fk3(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fk3) {
            return this.g == ((fk3) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        gk3 gk3Var = (gk3) i73Var;
        gk3Var.o = this.g;
        gk3Var.f = -9223372034707292160L;
    }

    @Override // defpackage.o73
    public final i73 l() {
        gk3 gk3Var = new gk3();
        gk3Var.o = this.g;
        gk3Var.f = -9223372034707292160L;
        return gk3Var;
    }
}
