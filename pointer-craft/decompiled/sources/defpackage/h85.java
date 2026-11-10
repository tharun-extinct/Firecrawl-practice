package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h85 {
    public final String g;
    public String y;
    public boolean r = false;
    public kp3 n = null;

    public h85(String str, String str2) {
        this.g = str;
        this.y = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h85)) {
            return false;
        }
        h85 h85Var = (h85) obj;
        return yf2.p(this.g, h85Var.g) && yf2.p(this.y, h85Var.y) && this.r == h85Var.r && yf2.p(this.n, h85Var.n);
    }

    public final kp3 g() {
        return this.n;
    }

    public final int hashCode() {
        int iL = xi3.l(xi3.x(this.g.hashCode() * 31, 31, this.y), 31, this.r);
        kp3 kp3Var = this.n;
        return iL + (kp3Var == null ? 0 : kp3Var.hashCode());
    }

    public final void n(kp3 kp3Var) {
        this.n = kp3Var;
    }

    public final boolean r() {
        return this.r;
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.n + ", isShowingSubstitution=" + this.r + ")";
    }

    public final void v(boolean z) {
        this.r = z;
    }

    public final void x(String str) {
        this.y = str;
    }

    public final String y() {
        return this.y;
    }
}
