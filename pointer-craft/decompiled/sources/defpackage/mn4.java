package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class mn4 extends on4 {
    public static final RectF j = new RectF();
    public float l;
    public final float n;
    public final float r;
    public final float v;
    public float x;
    public final float y;

    public mn4(float f, float f2, float f3, float f4) {
        this.y = f;
        this.r = f2;
        this.n = f3;
        this.v = f4;
    }

    @Override // defpackage.on4
    public final void g(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.n;
        float f2 = this.v;
        RectF rectF = j;
        rectF.set(this.y, this.r, f, f2);
        path.arcTo(rectF, this.x, this.l, false);
        path.transform(matrix);
    }
}
