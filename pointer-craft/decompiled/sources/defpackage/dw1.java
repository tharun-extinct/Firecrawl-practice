package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dw1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final int a;
    public final int[] b = new int[2];
    public boolean c;
    public int i;
    public final float j;
    public final View m;
    public cw1 q;
    public final int t;
    public cw1 w;

    public dw1(View view) {
        this.m = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.j = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.t = tapTimeout;
        this.a = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void g() {
        cw1 cw1Var = this.w;
        View view = this.m;
        if (cw1Var != null) {
            view.removeCallbacks(cw1Var);
        }
        cw1 cw1Var2 = this.q;
        if (cw1Var2 != null) {
            view.removeCallbacks(cw1Var2);
        }
    }

    public boolean n() {
        mp4 mp4VarY = y();
        if (mp4VarY == null || !mp4VarY.g()) {
            return true;
        }
        mp4VarY.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        ef1 ef1VarJ;
        boolean z2 = this.c;
        View view2 = this.m;
        if (z2) {
            mp4 mp4VarY = y();
            if (mp4VarY != null && mp4VarY.g() && (ef1VarJ = mp4VarY.j()) != null && ef1VarJ.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.b;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                ef1VarJ.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zY = ef1VarJ.y(motionEventObtainNoHistory, this.i);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zY && z3) {
                    z = true;
                } else if (n()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (n()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.i = motionEvent.getPointerId(0);
                    cw1 cw1Var = this.q;
                    if (cw1Var == null) {
                        cw1Var = new cw1(this, (byte) 0);
                        this.q = cw1Var;
                    }
                    view2.postDelayed(cw1Var, this.t);
                    cw1 cw1Var2 = this.w;
                    if (cw1Var2 == null) {
                        cw1Var2 = new cw1(this, (byte) 1);
                        this.w = cw1Var2;
                    }
                    view2.postDelayed(cw1Var2, this.a);
                } else if (actionMasked2 == 1) {
                    g();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.i);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.j;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            g();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (r()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    g();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.c = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c = false;
        this.i = -1;
        cw1 cw1Var = this.q;
        if (cw1Var != null) {
            this.m.removeCallbacks(cw1Var);
        }
    }

    public abstract boolean r();

    public abstract mp4 y();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
