package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mm5 {
    public static void g(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void r(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public static void y(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
