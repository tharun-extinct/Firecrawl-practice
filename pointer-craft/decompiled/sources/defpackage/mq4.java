package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mq4 {
    public static final ho1 g;
    public static final as5 j;
    public static final as5 l;
    public static final as5 n;
    public static final ho1 r;
    public static final as5 t;
    public static final as5 v;
    public static final as5 x;
    public static final ho1 y;

    static {
        da1 da1Var = da1.t;
        g = new ho1(da1Var, 1.0f);
        da1 da1Var2 = da1.j;
        y = new ho1(da1Var2, 1.0f);
        da1 da1Var3 = da1.a;
        r = new ho1(da1Var3, 1.0f);
        i00 i00Var = hi0.o;
        byte b = 29;
        n = new as5(da1Var, new f(i00Var, b), i00Var);
        i00 i00Var2 = hi0.h;
        v = new as5(da1Var, new f(i00Var2, b), i00Var2);
        j00 j00Var = hi0.u;
        x = new as5(da1Var2, new zr5(j00Var, (byte) 0), j00Var);
        j00 j00Var2 = hi0.p;
        l = new as5(da1Var2, new zr5(j00Var2, (byte) 0), j00Var2);
        k00 k00Var = hi0.w;
        j = new as5(da1Var3, new zr5(k00Var, (byte) 1), k00Var);
        k00 k00Var2 = hi0.t;
        t = new as5(da1Var3, new zr5(k00Var2, (byte) 1), k00Var2);
    }

    public static final j73 a(j73 j73Var, float f, float f2, float f3, float f4) {
        return j73Var.n(new lq4(f, f2, f3, f4, true));
    }

    public static j73 b(j73 j73Var) {
        as5 as5Var;
        i00 i00Var = hi0.o;
        if (yf2.p(i00Var, i00Var)) {
            as5Var = n;
        } else if (yf2.p(i00Var, hi0.h)) {
            as5Var = v;
        } else {
            as5Var = new as5(da1.t, new f(i00Var, (byte) 29), i00Var);
        }
        return j73Var.n(as5Var);
    }

    public static j73 c(j73 j73Var) {
        as5 as5Var;
        j00 j00Var = hi0.u;
        if (yf2.p(j00Var, j00Var)) {
            as5Var = x;
        } else if (yf2.p(j00Var, hi0.p)) {
            as5Var = l;
        } else {
            as5Var = new as5(da1.j, new zr5(j00Var, (byte) 0), j00Var);
        }
        return j73Var.n(as5Var);
    }

    public static final j73 g(j73 j73Var, float f, float f2) {
        return j73Var.n(new kh5(f, f2));
    }

    public static j73 i(j73 j73Var, k00 k00Var, int i) {
        as5 as5Var;
        k00 k00Var2 = hi0.w;
        if ((i & 1) != 0) {
            k00Var = k00Var2;
        }
        if (k00Var.equals(k00Var2)) {
            as5Var = j;
        } else if (k00Var.equals(hi0.t)) {
            as5Var = t;
        } else {
            as5Var = new as5(da1.a, new zr5(k00Var, (byte) 1), k00Var);
        }
        return j73Var.n(as5Var);
    }

    public static final j73 j(j73 j73Var, float f) {
        return j73Var.n(new lq4(f, f, f, f, true));
    }

    public static j73 l(j73 j73Var, float f, float f2, float f3, float f4, int i) {
        return j73Var.n(new lq4(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
    }

    public static j73 m(j73 j73Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f3 = Float.NaN;
        }
        return a(j73Var, f, f2, f3, (i & 8) == 0 ? 400.0f : Float.NaN);
    }

    public static final j73 n(j73 j73Var, float f) {
        return j73Var.n(new lq4(0.0f, f, 0.0f, f, 5));
    }

    public static final j73 q(j73 j73Var, float f) {
        return j73Var.n(new lq4(f, 0.0f, f, 0.0f, 10));
    }

    public static final j73 r(j73 j73Var, float f) {
        return j73Var.n(f == 1.0f ? g : new ho1(da1.t, f));
    }

    public static final j73 t(j73 j73Var, float f, float f2) {
        return j73Var.n(new lq4(f, f2, f, f2, true));
    }

    public static final j73 v(j73 j73Var, float f, float f2) {
        return j73Var.n(new lq4(0.0f, f, 0.0f, f2, 5));
    }

    public static j73 w(j73 j73Var, float f) {
        return j73Var.n(new lq4(Float.NaN, 0.0f, f, 0.0f, 10));
    }

    public static final j73 x(j73 j73Var, float f) {
        return j73Var.n(new lq4(f, f, f, f, false));
    }

    public static j73 y(j73 j73Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return g(j73Var, f, f2);
    }
}
