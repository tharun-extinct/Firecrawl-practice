package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class ld2 implements View.OnTouchListener {
    public final int a;
    public final Dialog j;
    public final int m;
    public final int t;

    public ld2(Dialog dialog, Rect rect) {
        this.j = dialog;
        this.t = rect.left;
        this.a = rect.top;
        this.m = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.t;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.a;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            float f = (-this.m) - 1;
            motionEventObtain.setLocation(f, f);
        }
        view.performClick();
        return this.j.onTouchEvent(motionEventObtain);
    }
}
