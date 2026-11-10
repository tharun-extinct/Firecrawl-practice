package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q71 extends v71 {
    public final g61 g;

    public q71(g61 g61Var) {
        this.g = g61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q71) && this.g.equals(((q71) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "DevicePaired(device=" + this.g + ")";
    }
}
