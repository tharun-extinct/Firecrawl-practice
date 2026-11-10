package defpackage;

import android.app.Notification;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes2.dex */
public final class q05 implements Runnable {
    public final Object a;
    public final /* synthetic */ byte j = 0;
    public final Object m;
    public final int t;

    public q05(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.m = systemForegroundService;
        this.t = i;
        this.a = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        Object obj = this.a;
        int i = this.t;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                ((r05) obj).y((Intent) obj2, i);
                break;
            default:
                ((SystemForegroundService) obj2).q.notify(i, (Notification) obj);
                break;
        }
    }

    public q05(int i, r05 r05Var, Intent intent) {
        this.a = r05Var;
        this.m = intent;
        this.t = i;
    }
}
