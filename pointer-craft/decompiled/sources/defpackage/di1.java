package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di1 {
    public final int g;

    public static String g(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        return i == 2 ? "EmojiSupportMatch.All" : du4.w(i, "Invalid(value=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof di1) {
            return this.g == ((di1) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return g(this.g);
    }
}
