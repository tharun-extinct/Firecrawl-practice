package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zi1 implements n22 {
    public final boolean g;

    public zi1(boolean z) {
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi1) && this.g == ((zi1) obj).g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g);
    }

    public final String toString() {
        return "EnabledModifier(enabled=" + this.g + ')';
    }
}
