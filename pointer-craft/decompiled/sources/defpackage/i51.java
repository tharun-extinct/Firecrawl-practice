package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i51 {
    public int g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i51) && this.g == ((i51) obj).g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return du4.w(this.g, "DeltaCounter(count=", ")");
    }
}
