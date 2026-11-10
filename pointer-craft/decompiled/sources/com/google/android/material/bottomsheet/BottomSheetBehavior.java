package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ag1;
import defpackage.b20;
import defpackage.b50;
import defpackage.bw0;
import defpackage.c50;
import defpackage.d50;
import defpackage.du4;
import defpackage.el5;
import defpackage.ew0;
import defpackage.f2;
import defpackage.f50;
import defpackage.fn4;
import defpackage.g33;
import defpackage.g50;
import defpackage.im5;
import defpackage.l0;
import defpackage.mq2;
import defpackage.od2;
import defpackage.p24;
import defpackage.pk5;
import defpackage.qk5;
import defpackage.r1;
import defpackage.rk4;
import defpackage.s1;
import defpackage.tp5;
import defpackage.u16;
import defpackage.uo1;
import defpackage.xi3;
import defpackage.xk5;
import defpackage.yo5;
import defpackage.zq2;
import io.appground.blek.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends bw0 {
    public boolean A;
    public final g50 B;
    public final ValueAnimator C;
    public final int D;
    public int E;
    public int F;
    public final float G;
    public int H;
    public final float I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public int P;
    public el5 Q;
    public boolean R;
    public int S;
    public boolean T;
    public final float U;
    public int V;
    public int W;
    public int X;
    public WeakReference Y;
    public final ArrayList Z;
    public final g33 a;
    public final ArrayList a0;
    public final boolean b;
    public VelocityTracker b0;
    public int c;
    public int c0;
    public final boolean d;
    public int d0;
    public final fn4 e;
    public WeakReference e0;
    public int f;
    public boolean f0;
    public final int g;
    public HashMap g0;
    public final boolean h;
    public final SparseIntArray h0;
    public final boolean i;
    public final SparseIntArray i0;
    public int j;
    public final SparseIntArray j0;
    public int k;
    public final Rect k0;
    public boolean l;
    public final d50 l0;
    public final ColorStateList m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final float r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public int x;
    public boolean y;
    public final boolean z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        byte b = 0;
        this.g = 0;
        this.y = true;
        this.q = -1;
        this.w = -1;
        this.B = new g50(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.d0 = -1;
        this.h0 = new SparseIntArray();
        this.i0 = new SparseIntArray();
        this.j0 = new SparseIntArray();
        this.k0 = new Rect();
        this.l0 = new d50(this, b);
        this.t = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p24.y);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.m = zq2.b(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.e = fn4.l(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).g();
        }
        fn4 fn4Var = this.e;
        if (fn4Var != null) {
            g33 g33Var = new g33(fn4Var);
            this.a = g33Var;
            g33Var.c(context);
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                this.a.p(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.a.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new c50(this, b));
        this.I = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            D(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            D(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.J != z) {
            this.J = z;
            if (!z && this.P == 5) {
                E(4);
            }
            I();
        }
        this.i = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.y != z2) {
            this.y = z2;
            if (this.Y != null) {
                u();
            }
            F((this.y && this.P == 6) ? 3 : this.P);
            J(this.P, true);
            I();
        }
        this.K = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.M = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.g = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            l0.u("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.G = f;
        if (this.Y != null) {
            this.F = (int) ((1.0f - f) * this.X);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                l0.u("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = dimensionPixelOffset;
            J(this.P, true);
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                l0.u("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = i2;
            J(this.P, true);
        }
        this.n = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.v = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.O = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.b = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.s = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.z = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.h = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.o = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.d = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.r = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View f(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewF = f(viewGroup.getChildAt(i));
            if (viewF != null) {
                return viewF;
            }
        }
        return null;
    }

    public static int k(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final boolean A() {
        WeakReference weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean B(View view) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() == view) {
                return true;
            }
        }
        return false;
    }

    public final void C(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.Z.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                C(viewGroup.getChildAt(i));
            }
        }
    }

    public final void D(int i) {
        boolean z = this.l;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.l = true;
            }
        } else {
            if (!z && this.x == i) {
                return;
            }
            this.l = false;
            this.x = Math.max(0, i);
        }
        L();
    }

    public final void E(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(du4.b(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.J && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.y && e(i) <= this.E) ? 3 : i;
        WeakReference weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            F(i);
            return;
        }
        View view = (View) this.Y.get();
        b50 b50Var = new b50(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(b50Var);
        } else {
            b50Var.run();
        }
    }

    public final void F(int i) {
        if (this.P == i) {
            return;
        }
        this.P = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.J;
        }
        WeakReference weakReference = this.Y;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            K(true);
        } else if (i == 6 || i == 5 || i == 4) {
            K(false);
        }
        J(i, true);
        ArrayList arrayList = this.a0;
        if (arrayList.size() <= 0) {
            I();
        } else {
            arrayList.get(0).getClass();
            uo1.B();
        }
    }

    public final boolean G(View view, float f) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f * this.U) + ((float) view.getTop())) - ((float) this.H)) / ((float) h()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        F(2);
        J(r4, true);
        r2.B.g(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.c(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.e(r4)
            el5 r1 = r2.Q
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.c(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.p = r3
            r3 = -1
            r1.r = r3
            r3 = 0
            boolean r3 = r1.j(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            byte r5 = r1.g
            if (r5 != 0) goto L30
            android.view.View r5 = r1.p
            if (r5 == 0) goto L30
            r5 = 0
            r1.p = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.F(r3)
            r3 = 1
            r2.J(r4, r3)
            g50 r2 = r2.B
            r2.g(r4)
            return
        L40:
            r2.F(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.H(android.view.View, int, boolean):void");
    }

    public final void I() {
        View view;
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        xk5.t(view, 1048576);
        xk5.l(view, 0);
        xk5.t(view, 524288);
        xk5.l(view, 0);
        xk5.t(view, 262144);
        xk5.l(view, 0);
        SparseIntArray sparseIntArray = this.i0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            xk5.t(view, i);
            xk5.l(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.h0;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            xk5.t(view, i2);
            xk5.l(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.j0;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            xk5.t(view, i3);
            xk5.l(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.y && this.P != 6) {
            sparseIntArray2.put(0, p(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J && this.P != 5) {
            xk5.a(view, f2.m, new u16(5, this));
        }
        int i4 = this.P;
        if (i4 == 3) {
            if (this.K && this.J) {
                return;
            }
            sparseIntArray3.put(0, p(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i4 == 4) {
            sparseIntArray.put(0, p(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i4 != 6) {
                return;
            }
            if (!this.K || !this.J) {
                sparseIntArray3.put(0, p(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, p(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void J(int i, boolean z) {
        g33 g33Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.P == 3 && (this.d || A());
        if (this.A == z2 || (g33Var = this.a) == null) {
            return;
        }
        this.A = z2;
        ValueAnimator valueAnimator = this.C;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            g33Var.u(this.A ? z() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(g33Var.t.t, z2 ? z() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void K(boolean z) {
        WeakReference weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.g0 != null) {
                    return;
                } else {
                    this.g0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.Y.get() && z) {
                    this.g0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.g0 = null;
        }
    }

    public final void L() {
        View view;
        if (this.Y != null) {
            u();
            if (this.P != 4 || (view = (View) this.Y.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.bw0
    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean zB;
        if (i3 != 1 && (zB = B(view2))) {
            int top = view.getTop();
            int i4 = top - i2;
            boolean z = this.L;
            boolean z2 = this.M;
            if (i2 > 0) {
                if (!this.T && !z2 && zB && view2.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i4 < d()) {
                    int iD = top - d();
                    iArr[1] = iD;
                    WeakHashMap weakHashMap = xk5.g;
                    view.offsetTopAndBottom(-iD);
                    F(3);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = xk5.g;
                    view.offsetTopAndBottom(-i2);
                    F(1);
                }
            } else if (i2 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.T && !z2 && zB && zCanScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i5 = this.H;
                    if (i4 > i5 && !this.J) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = xk5.g;
                        view.offsetTopAndBottom(-i6);
                        F(4);
                    } else {
                        if (!z) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = xk5.g;
                        view.offsetTopAndBottom(-i2);
                        F(1);
                    }
                }
            }
            o(view.getTop());
            this.S = i2;
            this.T = true;
            this.N = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    @Override // defpackage.bw0
    public final void b(View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == d()) {
            F(3);
            return;
        }
        if (B(view2) && this.T) {
            if (this.S > 0) {
                if (!this.y && view.getTop() > this.F) {
                    i3 = 6;
                }
            } else if (this.J) {
                VelocityTracker velocityTracker = this.b0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.r);
                    yVelocity = this.b0.getYVelocity(this.c0);
                }
                if (G(view, yVelocity)) {
                    i3 = 5;
                } else if (this.S == 0) {
                    top2 = view.getTop();
                    if (this.y) {
                        i2 = this.F;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.H)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.H)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.E) >= Math.abs(top2 - this.H)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.y) {
                        top = view.getTop();
                        if (Math.abs(top - this.F) < Math.abs(top - this.H)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.S == 0) {
                top2 = view.getTop();
                if (this.y) {
                    i2 = this.F;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.H)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.H)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.E) >= Math.abs(top2 - this.H)) {
                    i3 = 4;
                }
            } else {
                if (!this.y) {
                    top = view.getTop();
                    if (Math.abs(top - this.F) < Math.abs(top - this.H)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            H(view, i3, false);
            this.T = false;
        }
    }

    @Override // defpackage.bw0
    public final Parcelable c(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new f50(this);
    }

    public final int d() {
        if (this.y) {
            return this.E;
        }
        return Math.max(this.D, this.u ? 0 : this.k);
    }

    public final int e(int i) {
        if (i == 3) {
            return d();
        }
        if (i == 4) {
            return this.H;
        }
        if (i == 5) {
            return this.X;
        }
        if (i == 6) {
            return this.F;
        }
        l0.u(xi3.j("Invalid state to get top offset: ", i));
        return 0;
    }

    public final int h() {
        int iMin;
        int i;
        int i2;
        if (this.l) {
            iMin = Math.min(Math.max(this.j, this.X - ((this.W * 9) / 16)), this.V);
            i = this.f;
        } else {
            if (!this.i && !this.b && (i2 = this.c) > 0) {
                return Math.max(this.x, i2 + this.t);
            }
            iMin = this.x;
            i = this.f;
        }
        return iMin + i;
    }

    @Override // defpackage.bw0
    public final boolean i(View view, int i, int i2) {
        this.S = 0;
        this.T = false;
        return (i & 2) != 0;
    }

    @Override // defpackage.bw0
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(k(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.q, marginLayoutParams.width), k(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.w, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.bw0
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.Y == null) {
            this.j = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.i || this.l) ? false : true;
            if (this.b || this.s || this.p || this.z || this.h || this.o || z) {
                b20 b20Var = new b20(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ag1 ag1Var = new ag1();
                ag1Var.g = paddingStart;
                ag1Var.y = paddingEnd;
                ag1Var.r = paddingBottom;
                rk4 rk4Var = new rk4((Object) b20Var, (Object) ag1Var, (byte) 23);
                WeakHashMap weakHashMap = xk5.g;
                pk5.r(view, rk4Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new im5());
                }
            }
            od2 od2Var = new od2(view);
            WeakHashMap weakHashMap2 = xk5.g;
            yo5.g(view, od2Var);
            this.Y = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            mq2.h(context, R.attr.motionDurationMedium2, 300);
            mq2.h(context, R.attr.motionDurationShort3, 150);
            mq2.h(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            g33 g33Var = this.a;
            if (g33Var != null) {
                view.setBackground(g33Var);
                float elevation = this.I;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                g33Var.s(elevation);
            } else {
                ColorStateList colorStateList = this.m;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            I();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = new el5(coordinatorLayout.getContext(), coordinatorLayout, this.l0);
        }
        int top = view.getTop();
        coordinatorLayout.b(view, i);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.V = height;
        int i2 = this.X;
        int i3 = i2 - height;
        int i4 = this.k;
        if (i3 < i4) {
            boolean z2 = this.u;
            int i5 = this.w;
            if (z2) {
                height = i5 == -1 ? i2 : Math.min(i2, i5);
                this.V = height;
            } else {
                int i6 = i2 - i4;
                height = i5 == -1 ? i6 : Math.min(i6, i5);
                this.V = height;
            }
        }
        this.E = Math.max(0, this.X - height);
        this.F = (int) ((1.0f - this.G) * this.X);
        u();
        int i7 = this.P;
        if (i7 == 3) {
            int iD = d();
            WeakHashMap weakHashMap3 = xk5.g;
            view.offsetTopAndBottom(iD);
        } else if (i7 == 6) {
            int i8 = this.F;
            WeakHashMap weakHashMap4 = xk5.g;
            view.offsetTopAndBottom(i8);
        } else if (this.J && i7 == 5) {
            int i9 = this.X;
            WeakHashMap weakHashMap5 = xk5.g;
            view.offsetTopAndBottom(i9);
        } else if (i7 == 4) {
            int i10 = this.H;
            WeakHashMap weakHashMap6 = xk5.g;
            view.offsetTopAndBottom(i10);
        } else if (i7 == 1 || i7 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap7 = xk5.g;
            view.offsetTopAndBottom(top2);
        }
        J(this.P, false);
        ArrayList arrayList = this.Z;
        arrayList.clear();
        if (this.v) {
            C(view);
        } else {
            arrayList.add(new WeakReference(f(view)));
        }
        ArrayList arrayList2 = this.a0;
        if (arrayList2.size() <= 0) {
            return true;
        }
        arrayList2.get(0).getClass();
        uo1.B();
        return false;
    }

    public final void o(int i) {
        if (((View) this.Y.get()) != null) {
            ArrayList arrayList = this.a0;
            if (arrayList.isEmpty()) {
                return;
            }
            if (i <= this.H) {
                d();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            uo1.B();
        }
    }

    public final int p(View view, int i, int i2) {
        int iY;
        String string = view.getResources().getString(i);
        u16 u16Var = new u16(i2, this);
        ArrayList arrayListV = xk5.v(view);
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListV.size()) {
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    int[] iArr = xk5.n;
                    if (i4 >= 32 || i5 != -1) {
                        break;
                    }
                    int i6 = iArr[i4];
                    boolean z = true;
                    for (int i7 = 0; i7 < arrayListV.size(); i7++) {
                        z &= ((f2) arrayListV.get(i7)).y() != i6;
                    }
                    if (z) {
                        i5 = i6;
                    }
                    i4++;
                }
                iY = i5;
                break;
            }
            if (TextUtils.equals(string, ((f2) arrayListV.get(i3)).r())) {
                iY = ((f2) arrayListV.get(i3)).y();
                break;
            }
            i3++;
        }
        if (iY != -1) {
            f2 f2Var = new f2(null, iY, string, u16Var, null);
            View.AccessibilityDelegate accessibilityDelegateR = xk5.r(view);
            s1 s1Var = accessibilityDelegateR == null ? null : accessibilityDelegateR instanceof r1 ? ((r1) accessibilityDelegateR).g : new s1(accessibilityDelegateR);
            if (s1Var == null) {
                s1Var = new s1();
            }
            xk5.q(view, s1Var);
            xk5.t(view, f2Var.y());
            xk5.v(view).add(f2Var);
            xk5.l(view, 0);
        }
        return iY;
    }

    @Override // defpackage.bw0
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (!this.O || view.isInTouchMode()) {
            return false;
        }
        int i = this.P;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.k0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = xk5.g;
            tp5 tp5VarG = qk5.g(view);
            if (tp5VarG != null) {
                rect2.bottom -= tp5VarG.g.t(519).n;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        E(3);
        return true;
    }

    @Override // defpackage.bw0
    public final void r(ew0 ew0Var) {
        this.Y = null;
        this.Q = null;
    }

    @Override // defpackage.bw0
    public final boolean s(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.P;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        el5 el5Var = this.Q;
        boolean z = this.L;
        if (el5Var != null && (z || i == 1)) {
            el5Var.t(motionEvent);
        }
        if (actionMasked == 0) {
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = null;
            VelocityTracker velocityTracker = this.b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b0 = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.b0;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.b0 = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (this.Q != null && ((z || this.P == 1) && actionMasked == 2 && !this.R)) {
            float fAbs = Math.abs(this.d0 - motionEvent.getY());
            el5 el5Var2 = this.Q;
            if (fAbs > el5Var2.y) {
                el5Var2.y(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.R;
    }

    @Override // defpackage.bw0
    public final boolean t(View view) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() != null) {
                if (!B(view) || this.P == 3 || this.N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public final void u() {
        int iH = h();
        boolean z = this.y;
        int i = this.X;
        if (z) {
            this.H = Math.max(i - iH, this.E);
        } else {
            this.H = i - iH;
        }
    }

    @Override // defpackage.bw0
    public final void v() {
        this.Y = null;
        this.Q = null;
    }

    @Override // defpackage.bw0
    public final void w(View view, Parcelable parcelable) {
        f50 f50Var = (f50) parcelable;
        int i = this.g;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.x = f50Var.m;
            }
            if (i == -1 || (i & 2) == 2) {
                this.y = f50Var.q;
            }
            if (i == -1 || (i & 4) == 4) {
                this.J = f50Var.w;
            }
            if (i == -1 || (i & 8) == 8) {
                this.K = f50Var.c;
            }
        }
        int i2 = f50Var.a;
        if (i2 == 1 || i2 == 2) {
            this.P = 4;
        } else {
            this.P = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    @Override // defpackage.bw0
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        el5 el5Var;
        if (!view.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = null;
            VelocityTracker velocityTracker = this.b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b0 = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.b0;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.b0 = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        ArrayList arrayList = this.Z;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.d0 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        view2 = null;
                        break;
                    }
                    Object obj = arrayList.get(i2);
                    i2++;
                    view2 = (View) ((WeakReference) obj).get();
                    if (view2 != null && coordinatorLayout.c(view2, x2, y)) {
                        break;
                    }
                }
            }
            WeakReference weakReference = new WeakReference(view2);
            this.e0 = weakReference;
            if (this.P != 2 && weakReference.get() != null) {
                this.c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f0 = true;
            }
            this.R = this.c0 == -1 && !coordinatorLayout.c(view, x, this.d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f0 = false;
            this.e0 = null;
            this.c0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (this.R || (el5Var = this.Q) == null || !el5Var.i(motionEvent)) {
            if (actionMasked == 2) {
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    if (((WeakReference) obj2).get() != null) {
                        if (!this.R && this.P != 1) {
                            if (!this.v) {
                                View view3 = !arrayList.isEmpty() ? (View) ((WeakReference) arrayList.get(0)).get() : null;
                                if (view3 != null && coordinatorLayout.c(view3, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    break;
                                }
                                if (this.Q == null) {
                                    break;
                                }
                            } else {
                                WeakReference weakReference2 = this.e0;
                                if (weakReference2 != null && weakReference2.get() != null) {
                                    break;
                                }
                                if (this.Q == null || (i = this.d0) == -1 || Math.abs(i - motionEvent.getY()) <= this.Q.y) {
                                    break;
                                }
                            }
                        } else {
                            break;
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    public final float z() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        g33 g33Var = this.a;
        if (g33Var != null && (weakReference = this.Y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.Y.get();
            if (A() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fM = g33Var.m();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fM <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fM;
                    }
                } else {
                    f = 0.0f;
                }
                float[] fArr = g33Var.I;
                float fG = fArr != null ? fArr[0] : g33Var.t.g.n().x.g(g33Var.l());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fG > 0.0f) {
                        f2 = radius2 / fG;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public BottomSheetBehavior() {
        this.g = 0;
        this.y = true;
        this.q = -1;
        this.w = -1;
        this.B = new g50(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.d0 = -1;
        this.h0 = new SparseIntArray();
        this.i0 = new SparseIntArray();
        this.j0 = new SparseIntArray();
        this.k0 = new Rect();
        this.l0 = new d50(this, (byte) 0);
    }

    @Override // defpackage.bw0
    public final void m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
