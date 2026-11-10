package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qh4 {
    public final long a;
    public final long g;
    public final long j;
    public final long l;
    public final long m;
    public final long n;
    public final long q;
    public final long r;
    public final long t;
    public final long v;
    public final long x;
    public final long y;

    public qh4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = j4;
        this.v = j5;
        this.x = j6;
        this.l = j7;
        this.j = j8;
        this.t = j9;
        this.a = j10;
        this.m = j11;
        this.q = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qh4.class != obj.getClass()) {
            return false;
        }
        qh4 qh4Var = (qh4) obj;
        long j = qh4Var.r;
        int i = jj0.t;
        return tf5.g(this.r, j) && tf5.g(this.y, qh4Var.y) && tf5.g(this.g, qh4Var.g) && tf5.g(this.x, qh4Var.x) && tf5.g(this.v, qh4Var.v) && tf5.g(this.n, qh4Var.n) && tf5.g(this.t, qh4Var.t) && tf5.g(this.j, qh4Var.j) && tf5.g(this.l, qh4Var.l) && tf5.g(this.q, qh4Var.q) && tf5.g(this.m, qh4Var.m) && tf5.g(this.a, qh4Var.a);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.a) + xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(Long.hashCode(this.r) * 31, 31, this.y), 31, this.g), 31, this.x), 31, this.v), 31, this.n), 31, this.t), 31, this.j), 31, this.l), 31, this.q), 31, this.m);
    }
}
