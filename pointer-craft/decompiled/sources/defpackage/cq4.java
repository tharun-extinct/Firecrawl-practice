package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cq4 {
    public final long g;

    public /* synthetic */ cq4(long j) {
        this.g = j;
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static String n(long j) {
        return j != 9205357640488583168L ? xi3.a("Size(", et2.v(Float.intBitsToFloat((int) (j >> 32))), ", ", et2.v(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "Size.Unspecified";
    }

    public static final boolean r(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static final float y(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cq4) {
            return this.g == ((cq4) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return n(this.g);
    }
}
