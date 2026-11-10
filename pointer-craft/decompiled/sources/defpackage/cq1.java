package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cq1 {
    public final float g;
    public final long r;
    public final float y;

    public cq1(float f, float f2, long j) {
        this.g = f;
        this.y = f2;
        this.r = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq1)) {
            return false;
        }
        cq1 cq1Var = (cq1) obj;
        return Float.compare(this.g, cq1Var.g) == 0 && Float.compare(this.y, cq1Var.y) == 0 && this.r == cq1Var.r;
    }

    public final float g(long j) {
        long j2 = this.r;
        return Math.signum(this.g) * this.y * yb.y(j2 > 0 ? j / j2 : 1.0f).g;
    }

    public final int hashCode() {
        return Long.hashCode(this.r) + fj.y(this.y, Float.hashCode(this.g) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbU = du4.u("FlingInfo(initialVelocity=", this.g, ", distance=", this.y, ", duration=");
        sbU.append(this.r);
        sbU.append(")");
        return sbU.toString();
    }

    public final float y(long j) {
        long j2 = this.r;
        return (((Math.signum(this.g) * yb.y(j2 > 0 ? j / j2 : 1.0f).y) * this.y) / j2) * 1000.0f;
    }
}
