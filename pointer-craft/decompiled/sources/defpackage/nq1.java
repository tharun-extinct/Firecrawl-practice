package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nq1 {
    public final float g;
    public final float n;
    public final float r;
    public final float y;

    public nq1(float f, float f2, float f3, float f4) {
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nq1)) {
            return false;
        }
        nq1 nq1Var = (nq1) obj;
        if (vb1.y(this.g, nq1Var.g) && vb1.y(this.y, nq1Var.y) && vb1.y(this.r, nq1Var.r)) {
            return vb1.y(this.n, nq1Var.n);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + fj.y(this.r, fj.y(this.y, Float.hashCode(this.g) * 31, 31), 31);
    }
}
