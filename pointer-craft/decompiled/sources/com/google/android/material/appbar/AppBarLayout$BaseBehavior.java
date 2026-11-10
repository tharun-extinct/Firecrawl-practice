package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.am5;
import defpackage.uo1;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout$BaseBehavior<T> extends am5 {
    public int n;
    public int r = -1;
    public int v = -1;
    public VelocityTracker x;
    public boolean y;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // defpackage.bw0
    public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // defpackage.bw0
    public final void b(View view, View view2, int i) {
        throw new ClassCastException();
    }

    @Override // defpackage.bw0
    public final Parcelable c(View view) {
        throw new ClassCastException();
    }

    @Override // defpackage.bw0
    public final boolean i(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // defpackage.bw0
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // defpackage.am5, defpackage.bw0
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // defpackage.bw0
    public final void m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062 A[RETURN] */
    @Override // defpackage.bw0
    public final boolean s(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                        this.r = motionEvent.getPointerId(i);
                        this.n = (int) (motionEvent.getY(i) + 0.5f);
                    }
                }
                velocityTracker = this.x;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (this.y) {
                    return true;
                }
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex != -1) {
                    this.n = (int) motionEvent.getY(iFindPointerIndex);
                    view.getClass();
                    uo1.B();
                    return false;
                }
            }
            return false;
        }
        VelocityTracker velocityTracker2 = this.x;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.x.computeCurrentVelocity(1000);
            this.x.getYVelocity(this.r);
            view.getClass();
            uo1.B();
            return false;
        }
        this.y = false;
        this.r = -1;
        VelocityTracker velocityTracker3 = this.x;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.x = null;
        }
        velocityTracker = this.x;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.y) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bw0
    public final void w(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    @Override // defpackage.bw0
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        if (this.v < 0) {
            this.v = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.y) {
            int i = this.r;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y - this.n) > this.v) {
                    this.n = y;
                    return true;
                }
                if (motionEvent.getActionMasked() != 0) {
                    this.r = -1;
                    motionEvent.getX();
                    motionEvent.getY();
                    uo1.B();
                    return false;
                }
                velocityTracker = this.x;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() != 0) {
                this.r = -1;
                motionEvent.getX();
                motionEvent.getY();
                uo1.B();
                return false;
            }
            velocityTracker = this.x;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
