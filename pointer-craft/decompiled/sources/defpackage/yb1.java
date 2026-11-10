package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yb1 {
    public final long g;

    public /* synthetic */ yb1(long j) {
        this.g = j;
    }

    public static final float g(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String r(long j) {
        return j != 9205357640488583168L ? du4.i(vb1.r(y(j)), " x ", vb1.r(g(j))) : "DpSize.Unspecified";
    }

    public static final float y(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yb1) {
            return this.g == ((yb1) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return r(this.g);
    }
}
