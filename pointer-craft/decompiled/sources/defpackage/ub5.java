package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ub5 {
    public final double g;
    public final double l;
    public final double n;
    public final double r;
    public final double v;
    public final double x;
    public final double y;

    public ub5(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.g = d;
        this.y = d2;
        this.r = d3;
        this.n = d4;
        this.v = d5;
        this.x = d6;
        this.l = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            l0.u("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            l0.u("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            l0.u("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            l0.u("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            l0.u("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            l0.u("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub5)) {
            return false;
        }
        ub5 ub5Var = (ub5) obj;
        return Double.compare(this.g, ub5Var.g) == 0 && Double.compare(this.y, ub5Var.y) == 0 && Double.compare(this.r, ub5Var.r) == 0 && Double.compare(this.n, ub5Var.n) == 0 && Double.compare(this.v, ub5Var.v) == 0 && Double.compare(this.x, ub5Var.x) == 0 && Double.compare(this.l, ub5Var.l) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.l) + ((Double.hashCode(this.x) + ((Double.hashCode(this.v) + ((Double.hashCode(this.n) + ((Double.hashCode(this.r) + ((Double.hashCode(this.y) + (Double.hashCode(this.g) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.g + ", a=" + this.y + ", b=" + this.r + ", c=" + this.n + ", d=" + this.v + ", e=" + this.x + ", f=" + this.l + ")";
    }

    public /* synthetic */ ub5(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
