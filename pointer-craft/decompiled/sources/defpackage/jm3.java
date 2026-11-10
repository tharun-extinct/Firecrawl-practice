package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jm3 extends nm3 {
    public final w75 g;
    public final int n;
    public final int r;
    public final Set v;
    public final String y;

    public jm3(w75 w75Var, String str, int i, int i2, Set set) {
        this.g = w75Var;
        this.y = str;
        this.r = i;
        this.n = i2;
        this.v = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm3)) {
            return false;
        }
        jm3 jm3Var = (jm3) obj;
        return this.g.equals(jm3Var.g) && this.y.equals(jm3Var.y) && this.r == jm3Var.r && this.n == jm3Var.n && this.v.equals(jm3Var.v);
    }

    @Override // defpackage.nm3
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.v.hashCode() + du4.r(this.n, du4.r(this.r, xi3.x(this.g.hashCode() * 31, 31, this.y), 31), 31)) * 31);
    }

    public final String toString() {
        return "Segmented(title=" + this.g + ", key=" + this.y + ", entries=" + this.r + ", entriesValues=" + this.n + ", default=" + this.v + ", proFeature=false)";
    }

    @Override // defpackage.nm3
    public final w75 y() {
        return this.g;
    }
}
