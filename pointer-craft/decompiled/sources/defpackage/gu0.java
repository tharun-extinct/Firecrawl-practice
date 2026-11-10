package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gu0 {
    public final long g;
    public final long n;
    public final long r;
    public final long v;
    public final long y;

    public gu0(long j, long j2, long j3, long j4, long j5) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = j4;
        this.v = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gu0)) {
            return false;
        }
        gu0 gu0Var = (gu0) obj;
        long j = gu0Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, gu0Var.y) && tf5.g(this.r, gu0Var.r) && tf5.g(this.n, gu0Var.n) && tf5.g(this.v, gu0Var.v);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.v) + xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r), 31, this.n);
    }

    public final String toString() {
        String strJ = jj0.j(this.g);
        String strJ2 = jj0.j(this.y);
        String strJ3 = jj0.j(this.r);
        String strJ4 = jj0.j(this.n);
        String strJ5 = jj0.j(this.v);
        StringBuilder sbZ = du4.z("ContextMenuColors(backgroundColor=", strJ, ", textColor=", strJ2, ", iconColor=");
        du4.B(sbZ, strJ3, ", disabledTextColor=", strJ4, ", disabledIconColor=");
        return du4.b(sbZ, strJ5, ")");
    }
}
