package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hv0 implements View.OnTouchListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ hv0(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                return ((Boolean) ((bz1) obj).l(view, motionEvent)).booleanValue();
            case 1:
                return ((Boolean) ((mv0) obj).l(view, motionEvent)).booleanValue();
            default:
                jf1 jf1Var = (jf1) obj;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - jf1Var.i;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        jf1Var.w = false;
                    }
                    jf1Var.h();
                    jf1Var.w = true;
                    jf1Var.i = SystemClock.uptimeMillis();
                }
                return false;
        }
    }
}
