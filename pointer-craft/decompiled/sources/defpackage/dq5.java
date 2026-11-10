package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class dq5 {
    public final p50 g;
    public final float y;

    public dq5(Rect rect, float f) {
        this.g = new p50(rect);
        this.y = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dq5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dq5 dq5Var = (dq5) obj;
        return yf2.p(this.g, dq5Var.g) && this.y == dq5Var.y;
    }

    public final Rect g() {
        p50 p50Var = this.g;
        p50Var.getClass();
        return new Rect(p50Var.g, p50Var.y, p50Var.r, p50Var.n);
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.g + ", density=" + this.y + ')';
    }

    public dq5(p50 p50Var, float f) {
        this.g = p50Var;
        this.y = f;
    }
}
