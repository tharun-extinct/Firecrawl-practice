package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zu3 {
    public final int g;

    public /* synthetic */ zu3(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zu3) {
            return this.g == ((zu3) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return du4.w(this.g, "PointerKeyboardModifiers(packedValue=", ")");
    }
}
