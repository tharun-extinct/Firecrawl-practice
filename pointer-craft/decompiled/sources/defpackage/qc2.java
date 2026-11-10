package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qc2 {
    public static final long g = g(Float.NaN, Float.NaN);
    public static final /* synthetic */ int y = 0;

    public static long g(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static String y(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ")";
    }
}
