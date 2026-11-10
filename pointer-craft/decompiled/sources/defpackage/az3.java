package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class az3 implements zl1 {
    public static final String u = iy2.v("Processor");
    public final pp0 a;
    public final List i;
    public final zl5 m;
    public final WorkDatabase q;
    public final Context t;
    public final HashMap c = new HashMap();
    public final HashMap w = new HashMap();
    public final HashSet b = new HashSet();
    public final ArrayList s = new ArrayList();
    public PowerManager.WakeLock j = null;
    public final Object p = new Object();

    public az3(Context context, pp0 pp0Var, zl5 zl5Var, WorkDatabase workDatabase, List list) {
        this.t = context;
        this.a = pp0Var;
        this.m = zl5Var;
        this.q = workDatabase;
        this.i = list;
    }

    public static boolean r(String str, yr5 yr5Var) {
        String str2 = u;
        if (yr5Var == null) {
            iy2.r().g(str2, xi3.t("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        yr5Var.r();
        iy2.r().g(str2, xi3.t("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final boolean a(String str) {
        boolean zR;
        synchronized (this.p) {
            iy2.r().g(u, "Processor stopping background work " + str, new Throwable[0]);
            zR = r(str, (yr5) this.c.remove(str));
        }
        return zR;
    }

    @Override // defpackage.zl1
    public final void g(String str, boolean z) {
        synchronized (this.p) {
            try {
                this.c.remove(str);
                int i = 0;
                iy2.r().g(u, az3.class.getSimpleName() + " " + str + " executed; reschedule = " + z, new Throwable[0]);
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((zl1) obj).g(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.p) {
            try {
                if (this.w.isEmpty()) {
                    try {
                        this.t.startService(x05.x(this.t));
                    } catch (Throwable th) {
                        iy2.r().y(u, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.j;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.j = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean l(String str, ob5 ob5Var) {
        synchronized (this.p) {
            try {
                if (n(str)) {
                    iy2.r().g(u, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                va5 va5Var = new va5(this.t, this.a, this.m, this, this.q, str);
                va5Var.B(this.i);
                va5Var.A(ob5Var);
                yr5 yr5VarN = va5Var.n();
                ol4 ol4VarG = yr5VarN.g();
                ol4VarG.g(new ks0(this, str, ol4VarG, (byte) 1), (mc4) this.m.r);
                this.c.put(str, yr5VarN);
                ((lk4) this.m.g).execute(yr5VarN);
                iy2.r().g(u, du4.i(az3.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n(String str) {
        boolean z;
        synchronized (this.p) {
            try {
                z = this.c.containsKey(str) || this.w.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean t(String str) {
        boolean zR;
        synchronized (this.p) {
            iy2.r().g(u, "Processor stopping foreground work " + str, new Throwable[0]);
            zR = r(str, (yr5) this.w.remove(str));
        }
        return zR;
    }

    public final void v(zl1 zl1Var) {
        synchronized (this.p) {
            this.s.remove(zl1Var);
        }
    }

    public final void x(String str, yv1 yv1Var) {
        synchronized (this.p) {
            try {
                iy2.r().n(u, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                yr5 yr5Var = (yr5) this.c.remove(str);
                if (yr5Var != null) {
                    if (this.j == null) {
                        PowerManager.WakeLock wakeLockG = cn5.g(this.t, "ProcessorForegroundLck");
                        this.j = wakeLockG;
                        wakeLockG.acquire();
                    }
                    this.w.put(str, yr5Var);
                    Intent intentN = x05.n(this.t, str, yv1Var);
                    Context context = this.t;
                    if (Build.VERSION.SDK_INT >= 26) {
                        tm.k(context, intentN);
                    } else {
                        context.startService(intentN);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(zl1 zl1Var) {
        synchronized (this.p) {
            this.s.add(zl1Var);
        }
    }
}
