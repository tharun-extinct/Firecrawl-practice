package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oe6 {
    public static final in4 a;
    public static Boolean b;
    public static final float c;
    public static final sj0 g;
    public static Boolean i;
    public static final sj0 j;
    public static final float l;
    public static final float m;
    public static final sj0 n;
    public static Boolean p;
    public static final sj0 q;
    public static final float r;
    public static Boolean s;
    public static final float t;
    public static final float v;
    public static final float w;
    public static final sj0 x;
    public static final sj0 y;

    static {
        sj0 sj0Var = sj0.u;
        g = sj0Var;
        sj0 sj0Var2 = sj0.i;
        y = sj0Var2;
        r = 0.38f;
        n = sj0Var2;
        v = 0.38f;
        x = sj0Var2;
        l = 0.12f;
        j = sj0Var;
        t = 44.0f;
        a = in4.q;
        m = 4.0f;
        q = sj0.f;
        w = 16.0f;
        c = 4.0f;
    }

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (i == null) {
            i = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            b = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            return !zc6.y() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static final RectF n(k44 k44Var) {
        return new RectF(k44Var.g, k44Var.y, k44Var.r, k44Var.n);
    }

    public static final Rect r(k44 k44Var) {
        return new Rect((int) k44Var.g, (int) k44Var.y, (int) k44Var.r, (int) k44Var.n);
    }

    public static final k44 v(Rect rect) {
        return new k44(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final k44 x(RectF rectF) {
        return new k44(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final Rect y(ne2 ne2Var) {
        return new Rect(ne2Var.g, ne2Var.y, ne2Var.r, ne2Var.n);
    }
}
