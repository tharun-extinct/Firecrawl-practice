package defpackage;

import android.os.Build;
import android.view.Display;
import android.view.RoundedCorner;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pe6 {
    public static final float a;
    public static final nf5 j;
    public static final sj0 l;
    public static ha2 m;
    public static final float t;
    public static final sj0 x;
    public static final sj0 g = sj0.a;
    public static final nf5 y = nf5.q;
    public static final sj0 r = sj0.m;
    public static final float n = 6.0f;
    public static final in4 v = in4.a;

    static {
        sj0 sj0Var = sj0.t;
        x = sj0Var;
        l = sj0Var;
        j = nf5.t;
        t = 48.0f;
        a = 68.0f;
    }

    public static la4 g(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        l0.u(xi3.j("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new la4(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }
}
