package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.iy2;
import defpackage.kr5;

/* JADX INFO: loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String g = iy2.v("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        iy2.r().g(g, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            kr5 kr5VarG = kr5.g(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (kr5.q) {
                try {
                    kr5VarG.t = pendingResultGoAsync;
                    if (kr5VarG.j) {
                        pendingResultGoAsync.finish();
                        kr5VarG.t = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            iy2.r().y(g, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
