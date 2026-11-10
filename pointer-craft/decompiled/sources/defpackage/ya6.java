package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ya6 {
    public static final String[] g = {"standard", "accelerate", "decelerate", "linear"};
    public static ha2 y;

    public static boolean l(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static boolean n(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean r(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean v(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static boolean x(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public abstract boolean c(View view, int i);

    public abstract int g(View view, int i);

    public int j(View view) {
        return 0;
    }

    public abstract void q(View view, int i, int i2);

    public int t() {
        return 0;
    }

    public abstract void w(View view, float f, float f2);

    public int y(View view, int i) {
        return view.getTop();
    }

    public void m(int i) {
    }

    public void a(View view, int i) {
    }
}
