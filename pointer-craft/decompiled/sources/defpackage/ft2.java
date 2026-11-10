package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ft2 extends o73 {
    public final uc g;
    public final b65 r;
    public final mt2 y;

    public ft2(uc ucVar, mt2 mt2Var, b65 b65Var) {
        this.g = ucVar;
        this.y = mt2Var;
        this.r = b65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ft2) {
            ft2 ft2Var = (ft2) obj;
            return yf2.p(this.g, ft2Var.g) && this.y == ft2Var.y && this.r == ft2Var.r;
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        gt2 gt2Var = (gt2) i73Var;
        if (gt2Var.h) {
            gt2Var.o.l();
            gt2Var.o.m(gt2Var);
        }
        uc ucVar = this.g;
        gt2Var.o = ucVar;
        if (gt2Var.h) {
            if (ucVar.g != null) {
                pc2.r("Expected textInputModifierNode to be null");
            }
            ucVar.g = gt2Var;
        }
        gt2Var.f = this.y;
        gt2Var.k = this.r;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new gt2(this.g, this.y, this.r);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.g + ", legacyTextFieldState=" + this.y + ", textFieldSelectionManager=" + this.r + ")";
    }
}
