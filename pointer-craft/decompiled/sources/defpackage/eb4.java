package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eb4 {
    public final np2 g;
    public final boolean r;
    public final boolean y;

    public eb4(np2 np2Var, boolean z, boolean z2) {
        this.g = np2Var;
        this.y = z;
        this.r = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb4)) {
            return false;
        }
        eb4 eb4Var = (eb4) obj;
        return this.g == eb4Var.g && this.y == eb4Var.y && this.r == eb4Var.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + xi3.l(this.g.hashCode() * 31, 31, this.y);
    }

    public final String toString() {
        return "RowColumnChildSelector(type=" + this.g + ", expandWidth=" + this.y + ", expandHeight=" + this.r + ')';
    }
}
