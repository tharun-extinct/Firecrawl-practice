package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ou1 {
    public final lu1 g;
    public final qv1 y;

    public ou1(lu1 lu1Var, qv1 qv1Var) {
        qv1Var.getClass();
        this.g = lu1Var;
        this.y = qv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou1)) {
            return false;
        }
        ou1 ou1Var = (ou1) obj;
        return yf2.p(this.g, ou1Var.g) && yf2.p(this.y, ou1Var.y);
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.y.j;
    }

    public final String toString() {
        return "FontFamilyWithWeight(fontFamily=" + this.g + ", weight=" + this.y + ")";
    }

    public ou1(lu1 lu1Var) {
        this(lu1Var, qv1.z);
    }
}
