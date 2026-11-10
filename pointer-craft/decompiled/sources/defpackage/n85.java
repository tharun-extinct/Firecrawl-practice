package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n85 {
    public final long g;
    public static final o85[] y = {new o85(0), new o85(4294967296L), new o85(8589934592L)};
    public static final long r = kq2.O(Float.NaN, 0);

    public /* synthetic */ n85(long j) {
        this.g = j;
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static String n(long j) {
        long jY = y(j);
        if (o85.g(jY, 0L)) {
            return "Unspecified";
        }
        if (o85.g(jY, 4294967296L)) {
            return r(j) + ".sp";
        }
        if (!o85.g(jY, 8589934592L)) {
            return "Invalid";
        }
        return r(j) + ".em";
    }

    public static final float r(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long y(long j) {
        return y[(int) ((j & 1095216660480L) >>> 32)].g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n85) {
            return this.g == ((n85) obj).g;
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
