package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bw0;
import defpackage.el5;
import defpackage.f2;
import defpackage.fa4;
import defpackage.h05;
import defpackage.xk5;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends bw0 {
    public el5 g;
    public boolean r;
    public boolean y;
    public byte n = 2;
    public float v = 0.0f;
    public float x = 0.5f;
    public final h05 l = new h05(this);

    @Override // defpackage.bw0
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            xk5.t(view, 1048576);
            xk5.l(view, 0);
            if (p(view)) {
                xk5.a(view, f2.m, new fa4((Object) this, (byte) 27));
            }
        }
        return false;
    }

    public boolean p(View view) {
        return true;
    }

    @Override // defpackage.bw0
    public final boolean s(View view, MotionEvent motionEvent) {
        if (this.g == null) {
            return false;
        }
        if (this.r && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.g.t(motionEvent);
        return true;
    }

    @Override // defpackage.bw0
    public boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zC = this.y;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zC = coordinatorLayout.c(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.y = zC;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.y = false;
        }
        if (zC) {
            el5 el5Var = this.g;
            if (el5Var == null) {
                el5Var = new el5(coordinatorLayout.getContext(), coordinatorLayout, this.l);
                this.g = el5Var;
            }
            if (!this.r && el5Var.i(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
