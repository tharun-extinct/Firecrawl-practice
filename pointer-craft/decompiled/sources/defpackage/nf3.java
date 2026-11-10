package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nf3 {
    public final my1 g;
    public final my1 r;
    public final xy1 y;

    public nf3(my1 my1Var, xy1 xy1Var, my1 my1Var2) {
        my1Var.getClass();
        xy1Var.getClass();
        my1Var2.getClass();
        this.g = my1Var;
        this.y = xy1Var;
        this.r = my1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf3)) {
            return false;
        }
        nf3 nf3Var = (nf3) obj;
        return yf2.p(this.g, nf3Var.g) && yf2.p(this.y, nf3Var.y) && yf2.p(this.r, nf3Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NavigationHandlers(navigateToDevice=" + this.g + ", navigateToFixDevice=" + this.y + ", navigateToKeyboardLayout=" + this.r + ")";
    }
}
