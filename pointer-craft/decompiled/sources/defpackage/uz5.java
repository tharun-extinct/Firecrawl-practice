package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uz5 {
    public static final nm0 g = new nm0(488326255, false, new bn0(12));

    public static float g(float f, float f2, float f3, float f4, float f5) {
        return r(f, f2, Math.max(0.0f, Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }

    public static float r(float f, float f2, float f3) {
        return du4.y(f2, f, f3, f);
    }

    public static boolean y(byte b) {
        return b > -65;
    }
}
