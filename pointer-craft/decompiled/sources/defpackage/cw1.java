package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class cw1 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ dw1 t;

    public /* synthetic */ cw1(dw1 dw1Var, byte b) {
        this.j = b;
        this.t = dw1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        dw1 dw1Var = this.t;
        switch (b) {
            case 0:
                ViewParent parent = dw1Var.m.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                dw1Var.g();
                View view = dw1Var.m;
                if (view.isEnabled() && !view.isLongClickable() && dw1Var.r()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    dw1Var.c = true;
                    break;
                }
                break;
        }
    }
}
