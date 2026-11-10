package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ri4 {
    public final p42 g;
    public final boolean n;
    public final qi4 r;
    public final long y;

    public ri4(p42 p42Var, long j, qi4 qi4Var, boolean z) {
        this.g = p42Var;
        this.y = j;
        this.r = qi4Var;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri4)) {
            return false;
        }
        ri4 ri4Var = (ri4) obj;
        return this.g == ri4Var.g && wi3.y(this.y, ri4Var.y) && this.r == ri4Var.r && this.n == ri4Var.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + ((this.r.hashCode() + xi3.v(this.g.hashCode() * 31, 31, this.y)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.g + ", position=" + wi3.l(this.y) + ", anchor=" + this.r + ", visible=" + this.n + ")";
    }
}
