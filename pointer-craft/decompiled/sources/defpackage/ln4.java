package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class ln4 extends pn4 {
    public final float n;
    public final nn4 r;
    public final float v;

    public ln4(nn4 nn4Var, float f, float f2) {
        this.r = nn4Var;
        this.n = f;
        this.v = f2;
    }

    @Override // defpackage.pn4
    public final void g(Matrix matrix, an4 an4Var, int i, Canvas canvas) {
        nn4 nn4Var = this.r;
        float f = nn4Var.r;
        float f2 = this.v;
        float f3 = nn4Var.y;
        float f4 = this.n;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.g;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(y());
        an4Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = an4Var.x;
        int[] iArr = an4.t;
        iArr[0] = i2;
        iArr[1] = an4Var.v;
        iArr[2] = an4Var.n;
        Paint paint = an4Var.r;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, an4.a, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float y() {
        nn4 nn4Var = this.r;
        return (float) Math.toDegrees(Math.atan((nn4Var.r - this.v) / (nn4Var.y - this.n)));
    }
}
