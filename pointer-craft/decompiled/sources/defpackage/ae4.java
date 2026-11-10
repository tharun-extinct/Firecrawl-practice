package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ae4 {
    public final float g;
    public final no1 r;
    public final long y;

    public ae4(float f, long j, no1 no1Var) {
        this.g = f;
        this.y = j;
        this.r = no1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae4)) {
            return false;
        }
        ae4 ae4Var = (ae4) obj;
        return Float.compare(this.g, ae4Var.g) == 0 && vb5.g(this.y, ae4Var.y) && yf2.p(this.r, ae4Var.r);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.g) * 31;
        int i = vb5.r;
        return this.r.hashCode() + xi3.v(iHashCode, 31, this.y);
    }

    public final String toString() {
        return "Scale(scale=" + this.g + ", transformOrigin=" + vb5.y(this.y) + ", animationSpec=" + this.r + ")";
    }
}
