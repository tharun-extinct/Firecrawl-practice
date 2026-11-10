package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yq3 extends fr3 {
    public final float n;
    public final float r;

    public yq3(float f, float f2) {
        super(3);
        this.r = f;
        this.n = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq3)) {
            return false;
        }
        yq3 yq3Var = (yq3) obj;
        return Float.compare(this.r, yq3Var.r) == 0 && Float.compare(this.n, yq3Var.n) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + (Float.hashCode(this.r) * 31);
    }

    public final String toString() {
        return "RelativeLineTo(dx=" + this.r + ", dy=" + this.n + ")";
    }
}
