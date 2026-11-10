package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wq4 {
    public final long a;
    public final long g;
    public final long j;
    public final long l;
    public final long n;
    public final long r;
    public final long t;
    public final long v;
    public final long x;
    public final long y;

    public wq4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wq4)) {
            return false;
        }
        wq4 wq4Var = (wq4) obj;
        long j = wq4Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, wq4Var.y) && tf5.g(this.r, wq4Var.r) && tf5.g(this.n, wq4Var.n) && tf5.g(this.v, wq4Var.v) && tf5.g(this.x, wq4Var.x) && tf5.g(this.l, wq4Var.l) && tf5.g(this.j, wq4Var.j) && tf5.g(this.t, wq4Var.t) && tf5.g(this.a, wq4Var.a);
    }

    public final long g(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.y : this.n;
        }
        return z2 ? this.l : this.t;
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.a) + xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r), 31, this.n), 31, this.v), 31, this.x), 31, this.l), 31, this.j), 31, this.t);
    }
}
