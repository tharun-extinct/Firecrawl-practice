package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ii4 {
    public final gi4 g;
    public final boolean r;
    public final gi4 y;

    public ii4(gi4 gi4Var, gi4 gi4Var2, boolean z) {
        this.g = gi4Var;
        this.y = gi4Var2;
        this.r = z;
    }

    public static ii4 g(ii4 ii4Var, gi4 gi4Var, gi4 gi4Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            gi4Var = ii4Var.g;
        }
        if ((i & 2) != 0) {
            gi4Var2 = ii4Var.y;
        }
        ii4Var.getClass();
        return new ii4(gi4Var, gi4Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii4)) {
            return false;
        }
        ii4 ii4Var = (ii4) obj;
        return yf2.p(this.g, ii4Var.g) && yf2.p(this.y, ii4Var.y) && this.r == ii4Var.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.g + ", end=" + this.y + ", handlesCrossed=" + this.r + ")";
    }
}
