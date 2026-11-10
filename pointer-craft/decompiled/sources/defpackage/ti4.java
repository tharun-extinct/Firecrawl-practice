package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ti4 {
    public static final zu4 n;
    public static final long r;
    public static final si g = new si(Float.NaN, Float.NaN);
    public static final te5 y = new te5(new vy3(9), new vy3(10));

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        r = jFloatToRawIntBits;
        n = new zu4(new wi3(jFloatToRawIntBits));
    }
}
