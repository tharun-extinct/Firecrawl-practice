package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class td0 {
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

    public td0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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

    public static zu4 g(ca5 ca5Var, h02 h02Var) {
        if (ca5Var == ca5.t) {
            h02Var.X(1539262271);
            zu4 zu4VarF = jr2.F(f83.m, h02Var);
            h02Var.b(false);
            return zu4VarF;
        }
        h02Var.X(1539355581);
        zu4 zu4VarF2 = jr2.F(f83.a, h02Var);
        h02Var.b(false);
        return zu4VarF2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof td0)) {
            return false;
        }
        td0 td0Var = (td0) obj;
        long j = td0Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, td0Var.y) && tf5.g(this.r, td0Var.r) && tf5.g(this.n, td0Var.n) && tf5.g(this.v, td0Var.v) && tf5.g(this.x, td0Var.x) && tf5.g(this.l, td0Var.l) && tf5.g(this.j, td0Var.j) && tf5.g(this.t, td0Var.t) && tf5.g(this.a, td0Var.a) && tf5.g(this.m, td0Var.m) && tf5.g(this.q, td0Var.q);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.q) + xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r), 31, this.n), 31, this.v), 31, this.x), 31, this.l), 31, this.j), 31, this.t), 31, this.a), 31, this.m);
    }
}
