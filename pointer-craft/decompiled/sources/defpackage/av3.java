package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class av3 {
    public final float g;
    public final boolean n;
    public final long r;
    public final float y;

    public av3(float f, float f2, long j, boolean z) {
        this.g = f;
        this.y = f2;
        this.r = j;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av3)) {
            return false;
        }
        av3 av3Var = (av3) obj;
        return Float.compare(this.g, av3Var.g) == 0 && Float.compare(this.y, av3Var.y) == 0 && this.r == av3Var.r && this.n == av3Var.n;
    }

    public final long g() {
        return this.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + xi3.v(fj.y(this.y, Float.hashCode(this.g) * 31, 31), 31, this.r);
    }

    public final boolean n() {
        return this.n;
    }

    public final float r() {
        return this.y;
    }

    public final String toString() {
        StringBuilder sbU = du4.u("TimedPoint(x=", this.g, ", y=", this.y, ", timestamp=");
        sbU.append(this.r);
        sbU.append(", isStart=");
        sbU.append(this.n);
        sbU.append(")");
        return sbU.toString();
    }

    public final float y() {
        return this.g;
    }
}
