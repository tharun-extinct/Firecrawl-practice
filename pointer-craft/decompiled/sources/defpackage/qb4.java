package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class qb4 {
    public final eo5 g;
    public final ArrayList y = new ArrayList();

    public qb4(eo5 eo5Var) {
        this.g = null;
        this.g = eo5Var;
    }

    public static long n(u51 u51Var, long j) {
        eo5 eo5Var = u51Var.n;
        ArrayList arrayList = u51Var.m;
        if (eo5Var instanceof m52) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            q51 q51Var = (q51) arrayList.get(i);
            if (q51Var instanceof u51) {
                u51 u51Var2 = (u51) q51Var;
                if (u51Var2.n != eo5Var) {
                    jMax = Math.max(jMax, n(u51Var2, ((long) u51Var2.x) + j));
                }
            }
        }
        u51 u51Var3 = eo5Var.j;
        u51 u51Var4 = eo5Var.t;
        if (u51Var != u51Var3) {
            return jMax;
        }
        long jA = eo5Var.a() + j;
        return Math.max(Math.max(jMax, n(u51Var4, jA)), jA - ((long) u51Var4.x));
    }

    public static long r(u51 u51Var, long j) {
        eo5 eo5Var = u51Var.n;
        ArrayList arrayList = u51Var.m;
        if (eo5Var instanceof m52) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            q51 q51Var = (q51) arrayList.get(i);
            if (q51Var instanceof u51) {
                u51 u51Var2 = (u51) q51Var;
                if (u51Var2.n != eo5Var) {
                    jMin = Math.min(jMin, r(u51Var2, ((long) u51Var2.x) + j));
                }
            }
        }
        u51 u51Var3 = eo5Var.t;
        u51 u51Var4 = eo5Var.j;
        if (u51Var != u51Var3) {
            return jMin;
        }
        long jA = j - eo5Var.a();
        return Math.min(Math.min(jMin, r(u51Var4, jA)), jA - ((long) u51Var4.x));
    }

    public final void g(eo5 eo5Var) {
        this.y.add(eo5Var);
    }

    public final long y(us0 us0Var, int i) {
        float f;
        long j;
        eo5 eo5Var = this.g;
        if (!(eo5Var instanceof lc0) ? i != 0 ? (eo5Var instanceof hk5) : (eo5Var instanceof l72) : ((lc0) eo5Var).x == i) {
            return 0L;
        }
        u51 u51Var = (i == 0 ? us0Var.n : us0Var.v).j;
        u51 u51Var2 = (i == 0 ? us0Var.n : us0Var.v).t;
        u51 u51Var3 = eo5Var.j;
        u51 u51Var4 = eo5Var.j;
        u51 u51Var5 = eo5Var.t;
        boolean zContains = u51Var3.q.contains(u51Var);
        boolean zContains2 = u51Var5.q.contains(u51Var2);
        long jA = eo5Var.a();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(n(u51Var4, u51Var4.x), ((long) u51Var4.x) + jA);
            }
            if (zContains2) {
                return Math.max(-r(u51Var5, u51Var5.x), ((long) (-u51Var5.x)) + jA);
            }
            return (eo5Var.a() + ((long) u51Var4.x)) - ((long) u51Var5.x);
        }
        long jN = n(u51Var4, 0L);
        long jR = r(u51Var5, 0L);
        long j2 = jN - jA;
        int i2 = u51Var5.x;
        if (j2 >= (-i2)) {
            j2 += (long) i2;
        }
        long j3 = u51Var4.x;
        long j4 = ((-jR) - jA) - j3;
        if (j4 >= j3) {
            j4 -= j3;
        }
        ts0 ts0Var = eo5Var.y;
        if (i == 0) {
            f = ts0Var.d0;
        } else if (i == 1) {
            f = ts0Var.e0;
        } else {
            ts0Var.getClass();
            f = -1.0f;
        }
        if (f > 0.0f) {
            j = (long) ((j2 / (1.0f - f)) + (j4 / f));
        } else {
            j = 0;
        }
        float f2 = j;
        return (((long) u51Var4.x) + ((((long) ((f2 * f) + 0.5f)) + jA) + ((long) du4.y(1.0f, f, f2, 0.5f)))) - ((long) u51Var5.x);
    }
}
