package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class n30 extends o73 {
    public final xy1 g;

    public n30(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n30) {
            return this.g == ((n30) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        gh3 gh3Var;
        o30 o30Var = (o30) i73Var;
        xy1 xy1Var = this.g;
        o30Var.o = xy1Var;
        if (o30Var.j.h && (gh3Var = k33.T(o30Var, 2).C) != null) {
            gh3Var.y1(xy1Var, true);
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new o30(this.g);
    }
}
