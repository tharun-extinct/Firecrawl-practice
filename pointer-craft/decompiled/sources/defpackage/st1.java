package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class st1 extends o73 {
    public final rt1 g;

    public st1(rt1 rt1Var) {
        this.g = rt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof st1) && yf2.p(this.g, ((st1) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ut1 ut1Var = (ut1) i73Var;
        ut1Var.o.g.q(ut1Var);
        rt1 rt1Var = this.g;
        ut1Var.o = rt1Var;
        rt1Var.g.y(ut1Var);
    }

    @Override // defpackage.o73
    public final i73 l() {
        ut1 ut1Var = new ut1();
        ut1Var.o = this.g;
        return ut1Var;
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.g + ")";
    }
}
