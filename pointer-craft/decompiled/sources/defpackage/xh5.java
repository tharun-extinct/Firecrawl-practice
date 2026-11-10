package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xh5 {
    public final long g;
    public final int y;

    public xh5(int i, long j) {
        this.g = j;
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh5)) {
            return false;
        }
        xh5 xh5Var = (xh5) obj;
        return this.g == xh5Var.g && this.y == xh5Var.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Long.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "UserMessage(id=" + this.g + ", message=" + this.y + ")";
    }
}
