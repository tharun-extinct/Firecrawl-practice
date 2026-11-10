package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jp0 implements oi5 {
    public final xy1 g;

    public jp0(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jp0) && yf2.p(this.g, ((jp0) obj).g);
    }

    @Override // defpackage.oi5
    public final Object g(tr3 tr3Var) {
        return this.g.a(tr3Var);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.g + ")";
    }
}
