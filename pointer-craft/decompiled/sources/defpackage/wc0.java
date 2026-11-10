package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wc0 {
    public final u6 g;
    public final boolean n;
    public final no1 r;
    public final xy1 y;

    public wc0(u6 u6Var, xy1 xy1Var, no1 no1Var, boolean z) {
        this.g = u6Var;
        this.y = xy1Var;
        this.r = no1Var;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc0)) {
            return false;
        }
        wc0 wc0Var = (wc0) obj;
        return yf2.p(this.g, wc0Var.g) && yf2.p(this.y, wc0Var.y) && yf2.p(this.r, wc0Var.r) && this.n == wc0Var.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + ((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.g + ", size=" + this.y + ", animationSpec=" + this.r + ", clip=" + this.n + ")";
    }
}
