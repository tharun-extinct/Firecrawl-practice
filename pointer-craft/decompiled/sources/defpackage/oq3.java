package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oq3 extends fr3 {
    public final float j;
    public final float l;
    public final float n;
    public final float r;
    public final float v;
    public final float x;

    public oq3(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.r = f;
        this.n = f2;
        this.v = f3;
        this.x = f4;
        this.l = f5;
        this.j = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq3)) {
            return false;
        }
        oq3 oq3Var = (oq3) obj;
        return Float.compare(this.r, oq3Var.r) == 0 && Float.compare(this.n, oq3Var.n) == 0 && Float.compare(this.v, oq3Var.v) == 0 && Float.compare(this.x, oq3Var.x) == 0 && Float.compare(this.l, oq3Var.l) == 0 && Float.compare(this.j, oq3Var.j) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.j) + fj.y(this.l, fj.y(this.x, fj.y(this.v, fj.y(this.n, Float.hashCode(this.r) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = du4.u("CurveTo(x1=", this.r, ", y1=", this.n, ", x2=");
        sbU.append(this.v);
        sbU.append(", y2=");
        sbU.append(this.x);
        sbU.append(", x3=");
        sbU.append(this.l);
        sbU.append(", y3=");
        sbU.append(this.j);
        sbU.append(")");
        return sbU.toString();
    }
}
