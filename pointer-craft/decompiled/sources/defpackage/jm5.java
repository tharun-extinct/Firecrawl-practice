package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jm5 {
    public static final pm5 g;
    public static final qc0 y;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            g = new qm5();
        } else {
            g = new pm5();
        }
        y = new qc0(Float.class, "translationAlpha", (byte) 7);
        new qc0(Rect.class, "clipBounds", (byte) 8);
    }

    public static float g(View view) {
        return g.n(view);
    }

    public static void n(View view, float f) {
        g.x(view, f);
    }

    public static void r(View view, int i, int i2, int i3, int i4) {
        g.l(view, i, i2, i3, i4);
    }

    public static void v(View view, int i) {
        g.j(view, i);
    }

    public static void y() {
        g.getClass();
    }
}
