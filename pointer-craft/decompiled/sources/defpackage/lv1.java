package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lv1 {
    public final int g;

    public final boolean equals(Object obj) {
        if (obj instanceof lv1) {
            return this.g == ((lv1) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        int i = this.g;
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }
}
