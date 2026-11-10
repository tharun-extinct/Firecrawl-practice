package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vn3 {
    public final float g;
    public final List y;

    public vn3(int i, float f) {
        this((i & 1) != 0 ? 0.0f : f, pi1.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn3)) {
            return false;
        }
        vn3 vn3Var = (vn3) obj;
        return vb1.y(this.g, vn3Var.g) && yf2.p(this.y, vn3Var.y);
    }

    public final vn3 g(vn3 vn3Var) {
        return new vn3(this.g + vn3Var.g, cj0.w0(this.y, vn3Var.y));
    }

    public final int hashCode() {
        return this.y.hashCode() + (Float.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "PaddingDimension(dp=" + ((Object) vb1.r(this.g)) + ", resourceIds=" + this.y + ')';
    }

    public vn3(float f, List list) {
        this.g = f;
        this.y = list;
    }
}
