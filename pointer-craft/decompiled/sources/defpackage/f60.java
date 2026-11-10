package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f60 implements d60 {
    public final j51 g;
    public final long y;

    public f60(qy4 qy4Var, long j) {
        this.g = qy4Var;
        this.y = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f60)) {
            return false;
        }
        f60 f60Var = (f60) obj;
        return yf2.p(this.g, f60Var.g) && ws0.r(this.y, f60Var.y);
    }

    public final float g() {
        long j = this.y;
        if (!ws0.n(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.g.y0(ws0.j(j));
    }

    public final int hashCode() {
        return Long.hashCode(this.y) + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.g + ", constraints=" + ws0.q(this.y) + ")";
    }
}
