package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ar3 extends fr3 {
    public final float n;
    public final float r;
    public final float v;
    public final float x;

    public ar3(float f, float f2, float f3, float f4) {
        super(1);
        this.r = f;
        this.n = f2;
        this.v = f3;
        this.x = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar3)) {
            return false;
        }
        ar3 ar3Var = (ar3) obj;
        return Float.compare(this.r, ar3Var.r) == 0 && Float.compare(this.n, ar3Var.n) == 0 && Float.compare(this.v, ar3Var.v) == 0 && Float.compare(this.x, ar3Var.x) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.x) + fj.y(this.v, fj.y(this.n, Float.hashCode(this.r) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = du4.u("RelativeQuadTo(dx1=", this.r, ", dy1=", this.n, ", dx2=");
        sbU.append(this.v);
        sbU.append(", dy2=");
        sbU.append(this.x);
        sbU.append(")");
        return sbU.toString();
    }
}
