package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qe2 {
    public final long g;

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static String y(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qe2) {
            return this.g == ((qe2) obj).g;
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
