package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class vg2 extends GestureDetector.SimpleOnGestureListener {
    public boolean g = true;
    public final /* synthetic */ wg2 y;

    public vg2(wg2 wg2Var) {
        this.y = wg2Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        wg2 wg2Var;
        View viewQ;
        n54 n54VarN;
        if (!this.g || (viewQ = (wg2Var = this.y).q(motionEvent)) == null || (n54VarN = wg2Var.p.N(viewQ)) == null) {
            return;
        }
        ld1 ld1Var = wg2Var.w;
        RecyclerView recyclerView = wg2Var.p;
        ld1Var.v(recyclerView, n54VarN);
        if ((ld1.y(983055, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = wg2Var.q;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                wg2Var.n = x;
                wg2Var.v = y;
                wg2Var.t = 0.0f;
                wg2Var.j = 0.0f;
                wg2Var.b(n54VarN, 2);
            }
        }
    }
}
