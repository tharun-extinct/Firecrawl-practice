package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mv1 {
    public final int g;

    public final boolean equals(Object obj) {
        if (obj instanceof mv1) {
            return this.g == ((mv1) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        int i = this.g;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        return i == 65535 ? "All" : "Invalid";
    }
}
