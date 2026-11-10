package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vw0 extends o73 {
    public final wb5 g;
    public final ma2 j;
    public final b65 l;
    public final boolean n;
    public final mt2 r;
    public final rt1 t;
    public final boolean v;
    public final aj3 x;
    public final k65 y;

    public vw0(wb5 wb5Var, k65 k65Var, mt2 mt2Var, boolean z, boolean z2, aj3 aj3Var, b65 b65Var, ma2 ma2Var, rt1 rt1Var) {
        this.g = wb5Var;
        this.y = k65Var;
        this.r = mt2Var;
        this.n = z;
        this.v = z2;
        this.x = aj3Var;
        this.l = b65Var;
        this.j = ma2Var;
        this.t = rt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vw0) {
            vw0 vw0Var = (vw0) obj;
            if (this.g.equals(vw0Var.g) && this.y.equals(vw0Var.y) && this.r == vw0Var.r && this.n == vw0Var.n && this.v == vw0Var.v && this.x.equals(vw0Var.x) && this.l == vw0Var.l && yf2.p(this.j, vw0Var.j) && yf2.p(this.t, vw0Var.t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode() + ((this.j.hashCode() + ((this.l.hashCode() + ((this.x.hashCode() + xi3.l(xi3.l(xi3.l((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31, 31, this.n), 31, this.v), 31, false)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        yw0 yw0Var = (yw0) i73Var;
        boolean z = yw0Var.B;
        boolean z2 = z && !yw0Var.A;
        ma2 ma2Var = yw0Var.E;
        b65 b65Var = yw0Var.D;
        boolean z3 = this.n;
        boolean z4 = this.v;
        boolean z5 = z4 && !z3;
        yw0Var.k = this.g;
        k65 k65Var = this.y;
        yw0Var.d = k65Var;
        yw0Var.e = this.r;
        yw0Var.A = z3;
        yw0Var.B = z4;
        yw0Var.C = this.x;
        b65 b65Var2 = this.l;
        yw0Var.D = b65Var2;
        ma2 ma2Var2 = this.j;
        yw0Var.E = ma2Var2;
        yw0Var.F = this.t;
        if (z4 != z || z5 != z2 || !yf2.p(ma2Var2, ma2Var) || !u75.r(k65Var.y)) {
            br2.d(yw0Var);
        }
        if (b65Var2 != b65Var) {
            b65Var2.x = new ww0(yw0Var, (byte) 0);
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        yw0 yw0Var = new yw0();
        yw0Var.k = this.g;
        yw0Var.d = this.y;
        yw0Var.e = this.r;
        yw0Var.A = this.n;
        yw0Var.B = this.v;
        yw0Var.C = this.x;
        b65 b65Var = this.l;
        yw0Var.D = b65Var;
        yw0Var.E = this.j;
        yw0Var.F = this.t;
        b65Var.x = new ww0(yw0Var, (byte) 4);
        return yw0Var;
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.g + ", value=" + this.y + ", state=" + this.r + ", readOnly=" + this.n + ", enabled=" + this.v + ", isPassword=false, offsetMapping=" + this.x + ", manager=" + this.l + ", imeOptions=" + this.j + ", focusRequester=" + this.t + ")";
    }
}
