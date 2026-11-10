package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha2 {
    public static int m;
    public static final d52 q = new d52(12);
    public final int a;
    public final String g;
    public final int j;
    public final long l;
    public final float n;
    public final float r;
    public final boolean t;
    public final float v;
    public final ej5 x;
    public final float y;

    public ha2(String str, float f, float f2, float f3, float f4, ej5 ej5Var, long j, int i, boolean z) {
        int i2;
        synchronized (q) {
            i2 = m;
            m = i2 + 1;
        }
        this.g = str;
        this.y = f;
        this.r = f2;
        this.n = f3;
        this.v = f4;
        this.x = ej5Var;
        this.l = j;
        this.j = i;
        this.t = z;
        this.a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha2)) {
            return false;
        }
        ha2 ha2Var = (ha2) obj;
        if (!yf2.p(this.g, ha2Var.g) || !vb1.y(this.y, ha2Var.y) || !vb1.y(this.r, ha2Var.r) || this.n != ha2Var.n || this.v != ha2Var.v || !this.x.equals(ha2Var.x)) {
            return false;
        }
        long j = ha2Var.l;
        int i = jj0.t;
        return tf5.g(this.l, j) && this.j == ha2Var.j && this.t == ha2Var.t;
    }

    public final int hashCode() {
        int iHashCode = (this.x.hashCode() + fj.y(this.v, fj.y(this.n, fj.y(this.r, fj.y(this.y, this.g.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = jj0.t;
        return Boolean.hashCode(this.t) + du4.r(this.j, xi3.v(iHashCode, 31, this.l), 31);
    }
}
