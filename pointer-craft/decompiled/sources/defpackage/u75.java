package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u75 {
    public static final /* synthetic */ int r = 0;
    public static final long y = sp2.y(0, 0);
    public final long g;

    public /* synthetic */ u75(long j) {
        this.g = j;
    }

    public static boolean g(long j, Object obj) {
        return (obj instanceof u75) && j == ((u75) obj).g;
    }

    public static String j(long j) {
        return du4.q((int) (j >> 32), (int) (j & 4294967295L), "TextRange(", ", ", ")");
    }

    public static final boolean l(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static final int n(long j) {
        return v(j) - x(j);
    }

    public static final boolean r(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int v(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int x(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean y(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return g(this.g, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return j(this.g);
    }
}
