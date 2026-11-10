package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vq4 {
    public final xy1 g;
    public final no1 y;

    public vq4(xy1 xy1Var, no1 no1Var) {
        this.g = xy1Var;
        this.y = no1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq4)) {
            return false;
        }
        vq4 vq4Var = (vq4) obj;
        return yf2.p(this.g, vq4Var.g) && yf2.p(this.y, vq4Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.g + ", animationSpec=" + this.y + ")";
    }
}
