package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qz2 extends rz2 {
    public final long n;
    public final int r;
    public final int y;

    public qz2(int i, int i2, long j) {
        super(j);
        this.y = i;
        this.r = i2;
        this.n = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz2)) {
            return false;
        }
        qz2 qz2Var = (qz2) obj;
        return this.y == qz2Var.y && this.r == qz2Var.r && this.n == qz2Var.n;
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + du4.r(this.r, Integer.hashCode(this.y) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbS = du4.s(this.y, this.r, "Scroll(scroll=", ", pan=", ", timeSinceLast=");
        sbS.append(this.n);
        sbS.append(")");
        return sbS.toString();
    }
}
