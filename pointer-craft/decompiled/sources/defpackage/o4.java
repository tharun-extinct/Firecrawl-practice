package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class o4 implements Application.ActivityLifecycleCallbacks {
    public final int a;
    public Object j;
    public Activity t;
    public boolean m = false;
    public boolean q = false;
    public boolean w = false;

    public o4(Activity activity) {
        this.t = activity;
        this.a = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.t == activity) {
            this.t = null;
            this.q = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.q || this.w || this.m) {
            return;
        }
        Object obj = this.j;
        try {
            Object obj2 = p4.r.get(activity);
            if (obj2 == obj && activity.hashCode() == this.a) {
                p4.l.postAtFrontOfQueue(new i26(p4.y.get(activity), obj2, (byte) 4));
                this.w = true;
                this.j = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.t == activity) {
            this.m = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
