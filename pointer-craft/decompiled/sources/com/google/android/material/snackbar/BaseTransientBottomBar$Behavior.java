package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.bi6;
import defpackage.k2;
import defpackage.oy;

/* JADX INFO: loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final bi6 j;

    public BaseTransientBottomBar$Behavior() {
        bi6 bi6Var = new bi6((byte) 13);
        this.v = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.x = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.n = (byte) 0;
        this.j = bi6Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean p(View view) {
        this.j.getClass();
        return view instanceof oy;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.bw0
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.j.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                k2 k2Var = k2.t;
                if (k2Var == null) {
                    k2Var = new k2();
                    k2.t = k2Var;
                }
                synchronized (k2Var.j) {
                }
            }
        } else if (coordinatorLayout.c(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            k2 k2Var2 = k2.t;
            if (k2Var2 == null) {
                k2Var2 = new k2();
                k2.t = k2Var2;
            }
            synchronized (k2Var2.j) {
            }
        }
        return super.x(coordinatorLayout, view, motionEvent);
    }
}
