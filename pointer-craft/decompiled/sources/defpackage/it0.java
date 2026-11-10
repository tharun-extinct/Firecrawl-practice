package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class it0 {
    public final int g;
    public final s25 n;
    public final jt0 r;
    public final long y;

    public it0(int i, long j, jt0 jt0Var, s25 s25Var) {
        this.g = i;
        this.y = j;
        this.r = jt0Var;
        this.n = s25Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it0)) {
            return false;
        }
        it0 it0Var = (it0) obj;
        return this.g == it0Var.g && this.y == it0Var.y && this.r == it0Var.r && yf2.p(this.n, it0Var.n);
    }

    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (this.r.hashCode() + xi3.v(Integer.hashCode(this.g) * 31, 31, this.y)) * 31;
        s25 s25Var = this.n;
        return iHashCode + (s25Var == null ? 0 : s25Var.hashCode());
    }

    public final jt0 r() {
        return this.r;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.g + ", timestamp=" + this.y + ", type=" + this.r + ", structureCompat=" + this.n + ")";
    }

    public final s25 y() {
        return this.n;
    }
}
