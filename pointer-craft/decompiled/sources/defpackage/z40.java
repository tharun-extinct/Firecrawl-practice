package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z40 {
    public final float g;
    public final cu4 y;

    public z40(float f, cu4 cu4Var) {
        this.g = f;
        this.y = cu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z40)) {
            return false;
        }
        z40 z40Var = (z40) obj;
        return vb1.y(this.g, z40Var.g) && this.y.equals(z40Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (Float.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + vb1.r(this.g) + ", brush=" + this.y + ")";
    }
}
