package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g15 extends o73 {
    public final tp3 g;
    public final zu4 r;
    public final int y;

    public g15(tp3 tp3Var, int i, zu4 zu4Var) {
        this.g = tp3Var;
        this.y = i;
        this.r = zu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g15) {
            g15 g15Var = (g15) obj;
            if (this.g == g15Var.g && this.y == g15Var.y && this.r.equals(g15Var.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode() + xi3.l(du4.r(this.y, this.g.hashCode() * 31, 31), 31, false);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        i15 i15Var = (i15) i73Var;
        i15Var.o = this.g;
        i15Var.f = this.y;
        i15Var.k = this.r;
    }

    @Override // defpackage.o73
    public final i73 l() {
        i15 i15Var = new i15();
        i15Var.o = this.g;
        i15Var.f = this.y;
        i15Var.k = this.r;
        return i15Var;
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.g + ", selectedTabIndex=" + this.y + ", followContentSize=false, animationSpec=" + this.r + ')';
    }
}
