package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class af1 {
    public final qf0 g;
    public final PathMeasure n;
    public final Path r;
    public final Matrix v;
    public final Path y;

    public af1(qf0 qf0Var) {
        Path path = new Path();
        this.y = path;
        this.r = new Path();
        this.n = new PathMeasure(path, false);
        this.g = qf0Var;
        this.v = new Matrix();
    }

    public abstract void g();

    public final void y(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.g.y();
        kf0 kf0Var = (kf0) this;
        float fWidth = rect.width() / kf0Var.l();
        float fHeight = rect.height() / kf0Var.l();
        qf0 qf0Var = kf0Var.g;
        float f2 = (qf0Var.p / 2.0f) + qf0Var.u;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (qf0Var.z != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        int i = qf0Var.g;
        float f4 = i;
        kf0Var.x = f4 * f;
        kf0Var.l = Math.min(i / 2, qf0Var.n ? (int) (f4 * qf0Var.r) : qf0Var.y) * f;
        kf0Var.j = qf0Var.q * f;
        int i2 = qf0Var.p;
        int i3 = qf0Var.g;
        float f5 = (i2 - i3) / 2.0f;
        kf0Var.t = f5;
        if (z || z2) {
            float f6 = ((1.0f - f) * i3) / 2.0f;
            if ((z && qf0Var.l == 2) || (z2 && qf0Var.j == 1)) {
                kf0Var.t = f5 + f6;
            } else if ((z && qf0Var.l == 1) || (z2 && qf0Var.j == 2)) {
                kf0Var.t = f5 - f6;
            }
        }
        if (z2 && qf0Var.j == 3) {
            kf0Var.i = f;
        } else {
            kf0Var.i = 1.0f;
        }
    }
}
