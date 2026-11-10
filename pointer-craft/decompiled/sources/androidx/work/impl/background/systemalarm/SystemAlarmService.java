package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.cn5;
import defpackage.iy2;
import defpackage.nu2;
import defpackage.r05;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SystemAlarmService extends nu2 {
    public static final String m = iy2.v("SystemAlarmService");
    public boolean a;
    public r05 t;

    public final void g() {
        this.a = true;
        iy2.r().g(m, "All commands completed in dispatcher", new Throwable[0]);
        String str = cn5.g;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = cn5.y;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                iy2.r().x(cn5.g, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // defpackage.nu2, android.app.Service
    public final void onCreate() {
        super.onCreate();
        r05 r05Var = new r05(this);
        this.t = r05Var;
        if (r05Var.s != null) {
            iy2.r().y(r05.p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            r05Var.s = this;
        }
        this.a = false;
    }

    @Override // defpackage.nu2, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a = true;
        this.t.n();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.a) {
            iy2.r().n(m, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.t.n();
            r05 r05Var = new r05(this);
            this.t = r05Var;
            if (r05Var.s != null) {
                iy2.r().y(r05.p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                r05Var.s = this;
            }
            this.a = false;
        }
        if (intent == null) {
            return 3;
        }
        this.t.y(intent, i2);
        return 3;
    }
}
