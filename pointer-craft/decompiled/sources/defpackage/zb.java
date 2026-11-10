package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zb implements lt3 {
    public final int j;

    public zb(int i) {
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb) && this.j == ((zb) obj).j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j);
    }

    public final String toString() {
        return du4.w(this.j, "AndroidFontResolveInterceptor(fontWeightAdjustment=", ")");
    }
}
