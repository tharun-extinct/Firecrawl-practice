package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class p50 {
    public final int g;
    public final int n;
    public final int r;
    public final int y;

    static {
        new p50(0, 0, 0, 0);
    }

    public p50(int i, int i2, int i3, int i4) {
        this.g = i;
        this.y = i2;
        this.r = i3;
        this.n = i4;
        if (i > i3) {
            l0.t(du4.m(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        l0.t(du4.m(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p50.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        p50 p50Var = (p50) obj;
        return this.g == p50Var.g && this.y == p50Var.y && this.r == p50Var.r && this.n == p50Var.n;
    }

    public final int hashCode() {
        return (((((this.g * 31) + this.y) * 31) + this.r) * 31) + this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(p50.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.g);
        sb.append(',');
        sb.append(this.y);
        sb.append(',');
        sb.append(this.r);
        sb.append(',');
        return xi3.m(sb, this.n, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p50(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
