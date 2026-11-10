package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oz2 extends rz2 {
    public final long n;
    public final boolean r;
    public final byte y;

    public oz2(byte b, boolean z, long j) {
        super(j);
        this.y = b;
        this.r = z;
        this.n = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz2)) {
            return false;
        }
        oz2 oz2Var = (oz2) obj;
        return this.y == oz2Var.y && this.r == oz2Var.r && this.n == oz2Var.n;
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + xi3.l(Byte.hashCode(this.y) * 31, 31, this.r);
    }

    public final String toString() {
        return "MouseButtonClick(mouseButton=" + ((int) this.y) + ", withDelay=" + this.r + ", timeSinceLast=" + this.n + ")";
    }
}
