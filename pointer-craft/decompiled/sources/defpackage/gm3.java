package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gm3 extends nm3 {
    public final w75 g;
    public final boolean r;
    public final String y;

    public gm3(w75 w75Var, String str, boolean z) {
        this.g = w75Var;
        this.y = str;
        this.r = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm3)) {
            return false;
        }
        gm3 gm3Var = (gm3) obj;
        return this.g.equals(gm3Var.g) && this.y.equals(gm3Var.y) && this.r == gm3Var.r;
    }

    @Override // defpackage.nm3
    public final boolean g() {
        return this.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + xi3.x(this.g.hashCode() * 31, 31, this.y);
    }

    public final String toString() {
        return "LayoutOption(title=" + this.g + ", key=" + this.y + ", proFeature=" + this.r + ")";
    }

    @Override // defpackage.nm3
    public final w75 y() {
        return this.g;
    }
}
