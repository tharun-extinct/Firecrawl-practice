package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class b35 {
    public static final Logger m;
    public static final b35 q;
    public final ml a;
    public final fa4 g;
    public final ArrayList j;
    public int l;
    public boolean n;
    public int r;
    public final ArrayList t;
    public long v;
    public int x;
    public final Logger y;

    static {
        Logger logger = Logger.getLogger(b35.class.getName());
        logger.getClass();
        m = logger;
        q = new b35(new fa4(ws5.t(ws5.y + " TaskRunner")));
    }

    public b35(fa4 fa4Var) {
        Logger logger = m;
        logger.getClass();
        this.g = fa4Var;
        this.y = logger;
        this.r = 10000;
        this.j = new ArrayList();
        this.t = new ArrayList();
        this.a = new ml((Object) this, (byte) 12);
    }

    public final void g(u25 u25Var, long j, boolean z) {
        TimeZone timeZone = ws5.g;
        a35 a35VarY = u25Var.y();
        a35VarY.getClass();
        if (a35VarY.r() != u25Var) {
            l0.z("Check failed.");
            return;
        }
        boolean zN = a35VarY.n();
        a35VarY.a();
        a35VarY.t(null);
        this.j.remove(a35VarY);
        if (j != -1 && !zN && !a35VarY.x()) {
            a35VarY.j(u25Var, j, true);
        }
        if (a35VarY.v().isEmpty()) {
            return;
        }
        this.t.add(a35VarY);
        if (z) {
            return;
        }
        v();
    }

    public final a35 n() {
        int i;
        synchronized (this) {
            i = this.r;
            this.r = i + 1;
        }
        return new a35(this, xi3.j("Q", i));
    }

    public final void r(a35 a35Var) {
        a35Var.getClass();
        TimeZone timeZone = ws5.g;
        if (a35Var.r() == null) {
            boolean zIsEmpty = a35Var.v().isEmpty();
            ArrayList arrayList = this.t;
            if (zIsEmpty) {
                arrayList.remove(a35Var);
            } else {
                us5.g(arrayList, a35Var);
            }
        }
        if (this.n) {
            fa4.b(this);
        } else {
            v();
        }
    }

    public final void v() {
        TimeZone timeZone = ws5.g;
        int i = this.x;
        if (i > this.l) {
            return;
        }
        this.x = i + 1;
        this.g.e(this, this.a);
    }

    public final u25 y() {
        long j;
        u25 u25Var;
        boolean z;
        TimeZone timeZone = ws5.g;
        while (true) {
            ArrayList arrayList = this.t;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jH = fa4.H();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i = 0;
            u25 u25Var2 = null;
            while (true) {
                if (i >= size) {
                    j = jH;
                    u25Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                u25 u25Var3 = (u25) ((a35) obj).v().get(0);
                j = jH;
                u25Var = null;
                long jMax = Math.max(0L, u25Var3.g() - jH);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (u25Var2 != null) {
                        z = true;
                        break;
                    }
                    u25Var2 = u25Var3;
                }
                jH = j;
            }
            ArrayList arrayList2 = this.j;
            if (u25Var2 != null) {
                TimeZone timeZone2 = ws5.g;
                u25Var2.n();
                a35 a35VarY = u25Var2.y();
                a35VarY.getClass();
                a35VarY.v().remove(u25Var2);
                arrayList.remove(a35VarY);
                a35VarY.t(u25Var2);
                arrayList2.add(a35VarY);
                if (z || (!this.n && !arrayList.isEmpty())) {
                    v();
                }
                return u25Var2;
            }
            if (this.n) {
                if (jMin >= this.v - j) {
                    return u25Var;
                }
                fa4.b(this);
                return u25Var;
            }
            this.n = true;
            this.v = j + jMin;
            try {
                try {
                    fa4.s(this, jMin);
                } catch (InterruptedException unused) {
                    TimeZone timeZone3 = ws5.g;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((a35) arrayList2.get(size2)).g();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        a35 a35Var = (a35) arrayList.get(size3);
                        a35Var.g();
                        if (a35Var.v().isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
                this.n = false;
            } catch (Throwable th) {
                this.n = false;
                throw th;
            }
        }
    }
}
