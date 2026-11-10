package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wq3 extends fr3 {
    public final float j;
    public final float l;
    public final float n;
    public final float r;
    public final float v;
    public final float x;

    public wq3(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof wq3)) {
            return false;
        }
        wq3 wq3Var = (wq3) obj;
        return Float.compare(this.r, wq3Var.r) == 0 && Float.compare(this.n, wq3Var.n) == 0 && Float.compare(this.v, wq3Var.v) == 0 && Float.compare(this.x, wq3Var.x) == 0 && Float.compare(this.l, wq3Var.l) == 0 && Float.compare(this.j, wq3Var.j) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.j) + fj.y(this.l, fj.y(this.x, fj.y(this.v, fj.y(this.n, Float.hashCode(this.r) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = du4.u("RelativeCurveTo(dx1=", this.r, ", dy1=", this.n, ", dx2=");
        sbU.append(this.v);
        sbU.append(", dy2=");
        sbU.append(this.x);
        sbU.append(", dx3=");
        sbU.append(this.l);
        sbU.append(", dy3=");
        sbU.append(this.j);
        sbU.append(")");
        return sbU.toString();
    }
}
