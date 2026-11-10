package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sr5 {
    public static final vg5 u;
    public vs0 a;
    public long b;
    public long c;
    public String g;
    public long i;
    public long j;
    public long l;
    public int m;
    public String n;
    public int p;
    public int q;
    public String r;
    public boolean s;
    public long t;
    public qz0 v;
    public long w;
    public qz0 x;
    public hr5 y = hr5.j;

    static {
        iy2.v("WorkSpec");
        u = new vg5();
    }

    public sr5(String str, String str2) {
        qz0 qz0Var = qz0.r;
        this.v = qz0Var;
        this.x = qz0Var;
        this.a = vs0.t;
        this.q = 1;
        this.w = 30000L;
        this.b = -1L;
        this.p = 1;
        this.g = str;
        this.r = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sr5.class != obj.getClass()) {
            return false;
        }
        sr5 sr5Var = (sr5) obj;
        if (this.l != sr5Var.l || this.j != sr5Var.j || this.t != sr5Var.t || this.m != sr5Var.m || this.w != sr5Var.w || this.c != sr5Var.c || this.i != sr5Var.i || this.b != sr5Var.b || this.s != sr5Var.s || !this.g.equals(sr5Var.g) || this.y != sr5Var.y || !this.r.equals(sr5Var.r)) {
            return false;
        }
        String str = this.n;
        String str2 = sr5Var.n;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        return this.v.equals(sr5Var.v) && this.x.equals(sr5Var.x) && this.a.equals(sr5Var.a) && this.q == sr5Var.q && this.p == sr5Var.p;
    }

    public final long g() {
        int i;
        if (this.y == hr5.j && (i = this.m) > 0) {
            int i2 = this.q;
            long j = this.w;
            return Math.min(18000000L, i2 == 2 ? j * ((long) i) : (long) Math.scalb(j, i - 1)) + this.c;
        }
        if (!r()) {
            long jCurrentTimeMillis = this.c;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.l;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j2 = this.c;
        if (j2 == 0) {
            j2 = this.l + jCurrentTimeMillis2;
        }
        long j3 = this.t;
        long j4 = this.j;
        if (j3 != j4) {
            return j2 + j4 + (j2 == 0 ? j3 * (-1) : 0L);
        }
        return j2 + (j2 != 0 ? j4 : 0L);
    }

    public final int hashCode() {
        int iX = xi3.x((this.y.hashCode() + (this.g.hashCode() * 31)) * 31, 31, this.r);
        String str = this.n;
        int iHashCode = (this.x.hashCode() + ((this.v.hashCode() + ((iX + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.l;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.j;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.t;
        int iD = (du4.D(this.q) + ((((this.a.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.m) * 31)) * 31;
        long j4 = this.w;
        int i3 = (iD + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.c;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.i;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.b;
        return du4.D(this.p) + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.s ? 1 : 0)) * 31);
    }

    public final boolean r() {
        return this.j != 0;
    }

    public final String toString() {
        return du4.b(new StringBuilder("{WorkSpec: "), this.g, "}");
    }

    public final boolean y() {
        return !vs0.t.equals(this.a);
    }
}
