package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hb6 {
    public static final sj0 g;
    public static final sj0 j;
    public static final sj0 l;
    public static final float n;
    public static final sj0 r;
    public static ha2 t;
    public static final sj0 v;
    public static final sj0 x;
    public static final float y;

    static {
        sj0 sj0Var = sj0.i;
        g = sj0Var;
        y = 0.1f;
        r = sj0Var;
        n = 0.38f;
        v = sj0.u;
        x = sj0.q;
        l = sj0.d;
        j = sj0.b;
    }

    public static final ha2 a() {
        ha2 ha2Var = t;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Watch", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(14.31f, 2.0f);
        kq3Var.l(0.41f, 2.48f);
        kq3Var.y(13.87f, 4.17f, 12.96f, 4.0f, 12.0f, 4.0f);
        kq3Var.r(-0.95f, 0.0f, -1.87f, 0.17f, -2.71f, 0.47f);
        kq3Var.x(9.7f, 2.0f);
        kq3Var.v(4.61f);
        kq3Var.t(0.41f, 17.52f);
        kq3Var.x(14.31f, 22.0f);
        kq3Var.x(9.7f, 22.0f);
        kq3Var.l(-0.41f, -2.47f);
        kq3Var.r(0.84f, 0.3f, 1.76f, 0.47f, 2.71f, 0.47f);
        kq3Var.r(0.96f, 0.0f, 1.87f, -0.17f, 2.72f, -0.48f);
        kq3Var.j(16.0f, 0.0f);
        kq3Var.x(8.0f, 0.0f);
        kq3Var.l(-0.95f, 5.73f);
        kq3Var.y(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f);
        kq3Var.m(1.19f, 4.81f, 3.05f, 6.27f);
        kq3Var.x(8.0f, 24.0f);
        kq3Var.v(8.0f);
        kq3Var.l(0.96f, -5.73f);
        kq3Var.y(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f);
        kq3Var.m(-1.19f, -4.81f, -3.04f, -6.27f);
        kq3Var.x(16.0f, 0.0f);
        kq3Var.g();
        kq3Var.j(12.0f, 18.0f);
        kq3Var.r(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        kq3Var.m(2.69f, -6.0f, 6.0f, -6.0f);
        kq3Var.m(6.0f, 2.69f, 6.0f, 6.0f);
        kq3Var.m(-2.69f, 6.0f, -6.0f, 6.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        t = ha2VarY;
        return ha2VarY;
    }

    public static sj0 j() {
        return j;
    }

    public static sj0 l() {
        return v;
    }

    public static final de3 m(Object obj) {
        if (obj instanceof Integer) {
            return de3.y;
        }
        if (obj instanceof int[]) {
            return de3.r;
        }
        if (obj instanceof Long) {
            return de3.n;
        }
        if (obj instanceof long[]) {
            return de3.v;
        }
        if (obj instanceof Float) {
            return de3.x;
        }
        if (obj instanceof float[]) {
            return de3.l;
        }
        if (obj instanceof Boolean) {
            return de3.j;
        }
        if (obj instanceof boolean[]) {
            return de3.t;
        }
        if ((obj instanceof String) || obj == null) {
            return de3.a;
        }
        return null;
    }

    public static float n() {
        return y;
    }

    public static final Object q(de3 de3Var, Bundle bundle, String str, String str2) {
        str.getClass();
        Object objN = de3Var.n(str2);
        de3Var.v(bundle, str, objN);
        return objN;
    }

    public static sj0 r() {
        return g;
    }

    public static sj0 t() {
        return l;
    }

    public static float v() {
        return n;
    }

    public static final Object w(de3 de3Var, Bundle bundle, String str, String str2, Object obj) {
        if (!bundle.containsKey(str)) {
            l0.u("There is no previous value in this savedState.");
            return null;
        }
        Object objR = de3Var.r(obj, str2);
        de3Var.v(bundle, str, objR);
        return objR;
    }

    public static sj0 x() {
        return x;
    }

    public static sj0 y() {
        return r;
    }

    public abstract List g(String str, List list);
}
