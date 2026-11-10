package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ob0 {
    public j51 g;
    public long n;
    public nb0 r;
    public fl2 y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob0)) {
            return false;
        }
        ob0 ob0Var = (ob0) obj;
        return yf2.p(this.g, ob0Var.g) && this.y == ob0Var.y && yf2.p(this.r, ob0Var.r) && cq4.g(this.n, ob0Var.n);
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + ((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.g + ", layoutDirection=" + this.y + ", canvas=" + this.r + ", size=" + cq4.n(this.n) + ")";
    }
}
