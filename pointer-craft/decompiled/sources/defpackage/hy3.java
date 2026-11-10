package defpackage;

import android.app.Activity;
import android.os.Trace;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class hy3 {
    public static ContentCaptureSession g(View view) {
        return view.getContentCaptureSession();
    }

    public static final void r(Activity activity, iy3.g gVar) {
        activity.registerActivityLifecycleCallbacks(gVar);
    }

    public static boolean y() {
        return Trace.isEnabled();
    }
}
