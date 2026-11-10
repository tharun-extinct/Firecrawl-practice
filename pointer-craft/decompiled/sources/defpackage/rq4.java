package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rq4 {
    public final jp2 g;
    public final jp2 y;

    public rq4(jp2 jp2Var, jp2 jp2Var2) {
        this.g = jp2Var;
        this.y = jp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq4)) {
            return false;
        }
        rq4 rq4Var = (rq4) obj;
        return this.g == rq4Var.g && this.y == rq4Var.y;
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + this.g + ", height=" + this.y + ')';
    }
}
