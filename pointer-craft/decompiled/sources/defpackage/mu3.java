package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mu3 extends o73 {
    public final ud g;

    public mu3(ud udVar) {
        this.g = udVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu3) && this.g.equals(((mu3) obj).g);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.g.hashCode() * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        nu3 nu3Var = (nu3) i73Var;
        ud udVar = nu3Var.f;
        ud udVar2 = this.g;
        if (yf2.p(udVar, udVar2)) {
            return;
        }
        nu3Var.f = udVar2;
        if (nu3Var.k) {
            nu3Var.S0();
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new nu3(this.g, null);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.g + ", overrideDescendants=false)";
    }
}
