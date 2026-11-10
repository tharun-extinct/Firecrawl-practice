package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wb5 {
    public final cj g;
    public final aj3 y;

    public wb5(cj cjVar, aj3 aj3Var) {
        this.g = cjVar;
        this.y = aj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb5)) {
            return false;
        }
        wb5 wb5Var = (wb5) obj;
        return yf2.p(this.g, wb5Var.g) && this.y.equals(wb5Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.g) + ", offsetMapping=" + this.y + ")";
    }
}
