package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r95 {
    public final long g;
    public final long r;
    public final long y;

    public r95() {
        aj6 aj6Var = mf1.j;
        long jX = ye6.x(45);
        long jX2 = ye6.x(5);
        long jX3 = ye6.x(5);
        this.g = jX;
        this.y = jX2;
        this.r = jX3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r95)) {
            return false;
        }
        r95 r95Var = (r95) obj;
        long j = r95Var.g;
        aj6 aj6Var = mf1.j;
        return this.g == j && this.y == r95Var.y && this.r == r95Var.r;
    }

    public final int hashCode() {
        aj6 aj6Var = mf1.j;
        return t32.s.hashCode() + xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) mf1.t(this.g)) + ", additionalTime=" + ((Object) mf1.t(this.y)) + ", idleTimeout=" + ((Object) mf1.t(this.r)) + ", timeSource=" + t32.s + ')';
    }
}
