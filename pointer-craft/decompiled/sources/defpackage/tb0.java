package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tb0 {
    public final float g;
    public final float n;
    public final float r;
    public final float v;
    public final float y;

    public tb0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
        this.v = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tb0)) {
            return false;
        }
        tb0 tb0Var = (tb0) obj;
        return vb1.y(this.g, tb0Var.g) && vb1.y(this.y, tb0Var.y) && vb1.y(this.r, tb0Var.r) && vb1.y(this.n, tb0Var.n) && vb1.y(this.v, tb0Var.v);
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + fj.y(this.n, fj.y(this.r, fj.y(this.y, Float.hashCode(this.g) * 31, 31), 31), 31);
    }
}
