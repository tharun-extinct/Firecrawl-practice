package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class wr5 {
    public static final String v = iy2.v("WorkTimer");
    public final ScheduledExecutorService g;
    public final Object n;
    public final HashMap r;
    public final HashMap y;

    public wr5() {
        ur5 ur5Var = new ur5();
        ur5Var.g = 0;
        this.y = new HashMap();
        this.r = new HashMap();
        this.n = new Object();
        this.g = Executors.newSingleThreadScheduledExecutor(ur5Var);
    }

    public final void g(String str, m41 m41Var) {
        synchronized (this.n) {
            iy2.r().g(v, "Starting timer for " + str, new Throwable[0]);
            y(str);
            vr5 vr5Var = new vr5(this, str);
            this.y.put(str, vr5Var);
            this.r.put(str, m41Var);
            this.g.schedule(vr5Var, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void y(String str) {
        synchronized (this.n) {
            try {
                if (((vr5) this.y.remove(str)) != null) {
                    iy2.r().g(v, "Stopping timer for " + str, new Throwable[0]);
                    this.r.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
