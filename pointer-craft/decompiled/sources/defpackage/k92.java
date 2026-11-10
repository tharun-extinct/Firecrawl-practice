package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k92 {
    public final long g;
    public final long n;
    public final long r;
    public final long y;

    public k92(long j, long j2, long j3, long j4) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k92)) {
            return false;
        }
        k92 k92Var = (k92) obj;
        long j = k92Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, k92Var.y) && tf5.g(this.r, k92Var.r) && tf5.g(this.n, k92Var.n);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.n) + xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r);
    }
}
