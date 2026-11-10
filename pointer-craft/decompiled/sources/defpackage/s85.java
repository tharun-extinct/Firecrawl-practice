package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s85 {
    public final rj0 g;
    public final un4 r;
    public final mf5 y;

    public s85(rj0 rj0Var, mf5 mf5Var, un4 un4Var) {
        this.g = rj0Var;
        this.y = mf5Var;
        this.r = un4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s85)) {
            return false;
        }
        s85 s85Var = (s85) obj;
        return yf2.p(this.g, s85Var.g) && yf2.p(this.y, s85Var.y) && yf2.p(this.r, s85Var.r);
    }

    public final int hashCode() {
        rj0 rj0Var = this.g;
        int iHashCode = (rj0Var == null ? 0 : rj0Var.hashCode()) * 31;
        mf5 mf5Var = this.y;
        int iHashCode2 = (iHashCode + (mf5Var == null ? 0 : mf5Var.hashCode())) * 31;
        un4 un4Var = this.r;
        return iHashCode2 + (un4Var != null ? un4Var.hashCode() : 0);
    }

    public final String toString() {
        return "Theme3Parameters(colorScheme=" + this.g + ", typography=" + this.y + ", shapes=" + this.r + ")";
    }
}
