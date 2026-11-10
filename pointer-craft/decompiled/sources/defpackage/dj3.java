package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dj3 extends o73 {
    public final xy1 g;

    public dj3(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        dj3 dj3Var = obj instanceof dj3 ? (dj3) obj : null;
        return dj3Var != null && this.g == dj3Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.g.hashCode() * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ej3 ej3Var = (ej3) i73Var;
        xy1 xy1Var = ej3Var.o;
        xy1 xy1Var2 = this.g;
        if (xy1Var != xy1Var2 || !ej3Var.f) {
            k33.V(ej3Var).W(false);
        }
        ej3Var.o = xy1Var2;
        ej3Var.f = true;
    }

    @Override // defpackage.o73
    public final i73 l() {
        ej3 ej3Var = new ej3();
        ej3Var.o = this.g;
        ej3Var.f = true;
        return ej3Var;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.g + ", rtlAware=true)";
    }
}
