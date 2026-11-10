package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pg4 {
    public final long g;
    public final t45 r;
    public final long y;

    public pg4(long j, long j2, t45 t45Var) {
        this.g = j;
        this.y = j2;
        this.r = t45Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg4)) {
            return false;
        }
        pg4 pg4Var = (pg4) obj;
        long j = pg4Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, pg4Var.y) && this.r.equals(pg4Var.r);
    }

    public final int hashCode() {
        int i = jj0.t;
        return this.r.hashCode() + xi3.v(Long.hashCode(this.g) * 31, 31, this.y);
    }
}
