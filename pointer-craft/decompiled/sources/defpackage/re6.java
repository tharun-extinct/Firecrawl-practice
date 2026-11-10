package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class re6 {
    public static final float a;
    public static final in4 g = in4.s;
    public static final float j;
    public static final sj0 l;
    public static final sj0 m;
    public static final float n;
    public static final nf5 q;
    public static final float r;
    public static final float t;
    public static final sj0 v;
    public static final sj0 w;
    public static final float x;
    public static final sj0 y;

    static {
        sj0 sj0Var = sj0.i;
        y = sj0Var;
        r = 0.38f;
        n = 8.0f;
        v = sj0.B;
        x = 1.0f;
        l = sj0Var;
        j = 1.0f;
        t = 3.0f;
        a = 1.0f;
        m = sj0.b;
        q = nf5.q;
        w = sj0.u;
    }

    public static final boolean n(ec1 ec1Var, long j2) {
        if (!ec1Var.j.h) {
            return false;
        }
        sc2 sc2Var = k33.V(ec1Var).M.r;
        if (!sc2Var.j0.h) {
            return false;
        }
        long jN = sc2Var.N(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jN & 4294967295L));
        long j3 = ec1Var.k;
        float f = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    public static final void r(hd5 hd5Var, xy1 xy1Var) {
        if (xy1Var.a(hd5Var) != gd5.j) {
            return;
        }
        sp2.A(hd5Var, xy1Var);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void v(Resources.Theme theme) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29) {
            sj.c(theme);
            return;
        }
        synchronized (wd6.g) {
            if (wd6.r) {
                method = wd6.y;
                if (method != null) {
                    method.invoke(theme, null);
                }
            } else {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    wd6.y = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                }
                wd6.r = true;
                method = wd6.y;
                if (method != null) {
                    try {
                        method.invoke(theme, null);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                        wd6.y = null;
                    }
                }
            }
            throw th;
        }
    }

    public static final void y(ec1 ec1Var, v92 v92Var) {
        ec1Var.R0();
        ec1Var.T0(v92Var);
    }
}
