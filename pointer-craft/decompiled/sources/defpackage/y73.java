package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y73 {
    public final long g;

    public /* synthetic */ y73(long j) {
        this.g = j;
    }

    public static final /* synthetic */ y73 g(long j) {
        return new y73(j);
    }

    public static final long n(long j) {
        int i = (int) (j >>> 32);
        return (((long) Float.floatToRawIntBits((short) (i & 65535))) & 4294967295L) | (Float.floatToRawIntBits((short) (i >>> 16)) << 32);
    }

    public static final boolean r(long j) {
        return (j & 1) != 0;
    }

    public static final long v(long j) {
        return (j >> 1) & 2147483647L;
    }

    public static long y(long j, long j2) {
        return ((j & 2147483647L) << 1) | 1 | (((long) ((((short) Float.intBitsToFloat((int) (j2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (j2 >> 32))) << 16))) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y73) {
            return this.g == ((y73) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.g + ")";
    }

    public final /* synthetic */ long x() {
        return this.g;
    }
}
