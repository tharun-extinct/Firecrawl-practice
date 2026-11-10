package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a80 {
    public final long g;
    public final long n;
    public final long r;
    public final long y;

    public a80(long j, long j2, long j3, long j4) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a80)) {
            return false;
        }
        a80 a80Var = (a80) obj;
        long j = a80Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, a80Var.y) && tf5.g(this.r, a80Var.r) && tf5.g(this.n, a80Var.n);
    }

    public final a80 g(long j, long j2, long j3, long j4) {
        return new a80(j != 16 ? j : this.g, j2 != 16 ? j2 : this.y, j3 != 16 ? j3 : this.r, j4 != 16 ? j4 : this.n);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.n) + xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r);
    }
}
