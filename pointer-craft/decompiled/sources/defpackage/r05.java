package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class r05 implements zl1 {
    public static final String p = iy2.v("SystemAlarmDispatcher");
    public final wr5 a;
    public Intent b;
    public final Handler c;
    public final ArrayList i;
    public final Context j;
    public final az3 m;
    public final kr5 q;
    public SystemAlarmService s;
    public final zl5 t;
    public final qk0 w;

    public r05(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.j = applicationContext;
        this.w = new qk0(applicationContext);
        this.a = new wr5();
        kr5 kr5VarG = kr5.g(systemAlarmService);
        this.q = kr5VarG;
        az3 az3Var = kr5VarG.x;
        this.m = az3Var;
        this.t = kr5VarG.n;
        az3Var.y(this);
        this.i = new ArrayList();
        this.b = null;
        this.c = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.zl1
    public final void g(String str, boolean z) {
        String str2 = qk0.m;
        Intent intent = new Intent(this.j, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        v(new q05(0, this, intent));
    }

    public final void n() {
        iy2.r().g(p, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.m.v(this);
        ScheduledExecutorService scheduledExecutorService = this.a.g;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.s = null;
    }

    public final void r() {
        if (this.c.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        l0.z("Needs to be invoked on the main thread.");
    }

    public final void v(Runnable runnable) {
        this.c.post(runnable);
    }

    public final void x() {
        r();
        PowerManager.WakeLock wakeLockG = cn5.g(this.j, "ProcessCommand");
        try {
            wakeLockG.acquire();
            this.q.n.g(new p05(this, (byte) 0));
        } finally {
            wakeLockG.release();
        }
    }

    public final void y(Intent intent, int i) {
        iy2 iy2VarR = iy2.r();
        String str = p;
        int i2 = 0;
        iy2VarR.g(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        r();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            iy2.r().x(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            r();
            synchronized (this.i) {
                try {
                    ArrayList arrayList = this.i;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.i) {
            try {
                boolean zIsEmpty = this.i.isEmpty();
                this.i.add(intent);
                if (zIsEmpty) {
                    x();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
