package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class nn4 extends on4 {
    public float r;
    public float y;

    @Override // defpackage.on4
    public final void g(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.y, this.r);
        path.transform(matrix);
    }
}
