package defpackage;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes2.dex */
public final class y05 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int j;
    public final /* synthetic */ SystemForegroundService m;
    public final /* synthetic */ Notification t;

    public y05(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.m = systemForegroundService;
        this.j = i;
        this.t = notification;
        this.a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        Notification notification = this.t;
        int i2 = this.j;
        SystemForegroundService systemForegroundService = this.m;
        if (i >= 29) {
            systemForegroundService.startForeground(i2, notification, this.a);
        } else {
            systemForegroundService.startForeground(i2, notification);
        }
    }
}
