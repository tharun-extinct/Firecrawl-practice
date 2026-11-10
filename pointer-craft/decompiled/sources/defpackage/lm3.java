package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lm3 extends nm3 {
    public final w75 g;
    public final boolean n;
    public final boolean r;
    public final String y;

    public lm3(w75 w75Var, String str, int i) {
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) == 0;
        this.g = w75Var;
        this.y = str;
        this.r = z;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm3)) {
            return false;
        }
        lm3 lm3Var = (lm3) obj;
        return this.g.equals(lm3Var.g) && this.y.equals(lm3Var.y) && this.r == lm3Var.r && this.n == lm3Var.n;
    }

    @Override // defpackage.nm3
    public final boolean g() {
        return this.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + xi3.l(xi3.x(this.g.hashCode() * 31, 31, this.y), 31, this.r);
    }

    public final String toString() {
        return "Toggle(title=" + this.g + ", key=" + this.y + ", default=" + this.r + ", proFeature=" + this.n + ")";
    }

    @Override // defpackage.nm3
    public final w75 y() {
        return this.g;
    }
}
