package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class nd2 {
    public static final nd2 v = new nd2(0, 0, 0, 0);
    public final int g;
    public final int n;
    public final int r;
    public final int y;

    public nd2(int i, int i2, int i3, int i4) {
        this.g = i;
        this.y = i2;
        this.r = i3;
        this.n = i4;
    }

    public static nd2 g(nd2 nd2Var, nd2 nd2Var2) {
        return r(Math.max(nd2Var.g, nd2Var2.g), Math.max(nd2Var.y, nd2Var2.y), Math.max(nd2Var.r, nd2Var2.r), Math.max(nd2Var.n, nd2Var2.n));
    }

    public static nd2 n(Insets insets) {
        return r(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static nd2 r(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? v : new nd2(i, i2, i3, i4);
    }

    public static nd2 y(nd2 nd2Var, nd2 nd2Var2) {
        return r(Math.min(nd2Var.g, nd2Var2.g), Math.min(nd2Var.y, nd2Var2.y), Math.min(nd2Var.r, nd2Var2.r), Math.min(nd2Var.n, nd2Var2.n));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nd2.class != obj.getClass()) {
            return false;
        }
        nd2 nd2Var = (nd2) obj;
        return this.n == nd2Var.n && this.g == nd2Var.g && this.r == nd2Var.r && this.y == nd2Var.y;
    }

    public final int hashCode() {
        return (((((this.g * 31) + this.y) * 31) + this.r) * 31) + this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.g);
        sb.append(", top=");
        sb.append(this.y);
        sb.append(", right=");
        sb.append(this.r);
        sb.append(", bottom=");
        return fj.x(sb, this.n, '}');
    }

    public final Insets v() {
        return sj.w(this.g, this.y, this.r, this.n);
    }
}
