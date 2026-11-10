package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eq4 {
    public final qg g;
    public long y;

    public eq4(qg qgVar, long j) {
        this.g = qgVar;
        this.y = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eq4) {
            eq4 eq4Var = (eq4) obj;
            if (this.g == eq4Var.g && qe2.g(this.y, eq4Var.y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.y) + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.g + ", startSize=" + qe2.y(this.y) + ")";
    }
}
