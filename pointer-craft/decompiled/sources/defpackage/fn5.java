package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fn5 {
    public final float g;
    public final float y;

    public fn5(float f, float f2) {
        this.g = f;
        this.y = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn5)) {
            return false;
        }
        fn5 fn5Var = (fn5) obj;
        return Float.compare(this.g, fn5Var.g) == 0 && Float.compare(this.y, fn5Var.y) == 0;
    }

    public final float[] g() {
        float f = this.g;
        float f2 = this.y;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.g + ", y=" + this.y + ")";
    }
}
