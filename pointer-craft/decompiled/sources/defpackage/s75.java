package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s75 {
    public final int g;
    public final boolean y;
    public static final s75 r = new s75(2, false);
    public static final s75 n = new s75(1, true);

    public s75(int i, boolean z) {
        this.g = i;
        this.y = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s75)) {
            return false;
        }
        s75 s75Var = (s75) obj;
        return this.g == s75Var.g && this.y == s75Var.y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.y) + (Integer.hashCode(this.g) * 31);
    }

    public final String toString() {
        if (equals(r)) {
            return "TextMotion.Static";
        }
        return equals(n) ? "TextMotion.Animated" : "Invalid";
    }
}
