package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mz2 extends rz2 {
    public final long n;
    public final boolean r;
    public final int y;

    public mz2(int i, long j, boolean z) {
        super(j);
        this.y = i;
        this.r = z;
        this.n = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz2)) {
            return false;
        }
        mz2 mz2Var = (mz2) obj;
        return this.y == mz2Var.y && this.r == mz2Var.r && this.n == mz2Var.n;
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + xi3.l(Integer.hashCode(this.y) * 31, 31, this.r);
    }

    public final String toString() {
        return "KeyEventRecord(keyCode=" + this.y + ", isDown=" + this.r + ", timeSinceLast=" + this.n + ")";
    }
}
