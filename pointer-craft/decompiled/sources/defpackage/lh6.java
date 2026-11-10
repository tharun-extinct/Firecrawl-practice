package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lh6 {
    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static void r(k65 k65Var, o45 o45Var, j75 j75Var, bl2 bl2Var, y65 y65Var, boolean z, aj3 aj3Var) {
        k44 k44VarY;
        if (z) {
            int iJ = aj3Var.j(u75.v(k65Var.y));
            String str = v45.g;
            if (iJ < j75Var.g.g.t.length()) {
                k44VarY = j75Var.y(iJ);
            } else {
                k44VarY = iJ != 0 ? j75Var.y(iJ - 1) : new k44(0.0f, 0.0f, 1.0f, (int) (v45.g(o45Var.y, o45Var.l, o45Var.j) & 4294967295L));
            }
            float f = k44VarY.y;
            float f2 = k44VarY.g;
            long jN = bl2Var.N((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            k44 k44VarR = kq2.r((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jN & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jN >> 32)))) << 32), (((long) Float.floatToRawIntBits(k44VarY.r - f2)) << 32) | (((long) Float.floatToRawIntBits(k44VarY.n - f)) & 4294967295L));
            if (yf2.p((y65) y65Var.g.y.get(), y65Var)) {
                y65Var.y.j(k44VarR);
            }
        }
    }

    public static float y(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }
}
