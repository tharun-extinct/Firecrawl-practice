package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ee3 {
    public final long g;
    public final long l;
    public final long n;
    public final long r;
    public final long v;
    public final long x;
    public final long y;

    public ee3(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = j4;
        this.v = j5;
        this.x = j6;
        this.l = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ee3)) {
            return false;
        }
        ee3 ee3Var = (ee3) obj;
        long j = ee3Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.n, ee3Var.n) && tf5.g(this.y, ee3Var.y) && tf5.g(this.v, ee3Var.v) && tf5.g(this.r, ee3Var.r) && tf5.g(this.x, ee3Var.x) && tf5.g(this.l, ee3Var.l);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.l) + xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.n), 31, this.y), 31, this.v), 31, this.r), 31, this.x);
    }
}
