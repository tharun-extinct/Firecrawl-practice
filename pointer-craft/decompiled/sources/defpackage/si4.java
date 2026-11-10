package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class si4 {
    public static final mj4 g = new mj4("SelectionHandleInfo");

    public static final long g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
