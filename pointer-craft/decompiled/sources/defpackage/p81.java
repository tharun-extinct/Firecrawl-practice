package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p81 {
    public final v71 g;

    public p81(v71 v71Var) {
        this.g = v71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p81) && this.g.equals(((p81) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "DeviceSetupState(currentScreen=" + this.g + ")";
    }
}
