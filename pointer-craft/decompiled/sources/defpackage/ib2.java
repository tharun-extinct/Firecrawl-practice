package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ib2 extends o73 {
    public final boolean g;
    public final t45 n;
    public final ve2 r;
    public final cn4 v;
    public final boolean y;

    public ib2(boolean z, boolean z2, ve2 ve2Var, t45 t45Var, cn4 cn4Var) {
        this.g = z;
        this.y = z2;
        this.r = ve2Var;
        this.n = t45Var;
        this.v = cn4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib2)) {
            return false;
        }
        ib2 ib2Var = (ib2) obj;
        return this.g == ib2Var.g && this.y == ib2Var.y && yf2.p(this.r, ib2Var.r) && yf2.p(this.n, ib2Var.n) && yf2.p(this.v, ib2Var.v) && vb1.y(2.0f, 2.0f) && vb1.y(1.0f, 1.0f);
    }

    public final int hashCode() {
        int iHashCode = (this.r.hashCode() + xi3.l(Boolean.hashCode(this.g) * 31, 31, this.y)) * 31;
        t45 t45Var = this.n;
        int iHashCode2 = (iHashCode + (t45Var == null ? 0 : t45Var.hashCode())) * 31;
        cn4 cn4Var = this.v;
        return Float.hashCode(1.0f) + fj.y(2.0f, (iHashCode2 + (cn4Var != null ? cn4Var.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        boolean z;
        kb2 kb2Var = (kb2) i73Var;
        boolean z2 = kb2Var.k;
        boolean z3 = this.g;
        boolean z4 = true;
        if (z2 != z3) {
            kb2Var.k = z3;
            z = true;
        } else {
            z = false;
        }
        boolean z5 = kb2Var.d;
        boolean z6 = this.y;
        if (z5 != z6) {
            kb2Var.d = z6;
            z = true;
        }
        ve2 ve2Var = kb2Var.e;
        ve2 ve2Var2 = this.r;
        if (ve2Var != ve2Var2) {
            kb2Var.e = ve2Var2;
            iv4 iv4Var = kb2Var.D;
            mu0 mu0Var = null;
            if (iv4Var != null) {
                iv4Var.x(null);
            }
            kb2Var.D = m50.T(kb2Var.E0(), null, new jb2(kb2Var, mu0Var, (byte) 3), 3);
        }
        t45 t45Var = kb2Var.E;
        t45 t45Var2 = this.n;
        if (!yf2.p(t45Var, t45Var2)) {
            kb2Var.E = t45Var2;
            z = true;
        }
        cn4 cn4Var = kb2Var.G;
        cn4 cn4Var2 = this.v;
        if (!yf2.p(cn4Var, cn4Var2)) {
            if (!yf2.p(kb2Var.G, cn4Var2)) {
                kb2Var.G = cn4Var2;
                kb2Var.I.Q0();
            }
            z = true;
        }
        if (!vb1.y(kb2Var.A, 2.0f)) {
            kb2Var.A = 2.0f;
            z = true;
        }
        if (vb1.y(kb2Var.B, 1.0f)) {
            z4 = z;
        } else {
            kb2Var.B = 1.0f;
        }
        if (z4) {
            kb2Var.T0();
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new kb2(this.g, this.y, this.r, this.n, this.v);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.g + ", isError=" + this.y + ", interactionSource=" + this.r + ", colors=" + this.n + ", textFieldShape=" + this.v + ", focusedIndicatorLineThickness=" + ((Object) vb1.r(2.0f)) + ", unfocusedIndicatorLineThickness=" + ((Object) vb1.r(1.0f)) + ')';
    }
}
