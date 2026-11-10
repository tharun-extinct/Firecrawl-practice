package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class za {
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ za(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof za) {
            return this.g == ((za) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return du4.w(this.g, "AndroidContentDataType(androidAutofillType=", ")");
    }
}
