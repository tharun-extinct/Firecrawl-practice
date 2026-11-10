package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nb2 {
    public final int g;

    public final boolean equals(Object obj) {
        if (obj instanceof nb2) {
            return this.g == ((nb2) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return du4.w(this.g, "IndirectPointerEventPrimaryDirectionalMotionAxis(value=", ")");
    }
}
