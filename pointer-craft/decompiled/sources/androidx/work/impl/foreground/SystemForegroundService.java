package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.fb0;
import defpackage.iy2;
import defpackage.kr5;
import defpackage.ks0;
import defpackage.nu2;
import defpackage.x05;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class SystemForegroundService extends nu2 {
    public static final String w = iy2.v("SystemFgService");
    public boolean a;
    public x05 m;
    public NotificationManager q;
    public Handler t;

    public final void g() {
        this.t = new Handler(Looper.getMainLooper());
        this.q = (NotificationManager) getApplicationContext().getSystemService("notification");
        x05 x05Var = new x05(getApplicationContext());
        this.m = x05Var;
        if (x05Var.b != null) {
            iy2.r().y(x05.s, "A callback already exists.", new Throwable[0]);
        } else {
            x05Var.b = this;
        }
    }

    @Override // defpackage.nu2, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g();
    }

    @Override // defpackage.nu2, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.m.j();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.a;
        String str = w;
        if (z) {
            iy2.r().n(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.m.j();
            g();
            this.a = false;
        }
        if (intent == null) {
            return 3;
        }
        x05 x05Var = this.m;
        kr5 kr5Var = x05Var.j;
        String str2 = x05.s;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            iy2.r().n(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            x05Var.t.g(new ks0(x05Var, kr5Var.r, stringExtra, (byte) 7, false));
            x05Var.l(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            x05Var.l(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            iy2.r().n(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra2);
            kr5Var.getClass();
            kr5Var.n.g(new fb0(kr5Var, uuidFromString, (byte) 0));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        iy2.r().n(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = x05Var.b;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.a = true;
        iy2.r().g(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
