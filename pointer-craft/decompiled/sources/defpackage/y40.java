package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y40 extends o73 {
    public final float g;
    public final cn4 r;
    public final cu4 y;

    public y40(float f, cu4 cu4Var, cn4 cn4Var) {
        this.g = f;
        this.y = cu4Var;
        this.r = cn4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y40)) {
            return false;
        }
        y40 y40Var = (y40) obj;
        return vb1.y(this.g, y40Var.g) && this.y.equals(y40Var.y) && yf2.p(this.r, y40Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + ((this.y.hashCode() + (Float.hashCode(this.g) * 31)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        x40 x40Var = (x40) i73Var;
        float f = x40Var.d;
        ia0 ia0Var = x40Var.B;
        float f2 = this.g;
        if (!vb1.y(f, f2)) {
            x40Var.d = f2;
            ia0Var.Q0();
        }
        cu4 cu4Var = x40Var.e;
        cu4 cu4Var2 = this.y;
        if (!yf2.p(cu4Var, cu4Var2)) {
            x40Var.e = cu4Var2;
            ia0Var.Q0();
        }
        cn4 cn4Var = x40Var.A;
        cn4 cn4Var2 = this.r;
        if (yf2.p(cn4Var, cn4Var2)) {
            return;
        }
        x40Var.A = cn4Var2;
        ia0Var.Q0();
        br2.d(x40Var);
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new x40(this.g, this.y, this.r);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + vb1.r(this.g) + ", brush=" + this.y + ", shape=" + this.r + ")";
    }
}
