package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ax0 implements n22 {
    public final x91 g;

    public ax0(x91 x91Var) {
        this.g = x91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax0) && this.g.equals(((ax0) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.g + ')';
    }
}
