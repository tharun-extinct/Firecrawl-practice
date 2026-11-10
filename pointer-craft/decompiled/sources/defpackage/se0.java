package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class se0 {
    public final float g;
    public final float n;
    public final float r;
    public final float v;
    public final float y;

    public se0(float f, float f2, float f3, float f4, float f5) {
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
        this.v = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof se0)) {
            return false;
        }
        se0 se0Var = (se0) obj;
        return vb1.y(this.g, se0Var.g) && vb1.y(this.y, se0Var.y) && vb1.y(this.r, se0Var.r) && vb1.y(this.n, se0Var.n) && vb1.y(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + fj.y(this.n, fj.y(this.r, fj.y(this.y, Float.hashCode(this.g) * 31, 31), 31), 31);
    }
}
