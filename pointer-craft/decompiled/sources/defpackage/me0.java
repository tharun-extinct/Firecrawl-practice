package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class me0 {
    public final long g;
    public final long j;
    public final long l;
    public final long n;
    public final long r;
    public final long v;
    public final long x;
    public final long y;

    public me0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
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
        if (obj == null || !(obj instanceof me0)) {
            return false;
        }
        me0 me0Var = (me0) obj;
        long j = me0Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, me0Var.y) && tf5.g(this.r, me0Var.r) && tf5.g(this.n, me0Var.n) && tf5.g(this.v, me0Var.v) && tf5.g(this.x, me0Var.x) && tf5.g(this.l, me0Var.l) && tf5.g(this.j, me0Var.j);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.j) + xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r), 31, this.n), 31, this.v), 31, this.x), 31, this.l);
    }
}
