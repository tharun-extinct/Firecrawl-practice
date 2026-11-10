package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cr3 extends fr3 {
    public final float n;
    public final float r;

    public cr3(float f, float f2) {
        super(1);
        this.r = f;
        this.n = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr3)) {
            return false;
        }
        cr3 cr3Var = (cr3) obj;
        return Float.compare(this.r, cr3Var.r) == 0 && Float.compare(this.n, cr3Var.n) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + (Float.hashCode(this.r) * 31);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.r + ", dy=" + this.n + ")";
    }
}
