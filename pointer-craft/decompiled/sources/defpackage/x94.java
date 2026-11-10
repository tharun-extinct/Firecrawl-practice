package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class x94 {
    public ku0 g;
    public boolean j;
    public jl n;
    public Executor r;
    public t51 v;
    public og2 x;
    public fx0 y;
    public final ro l = new ro(new w9(0, this, x94.class, "onClosed", "onClosed()V", 0, 3));
    public final ThreadLocal t = new ThreadLocal();
    public final LinkedHashMap a = new LinkedHashMap();
    public boolean m = true;

    public Set a() {
        return cj0.J0(new ArrayList(dj0.Y(vi1.j, 10)));
    }

    public final boolean b() {
        t51 t51Var = this.v;
        if (t51Var == null) {
            yf2.Y("connectionManager");
            throw null;
        }
        zx1 zx1Var = (zx1) t51Var.j;
        if (zx1Var != null) {
            return zx1Var.isOpen();
        }
        return false;
    }

    public final void c() {
        t().K().a();
        if (w()) {
            return;
        }
        og2 og2VarJ = j();
        og2VarJ.y.r(og2VarJ.x, og2VarJ.l);
    }

    public final void g() {
        if (this.j) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            l0.z("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void i(tb4 tb4Var) {
        tb4Var.getClass();
        og2 og2VarJ = j();
        ae5 ae5Var = og2VarJ.y;
        ae5Var.getClass();
        cc4 cc4VarO = tb4Var.O("PRAGMA query_only");
        try {
            cc4VarO.H();
            boolean zE = cc4VarO.e();
            c93.h(cc4VarO, null);
            if (!zE) {
                zq2.m(tb4Var, "PRAGMA temp_store = MEMORY");
                zq2.m(tb4Var, "PRAGMA recursive_triggers = 1");
                zq2.m(tb4Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (ae5Var.n) {
                    zq2.m(tb4Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    zq2.m(tb4Var, ay4.M("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                ri3 ri3Var = ae5Var.j;
                ReentrantLock reentrantLock = ri3Var.g;
                reentrantLock.lock();
                try {
                    ri3Var.n = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (og2VarJ.j) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c93.h(cc4VarO, th2);
                throw th3;
            }
        }
    }

    public final og2 j() {
        og2 og2Var = this.x;
        if (og2Var != null) {
            return og2Var;
        }
        yf2.Y("internalTracker");
        throw null;
    }

    public iz4 l(q01 q01Var) {
        throw new uh3(0);
    }

    public LinkedHashMap m() {
        int iH = v13.h(dj0.Y(vi1.j, 10));
        if (iH < 16) {
            iH = 16;
        }
        return new LinkedHashMap(iH);
    }

    public List n(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v13.h(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            tf0 tf0Var = (tf0) entry.getKey();
            tf0Var.getClass();
            Class clsG = tf0Var.g();
            clsG.getClass();
            linkedHashMap2.put(clsG, entry.getValue());
        }
        return pi1.j;
    }

    public final Object p(boolean z, bz1 bz1Var, ou0 ou0Var) {
        aq2.I(this);
        t51 t51Var = this.v;
        if (t51Var != null) {
            return ((fq0) t51Var.x).s(z, bz1Var, ou0Var);
        }
        yf2.Y("connectionManager");
        throw null;
    }

    public final boolean q() {
        t51 t51Var = this.v;
        if (t51Var != null) {
            return ((iz4) t51Var.l) != null;
        }
        yf2.Y("connectionManager");
        throw null;
    }

    public final void r() {
        g();
        g();
        zx1 zx1VarK = t().K();
        if (!zx1VarK.p()) {
            mu0 mu0Var = null;
            np npVar = new np(j(), mu0Var, (byte) 10);
            Thread.interrupted();
            ra.N(new ko((Object) npVar, mu0Var, (byte) 14));
        }
        if (zx1VarK.j.isWriteAheadLoggingEnabled()) {
            zx1VarK.x();
        } else {
            zx1VarK.y();
        }
    }

    public final void s() {
        t().K().u();
    }

    public final iz4 t() {
        t51 t51Var = this.v;
        if (t51Var == null) {
            yf2.Y("connectionManager");
            throw null;
        }
        iz4 iz4Var = (iz4) t51Var.l;
        if (iz4Var != null) {
            return iz4Var;
        }
        l0.z("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public abstract og2 v();

    public final boolean w() {
        return b() && t().K().p();
    }

    public z94 x() {
        throw new uh3(0);
    }

    public final void y() {
        if (!q() || w()) {
            return;
        }
        fx0 fx0Var = (fx0) this.t.get();
        if ((fx0Var != null ? (qb5) fx0Var.h(qb5.t) : null) == null) {
            return;
        }
        l0.z("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }
}
