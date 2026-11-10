package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t71 extends v71 {
    public final g61 g;
    public final cq0 y;

    public t71(g61 g61Var, cq0 cq0Var) {
        this.g = g61Var;
        this.y = cq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t71)) {
            return false;
        }
        t71 t71Var = (t71) obj;
        return this.g.equals(t71Var.g) && this.y == t71Var.y;
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "PairingFailed(device=" + this.g + ", reason=" + this.y + ")";
    }
}
