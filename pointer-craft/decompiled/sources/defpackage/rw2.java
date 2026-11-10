package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes2.dex */
public final class rw2 implements View.OnTouchListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ rw2(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                sw2 sw2Var = (sw2) obj;
                ow2 ow2Var = sw2Var.d;
                Handler handler = sw2Var.C;
                em emVar = sw2Var.G;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && emVar != null && emVar.isShowing() && x >= 0 && x < emVar.getWidth() && y >= 0 && y < emVar.getHeight()) {
                    handler.postDelayed(ow2Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(ow2Var);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
