package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r75 {
    public final int g;

    public final boolean equals(Object obj) {
        if (obj instanceof r75) {
            return this.g == ((r75) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        int i = this.g;
        if (i == 1) {
            return "Linearity.Linear";
        }
        if (i == 2) {
            return "Linearity.FontHinting";
        }
        return i == 3 ? "Linearity.None" : "Invalid";
    }
}
