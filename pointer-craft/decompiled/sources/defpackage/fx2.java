package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fx2 {
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fx2(int i) {
        this.g = i;
    }

    public static final /* synthetic */ fx2 g(int i) {
        return new fx2(i);
    }

    public static final boolean y(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fx2) {
            return this.g == ((fx2) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g ? 1 : 0);
    }

    public final /* synthetic */ int r() {
        return this.g ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.g;
        if (z) {
            return z ? "Assertive" : "Unknown";
        }
        return "Polite";
    }
}
