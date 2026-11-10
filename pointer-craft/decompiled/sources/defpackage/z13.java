package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z13 {
    public final String g;
    public final me2 y;

    public z13(String str, me2 me2Var) {
        this.g = str;
        this.y = me2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z13)) {
            return false;
        }
        z13 z13Var = (z13) obj;
        return this.g.equals(z13Var.g) && this.y.equals(z13Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.g + ", range=" + this.y + ')';
    }
}
