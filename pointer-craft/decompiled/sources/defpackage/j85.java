package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j85 {
    public final qj0 g;
    public final pv1 r;
    public final n85 y;

    public j85(qj0 qj0Var, n85 n85Var, pv1 pv1Var, int i) {
        n85Var = (i & 2) != 0 ? null : n85Var;
        pv1Var = (i & 4) != 0 ? null : pv1Var;
        this.g = qj0Var;
        this.y = n85Var;
        this.r = pv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j85)) {
            return false;
        }
        j85 j85Var = (j85) obj;
        return yf2.p(this.g, j85Var.g) && yf2.p(this.y, j85Var.y) && yf2.p(this.r, j85Var.r);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        n85 n85Var = this.y;
        return (((iHashCode + (n85Var != null ? Long.hashCode(n85Var.g) : 0)) * 31) + (this.r != null ? Integer.hashCode(500) : 0)) * 923521;
    }

    public final String toString() {
        return "TextStyle(color=" + this.g + ", fontSize=" + this.y + ", fontWeight=" + this.r + ", fontStyle=null, textDecoration=null, textAlign=null, fontFamily=null)";
    }
}
