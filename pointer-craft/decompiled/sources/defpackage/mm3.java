package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mm3 extends nm3 {
    public final w75 g;
    public final km3 y;

    public mm3(w75 w75Var, km3 km3Var) {
        this.g = w75Var;
        this.y = km3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm3)) {
            return false;
        }
        mm3 mm3Var = (mm3) obj;
        return this.g.equals(mm3Var.g) && this.y.equals(mm3Var.y);
    }

    @Override // defpackage.nm3
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WrappedOption(title=" + this.g + ", option=" + this.y + ", proFeature=false)";
    }

    @Override // defpackage.nm3
    public final w75 y() {
        return this.g;
    }
}
