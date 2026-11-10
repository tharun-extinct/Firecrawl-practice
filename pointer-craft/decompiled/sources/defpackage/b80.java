package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class b80 {
    public static final bo3 g;
    public static final float n;
    public static final float r;
    public static final float v;
    public static final float x;
    public static final bo3 y;

    static {
        float f = ue5.p;
        float f2 = ue5.u;
        g = new bo3(f, 8.0f, f2, 8.0f);
        if (!(f2 >= 0.0f)) {
            kc2.g("Padding must be non-negative");
        }
        y = new bo3(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            kc2.g("Padding must be non-negative");
        }
        r = 58.0f;
        n = 40.0f;
        v = 18.0f;
        x = c93.a;
    }

    public static a80 g(long j, long j2, h02 h02Var, int i) {
        if ((i & 2) != 0) {
            j2 = jj0.j;
        }
        long j3 = j2;
        long j4 = jj0.j;
        return y((rj0) h02Var.a(tj0.g)).g(j, j3, j4, j4);
    }

    public static a80 n(rj0 rj0Var) {
        a80 a80Var = rj0Var.Z;
        if (a80Var != null) {
            return a80Var;
        }
        long j = jj0.l;
        a80 a80Var2 = new a80(j, tj0.n(rj0Var, sj0.u), j, jj0.y(ye6.v(), tj0.n(rj0Var, ye6.n())));
        rj0Var.Z = a80Var2;
        return a80Var2;
    }

    public static a80 r(rj0 rj0Var) {
        a80 a80Var = rj0Var.Y;
        if (a80Var != null) {
            return a80Var;
        }
        long j = jj0.l;
        a80 a80Var2 = new a80(j, tj0.n(rj0Var, gp4.C), j, jj0.y(gp4.B, tj0.n(rj0Var, gp4.A)));
        rj0Var.Y = a80Var2;
        return a80Var2;
    }

    public static a80 y(rj0 rj0Var) {
        a80 a80Var = rj0Var.W;
        if (a80Var != null) {
            return a80Var;
        }
        a80 a80Var2 = new a80(tj0.n(rj0Var, v70.q), tj0.n(rj0Var, v70.p), jj0.y(v70.c, tj0.n(rj0Var, v70.w)), jj0.y(v70.b, tj0.n(rj0Var, v70.i)));
        rj0Var.W = a80Var2;
        return a80Var2;
    }
}
