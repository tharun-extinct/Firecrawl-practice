package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ed2 {
    public final int g;

    public final boolean equals(Object obj) {
        if (obj instanceof ed2) {
            return this.g == ((ed2) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        int i = this.g;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
