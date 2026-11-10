package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class g95 extends o73 {
    public final ve2 g;
    public final zu4 r;
    public final boolean y;

    public g95(ve2 ve2Var, boolean z, zu4 zu4Var) {
        this.g = ve2Var;
        this.y = z;
        this.r = zu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g95)) {
            return false;
        }
        g95 g95Var = (g95) obj;
        return yf2.p(this.g, g95Var.g) && this.y == g95Var.y && this.r.equals(g95Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + xi3.l(this.g.hashCode() * 31, 31, this.y);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        i95 i95Var = (i95) i73Var;
        i95Var.o = this.g;
        boolean z = i95Var.f;
        boolean z2 = this.y;
        if (z != z2) {
            c93.B(i95Var);
        }
        i95Var.f = z2;
        i95Var.k = this.r;
        if (i95Var.A == null && !Float.isNaN(i95Var.C)) {
            i95Var.A = c93.y(i95Var.C);
        }
        if (i95Var.e != null || Float.isNaN(i95Var.B)) {
            return;
        }
        i95Var.e = c93.y(i95Var.B);
    }

    @Override // defpackage.o73
    public final i73 l() {
        i95 i95Var = new i95();
        i95Var.o = this.g;
        i95Var.f = this.y;
        i95Var.k = this.r;
        i95Var.B = Float.NaN;
        i95Var.C = Float.NaN;
        return i95Var;
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.g + ", checked=" + this.y + ", animationSpec=" + this.r + ')';
    }
}
