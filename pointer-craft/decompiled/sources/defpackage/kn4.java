package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class kn4 extends pn4 {
    public final mn4 r;

    public kn4(mn4 mn4Var) {
        this.r = mn4Var;
    }

    @Override // defpackage.pn4
    public final void g(Matrix matrix, an4 an4Var, int i, Canvas canvas) {
        RectF rectF = mn4.j;
        mn4 mn4Var = this.r;
        float f = mn4Var.x;
        float f2 = mn4Var.l;
        RectF rectF2 = new RectF(mn4Var.y, mn4Var.r, mn4Var.n, mn4Var.v);
        Paint paint = an4Var.y;
        boolean z = f2 < 0.0f;
        Path path = an4Var.l;
        int[] iArr = an4.m;
        if (z) {
            iArr[0] = 0;
            iArr[1] = an4Var.x;
            iArr[2] = an4Var.v;
            iArr[3] = an4Var.n;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = -i;
            rectF2.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = an4Var.n;
            iArr[2] = an4Var.v;
            iArr[3] = an4Var.x;
        }
        float fWidth = rectF2.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = an4.q;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF2.centerX(), rectF2.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF2.height() / rectF2.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, an4Var.j);
        }
        canvas.drawArc(rectF2, f, f2, true, paint);
        canvas.restore();
    }
}
