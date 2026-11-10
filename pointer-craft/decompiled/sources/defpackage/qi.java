package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class qi {
    public static final LinearInterpolator g = new LinearInterpolator();
    public static final on1 y = new on1((byte) 1);
    public static final on1 r = new on1((byte) 0);
    public static final on1 n = new on1(on1.v);

    static {
        new DecelerateInterpolator();
    }

    public static float g(float f, float f2, float f3) {
        return du4.y(f2, f, f3, f);
    }

    public static int r(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static float y(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : g(f, f2, (f5 - f3) / (f4 - f3));
    }
}
