package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ee2 {
    public final long g;

    public /* synthetic */ ee2(long j) {
        this.g = j;
    }

    public static long g(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ee2) {
            return this.g == ((ee2) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.g;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return fj.x(sb, (int) (j & 4294967295L), ')');
    }
}
