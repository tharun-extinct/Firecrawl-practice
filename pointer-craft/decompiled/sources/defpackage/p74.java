package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p74 {
    public final int g;
    public final ov1 n;
    public final int r;
    public final qv1 y;

    public p74(int i, qv1 qv1Var, int i2, ov1 ov1Var) {
        this.g = i;
        this.y = qv1Var;
        this.r = i2;
        this.n = ov1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p74)) {
            return false;
        }
        p74 p74Var = (p74) obj;
        return this.g == p74Var.g && yf2.p(this.y, p74Var.y) && this.r == p74Var.r && this.n.equals(p74Var.n);
    }

    public final int hashCode() {
        return this.n.g.hashCode() + du4.r(0, du4.r(this.r, ((this.g * 31) + this.y.j) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        int i = this.r;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(this.g);
        sb.append(", weight=");
        sb.append(this.y);
        sb.append(", style=");
        return du4.b(sb, str, ", loadingStrategy=Blocking)");
    }
}
