package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ja4 extends Drawable {
    public static final double g = Math.cos(Math.toRadians(45.0d));

    public static float g(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - g) * ((double) f2)) + ((double) f));
    }

    public static float y(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - g) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
