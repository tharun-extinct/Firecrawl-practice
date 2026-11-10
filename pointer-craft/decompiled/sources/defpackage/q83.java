package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q83 {
    public final long g;
    public final boolean r;
    public final long y;

    public q83(long j, long j2, boolean z) {
        this.g = j;
        this.y = j2;
        this.r = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q83)) {
            return false;
        }
        q83 q83Var = (q83) obj;
        return wi3.y(this.g, q83Var.g) && this.y == q83Var.y && this.r == q83Var.r;
    }

    public final q83 g(q83 q83Var) {
        return new q83(wi3.v(this.g, q83Var.g), Math.max(this.y, q83Var.y), this.r);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + xi3.v(Long.hashCode(this.g) * 31, 31, this.y);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + wi3.l(this.g) + ", timeMillis=" + this.y + ", shouldApplyImmediately=" + this.r + ")";
    }
}
