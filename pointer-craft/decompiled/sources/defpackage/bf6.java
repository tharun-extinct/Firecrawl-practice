package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bf6 {
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float g(ts3 ts3Var, boolean z, i72[] i72VarArr, float f) {
        float f2 = Float.NaN;
        for (i72 i72Var : i72VarArr) {
            float fG = ts3Var.g(i72Var);
            if (Float.isNaN(f2)) {
                f2 = fG;
            } else if (z == (fG > f2)) {
                f2 = fG;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static float r(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return gg1.r(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static float y(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return gg1.y(edgeEffect);
        }
        return 0.0f;
    }
}
