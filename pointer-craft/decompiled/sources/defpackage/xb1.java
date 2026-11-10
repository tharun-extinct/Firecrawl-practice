package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xb1 {
    public final long g;

    public static String g(long j) {
        return j != 9205357640488583168L ? xi3.a("(", vb1.r(Float.intBitsToFloat((int) (j >> 32))), ", ", vb1.r(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xb1) {
            return this.g == ((xb1) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return g(this.g);
    }
}
