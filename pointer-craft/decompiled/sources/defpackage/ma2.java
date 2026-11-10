package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ma2 {
    public static final ma2 l = new ma2(false, 0, true, 1, 1, tx2.a);
    public final boolean g;
    public final int n;
    public final boolean r;
    public final int v;
    public final tx2 x;
    public final int y;

    public ma2(boolean z, int i, boolean z2, int i2, int i3, tx2 tx2Var) {
        this.g = z;
        this.y = i;
        this.r = z2;
        this.n = i2;
        this.v = i3;
        this.x = tx2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma2)) {
            return false;
        }
        ma2 ma2Var = (ma2) obj;
        return this.g == ma2Var.g && this.y == ma2Var.y && this.r == ma2Var.r && this.n == ma2Var.n && this.v == ma2Var.v && yf2.p(this.x, ma2Var.x);
    }

    public final int hashCode() {
        return this.x.j.hashCode() + du4.r(this.v, du4.r(this.n, xi3.l(du4.r(this.y, Boolean.hashCode(this.g) * 31, 31), 31, this.r), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.g + ", capitalization=" + c93.G(this.y) + ", autoCorrect=" + this.r + ", keyboardType=" + pw5.U(this.n) + ", imeAction=" + la2.g(this.v) + ", platformImeOptions=null, hintLocales=" + this.x + ")";
    }
}
