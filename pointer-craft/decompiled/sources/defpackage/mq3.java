package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mq3 extends fr3 {
    public final float j;
    public final boolean l;
    public final float n;
    public final float r;
    public final float t;
    public final float v;
    public final boolean x;

    public mq3(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof mq3)) {
            return false;
        }
        mq3 mq3Var = (mq3) obj;
        return Float.compare(this.r, mq3Var.r) == 0 && Float.compare(this.n, mq3Var.n) == 0 && Float.compare(this.v, mq3Var.v) == 0 && this.x == mq3Var.x && this.l == mq3Var.l && Float.compare(this.j, mq3Var.j) == 0 && Float.compare(this.t, mq3Var.t) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.t) + fj.y(this.j, xi3.l(xi3.l(fj.y(this.v, fj.y(this.n, Float.hashCode(this.r) * 31, 31), 31), 31, this.x), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sbU = du4.u("ArcTo(horizontalEllipseRadius=", this.r, ", verticalEllipseRadius=", this.n, ", theta=");
        sbU.append(this.v);
        sbU.append(", isMoreThanHalf=");
        sbU.append(this.x);
        sbU.append(", isPositiveArc=");
        sbU.append(this.l);
        sbU.append(", arcStartX=");
        sbU.append(this.j);
        sbU.append(", arcStartY=");
        sbU.append(this.t);
        sbU.append(")");
        return sbU.toString();
    }
}
