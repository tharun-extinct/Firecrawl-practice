package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vb5 {
    public static final /* synthetic */ int r = 0;
    public static final long y = xs2.r(0.5f, 0.5f);
    public final long g;

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static String y(long j) {
        return "TransformOrigin(packedValue=" + j + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vb5) {
            return this.g == ((vb5) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return y(this.g);
    }
}
