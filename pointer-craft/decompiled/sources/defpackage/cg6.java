package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cg6 {
    public static ha2 g;

    public static final ha2 g() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3VarJ = du4.j(18.0f, 16.08f);
        kq3VarJ.r(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        kq3VarJ.x(8.91f, 12.7f);
        kq3VarJ.r(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        kq3VarJ.m(-0.04f, -0.47f, -0.09f, -0.7f);
        kq3VarJ.l(7.05f, -4.11f);
        kq3VarJ.r(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        kq3VarJ.r(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        kq3VarJ.m(-1.34f, -3.0f, -3.0f, -3.0f);
        kq3VarJ.m(-3.0f, 1.34f, -3.0f, 3.0f);
        kq3VarJ.r(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        kq3VarJ.x(8.04f, 9.81f);
        kq3VarJ.y(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        kq3VarJ.r(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        kq3VarJ.m(1.34f, 3.0f, 3.0f, 3.0f);
        kq3VarJ.r(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        kq3VarJ.l(7.12f, 4.16f);
        kq3VarJ.r(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        kq3VarJ.r(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        kq3VarJ.m(2.92f, -1.31f, 2.92f, -2.92f);
        kq3VarJ.r(0.0f, -1.61f, -1.31f, -2.92f, -2.92f, -2.92f);
        kq3VarJ.g();
        kq3VarJ.j(18.0f, 4.0f);
        kq3VarJ.r(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        kq3VarJ.m(-0.45f, 1.0f, -1.0f, 1.0f);
        kq3VarJ.m(-1.0f, -0.45f, -1.0f, -1.0f);
        kq3VarJ.m(0.45f, -1.0f, 1.0f, -1.0f);
        kq3VarJ.g();
        kq3VarJ.j(6.0f, 13.0f);
        kq3VarJ.r(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        kq3VarJ.m(0.45f, -1.0f, 1.0f, -1.0f);
        kq3VarJ.m(1.0f, 0.45f, 1.0f, 1.0f);
        kq3VarJ.m(-0.45f, 1.0f, -1.0f, 1.0f);
        kq3VarJ.g();
        kq3VarJ.j(18.0f, 20.02f);
        kq3VarJ.r(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        kq3VarJ.m(0.45f, -1.0f, 1.0f, -1.0f);
        kq3VarJ.m(1.0f, 0.45f, 1.0f, 1.0f);
        kq3VarJ.m(-0.45f, 1.0f, -1.0f, 1.0f);
        kq3VarJ.g();
        ga2.g(ga2Var, kq3VarJ.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static boolean y(Context context) {
        ((nz0) ((xw1) og0.f(context, xw1.class))).getClass();
        Set set = Collections.EMPTY_SET;
        js2.v(set.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (set.isEmpty()) {
            return true;
        }
        return ((Boolean) set.iterator().next()).booleanValue();
    }
}
