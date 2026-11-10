package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class sg0 implements n21 {
    public final Context j;
    public final BroadcastReceiver t;

    public sg0(Context context, t30 t30Var) {
        t30Var.getClass();
        this.j = context;
        this.t = t30Var;
    }

    @Override // defpackage.n21
    public final void i(gu2 gu2Var) {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        if (Build.VERSION.SDK_INT >= 36) {
            intentFilter.addAction("android.bluetooth.device.action.KEY_MISSING");
        }
        ue5.l0(this.j, this.t, intentFilter);
    }

    @Override // defpackage.n21
    public final void t(gu2 gu2Var) {
        this.j.unregisterReceiver(this.t);
    }
}
