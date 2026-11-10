package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xf1 implements oi5 {
    public final tp3 g;

    public xf1(tp3 tp3Var) {
        this.g = tp3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xf1) && this.g == ((xf1) obj).g;
    }

    @Override // defpackage.oi5
    public final Object g(tr3 tr3Var) {
        return this.g.getValue();
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.g + ")";
    }
}
