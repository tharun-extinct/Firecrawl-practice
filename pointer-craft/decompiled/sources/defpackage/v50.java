package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v50 {
    public final np2 g;
    public final int r;
    public final int y;

    public v50(np2 np2Var, int i, int i2) {
        this.g = np2Var;
        this.y = i;
        this.r = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v50)) {
            return false;
        }
        v50 v50Var = (v50) obj;
        return this.g == v50Var.g && this.y == v50Var.y && this.r == v50Var.r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.r) + du4.r(this.y, this.g.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.g + ", horizontalAlignment=" + ((Object) q6.y(this.y)) + ", verticalAlignment=" + ((Object) s6.y(this.r)) + ')';
    }
}
