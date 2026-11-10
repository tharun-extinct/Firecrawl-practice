package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class kw implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final kw q = new kw();
    public final AtomicBoolean j = new AtomicBoolean();
    public final AtomicBoolean t = new AtomicBoolean();
    public final ArrayList a = new ArrayList();
    public boolean m = false;

    public static void y(Application application) {
        kw kwVar = q;
        synchronized (kwVar) {
            try {
                if (!kwVar.m) {
                    application.registerActivityLifecycleCallbacks(kwVar);
                    application.registerComponentCallbacks(kwVar);
                    kwVar.m = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(jw jwVar) {
        synchronized (q) {
            this.a.add(jwVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.j.compareAndSet(true, false);
        this.t.set(true);
        if (zCompareAndSet) {
            r(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.j.compareAndSet(true, false);
        this.t.set(true);
        if (zCompareAndSet) {
            r(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.j.compareAndSet(false, true)) {
            this.t.set(true);
            r(true);
        }
    }

    public final void r(boolean z) {
        synchronized (q) {
            try {
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((jw) obj).g(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
