package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class iy3 extends ki1 {
    final /* synthetic */ ky3 this$0;

    public static final class g extends ki1 {
        final /* synthetic */ ky3 this$0;

        public g(ky3 ky3Var) {
            this.this$0 = ky3Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.g();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ky3 ky3Var = this.this$0;
            int i = ky3Var.j + 1;
            ky3Var.j = i;
            if (i == 1 && ky3Var.m) {
                ky3Var.w.n(vt2.ON_START);
                ky3Var.m = false;
            }
        }
    }

    public iy3(ky3 ky3Var) {
        this.this$0 = ky3Var;
    }

    @Override // defpackage.ki1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = c74.t;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((c74) fragmentFindFragmentByTag).j = this.this$0.i;
        }
    }

    @Override // defpackage.ki1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ky3 ky3Var = this.this$0;
        int i = ky3Var.t - 1;
        ky3Var.t = i;
        if (i == 0) {
            Handler handler = ky3Var.q;
            handler.getClass();
            handler.postDelayed(ky3Var.c, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        hy3.r(activity, new g(this.this$0));
    }

    @Override // defpackage.ki1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ky3 ky3Var = this.this$0;
        int i = ky3Var.j - 1;
        ky3Var.j = i;
        if (i == 0 && ky3Var.a) {
            ky3Var.w.n(vt2.ON_STOP);
            ky3Var.m = true;
        }
    }
}
