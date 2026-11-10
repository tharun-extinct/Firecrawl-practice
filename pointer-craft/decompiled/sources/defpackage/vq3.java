package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vq3 extends fr3 {
    public final float j;
    public final boolean l;
    public final float n;
    public final float r;
    public final float t;
    public final float v;
    public final boolean x;

    public vq3(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.r = f;
        this.n = f2;
        this.v = f3;
        this.x = z;
        this.l = z2;
        this.j = f4;
        this.t = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq3)) {
            return false;
        }
        vq3 vq3Var = (vq3) obj;
        return Float.compare(this.r, vq3Var.r) == 0 && Float.compare(this.n, vq3Var.n) == 0 && Float.compare(this.v, vq3Var.v) == 0 && this.x == vq3Var.x && this.l == vq3Var.l && Float.compare(this.j, vq3Var.j) == 0 && Float.compare(this.t, vq3Var.t) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.t) + fj.y(this.j, xi3.l(xi3.l(fj.y(this.v, fj.y(this.n, Float.hashCode(this.r) * 31, 31), 31), 31, this.x), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sbU = du4.u("RelativeArcTo(horizontalEllipseRadius=", this.r, ", verticalEllipseRadius=", this.n, ", theta=");
        sbU.append(this.v);
        sbU.append(", isMoreThanHalf=");
        sbU.append(this.x);
        sbU.append(", isPositiveArc=");
        sbU.append(this.l);
        sbU.append(", arcStartDx=");
        sbU.append(this.j);
        sbU.append(", arcStartDy=");
        sbU.append(this.t);
        sbU.append(")");
        return sbU.toString();
    }
}
