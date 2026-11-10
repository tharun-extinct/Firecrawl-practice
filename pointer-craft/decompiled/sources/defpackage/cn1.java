package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cn1 {
    public final o22 g;
    public final o22 y;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ cn1(o22 o22Var, int i) {
        int i2 = i & 2;
        m22 m22Var = m22.g;
        this(m22Var, i2 != 0 ? m22Var : o22Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn1)) {
            return false;
        }
        cn1 cn1Var = (cn1) obj;
        return yf2.p(this.g, cn1Var.g) && yf2.p(this.y, cn1Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=" + this.g + ", nonSizeOrCornerModifiers=" + this.y + ')';
    }

    public cn1(o22 o22Var, o22 o22Var2) {
        this.g = o22Var;
        this.y = o22Var2;
    }
}
