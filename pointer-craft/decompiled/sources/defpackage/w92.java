package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w92 extends BroadcastReceiver {
    public static final IntentFilter r;
    public static final List y;
    public final o82 g;

    static {
        List listD = pw5.d("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        y = listD;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        r = intentFilter;
    }

    public w92(o82 o82Var) {
        this.g = o82Var;
    }

    public final void g(Context context) throws PendingIntent.CanceledException {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        boolean zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
        if (Build.VERSION.SDK_INT >= 33) {
            zIsDeviceIdleMode = zIsDeviceIdleMode || h2.n(powerManager);
        }
        if (zIsDeviceIdleMode) {
            this.g.g();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws PendingIntent.CanceledException {
        if (cj0.f0(y, intent.getAction())) {
            g(context);
        }
    }
}
