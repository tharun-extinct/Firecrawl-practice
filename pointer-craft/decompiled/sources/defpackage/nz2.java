package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nz2 extends rz2 {
    public final long n;
    public final boolean r;
    public final byte y;

    public nz2(byte b, boolean z, long j) {
        super(j);
        this.y = b;
        this.r = z;
        this.n = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz2)) {
            return false;
        }
        nz2 nz2Var = (nz2) obj;
        return this.y == nz2Var.y && this.r == nz2Var.r && this.n == nz2Var.n;
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + xi3.l(Byte.hashCode(this.y) * 31, 31, this.r);
    }

    public final String toString() {
        return "MouseButton(mouseButton=" + ((int) this.y) + ", down=" + this.r + ", timeSinceLast=" + this.n + ")";
    }
}
