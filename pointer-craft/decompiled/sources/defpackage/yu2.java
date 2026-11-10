package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yu2 {
    public final int g;

    public final boolean equals(Object obj) {
        if (obj instanceof yu2) {
            return this.g == ((yu2) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        int i = this.g;
        if (i == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        return i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
