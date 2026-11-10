package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public abstract class y60 extends ss0 {
    public static final String j = iy2.v("BrdcstRcvrCnstrntTrckr");
    public final t30 l;

    public y60(Context context, zl5 zl5Var) {
        super(context, zl5Var);
        this.l = new t30(this, (byte) 1);
    }

    public void l(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        byte b = 0;
        iy2.r().g(d00.t, "Received ".concat(action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    b = -1;
                }
                break;
            case -54942926:
                b = !action.equals("android.os.action.DISCHARGING") ? (byte) -1 : (byte) 1;
                break;
            case 948344062:
                b = !action.equals("android.os.action.CHARGING") ? (byte) -1 : (byte) 2;
                break;
            case 1019184907:
                b = !action.equals("android.intent.action.ACTION_POWER_CONNECTED") ? (byte) -1 : (byte) 3;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                r(Boolean.FALSE);
                break;
            case 1:
                r(Boolean.FALSE);
                break;
            case 2:
                r(Boolean.TRUE);
                break;
            case 3:
                r(Boolean.TRUE);
                break;
        }
    }

    @Override // defpackage.ss0
    public final void n() {
        iy2.r().g(j, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.y.registerReceiver(this.l, x());
    }

    @Override // defpackage.ss0
    public final void v() {
        iy2.r().g(j, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.y.unregisterReceiver(this.l);
    }

    public IntentFilter x() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }
}
