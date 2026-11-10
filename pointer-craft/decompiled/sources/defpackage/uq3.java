package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uq3 extends fr3 {
    public final float n;
    public final float r;

    public uq3(float f, float f2) {
        super(1);
        this.r = f;
        this.n = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq3)) {
            return false;
        }
        uq3 uq3Var = (uq3) obj;
        return Float.compare(this.r, uq3Var.r) == 0 && Float.compare(this.n, uq3Var.n) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + (Float.hashCode(this.r) * 31);
    }

    public final String toString() {
        return "ReflectiveQuadTo(x=" + this.r + ", y=" + this.n + ")";
    }
}
