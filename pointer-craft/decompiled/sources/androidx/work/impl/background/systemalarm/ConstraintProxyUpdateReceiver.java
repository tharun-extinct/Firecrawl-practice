package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.iy2;
import defpackage.kr5;
import defpackage.ks0;
import defpackage.xi3;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String g = iy2.v("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        byte b = 0;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            kr5.g(context).n.g(new ks0(intent, context, goAsync(), b));
        } else {
            iy2.r().g(g, xi3.t("Ignoring unknown action ", action), new Throwable[0]);
        }
    }
}
