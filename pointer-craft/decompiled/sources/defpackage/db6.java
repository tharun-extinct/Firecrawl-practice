package defpackage;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class db6 {
    public static final sj0 g = sj0.B;
    public static final float y = 1.0f;
    public static final in4 r = in4.i;
    public static final sj0 n = sj0.k;
    public static final float v = 1.0f;
    public static final float x = 0.38f;
    public static final float l = 8.0f;
    public static final float j = 1.0f;
    public static final float t = 3.0f;
    public static final float a = 1.0f;

    public static final hb3 g(hb3 hb3Var) {
        if (hb3Var.t()) {
            hb3 hb3Var2 = ee4.y;
            hb3Var2.getClass();
            return hb3Var2;
        }
        hb3 hb3Var3 = new hb3(hb3Var.v);
        hb3Var3.m(hb3Var);
        return hb3Var3;
    }

    public static void n(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static void r(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static boolean v(MotionEvent motionEvent, int i) {
        return i != 0 && (motionEvent.getButtonState() & i) == i;
    }

    public static void y(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }
}
