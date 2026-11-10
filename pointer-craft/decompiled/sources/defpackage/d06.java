package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d06 {
    public static ha2 a;
    public static final nm0 g = new nm0(-686688700, false, new bn0(16));
    public static final nm0 y = new nm0(554495716, false, new bn0(17));
    public static final nm0 r = new nm0(533640379, false, new gn0(8));
    public static final nm0 n = new nm0(1053941333, false, new gn0(9));
    public static final nm0 v = new nm0(2139954461, false, new bn0(18));
    public static final nm0 x = new nm0(-1238251395, false, new bn0(19));
    public static final nm0 l = new nm0(-1115890335, false, new bn0(20));
    public static final nm0 j = new nm0(-51009343, false, new bn0(21));
    public static final nm0 t = new nm0(-231124806, false, new gn0(10));

    public static final long g(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void r(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            r((View) parent, fArr, fArr2, iArr);
            ra.J(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            ra.J(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            ra.J(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            ra.J(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        gp4.R(matrix, fArr2);
        ra.I(fArr, fArr2);
    }

    public static void y(ba baVar, float[] fArr, float[] fArr2, int[] iArr) {
        l33.n(fArr);
        r(baVar, fArr, fArr2, iArr);
    }
}
