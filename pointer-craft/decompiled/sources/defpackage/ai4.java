package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ai4 {
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
    public final long w;
    public final long x;
    public final long y;

    public ai4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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
        this.w = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ai4)) {
            return false;
        }
        ai4 ai4Var = (ai4) obj;
        long j = ai4Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, ai4Var.y) && tf5.g(this.r, ai4Var.r) && tf5.g(this.n, ai4Var.n) && tf5.g(this.v, ai4Var.v) && tf5.g(this.x, ai4Var.x) && tf5.g(this.l, ai4Var.l) && tf5.g(this.j, ai4Var.j) && tf5.g(this.t, ai4Var.t) && tf5.g(this.a, ai4Var.a) && tf5.g(this.m, ai4Var.m) && tf5.g(this.q, ai4Var.q) && tf5.g(this.w, ai4Var.w);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.w) + xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r), 31, this.n), 31, this.v), 31, this.x), 31, this.l), 31, this.j), 31, this.t), 31, this.a), 31, this.m), 31, this.q);
    }
}
