package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o85 {
    public final long g;

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static String y(long j) {
        if (g(j, 0L)) {
            return "Unspecified";
        }
        if (g(j, 4294967296L)) {
            return "Sp";
        }
        return g(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o85) {
            return this.g == ((o85) obj).g;
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
