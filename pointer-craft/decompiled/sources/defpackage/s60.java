package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface s60 {
    public static final r60 g = r60.g;

    default float g(float f, float f2, float f3) {
        g.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
