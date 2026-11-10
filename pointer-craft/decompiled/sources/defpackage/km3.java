package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class km3 extends nm3 {
    public final w75 g;
    public final String y;

    public km3(w75 w75Var, String str) {
        this.g = w75Var;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km3)) {
            return false;
        }
        km3 km3Var = (km3) obj;
        return this.g.equals(km3Var.g) && this.y.equals(km3Var.y);
    }

    @Override // defpackage.nm3
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + du4.r(50, xi3.x(this.g.hashCode() * 31, 31, this.y), 31);
    }

    public final String toString() {
        return "Slider(title=" + this.g + ", key=" + this.y + ", default=50, proFeature=false)";
    }

    @Override // defpackage.nm3
    public final w75 y() {
        return this.g;
    }
}
