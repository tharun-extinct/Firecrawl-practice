package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import defpackage.de0;
import defpackage.e54;
import defpackage.ee0;
import defpackage.fa4;
import defpackage.j54;
import defpackage.jl5;
import defpackage.jv2;
import defpackage.k12;
import defpackage.k2;
import defpackage.kk5;
import defpackage.l0;
import defpackage.l2;
import defpackage.m2;
import defpackage.m54;
import defpackage.n24;
import defpackage.n54;
import defpackage.p44;
import defpackage.rk4;
import defpackage.si0;
import defpackage.sp4;
import defpackage.v44;
import defpackage.v92;
import defpackage.x44;
import defpackage.xk5;
import defpackage.y44;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public final rk4 a;
    public final boolean b;
    public boolean c;
    public int h;
    public final boolean i;
    public ee0 j;
    public final rk4 m;
    public int o;
    public boolean p;
    public jv2 q;
    public int s;
    public RecyclerView t;
    public int u;
    public boolean w;
    public int z;

    public g() {
        v92 v92Var = new v92((Object) this, (byte) 24);
        fa4 fa4Var = new fa4((Object) this, (byte) 23);
        this.a = new rk4((kk5) v92Var);
        this.m = new rk4((kk5) fa4Var);
        this.w = false;
        this.c = false;
        this.i = true;
        this.b = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int H(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int J(View view) {
        return view.getBottom() + ((y44) view.getLayoutParams()).t.bottom;
    }

    public static int L(View view) {
        return view.getLeft() - ((y44) view.getLayoutParams()).t.left;
    }

    public static int M(View view) {
        Rect rect = ((y44) view.getLayoutParams()).t;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int N(View view) {
        Rect rect = ((y44) view.getLayoutParams()).t;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int O(View view) {
        return view.getRight() + ((y44) view.getLayoutParams()).t.right;
    }

    public static int P(View view) {
        return view.getTop() - ((y44) view.getLayoutParams()).t.top;
    }

    public static int R(View view) {
        return ((y44) view.getLayoutParams()).j.n();
    }

    public static x44 S(Context context, AttributeSet attributeSet, int i, int i2) {
        x44 x44Var = new x44();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n24.g, i, i2);
        x44Var.g = typedArrayObtainStyledAttributes.getInt(0, 1);
        x44Var.y = typedArrayObtainStyledAttributes.getInt(10, 1);
        x44Var.r = typedArrayObtainStyledAttributes.getBoolean(9, false);
        x44Var.n = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return x44Var;
    }

    public static boolean X(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void Y(View view, int i, int i2, int i3, int i4) {
        y44 y44Var = (y44) view.getLayoutParams();
        Rect rect = y44Var.t;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) y44Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) y44Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) y44Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) y44Var).bottomMargin);
    }

    public static int p(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public final void A(e54 e54Var) {
        for (int iG = G() - 1; iG >= 0; iG--) {
            View viewF = F(iG);
            n54 n54VarO = RecyclerView.O(viewF);
            if (n54VarO.s()) {
                if (RecyclerView.K0) {
                    Log.d("RecyclerView", "ignoring view " + n54VarO);
                }
            } else if (!n54VarO.j() || n54VarO.a() || this.t.z.y) {
                F(iG);
                this.j.r(iG);
                e54Var.m(viewF);
                this.t.c.H(n54VarO);
            } else {
                if (F(iG) != null) {
                    this.j.a(iG);
                }
                e54Var.a(n54VarO);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    public boolean A0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = this.h - getPaddingRight();
        int paddingBottom = this.o - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int iMin = Math.min(0, i);
        int i2 = top - paddingTop;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - paddingRight;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - paddingBottom);
        if (this.t.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int paddingRight2 = this.h - getPaddingRight();
                int paddingBottom2 = this.o - getPaddingBottom();
                Rect rect2 = this.t.s;
                K(rect2, focusedChild);
                if (rect2.left - i4 < paddingRight2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < paddingBottom2 && rect2.bottom - i5 > paddingTop2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.m0(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.m0(i4, i5, false);
            return true;
        }
        return false;
    }

    public View B(int i) {
        int iG = G();
        for (int i2 = 0; i2 < iG; i2++) {
            View viewF = F(i2);
            n54 n54VarO = RecyclerView.O(viewF);
            if (n54VarO != null && n54VarO.n() == i && !n54VarO.s() && (this.t.o0.l || !n54VarO.a())) {
                return viewF;
            }
        }
        return null;
    }

    public final void B0() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public y44 C() {
        return new y44(-2, -2);
    }

    public abstract int C0(int i, e54 e54Var, j54 j54Var);

    public y44 D(Context context, AttributeSet attributeSet) {
        return new y44(context, attributeSet);
    }

    public y44 E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof y44) {
            return new y44((y44) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new y44((ViewGroup.MarginLayoutParams) layoutParams) : new y44(layoutParams);
    }

    public abstract int E0(int i, e54 e54Var, j54 j54Var);

    public final View F(int i) {
        ee0 ee0Var = this.j;
        if (ee0Var != null) {
            return ee0Var.n(i);
        }
        return null;
    }

    public final void F0(RecyclerView recyclerView) {
        G0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final int G() {
        ee0 ee0Var = this.j;
        if (ee0Var != null) {
            return ee0Var.v();
        }
        return 0;
    }

    public final void G0(int i, int i2) {
        this.h = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.u = mode;
        if (mode == 0 && !RecyclerView.N0) {
            this.h = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.z = mode2;
        if (mode2 != 0 || RecyclerView.N0) {
            return;
        }
        this.o = 0;
    }

    public void H0(Rect rect, int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        RecyclerView recyclerView = this.t;
        WeakHashMap weakHashMap = xk5.g;
        this.t.setMeasuredDimension(p(i, paddingRight, recyclerView.getMinimumWidth()), p(i2, paddingBottom, this.t.getMinimumHeight()));
    }

    public int I(e54 e54Var, j54 j54Var) {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null || recyclerView.z == null || !i()) {
            return 1;
        }
        return this.t.z.g();
    }

    public final void I0(int i, int i2) {
        int iG = G();
        if (iG == 0) {
            this.t.s(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iG; i7++) {
            View viewF = F(i7);
            Rect rect = this.t.s;
            K(rect, viewF);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.t.s.set(i6, i4, i3, i5);
        H0(this.t.s, i, i2);
    }

    public final void J0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.t = null;
            this.j = null;
            this.h = 0;
            this.o = 0;
        } else {
            this.t = recyclerView;
            this.j = recyclerView.w;
            this.h = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.u = 1073741824;
        this.z = 1073741824;
    }

    public void K(Rect rect, View view) {
        boolean z = RecyclerView.J0;
        y44 y44Var = (y44) view.getLayoutParams();
        Rect rect2 = y44Var.t;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) y44Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) y44Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) y44Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) y44Var).bottomMargin);
    }

    final boolean K0(View view, int i, int i2, y44 y44Var) {
        return (!view.isLayoutRequested() && this.i && X(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) y44Var).width) && X(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) y44Var).height)) ? false : true;
    }

    public boolean L0() {
        return false;
    }

    public final boolean M0(View view, int i, int i2, y44 y44Var) {
        return (this.i && X(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) y44Var).width) && X(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) y44Var).height)) ? false : true;
    }

    public void N0(RecyclerView recyclerView, int i) {
        jv2 jv2Var = new jv2(recyclerView.getContext());
        jv2Var.g = i;
        O0(jv2Var);
    }

    public final void O0(jv2 jv2Var) {
        jv2 jv2Var2 = this.q;
        if (jv2Var2 != null && jv2Var != jv2Var2 && jv2Var2.v) {
            jv2Var2.t();
        }
        this.q = jv2Var;
        RecyclerView recyclerView = this.t;
        m54 m54Var = recyclerView.l0;
        m54Var.c.removeCallbacks(m54Var);
        m54Var.a.abortAnimation();
        if (jv2Var.j) {
            Log.w("RecyclerView", "An instance of " + jv2Var.getClass().getSimpleName() + " was started more than once. Each instance of" + jv2Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        jv2Var.y = recyclerView;
        jv2Var.r = this;
        int i = jv2Var.g;
        if (i == -1) {
            l0.u("Invalid target position");
            return;
        }
        recyclerView.o0.g = i;
        jv2Var.v = true;
        jv2Var.n = true;
        jv2Var.x = recyclerView.h.B(i);
        jv2Var.y.l0.y();
        jv2Var.j = true;
    }

    public boolean P0() {
        return false;
    }

    public final int Q() {
        RecyclerView recyclerView = this.t;
        p44 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.g();
        }
        return 0;
    }

    public int T(e54 e54Var, j54 j54Var) {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null || recyclerView.z == null || !b()) {
            return 1;
        }
        return this.t.z.g();
    }

    public final void U(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((y44) view.getLayoutParams()).t;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.t != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.t.u;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean V() {
        return true;
    }

    public boolean W() {
        return false;
    }

    public void Z(int i) {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            int iV = recyclerView.w.v();
            for (int i2 = 0; i2 < iV; i2++) {
                recyclerView.w.n(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void a0(int i) {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            int iV = recyclerView.w.v();
            for (int i2 = 0; i2 < iV; i2++) {
                recyclerView.w.n(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract boolean b();

    public final void c(Rect rect, View view) {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.P(view));
        }
    }

    public void c0(RecyclerView recyclerView) {
    }

    public int d(j54 j54Var) {
        return 0;
    }

    public int e(j54 j54Var) {
        return 0;
    }

    public View e0(View view, int i, e54 e54Var, j54 j54Var) {
        return null;
    }

    public int f(j54 j54Var) {
        return 0;
    }

    public void f0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.t;
        e54 e54Var = recyclerView.a;
        j54 j54Var = recyclerView.o0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.t.canScrollVertically(-1) && !this.t.canScrollHorizontally(-1) && !this.t.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        p44 p44Var = this.t.z;
        if (p44Var != null) {
            accessibilityEvent.setItemCount(p44Var.g());
        }
    }

    public void g0(e54 e54Var, j54 j54Var, m2 m2Var) {
        if (this.t.canScrollVertically(-1) || this.t.canScrollHorizontally(-1)) {
            m2Var.g(8192);
            m2Var.a0(true);
            m2Var.h(67108864, true);
        }
        if (this.t.canScrollVertically(1) || this.t.canScrollHorizontally(1)) {
            m2Var.g(4096);
            m2Var.a0(true);
            m2Var.h(67108864, true);
        }
        m2Var.A(k2.n(T(e54Var, j54Var), I(e54Var, j54Var), 0));
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = xk5.g;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = xk5.g;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int h(j54 j54Var) {
        G();
        return 0;
    }

    public void h0(e54 e54Var, j54 j54Var, View view, m2 m2Var) {
        m2Var.B(l2.g(false, b() ? R(view) : 0, 1, i() ? R(view) : 0, 1));
    }

    public abstract boolean i();

    public final void i0(View view, m2 m2Var) {
        n54 n54VarO = RecyclerView.O(view);
        if (n54VarO == null || n54VarO.a()) {
            return;
        }
        ee0 ee0Var = this.j;
        if (ee0Var.r.contains(n54VarO.g)) {
            return;
        }
        RecyclerView recyclerView = this.t;
        h0(recyclerView.a, recyclerView.o0, view, m2Var);
    }

    public int k(j54 j54Var) {
        G();
        return 0;
    }

    public int o(j54 j54Var) {
        return 0;
    }

    public void o0(RecyclerView recyclerView, int i, int i2) {
        n0(i);
    }

    public abstract void p0(e54 e54Var, j54 j54Var);

    public final void q(View view, int i, boolean z) {
        n54 n54VarO = RecyclerView.O(view);
        if (z || n54VarO.a()) {
            sp4 sp4Var = (sp4) this.t.c.t;
            jl5 jl5VarG = (jl5) sp4Var.get(n54VarO);
            if (jl5VarG == null) {
                jl5VarG = jl5.g();
                sp4Var.put(n54VarO, jl5VarG);
            }
            jl5VarG.g |= 1;
        } else {
            this.t.c.H(n54VarO);
        }
        y44 y44Var = (y44) view.getLayoutParams();
        if (n54VarO.p() || n54VarO.m()) {
            if (n54VarO.m()) {
                n54VarO.c.w(n54VarO);
            } else {
                n54VarO.a &= -33;
            }
            this.j.y(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.t;
            ee0 ee0Var = this.j;
            if (parent == recyclerView) {
                de0 de0Var = ee0Var.y;
                int iIndexOfChild = ee0Var.g.g.indexOfChild(view);
                int iY = (iIndexOfChild == -1 || de0Var.n(iIndexOfChild)) ? -1 : iIndexOfChild - de0Var.y(iIndexOfChild);
                if (i == -1) {
                    i = this.j.v();
                }
                if (iY == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.t.indexOfChild(view) + this.t.C());
                }
                if (iY != i) {
                    g gVar = this.t.h;
                    View viewF = gVar.F(iY);
                    if (viewF == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iY + gVar.t.toString());
                    }
                    gVar.F(iY);
                    gVar.j.r(iY);
                    y44 y44Var2 = (y44) viewF.getLayoutParams();
                    n54 n54VarO2 = RecyclerView.O(viewF);
                    boolean zA = n54VarO2.a();
                    RecyclerView recyclerView2 = gVar.t;
                    if (zA) {
                        sp4 sp4Var2 = (sp4) recyclerView2.c.t;
                        jl5 jl5VarG2 = (jl5) sp4Var2.get(n54VarO2);
                        if (jl5VarG2 == null) {
                            jl5VarG2 = jl5.g();
                            sp4Var2.put(n54VarO2, jl5VarG2);
                        }
                        jl5VarG2.g = 1 | jl5VarG2.g;
                    } else {
                        recyclerView2.c.H(n54VarO2);
                    }
                    gVar.j.y(viewF, i, y44Var2, n54VarO2.a());
                }
            } else {
                ee0Var.g(view, i, false);
                y44Var.a = true;
                jv2 jv2Var = this.q;
                if (jv2Var != null && jv2Var.v) {
                    jv2Var.y.getClass();
                    n54 n54VarO3 = RecyclerView.O(view);
                    if ((n54VarO3 != null ? n54VarO3.n() : -1) == jv2Var.g) {
                        jv2Var.x = view;
                        if (RecyclerView.K0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (y44Var.m) {
            if (RecyclerView.K0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + y44Var.j);
            }
            n54VarO.g.invalidate();
            y44Var.m = false;
        }
    }

    public void q0(j54 j54Var) {
        if (G() == 0) {
            return;
        }
        R(F(0));
    }

    public void r0(Parcelable parcelable) {
    }

    public boolean s(y44 y44Var) {
        return true;
    }

    public Parcelable s0() {
        return null;
    }

    public void t0(int i) {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[PHI: r0
  0x0060: PHI (r0v8 int) = (r0v5 int), (r0v14 int) binds: [B:24:0x007c, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean u0(int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f;
        e54 e54Var = this.t.a;
        int iHeight = this.o;
        int iWidth = this.h;
        Rect rect = new Rect();
        if (this.t.getMatrix().isIdentity() && this.t.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i == 4096) {
            paddingTop = this.t.canScrollVertically(1) ? (iHeight - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.t.canScrollHorizontally(1)) {
                paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
            } else {
                paddingLeft = 0;
            }
        } else if (i != 8192) {
            paddingTop = 0;
            paddingLeft = 0;
        } else {
            paddingTop = this.t.canScrollVertically(-1) ? -((iHeight - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.t.canScrollHorizontally(-1)) {
                paddingLeft = -((iWidth - getPaddingLeft()) - getPaddingRight());
            } else {
                paddingLeft = 0;
            }
        }
        if (paddingTop != 0 || paddingLeft != 0) {
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < 0.0f) {
                    if (RecyclerView.J0) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                    paddingLeft = (int) (paddingLeft * f);
                    paddingTop = (int) (paddingTop * f);
                }
                this.t.m0(paddingLeft, paddingTop, true);
                return true;
            }
            RecyclerView recyclerView = this.t;
            p44 p44Var = recyclerView.z;
            if (p44Var != null) {
                if (i == 4096) {
                    recyclerView.n0(p44Var.g() - 1);
                    return true;
                }
                if (i != 8192) {
                    return true;
                }
                recyclerView.n0(0);
                return true;
            }
        }
        return false;
    }

    public final void v0() {
        for (int iG = G() - 1; iG >= 0; iG--) {
            this.j.a(iG);
        }
    }

    public void w(String str) {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            recyclerView.m(str);
        }
    }

    public final void w0(e54 e54Var) {
        for (int iG = G() - 1; iG >= 0; iG--) {
            if (!RecyclerView.O(F(iG)).s()) {
                z0(iG, e54Var);
            }
        }
    }

    public final void x0(e54 e54Var) {
        ArrayList arrayList;
        int size = e54Var.g.size();
        int i = size - 1;
        while (true) {
            arrayList = e54Var.g;
            if (i < 0) {
                break;
            }
            View view = ((n54) arrayList.get(i)).g;
            n54 n54VarO = RecyclerView.O(view);
            if (!n54VarO.s()) {
                n54VarO.b(false);
                if (n54VarO.q()) {
                    this.t.removeDetachedView(view, false);
                }
                v44 v44Var = this.t.T;
                if (v44Var != null) {
                    v44Var.n(n54VarO);
                }
                n54VarO.b(true);
                n54 n54VarO2 = RecyclerView.O(view);
                n54VarO2.c = null;
                n54VarO2.i = false;
                n54VarO2.a &= -33;
                e54Var.a(n54VarO2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = e54Var.y;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.t.invalidate();
        }
    }

    public final void y0(View view, e54 e54Var) {
        ee0 ee0Var = this.j;
        k12 k12Var = ee0Var.g;
        byte b = ee0Var.n;
        if (b == 1) {
            l0.z("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            l0.z("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            ee0Var.n = (byte) 1;
            ee0Var.v = view;
            int iIndexOfChild = k12Var.g.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (ee0Var.y.t(iIndexOfChild)) {
                    ee0Var.m(view);
                }
                k12Var.n(iIndexOfChild);
            }
            ee0Var.n = (byte) 0;
            ee0Var.v = null;
            e54Var.t(view);
        } catch (Throwable th) {
            ee0Var.n = (byte) 0;
            ee0Var.v = null;
            throw th;
        }
    }

    public final void z0(int i, e54 e54Var) {
        View viewF = F(i);
        if (F(i) != null) {
            this.j.a(i);
        }
        e54Var.t(viewF);
    }

    public void b0() {
    }

    public void k0() {
    }

    public void D0(int i) {
    }

    public void d0(RecyclerView recyclerView) {
    }

    public void n0(int i) {
    }

    public void j0(int i, int i2) {
    }

    public void l0(int i, int i2) {
    }

    public void m0(int i, int i2) {
    }

    public void z(int i, si0 si0Var) {
    }

    public void u(int i, int i2, j54 j54Var, si0 si0Var) {
    }
}
