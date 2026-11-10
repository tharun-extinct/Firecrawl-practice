package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xn3 implements n22 {
    public final vn3 g;
    public final vn3 n;
    public final vn3 r;
    public final vn3 v;
    public final vn3 x;
    public final vn3 y;

    public /* synthetic */ xn3(vn3 vn3Var, vn3 vn3Var2, vn3 vn3Var3, vn3 vn3Var4) {
        this(new vn3(3, 0.0f), vn3Var, vn3Var2, new vn3(3, 0.0f), vn3Var3, vn3Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn3)) {
            return false;
        }
        xn3 xn3Var = (xn3) obj;
        return yf2.p(this.g, xn3Var.g) && yf2.p(this.y, xn3Var.y) && yf2.p(this.r, xn3Var.r) && yf2.p(this.n, xn3Var.n) && yf2.p(this.v, xn3Var.v) && yf2.p(this.x, xn3Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode() + ((this.v.hashCode() + ((this.n.hashCode() + ((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.g + ", start=" + this.y + ", top=" + this.r + ", right=" + this.n + ", end=" + this.v + ", bottom=" + this.x + ')';
    }

    public xn3(vn3 vn3Var, vn3 vn3Var2, vn3 vn3Var3, vn3 vn3Var4, vn3 vn3Var5, vn3 vn3Var6) {
        this.g = vn3Var;
        this.y = vn3Var2;
        this.r = vn3Var3;
        this.n = vn3Var4;
        this.v = vn3Var5;
        this.x = vn3Var6;
    }
}
