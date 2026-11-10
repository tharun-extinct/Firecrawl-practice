package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.bw0;
import defpackage.d50;
import defpackage.du4;
import defpackage.e3;
import defpackage.el5;
import defpackage.en4;
import defpackage.et2;
import defpackage.ew0;
import defpackage.f2;
import defpackage.fn4;
import defpackage.g33;
import defpackage.g50;
import defpackage.l;
import defpackage.l0;
import defpackage.mq2;
import defpackage.op4;
import defpackage.p24;
import defpackage.uo1;
import defpackage.xk5;
import defpackage.zq2;
import io.appground.blek.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends bw0 {
    public boolean a;
    public WeakReference b;
    public int c;
    public et2 g;
    public final LinkedHashSet h;
    public int i;
    public int j;
    public final boolean l;
    public final float m;
    public final fn4 n;
    public final d50 o;
    public final int p;
    public int q;
    public final ColorStateList r;
    public WeakReference s;
    public el5 t;
    public VelocityTracker u;
    public final g50 v;
    public int w;
    public final float x;
    public final g33 y;
    public int z;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.v = new g50(this);
        this.l = true;
        this.j = 5;
        this.m = 0.1f;
        this.p = -1;
        this.h = new LinkedHashSet();
        this.o = new d50(this, (byte) 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p24.G);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.r = zq2.b(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.n = fn4.l(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).g();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.p = resourceId;
            WeakReference weakReference = this.s;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.s = null;
            WeakReference weakReference2 = this.b;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        fn4 fn4Var = this.n;
        if (fn4Var != null) {
            g33 g33Var = new g33(fn4Var);
            this.y = g33Var;
            g33Var.c(context);
            ColorStateList colorStateList = this.r;
            if (colorStateList != null) {
                this.y.p(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.y.setTint(typedValue.data);
            }
        }
        this.x = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.l = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.bw0
    public final Parcelable c(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new op4(this);
    }

    public final void h() {
        View view;
        WeakReference weakReference = this.b;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        xk5.t(view, 262144);
        xk5.l(view, 0);
        xk5.t(view, 1048576);
        xk5.l(view, 0);
        final int i = 5;
        if (this.j != 5) {
            xk5.a(view, f2.m, new e3() { // from class: np4
                @Override // defpackage.e3
                public final boolean r(View view2) {
                    byte b = i;
                    byte b2 = 1;
                    if (b == 1 || b == 2) {
                        throw new IllegalArgumentException(du4.b(new StringBuilder("STATE_"), b == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.j;
                    WeakReference weakReference2 = sideSheetBehavior.b;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.p(b);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.b.get();
                    w74 w74Var = new w74(sideSheetBehavior, b, b2);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(w74Var);
                        return true;
                    }
                    w74Var.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.j != 3) {
            xk5.a(view, f2.a, new e3() { // from class: np4
                @Override // defpackage.e3
                public final boolean r(View view2) {
                    byte b = i2;
                    byte b2 = 1;
                    if (b == 1 || b == 2) {
                        throw new IllegalArgumentException(du4.b(new StringBuilder("STATE_"), b == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.j;
                    WeakReference weakReference2 = sideSheetBehavior.b;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.p(b);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.b.get();
                    w74 w74Var = new w74(sideSheetBehavior, b, b2);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(w74Var);
                        return true;
                    }
                    w74Var.run();
                    return true;
                }
            });
        }
    }

    @Override // defpackage.bw0
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0205  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:0x0121  */
    /* JADX WARN: Code duplicated, block: B:74:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    @Override // defpackage.bw0
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        ew0 ew0Var;
        fn4 fn4Var;
        WeakReference weakReference;
        fn4 fn4VarG;
        View view2;
        WeakReference weakReference2;
        fn4 fn4VarG2;
        View view3;
        int left;
        int i2;
        int iR;
        int i3;
        View viewFindViewById;
        int i4;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference3 = this.b;
        g33 g33Var = this.y;
        if (weakReference3 == null) {
            this.b = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            mq2.h(context, R.attr.motionDurationMedium2, 300);
            mq2.h(context, R.attr.motionDurationShort3, 150);
            mq2.h(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (g33Var != null) {
                view.setBackground(g33Var);
                float elevation = this.x;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                g33Var.s(elevation);
            } else {
                ColorStateList colorStateList = this.r;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = xk5.g;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.j == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            h();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (xk5.n(view) == null) {
                xk5.w(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((ew0) view.getLayoutParams()).r, i) == 3 ? 1 : 0;
        et2 et2Var = this.g;
        if (et2Var != null) {
            switch (et2Var.g) {
                case 0:
                    i4 = 1;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            if (i4 != i6) {
                ew0Var = null;
                fn4Var = this.n;
                if (i6 == 0) {
                    this.g = new et2(this, (byte) 1);
                    if (fn4Var != null) {
                        weakReference2 = this.b;
                        if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof ew0)) {
                            ew0Var = (ew0) view3.getLayoutParams();
                        }
                        if (ew0Var != null || ((ViewGroup.MarginLayoutParams) ew0Var).rightMargin <= 0) {
                            en4 en4VarM = fn4Var.m();
                            en4VarM.x = new l(0.0f);
                            en4VarM.l = new l(0.0f);
                            fn4VarG2 = en4VarM.g();
                            if (g33Var != null) {
                                g33Var.setShapeAppearanceModel(fn4VarG2);
                            }
                        }
                    }
                } else {
                    if (i6 == 1) {
                        l0.u(du4.w(i6, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                        return false;
                    }
                    this.g = new et2(this, (byte) 0);
                    if (fn4Var != null) {
                        weakReference = this.b;
                        if (weakReference != null && (view2 = (View) weakReference.get()) != null && (view2.getLayoutParams() instanceof ew0)) {
                            ew0Var = (ew0) view2.getLayoutParams();
                        }
                        if (ew0Var != null || ((ViewGroup.MarginLayoutParams) ew0Var).leftMargin <= 0) {
                            en4 en4VarM2 = fn4Var.m();
                            en4VarM2.v = new l(0.0f);
                            en4VarM2.j = new l(0.0f);
                            fn4VarG = en4VarM2.g();
                            if (g33Var != null) {
                                g33Var.setShapeAppearanceModel(fn4VarG);
                            }
                        }
                    }
                }
            }
        } else {
            ew0Var = null;
            fn4Var = this.n;
            if (i6 == 0) {
                this.g = new et2(this, (byte) 1);
                if (fn4Var != null) {
                    weakReference2 = this.b;
                    if (weakReference2 != null) {
                        ew0Var = (ew0) view3.getLayoutParams();
                    }
                    if (ew0Var != null) {
                        en4 en4VarM3 = fn4Var.m();
                        en4VarM3.x = new l(0.0f);
                        en4VarM3.l = new l(0.0f);
                        fn4VarG2 = en4VarM3.g();
                        if (g33Var != null) {
                            g33Var.setShapeAppearanceModel(fn4VarG2);
                        }
                    } else {
                        en4 en4VarM4 = fn4Var.m();
                        en4VarM4.x = new l(0.0f);
                        en4VarM4.l = new l(0.0f);
                        fn4VarG2 = en4VarM4.g();
                        if (g33Var != null) {
                            g33Var.setShapeAppearanceModel(fn4VarG2);
                        }
                    }
                }
            } else {
                if (i6 == 1) {
                    l0.u(du4.w(i6, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.g = new et2(this, (byte) 0);
                if (fn4Var != null) {
                    weakReference = this.b;
                    if (weakReference != null) {
                        ew0Var = (ew0) view2.getLayoutParams();
                    }
                    if (ew0Var != null) {
                        en4 en4VarM5 = fn4Var.m();
                        en4VarM5.v = new l(0.0f);
                        en4VarM5.j = new l(0.0f);
                        fn4VarG = en4VarM5.g();
                        if (g33Var != null) {
                            g33Var.setShapeAppearanceModel(fn4VarG);
                        }
                    } else {
                        en4 en4VarM6 = fn4Var.m();
                        en4VarM6.v = new l(0.0f);
                        en4VarM6.j = new l(0.0f);
                        fn4VarG = en4VarM6.g();
                        if (g33Var != null) {
                            g33Var.setShapeAppearanceModel(fn4VarG);
                        }
                    }
                }
            }
        }
        if (this.t == null) {
            this.t = new el5(coordinatorLayout.getContext(), coordinatorLayout, this.o);
        }
        int iR2 = this.g.r(view);
        coordinatorLayout.b(view, i);
        this.w = coordinatorLayout.getWidth();
        switch (this.g.g) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.c = left;
        this.q = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.g.g) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i2 = 0;
        }
        this.i = i2;
        int i7 = this.j;
        if (i7 == 1 || i7 == 2) {
            iR = iR2 - this.g.r(view);
        } else if (i7 == 3) {
            iR = 0;
        } else {
            if (i7 != 5) {
                uo1.z("Unexpected value: ", this.j);
                return false;
            }
            iR = this.g.y();
        }
        WeakHashMap weakHashMap2 = xk5.g;
        view.offsetLeftAndRight(iR);
        if (this.s == null && (i3 = this.p) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.s = new WeakReference(viewFindViewById);
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                uo1.B();
                return false;
            }
        }
        return true;
    }

    public final void p(int i) {
        View view;
        if (this.j == i) {
            return;
        }
        this.j = i;
        WeakReference weakReference = this.b;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.j == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.h.iterator();
        if (!it.hasNext()) {
            h();
        } else {
            it.next().getClass();
            uo1.B();
        }
    }

    @Override // defpackage.bw0
    public final void r(ew0 ew0Var) {
        this.b = null;
        this.t = null;
    }

    @Override // defpackage.bw0
    public final boolean s(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.j == 1 && actionMasked == 0) {
            return true;
        }
        if (u()) {
            this.t.t(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.u) != null) {
            velocityTracker.recycle();
            this.u = null;
        }
        VelocityTracker velocityTrackerObtain = this.u;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.u = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (u() && actionMasked == 2 && !this.a && u()) {
            float fAbs = Math.abs(this.z - motionEvent.getX());
            el5 el5Var = this.t;
            if (fAbs > el5Var.y) {
                el5Var.y(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.a;
    }

    public final boolean u() {
        if (this.t != null) {
            return this.l || this.j == 1;
        }
        return false;
    }

    @Override // defpackage.bw0
    public final void v() {
        this.b = null;
        this.t = null;
    }

    @Override // defpackage.bw0
    public final void w(View view, Parcelable parcelable) {
        int i = ((op4) parcelable).a;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.j = i;
    }

    @Override // defpackage.bw0
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        el5 el5Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && xk5.n(view) == null) || !this.l) {
            this.a = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.u) != null) {
            velocityTracker.recycle();
            this.u = null;
        }
        VelocityTracker velocityTrackerObtain = this.u;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.u = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.z = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.a) {
            this.a = false;
            return false;
        }
        return (this.a || (el5Var = this.t) == null || !el5Var.i(motionEvent)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.c(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        p(2);
        r2.v.g(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            et2 r0 = r2.g
            int r0 = r0.y()
            goto L1d
        Ld:
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            java.lang.String r2 = defpackage.xi3.j(r2, r4)
            defpackage.l0.u(r2)
            return
        L17:
            et2 r0 = r2.g
            int r0 = r0.g()
        L1d:
            el5 r1 = r2.t
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.c(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.p = r3
            r3 = -1
            r1.r = r3
            r3 = 0
            boolean r3 = r1.j(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            byte r5 = r1.g
            if (r5 != 0) goto L49
            android.view.View r5 = r1.p
            if (r5 == 0) goto L49
            r5 = 0
            r1.p = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.p(r3)
            g50 r2 = r2.v
            r2.g(r4)
            return
        L55:
            r2.p(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.z(android.view.View, int, boolean):void");
    }

    public SideSheetBehavior() {
        this.v = new g50(this);
        this.l = true;
        this.j = 5;
        this.m = 0.1f;
        this.p = -1;
        this.h = new LinkedHashSet();
        this.o = new d50(this, (byte) 1);
    }
}
