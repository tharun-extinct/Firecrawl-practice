package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w51 {
    public final long g;
    public final long y;

    public w51(long j, long j2) {
        this.g = j;
        this.y = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w51) {
            w51 w51Var = (w51) obj;
            return qe2.g(this.g, w51Var.g) && this.y == w51Var.y;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.y) + (Long.hashCode(this.g) * 31);
    }
}
