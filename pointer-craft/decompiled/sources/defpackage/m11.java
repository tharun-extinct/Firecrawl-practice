package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m11 {
    public final long g;
    public final long j;
    public final long l;
    public final long n;
    public final long r;
    public final long v;
    public final long x;
    public final long y;

    public m11(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = j4;
        this.v = j5;
        this.x = j6;
        this.l = j7;
        this.j = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m11)) {
            return false;
        }
        m11 m11Var = (m11) obj;
        long j = m11Var.g;
        int i = jj0.t;
        if (tf5.g(this.g, j) && tf5.g(this.y, m11Var.y) && tf5.g(this.r, m11Var.r) && tf5.g(this.n, m11Var.n) && tf5.g(this.v, m11Var.v) && tf5.g(this.x, m11Var.x) && tf5.g(this.l, m11Var.l)) {
            return tf5.g(this.j, m11Var.j);
        }
        return false;
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.j) + xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r), 31, this.n), 31, this.v), 31, this.x), 31, this.l);
    }
}
