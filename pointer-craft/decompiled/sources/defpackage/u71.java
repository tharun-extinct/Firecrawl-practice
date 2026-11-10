package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u71 extends v71 {
    public final g61 g;

    public u71(g61 g61Var) {
        this.g = g61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u71) && this.g.equals(((u71) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "ResetConnectionView(device=" + this.g + ")";
    }
}
