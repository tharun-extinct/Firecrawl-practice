package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bb5 {
    public final long g;
    public final long n;
    public final long r;
    public final long v;
    public final long x;
    public final long y;

    public bb5(long j, long j2, long j3, long j4, long j5, long j6) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = j4;
        this.v = j5;
        this.x = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bb5)) {
            return false;
        }
        bb5 bb5Var = (bb5) obj;
        long j = bb5Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, bb5Var.y) && tf5.g(this.r, bb5Var.r) && tf5.g(this.n, bb5Var.n) && tf5.g(this.v, bb5Var.v) && tf5.g(this.x, bb5Var.x);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.x) + xi3.v(xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r), 31, this.n), 31, this.v);
    }
}
