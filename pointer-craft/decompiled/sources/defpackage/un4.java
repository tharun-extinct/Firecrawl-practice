package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class un4 {
    public final zw0 g;
    public final zw0 j;
    public final zw0 l;
    public final zw0 n;
    public final zw0 r;
    public final zw0 v;
    public final zw0 x;
    public final zw0 y;

    public un4(zw0 zw0Var, zw0 zw0Var2, zw0 zw0Var3, zw0 zw0Var4, zw0 zw0Var5) {
        ma4 ma4Var = hn4.v;
        ma4 ma4Var2 = hn4.l;
        ma4 ma4Var3 = hn4.j;
        this.g = zw0Var;
        this.y = zw0Var2;
        this.r = zw0Var3;
        this.n = zw0Var4;
        this.v = zw0Var5;
        this.x = ma4Var;
        this.l = ma4Var2;
        this.j = ma4Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un4)) {
            return false;
        }
        un4 un4Var = (un4) obj;
        return yf2.p(this.g, un4Var.g) && yf2.p(this.y, un4Var.y) && yf2.p(this.r, un4Var.r) && yf2.p(this.n, un4Var.n) && yf2.p(this.v, un4Var.v) && yf2.p(this.x, un4Var.x) && yf2.p(this.l, un4Var.l) && yf2.p(this.j, un4Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.l.hashCode() + ((this.x.hashCode() + ((this.v.hashCode() + ((this.n.hashCode() + ((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.g + ", small=" + this.y + ", medium=" + this.r + ", large=" + this.n + ", largeIncreased=" + this.x + ", extraLarge=" + this.v + ", extralargeIncreased=" + this.l + ", extraExtraLarge=" + this.j + ')';
    }

    public un4() {
        this(hn4.g, hn4.y, hn4.r, hn4.n, hn4.x);
    }
}
