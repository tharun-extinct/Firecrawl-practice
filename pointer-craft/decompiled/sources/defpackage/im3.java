package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class im3 extends nm3 {
    public final w75 g;

    public im3(w75 w75Var) {
        this.g = w75Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof im3) && this.g.equals(((im3) obj).g);
    }

    @Override // defpackage.nm3
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "Section(title=" + this.g + ", proFeature=false)";
    }

    @Override // defpackage.nm3
    public final w75 y() {
        return this.g;
    }
}
