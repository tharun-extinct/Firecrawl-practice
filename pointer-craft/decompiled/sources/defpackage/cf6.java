package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cf6 {
    public static final void a(String str) {
        throw new NoSuchElementException(str);
    }

    public static float g(EdgeEffect edgeEffect, float f, float f2, j51 j51Var) {
        float f3 = hg1.g;
        double dY = j51Var.y() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) hg1.g) * dY;
        if (((float) (Math.exp((hg1.y / hg1.r) * Math.log(dAbs / d)) * d)) > r(edgeEffect) * f2) {
            return 0.0f;
        }
        n(edgeEffect, k33.Z(f));
        return f;
    }

    public static final void j(String str) {
        throw new IllegalStateException(str);
    }

    public static final void l(String str) {
        throw new IllegalArgumentException(str);
    }

    public static void n(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static float r(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return wa.n(edgeEffect);
        }
        return 0.0f;
    }

    public static final void t(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static float v(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return wa.x(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static void x(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof g32)) {
            edgeEffect.onRelease();
            return;
        }
        g32 g32Var = (g32) edgeEffect;
        float f2 = g32Var.y + f;
        g32Var.y = f2;
        if (Math.abs(f2) > g32Var.g) {
            g32Var.onRelease();
        }
    }

    public static EdgeEffect y(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? wa.g(context) : new g32(context);
    }
}
