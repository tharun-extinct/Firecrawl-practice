package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s71 extends v71 {
    public final g61 g;

    public s71(g61 g61Var) {
        this.g = g61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s71) && this.g.equals(((s71) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "PairDevice(device=" + this.g + ")";
    }
}
