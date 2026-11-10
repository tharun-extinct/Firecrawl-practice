package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rx3 implements jk4 {
    public final jk4 g;
    public final String y;

    public rx3(jk4 jk4Var) {
        jk4Var.getClass();
        this.g = jk4Var;
        this.y = jk4Var.g() + "Array";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx3)) {
            return false;
        }
        rx3 rx3Var = (rx3) obj;
        return yf2.p(this.g, rx3Var.g) && this.y.equals(rx3Var.y);
    }

    @Override // defpackage.jk4
    public final String g() {
        return this.y;
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    @Override // defpackage.jk4
    public final String n(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.jk4
    public final int r() {
        return 1;
    }

    public final String toString() {
        return this.y + '(' + this.g + ')';
    }

    @Override // defpackage.jk4
    public final jk4 x(int i) {
        if (i >= 0) {
            return this.g;
        }
        l0.t(du4.b(du4.p(i, "Illegal index ", ", "), this.y, " expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.jk4
    public final tx3 y() {
        return cy4.r;
    }
}
