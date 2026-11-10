package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class z50 {
    public static final hb3 g = y(true);
    public static final hb3 y = y(false);
    public static final y50 r = y50.y;

    public static final void g(j73 j73Var, h02 h02Var, int i) {
        h02Var.Z(-211209833);
        int i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(h02Var.T);
            j73 j73VarW = m50.W(h02Var, j73Var);
            tr3 tr3VarQ = h02Var.q();
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, r);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new f(j73Var, i, (byte) 8);
        }
    }

    public static final void n(ts3 ts3Var, us3 us3Var, p33 p33Var, fl2 fl2Var, int i, int i2, k00 k00Var) {
        k00 k00Var2;
        Object objA = p33Var.a();
        u50 u50Var = objA instanceof u50 ? (u50) objA : null;
        ts3.a(ts3Var, us3Var, ((u50Var == null || (k00Var2 = u50Var.o) == null) ? k00Var : k00Var2).g((((long) us3Var.j) << 32) | (((long) us3Var.t) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), fl2Var));
    }

    public static final t33 r(k00 k00Var, boolean z) {
        t33 t33Var = (t33) (z ? g : y).l(k00Var);
        return t33Var == null ? new c60(k00Var, z) : t33Var;
    }

    public static final hb3 y(boolean z) {
        hb3 hb3Var = new hb3(9);
        k00 k00Var = hi0.t;
        hb3Var.c(k00Var, new c60(k00Var, z));
        k00 k00Var2 = hi0.a;
        hb3Var.c(k00Var2, new c60(k00Var2, z));
        k00 k00Var3 = hi0.m;
        hb3Var.c(k00Var3, new c60(k00Var3, z));
        k00 k00Var4 = hi0.q;
        hb3Var.c(k00Var4, new c60(k00Var4, z));
        k00 k00Var5 = hi0.w;
        hb3Var.c(k00Var5, new c60(k00Var5, z));
        k00 k00Var6 = hi0.c;
        hb3Var.c(k00Var6, new c60(k00Var6, z));
        k00 k00Var7 = hi0.i;
        hb3Var.c(k00Var7, new c60(k00Var7, z));
        k00 k00Var8 = hi0.b;
        hb3Var.c(k00Var8, new c60(k00Var8, z));
        k00 k00Var9 = hi0.s;
        hb3Var.c(k00Var9, new c60(k00Var9, z));
        return hb3Var;
    }
}
