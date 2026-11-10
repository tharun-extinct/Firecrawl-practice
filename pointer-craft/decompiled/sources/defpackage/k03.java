package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.appground.blek.MainApp;

/* JADX INFO: loaded from: classes.dex */
public final class k03 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ MainApp j;

    public k03(MainApp mainApp) {
        this.j = mainApp;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        MainApp mainApp = this.j;
        mainApp.i++;
        iv4 iv4Var = mainApp.c;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        MainApp mainApp = this.j;
        int i = mainApp.i - 1;
        mainApp.i = i;
        if (i <= 0) {
            mainApp.c = m50.T(mainApp.w, null, new j03(mainApp, (mu0) null, (byte) 0), 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        MainApp mainApp = this.j;
        iv4 iv4Var = mainApp.s;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        int i = mainApp.b;
        mainApp.b = i + 1;
        if (i == 0) {
            mainApp.g().r(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        MainApp mainApp = this.j;
        int i = mainApp.b - 1;
        mainApp.b = i;
        if (i <= 0) {
            mainApp.b = 0;
            iv4 iv4Var = mainApp.s;
            mu0 mu0Var = null;
            if (iv4Var != null) {
                iv4Var.x(null);
            }
            mainApp.s = m50.T(mainApp.w, null, new j03(mainApp, mu0Var, (byte) 1), 3);
        }
    }
}
