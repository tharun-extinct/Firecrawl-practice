package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ht0 {
    public final np2 g;
    public final s6 n;
    public final q6 r;
    public final int y;

    public /* synthetic */ ht0(np2 np2Var, int i, q6 q6Var, s6 s6Var, int i2) {
        this(np2Var, i, (i2 & 4) != 0 ? null : q6Var, (i2 & 8) != 0 ? null : s6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht0)) {
            return false;
        }
        ht0 ht0Var = (ht0) obj;
        return this.g == ht0Var.g && this.y == ht0Var.y && yf2.p(this.r, ht0Var.r) && yf2.p(this.n, ht0Var.n);
    }

    public final int hashCode() {
        int iR = du4.r(this.y, this.g.hashCode() * 31, 31);
        q6 q6Var = this.r;
        int iHashCode = (iR + (q6Var == null ? 0 : Integer.hashCode(q6Var.g))) * 31;
        s6 s6Var = this.n;
        return iHashCode + (s6Var != null ? Integer.hashCode(s6Var.g) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.g + ", numChildren=" + this.y + ", horizontalAlignment=" + this.r + ", verticalAlignment=" + this.n + ')';
    }

    public ht0(np2 np2Var, int i, q6 q6Var, s6 s6Var) {
        this.g = np2Var;
        this.y = i;
        this.r = q6Var;
        this.n = s6Var;
    }
}
