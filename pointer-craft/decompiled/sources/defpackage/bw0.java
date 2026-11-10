package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bw0 {
    public Parcelable c(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean g(View view) {
        return false;
    }

    public boolean i(View view, int i, int i2) {
        return false;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public void m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    public boolean s(View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean t(View view) {
        return false;
    }

    public boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void v() {
    }

    public void r(ew0 ew0Var) {
    }

    public void y(View view) {
    }

    public void w(View view, Parcelable parcelable) {
    }

    public void b(View view, View view2, int i) {
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }
}
