package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u92 {
    public final long g;
    public final long n;
    public final long r;
    public final long v;
    public final long x;
    public final long y;

    public u92(long j, long j2, long j3, long j4, long j5, long j6) {
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
        if (obj == null || !(obj instanceof u92)) {
            return false;
        }
        u92 u92Var = (u92) obj;
        long j = u92Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, u92Var.y) && tf5.g(this.r, u92Var.r) && tf5.g(this.n, u92Var.n) && tf5.g(this.v, u92Var.v) && tf5.g(this.x, u92Var.x);
    }

    public final ob3 g(boolean z, boolean z2, h02 h02Var) {
        long j;
        if (z) {
            j = !z2 ? this.g : this.v;
        } else {
            j = this.r;
        }
        return kq2.Q(new jj0(j), h02Var);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.x) + xi3.v(xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r), 31, this.n), 31, this.v);
    }

    public final ob3 y(boolean z, boolean z2, h02 h02Var) {
        long j;
        if (z) {
            j = !z2 ? this.y : this.x;
        } else {
            j = this.n;
        }
        return kq2.Q(new jj0(j), h02Var);
    }
}
