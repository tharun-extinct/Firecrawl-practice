package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wy3 {
    public final int g;

    public wy3(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wy3) {
            return this.g == ((wy3) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g;
    }
}
