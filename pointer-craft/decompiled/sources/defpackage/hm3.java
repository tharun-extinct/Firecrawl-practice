package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hm3 extends nm3 {
    public final w75 g;
    public final boolean l;
    public final int n;
    public final int r;
    public final String v;
    public final boolean x;
    public final String y;

    public hm3(w75 w75Var, String str, int i, int i2, String str2, boolean z, boolean z2) {
        this.g = w75Var;
        this.y = str;
        this.r = i;
        this.n = i2;
        this.v = str2;
        this.x = z;
        this.l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm3)) {
            return false;
        }
        hm3 hm3Var = (hm3) obj;
        return yf2.p(this.g, hm3Var.g) && yf2.p(this.y, hm3Var.y) && this.r == hm3Var.r && this.n == hm3Var.n && yf2.p(this.v, hm3Var.v) && this.x == hm3Var.x && this.l == hm3Var.l;
    }

    @Override // defpackage.nm3
    public final boolean g() {
        return this.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + xi3.l(xi3.x(du4.r(this.n, du4.r(this.r, xi3.x(this.g.hashCode() * 31, 31, this.y), 31), 31), 31, this.v), 31, this.x);
    }

    public final String toString() {
        return "List(title=" + this.g + ", key=" + this.y + ", entries=" + this.r + ", entriesValues=" + this.n + ", defaultValue=" + this.v + ", multi=" + this.x + ", proFeature=" + this.l + ")";
    }

    @Override // defpackage.nm3
    public final w75 y() {
        return this.g;
    }

    public /* synthetic */ hm3(w75 w75Var, String str, int i, int i2, String str2, boolean z, int i3) {
        this(w75Var, str, i, i2, str2, (i3 & 32) != 0 ? false : z, (i3 & 64) == 0);
    }
}
