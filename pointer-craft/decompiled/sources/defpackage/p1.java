package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {
    public final String g;
    public final jz1 y;

    public p1(String str, jz1 jz1Var) {
        this.g = str;
        this.y = jz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return yf2.p(this.g, p1Var.g) && yf2.p(this.y, p1Var.y);
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        jz1 jz1Var = this.y;
        return iHashCode + (jz1Var != null ? jz1Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.g + ", action=" + this.y + ")";
    }
}
