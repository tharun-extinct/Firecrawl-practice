package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bw0;
import defpackage.cc0;
import defpackage.lr2;
import defpackage.mq2;
import defpackage.o62;
import defpackage.p62;
import defpackage.qi;
import defpackage.uo1;
import io.appground.blek.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends bw0 {
    public o62 j;
    public AccessibilityManager l;
    public ViewPropertyAnimator m;
    public TimeInterpolator n;
    public int r;
    public TimeInterpolator v;
    public int y;
    public final LinkedHashSet g = new LinkedHashSet();
    public int x = 0;
    public final boolean t = true;
    public byte a = 2;
    public int q = 0;
    public int w = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.bw0
    public boolean i(View view, int i, int i2) {
        return i == 2;
    }

    @Override // defpackage.bw0
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.x = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.y = mq2.h(view.getContext(), R.attr.motionDurationLong2, 225);
        this.r = mq2.h(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.n = lr2.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, qi.n);
        this.v = lr2.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, qi.r);
        AccessibilityManager accessibilityManager = this.l;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.l = accessibilityManager;
        }
        if (accessibilityManager != null && this.j == null) {
            o62 o62Var = new o62(this, view, (byte) 0);
            this.j = o62Var;
            accessibilityManager.addTouchExplorationStateChangeListener(o62Var);
            view.addOnAttachStateChangeListener(new cc0(this, (byte) 2));
        }
        return false;
    }

    @Override // defpackage.bw0
    public final void m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                p(view);
            }
        } else {
            if (this.a == 1) {
                return;
            }
            if (this.t && (accessibilityManager = this.l) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.m;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            u(view, 1);
            this.m = view.animate().translationY(this.x).setInterpolator(this.v).setDuration(this.r).setListener(new p62(this, view, (byte) 0));
        }
    }

    public final void p(View view) {
        if (this.a == 2) {
            return;
        }
        u(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.m = view.animate().translationY(0.0f).setInterpolator(this.n).setDuration(this.y).setListener(new p62(this, view, (byte) 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(View view, int i) {
        this.a = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.q = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.w = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.q);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.w);
            }
        }
        Iterator it = this.g.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            uo1.B();
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
