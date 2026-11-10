package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jt3 {
    public static final jt3 r = new jt3(0, false);
    public final boolean g;
    public final int y;

    public jt3() {
        this.g = false;
        this.y = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt3)) {
            return false;
        }
        jt3 jt3Var = (jt3) obj;
        return this.g == jt3Var.g && this.y == jt3Var.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Boolean.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.g + ", emojiSupportMatch=" + di1.g(this.y) + ")";
    }

    public jt3(int i, boolean z) {
        this.g = z;
        this.y = i;
    }
}
