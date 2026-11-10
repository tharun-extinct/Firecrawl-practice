package defpackage;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yc6 {
    public static final sj0 A;
    public static final sj0 B;
    public static final sj0 C;
    public static final sj0 D;
    public static final sj0 a;
    public static final sj0 b;
    public static final sj0 c;
    public static final sj0 d;
    public static final sj0 e;
    public static final sj0 f;
    public static final sj0 g;
    public static final sj0 h;
    public static final sj0 i;
    public static final sj0 j;
    public static final sj0 k;
    public static final sj0 l;
    public static final sj0 m;
    public static final sj0 n;
    public static final sj0 o;
    public static final sj0 p;
    public static final sj0 q;
    public static final sj0 r;
    public static final sj0 s;
    public static final sj0 t;
    public static final sj0 u;
    public static final sj0 v;
    public static final sj0 w;
    public static final sj0 x;
    public static final in4 y;
    public static final sj0 z;

    static {
        sj0 sj0Var = sj0.u;
        g = sj0Var;
        y = in4.a;
        sj0 sj0Var2 = sj0.i;
        r = sj0Var2;
        n = sj0Var2;
        v = sj0Var2;
        x = sj0Var2;
        l = sj0Var2;
        j = sj0Var2;
        sj0 sj0Var3 = sj0.j;
        t = sj0Var3;
        a = sj0Var2;
        m = sj0Var3;
        sj0 sj0Var4 = sj0.b;
        q = sj0Var4;
        w = sj0Var3;
        c = sj0Var3;
        i = sj0Var3;
        b = sj0Var2;
        s = sj0Var;
        p = sj0Var4;
        u = sj0Var;
        z = sj0Var4;
        h = sj0Var4;
        o = sj0Var2;
        f = sj0Var4;
        k = sj0Var4;
        d = sj0Var4;
        e = sj0Var4;
        A = sj0Var4;
        B = sj0.s;
        C = sj0Var4;
        D = sj0Var4;
    }

    public static final void g(Throwable th, my1 my1Var) {
        r(th, my1Var);
    }

    public static void n(int i2, int i3) {
        String strR;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strR = zc6.r("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    l0.u(xi3.j("negative size: ", i3));
                    return;
                }
                strR = zc6.r("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strR);
        }
    }

    public static final boolean r(Throwable th, my1 my1Var) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = xg2.g;
        x81 x81Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = at3.y;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = pi1.j;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) listAsList.get(i2)) instanceof x81) {
                return false;
            }
        }
        try {
            go0 go0Var = (go0) my1Var.g();
            if (go0Var != null) {
                boolean z3 = go0Var.y;
                List list = go0Var.g;
                if (z3) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((io0) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z2 = true;
                }
            }
            if (z2) {
                go0Var.getClass();
                x81Var = new x81(go0Var);
            }
        } catch (Throwable th2) {
            x81Var = th2;
        }
        if (x81Var != null) {
            kf6.g(th, x81Var);
        }
        return z2;
    }

    public static void v(int i2, int i3, int i4) {
        String strX;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strX = x(i2, i4, "start index");
            } else {
                strX = (i3 < 0 || i3 > i4) ? x(i3, i4, "end index") : zc6.r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strX);
        }
    }

    public static String x(int i2, int i3, String str) {
        if (i2 < 0) {
            return zc6.r("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zc6.r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        l0.u(xi3.j("negative size: ", i3));
        return null;
    }

    public static final String y(ov1 ov1Var, Context context) {
        List list = ov1Var.g;
        n51 n51VarL = k33.l(context);
        int i2 = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i2 == 0) {
            return tw2.g(list, null, new m92(n51VarL), 31);
        }
        if (list.size() > 0) {
            list.get(0).getClass();
            uo1.B();
            return null;
        }
        return ((Object) (!list.isEmpty() ? "," : "")) + "'wght' " + xs2.q(i2 + 400.0f, 1.0f, 1000.0f);
    }
}
