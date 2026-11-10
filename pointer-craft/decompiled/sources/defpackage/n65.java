package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n65 {
    public static final n65 r = new n65(1.0f, 0.0f);
    public final float g;
    public final float y;

    public n65(float f, float f2) {
        this.g = f;
        this.y = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n65)) {
            return false;
        }
        n65 n65Var = (n65) obj;
        return this.g == n65Var.g && this.y == n65Var.y;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.g + ", skewX=" + this.y + ")";
    }
}
