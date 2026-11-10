package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sg2 implements a54 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ sg2(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.a54
    public final boolean g(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                wg2 wg2Var = (wg2) obj;
                wg2Var.k.onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                tg2 tg2Var = null;
                if (actionMasked == 0) {
                    wg2Var.q = motionEvent.getPointerId(0);
                    wg2Var.n = motionEvent.getX();
                    wg2Var.v = motionEvent.getY();
                    VelocityTracker velocityTracker = wg2Var.z;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    wg2Var.z = VelocityTracker.obtain();
                    if (wg2Var.r == null) {
                        ArrayList arrayList = wg2Var.b;
                        if (!arrayList.isEmpty()) {
                            View viewQ = wg2Var.q(motionEvent);
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                tg2 tg2Var2 = (tg2) arrayList.get(size);
                                if (tg2Var2.v.g == viewQ) {
                                    tg2Var = tg2Var2;
                                }
                            }
                        }
                        if (tg2Var != null) {
                            n54 n54Var = tg2Var.v;
                            wg2Var.n -= tg2Var.t;
                            wg2Var.v -= tg2Var.a;
                            wg2Var.m(n54Var, true);
                            if (wg2Var.g.remove(n54Var.g)) {
                                wg2Var.w.g(wg2Var.p, n54Var);
                            }
                            wg2Var.b(n54Var, tg2Var.x);
                            wg2Var.s(wg2Var.i, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    wg2Var.q = -1;
                    wg2Var.b(null, 0);
                } else {
                    int i = wg2Var.q;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        wg2Var.t(actionMasked, iFindPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = wg2Var.z;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return wg2Var.r != null;
            default:
                if (motionEvent.getActionMasked() == 3) {
                    ((q70) obj).h();
                }
                return false;
        }
    }

    @Override // defpackage.a54
    public final void n(boolean z) {
        switch (this.g) {
            case 0:
                if (z) {
                    ((wg2) this.y).b(null, 0);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.a54
    public final void y(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.g) {
            case 0:
                wg2 wg2Var = (wg2) this.y;
                ml mlVar = wg2Var.u;
                wg2Var.k.onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = wg2Var.z;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (wg2Var.q != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int iFindPointerIndex = motionEvent.findPointerIndex(wg2Var.q);
                    if (iFindPointerIndex >= 0) {
                        wg2Var.t(actionMasked, iFindPointerIndex, motionEvent);
                    }
                    n54 n54Var = wg2Var.r;
                    if (n54Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (iFindPointerIndex >= 0) {
                                    wg2Var.s(wg2Var.i, iFindPointerIndex, motionEvent);
                                    wg2Var.i(n54Var);
                                    wg2Var.p.removeCallbacks(mlVar);
                                    mlVar.run();
                                    wg2Var.p.invalidate();
                                }
                                break;
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = wg2Var.z;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == wg2Var.q) {
                                    wg2Var.q = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    wg2Var.s(wg2Var.i, actionIndex, motionEvent);
                                }
                                break;
                            }
                        }
                        wg2Var.b(null, 0);
                        wg2Var.q = -1;
                        break;
                    }
                }
                break;
        }
    }

    private final void r(boolean z) {
    }

    private final void v(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
