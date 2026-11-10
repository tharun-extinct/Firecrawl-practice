package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq3 extends fr3 {
    public final float n;
    public final float r;

    public qq3(float f, float f2) {
        super(3);
        this.r = f;
        this.n = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq3)) {
            return false;
        }
        qq3 qq3Var = (qq3) obj;
        return Float.compare(this.r, qq3Var.r) == 0 && Float.compare(this.n, qq3Var.n) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + (Float.hashCode(this.r) * 31);
    }

    public final String toString() {
        return "LineTo(x=" + this.r + ", y=" + this.n + ")";
    }
}
