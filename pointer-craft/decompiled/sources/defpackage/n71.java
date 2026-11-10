package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n71 extends v71 {
    public final g61 g;

    public n71(g61 g61Var) {
        this.g = g61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n71) && this.g.equals(((n71) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "ConnectDevice(device=" + this.g + ")";
    }
}
