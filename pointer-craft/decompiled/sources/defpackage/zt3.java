package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zt3 {
    public final tt3 g;
    public final jt3 y;

    public zt3(tt3 tt3Var, jt3 jt3Var) {
        this.g = tt3Var;
        this.y = jt3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt3)) {
            return false;
        }
        zt3 zt3Var = (zt3) obj;
        return yf2.p(this.y, zt3Var.y) && yf2.p(this.g, zt3Var.g);
    }

    public final int hashCode() {
        tt3 tt3Var = this.g;
        int iHashCode = (tt3Var != null ? tt3Var.hashCode() : 0) * 31;
        jt3 jt3Var = this.y;
        return iHashCode + (jt3Var != null ? jt3Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.g + ", paragraphSyle=" + this.y + ")";
    }
}
