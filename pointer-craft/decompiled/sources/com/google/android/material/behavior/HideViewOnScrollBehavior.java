package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bw0;
import defpackage.cc0;
import defpackage.du4;
import defpackage.ew0;
import defpackage.l0;
import defpackage.lr2;
import defpackage.mq2;
import defpackage.o62;
import defpackage.p62;
import defpackage.q62;
import defpackage.qi;
import defpackage.uo1;
import io.appground.blek.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends bw0 {
    public q62 g;
    public TimeInterpolator j;
    public TimeInterpolator l;
    public ViewPropertyAnimator m;
    public o62 r;
    public int v;
    public int x;
    public AccessibilityManager y;
    public final LinkedHashSet n = new LinkedHashSet();
    public int t = 0;
    public byte a = 2;
    public int q = 0;
    public int w = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // defpackage.bw0
    public final boolean i(View view, int i, int i2) {
        return i == 2;
    }

    @Override // defpackage.bw0
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredHeight;
        int i2;
        AccessibilityManager accessibilityManager = this.y;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.y = accessibilityManager;
        }
        if (accessibilityManager != null && this.r == null) {
            o62 o62Var = new o62(this, view, (byte) 1);
            this.r = o62Var;
            accessibilityManager.addTouchExplorationStateChangeListener(o62Var);
            view.addOnAttachStateChangeListener(new cc0(this, (byte) 3));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((ew0) view.getLayoutParams()).r;
        if (i3 == 80 || i3 == 81) {
            p(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            p((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        switch (this.g.g) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        this.t = measuredHeight + i2;
        this.v = mq2.h(view.getContext(), R.attr.motionDurationLong2, 225);
        this.x = mq2.h(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.l = lr2.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, qi.n);
        this.j = lr2.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, qi.r);
        return false;
    }

    @Override // defpackage.bw0
    public final void m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                u(view);
                return;
            }
            return;
        }
        if (this.a == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.y;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.m;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            z(view, 1);
            this.m = this.g.l(view, this.t).setInterpolator(this.j).setDuration(this.x).setListener(new p62(this, view, (byte) 1));
        }
    }

    public final void p(int i) {
        int i2;
        q62 q62Var = this.g;
        if (q62Var != null) {
            switch (q62Var.g) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return;
            }
        }
        if (i == 0) {
            this.g = new q62((byte) 2);
            return;
        }
        if (i == 1) {
            this.g = new q62((byte) 0);
        } else if (i == 2) {
            this.g = new q62((byte) 1);
        } else {
            l0.u(du4.w(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
        }
    }

    public final void u(View view) {
        if (this.a == 2) {
            return;
        }
        z(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.g.getClass();
        this.m = this.g.l(view, 0).setInterpolator(this.l).setDuration(this.v).setListener(new p62(this, view, (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(View view, int i) {
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
        Iterator it = this.n.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            uo1.B();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
