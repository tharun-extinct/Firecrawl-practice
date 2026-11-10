package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class e00 extends y60 {
    public static final String t = iy2.v("BatteryNotLowTracker");

    @Override // defpackage.ss0
    public final Object g() {
        Intent intentRegisterReceiver = this.y.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        iy2.r().y(t, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // defpackage.y60
    public final void l(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        iy2.r().g(t, xi3.t("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            r(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            r(Boolean.FALSE);
        }
    }

    @Override // defpackage.y60
    public final IntentFilter x() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
}
