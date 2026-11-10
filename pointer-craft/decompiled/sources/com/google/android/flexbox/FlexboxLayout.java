package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.l0;
import defpackage.o24;
import defpackage.rp1;
import defpackage.rv;
import defpackage.sp1;
import defpackage.tp1;
import defpackage.uo1;
import defpackage.up1;
import defpackage.vp1;
import defpackage.wp1;
import defpackage.xi3;
import defpackage.xk5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements rp1 {
    public int a;
    public int b;
    public Drawable c;
    public List f;
    public SparseIntArray h;
    public Drawable i;
    public int j;
    public final up1 k;
    public int m;
    public final rv o;
    public int p;
    public int q;
    public int s;
    public int t;
    public int u;
    public int w;
    public int[] z;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.w = -1;
        this.o = new rv(this);
        this.f = new ArrayList();
        this.k = new up1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o24.g, 0, 0);
        this.j = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.t = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.m = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.q = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.w = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i != 0) {
            this.s = i;
            this.b = i;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i2 != 0) {
            this.s = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i3 != 0) {
            this.b = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.rp1
    public final boolean a() {
        int i = this.j;
        return i == 0 || i == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SparseIntArray sparseIntArray = this.h;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.h = sparseIntArray;
        }
        rv rvVar = this.o;
        rp1 rp1Var = (rp1) rvVar.j;
        int flexItemCount = rp1Var.getFlexItemCount();
        ArrayList arrayListA = rvVar.a(flexItemCount);
        vp1 vp1Var = new vp1();
        if (view == null || !(layoutParams instanceof sp1)) {
            vp1Var.t = 1;
        } else {
            vp1Var.t = ((sp1) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= rp1Var.getFlexItemCount()) {
            vp1Var.j = flexItemCount;
        } else {
            vp1Var.j = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((vp1) arrayListA.get(i2)).j++;
            }
        }
        arrayListA.add(vp1Var);
        this.z = rv.k(flexItemCount + 1, arrayListA, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    public final boolean b(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewI = i(i - i3);
            if (viewI != null && viewI.getVisibility() != 8) {
                if (a()) {
                    return (this.s & 2) != 0;
                }
                return (this.b & 2) != 0;
            }
        }
        if (a()) {
            return (this.s & 1) != 0;
        }
        return (this.b & 1) != 0;
    }

    public final void c(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.i;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.u + i, i3 + i2);
        this.i.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof wp1;
    }

    @Override // defpackage.rp1
    public final void g(View view, int i, int i2, tp1 tp1Var) {
        if (b(i, i2)) {
            boolean zA = a();
            int i3 = tp1Var.v;
            if (zA) {
                int i4 = this.u;
                tp1Var.v = i3 + i4;
                tp1Var.x += i4;
            } else {
                int i5 = this.p;
                tp1Var.v = i3 + i5;
                tp1Var.x += i5;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof wp1) {
            wp1 wp1Var = (wp1) layoutParams;
            wp1 wp1Var2 = new wp1(wp1Var);
            wp1Var2.j = 1;
            wp1Var2.t = 0.0f;
            wp1Var2.a = 1.0f;
            wp1Var2.m = -1;
            wp1Var2.q = -1.0f;
            wp1Var2.w = -1;
            wp1Var2.c = -1;
            wp1Var2.i = 16777215;
            wp1Var2.b = 16777215;
            wp1Var2.j = wp1Var.j;
            wp1Var2.t = wp1Var.t;
            wp1Var2.a = wp1Var.a;
            wp1Var2.m = wp1Var.m;
            wp1Var2.q = wp1Var.q;
            wp1Var2.w = wp1Var.w;
            wp1Var2.c = wp1Var.c;
            wp1Var2.i = wp1Var.i;
            wp1Var2.b = wp1Var.b;
            wp1Var2.s = wp1Var.s;
            return wp1Var2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            wp1 wp1Var3 = new wp1((ViewGroup.MarginLayoutParams) layoutParams);
            wp1Var3.j = 1;
            wp1Var3.t = 0.0f;
            wp1Var3.a = 1.0f;
            wp1Var3.m = -1;
            wp1Var3.q = -1.0f;
            wp1Var3.w = -1;
            wp1Var3.c = -1;
            wp1Var3.i = 16777215;
            wp1Var3.b = 16777215;
            return wp1Var3;
        }
        wp1 wp1Var4 = new wp1(layoutParams);
        wp1Var4.j = 1;
        wp1Var4.t = 0.0f;
        wp1Var4.a = 1.0f;
        wp1Var4.m = -1;
        wp1Var4.q = -1.0f;
        wp1Var4.w = -1;
        wp1Var4.c = -1;
        wp1Var4.i = 16777215;
        wp1Var4.b = 16777215;
        return wp1Var4;
    }

    @Override // defpackage.rp1
    public int getAlignContent() {
        return this.q;
    }

    @Override // defpackage.rp1
    public int getAlignItems() {
        return this.m;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.c;
    }

    public Drawable getDividerDrawableVertical() {
        return this.i;
    }

    @Override // defpackage.rp1
    public int getFlexDirection() {
        return this.j;
    }

    @Override // defpackage.rp1
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<tp1> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (tp1 tp1Var : this.f) {
            if (tp1Var.g() != 0) {
                arrayList.add(tp1Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.rp1
    public List<tp1> getFlexLinesInternal() {
        return this.f;
    }

    @Override // defpackage.rp1
    public int getFlexWrap() {
        return this.t;
    }

    public int getJustifyContent() {
        return this.a;
    }

    @Override // defpackage.rp1
    public int getLargestMainSize() {
        Iterator it = this.f.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((tp1) it.next()).v);
        }
        return iMax;
    }

    @Override // defpackage.rp1
    public int getMaxLine() {
        return this.w;
    }

    public int getShowDividerHorizontal() {
        return this.b;
    }

    public int getShowDividerVertical() {
        return this.s;
    }

    @Override // defpackage.rp1
    public int getSumOfCrossSize() {
        int size = this.f.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            tp1 tp1Var = (tp1) this.f.get(i2);
            if (s(i2)) {
                i += a() ? this.p : this.u;
            }
            if (p(i2)) {
                i += a() ? this.p : this.u;
            }
            i += tp1Var.l;
        }
        return i;
    }

    public final void h(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                l0.u(xi3.j("Invalid flex direction: ", i));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode != 1073741824) {
            l0.z(xi3.j("Unknown width mode is set: ", mode));
            return;
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 != 1073741824) {
            l0.z(xi3.j("Unknown height mode is set: ", mode2));
            return;
        } else {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    public final View i(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.z;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // defpackage.rp1
    public final View l(int i) {
        return i(i);
    }

    @Override // defpackage.rp1
    public final int m(View view) {
        return 0;
    }

    @Override // defpackage.rp1
    public final int n(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.i == null && this.c == null) {
            return;
        }
        if (this.b == 0 && this.s == 0) {
            return;
        }
        WeakHashMap weakHashMap = xk5.g;
        int layoutDirection = getLayoutDirection();
        int i = this.j;
        if (i == 0) {
            v(canvas, layoutDirection == 1, this.t == 2);
            return;
        }
        if (i == 1) {
            v(canvas, layoutDirection != 1, this.t == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.t == 2) {
                z = !z;
            }
            q(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.t == 2) {
            z2 = !z2;
        }
        q(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        WeakHashMap weakHashMap = xk5.g;
        int layoutDirection = getLayoutDirection();
        int i5 = this.j;
        if (i5 == 0) {
            u(layoutDirection == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            u(layoutDirection != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = layoutDirection == 1;
            if (this.t == 2) {
                z2 = !z2;
            }
            z(z2, false, i, i2, i3, i4);
            return;
        }
        if (i5 != 3) {
            uo1.z("Invalid flex direction is set: ", this.j);
            return;
        }
        z2 = layoutDirection == 1;
        if (this.t == 2) {
            z2 = !z2;
        }
        z(z2, true, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        SparseIntArray sparseIntArray = this.h;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.h = sparseIntArray;
        }
        rv rvVar = this.o;
        rp1 rp1Var = (rp1) rvVar.j;
        int flexItemCount = rp1Var.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.h;
            int flexItemCount2 = ((rp1) rvVar.j).getFlexItemCount();
            this.z = rv.k(flexItemCount2, rvVar.a(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewY = rp1Var.y(i3);
            if (viewY != null && ((sp1) viewY.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray3 = this.h;
                int flexItemCount3 = ((rp1) rvVar.j).getFlexItemCount();
                this.z = rv.k(flexItemCount3, rvVar.a(flexItemCount3), sparseIntArray3);
                break;
            }
        }
        int i4 = this.j;
        up1 up1Var = this.k;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                uo1.z("Invalid value for the flex direction is set: ", this.j);
                return;
            }
            this.f.clear();
            up1Var.g = null;
            up1Var.y = 0;
            this.o.x(this.k, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.f = up1Var.g;
            rvVar.q(i, i2, 0);
            rvVar.m(i, i2, getPaddingRight() + getPaddingLeft());
            rvVar.A(0);
            h(this.j, i, i2, up1Var.y);
            return;
        }
        this.f.clear();
        up1Var.g = null;
        up1Var.y = 0;
        this.o.x(this.k, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.f = up1Var.g;
        rvVar.q(i, i2, 0);
        if (this.m == 3) {
            for (tp1 tp1Var : this.f) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < tp1Var.j; i5++) {
                    View viewI = i(tp1Var.i + i5);
                    if (viewI != null && viewI.getVisibility() != 8) {
                        wp1 wp1Var = (wp1) viewI.getLayoutParams();
                        int i6 = this.t;
                        int i7 = tp1Var.q;
                        iMax = i6 != 2 ? Math.max(iMax, viewI.getMeasuredHeight() + Math.max(i7 - viewI.getBaseline(), ((ViewGroup.MarginLayoutParams) wp1Var).topMargin) + ((ViewGroup.MarginLayoutParams) wp1Var).bottomMargin) : Math.max(iMax, viewI.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) wp1Var).topMargin + Math.max(viewI.getBaseline() + (i7 - viewI.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) wp1Var).bottomMargin));
                    }
                }
                tp1Var.l = iMax;
            }
        }
        rvVar.m(i, i2, getPaddingBottom() + getPaddingTop());
        rvVar.A(0);
        h(this.j, i, i2, up1Var.y);
    }

    public final boolean p(int i) {
        if (i >= 0 && i < this.f.size()) {
            for (int i2 = i + 1; i2 < this.f.size(); i2++) {
                if (((tp1) this.f.get(i2)).g() > 0) {
                    return false;
                }
            }
            if (a()) {
                return (this.b & 4) != 0;
            }
            if ((this.s & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void q(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            tp1 tp1Var = (tp1) this.f.get(i);
            for (int i2 = 0; i2 < tp1Var.j; i2++) {
                int i3 = tp1Var.i + i2;
                View viewI = i(i3);
                if (viewI != null && viewI.getVisibility() != 8) {
                    wp1 wp1Var = (wp1) viewI.getLayoutParams();
                    if (b(i3, i2)) {
                        w(canvas, tp1Var.g, z2 ? viewI.getBottom() + ((ViewGroup.MarginLayoutParams) wp1Var).bottomMargin : (viewI.getTop() - ((ViewGroup.MarginLayoutParams) wp1Var).topMargin) - this.p, tp1Var.l);
                    }
                    if (i2 == tp1Var.j - 1 && (this.b & 4) > 0) {
                        w(canvas, tp1Var.g, z2 ? (viewI.getTop() - ((ViewGroup.MarginLayoutParams) wp1Var).topMargin) - this.p : viewI.getBottom() + ((ViewGroup.MarginLayoutParams) wp1Var).bottomMargin, tp1Var.l);
                    }
                }
            }
            if (s(i)) {
                c(canvas, z ? tp1Var.r : tp1Var.g - this.u, paddingTop, iMax);
            }
            if (p(i) && (this.s & 4) > 0) {
                c(canvas, z ? tp1Var.g - this.u : tp1Var.r, paddingTop, iMax);
            }
        }
    }

    @Override // defpackage.rp1
    public final int r(View view, int i, int i2) {
        int i3;
        int i4;
        if (a()) {
            i3 = b(i, i2) ? this.u : 0;
            if ((this.s & 4) <= 0) {
                return i3;
            }
            i4 = this.u;
        } else {
            i3 = b(i, i2) ? this.p : 0;
            if ((this.b & 4) <= 0) {
                return i3;
            }
            i4 = this.p;
        }
        return i3 + i4;
    }

    public final boolean s(int i) {
        if (i >= 0 && i < this.f.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((tp1) this.f.get(i2)).g() > 0) {
                    if (a()) {
                        return (this.b & 2) != 0;
                    }
                    return (this.s & 2) != 0;
                }
            }
            if (a()) {
                return (this.b & 1) != 0;
            }
            if ((this.s & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public void setAlignContent(int i) {
        if (this.q != i) {
            this.q = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.m != i) {
            this.m = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.c) {
            return;
        }
        this.c = drawable;
        if (drawable != null) {
            this.p = drawable.getIntrinsicHeight();
        } else {
            this.p = 0;
        }
        if (this.c == null && this.i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.i) {
            return;
        }
        this.i = drawable;
        if (drawable != null) {
            this.u = drawable.getIntrinsicWidth();
        } else {
            this.u = 0;
        }
        if (this.c == null && this.i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.j != i) {
            this.j = i;
            requestLayout();
        }
    }

    @Override // defpackage.rp1
    public void setFlexLines(List<tp1> list) {
        this.f = list;
    }

    public void setFlexWrap(int i) {
        if (this.t != i) {
            this.t = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.w != i) {
            this.w = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.b) {
            this.b = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.s) {
            this.s = i;
            requestLayout();
        }
    }

    @Override // defpackage.rp1
    public final int t(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    public final void u(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewI;
        boolean z2;
        int i7;
        int i8;
        float f3;
        float f4;
        int i9;
        float f5;
        int i10;
        View view;
        rv rvVar;
        tp1 tp1Var;
        rv rvVar2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f.size();
        for (int i12 = 0; i12 < size; i12++) {
            tp1 tp1Var2 = (tp1) this.f.get(i12);
            if (s(i12)) {
                int i13 = this.p;
                paddingBottom -= i13;
                paddingTop += i13;
            }
            int i14 = paddingBottom;
            int i15 = this.a;
            char c = 4;
            int i16 = 2;
            boolean z3 = true;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i11 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    int i17 = tp1Var2.v;
                    measuredWidth = paddingLeft + ((i11 - i17) / 2.0f);
                    f = (i11 - paddingRight) - ((i11 - i17) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int iG = tp1Var2.g();
                    f2 = (i11 - tp1Var2.v) / (iG != 1 ? iG - 1 : 1.0f);
                    f = i11 - paddingRight;
                } else if (i15 == 4) {
                    int iG2 = tp1Var2.g();
                    float f6 = iG2 != 0 ? (i11 - tp1Var2.v) / iG2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i11 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else {
                    if (i15 != 5) {
                        uo1.z("Invalid justifyContent is set: ", this.a);
                        return;
                    }
                    int iG3 = tp1Var2.g();
                    f2 = iG3 != 0 ? (i11 - tp1Var2.v) / (iG3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i11 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < tp1Var2.j) {
                    i6 = tp1Var2.i + i5;
                    viewI = i(i6);
                    char c2 = c;
                    if (viewI != null) {
                        z2 = z3;
                        if (viewI.getVisibility() == 8) {
                            z2 = z2;
                        } else {
                            wp1 wp1Var = (wp1) viewI.getLayoutParams();
                            f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) wp1Var).leftMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) wp1Var).rightMargin;
                            if (b(i6, i5)) {
                                int i18 = this.u;
                                float f9 = i18;
                                f3 += f9;
                                f4 -= f9;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            f5 = f4;
                            if (i5 == tp1Var2.j - 1 || (this.s & 4) <= 0) {
                                i10 = 0;
                            } else {
                                i10 = this.u;
                            }
                            if (this.t == i16) {
                                i8 = i16;
                                rvVar2 = this.o;
                                if (z) {
                                    view = viewI;
                                    rvVar2.z(view, tp1Var2, Math.round(f5) - viewI.getMeasuredWidth(), i14 - viewI.getMeasuredHeight(), Math.round(f5), i14);
                                } else {
                                    view = viewI;
                                    rvVar2.z(view, tp1Var2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                                }
                                i7 = i14;
                            } else {
                                i5 = i5;
                                view = viewI;
                                z2 = z2;
                                i8 = i16;
                                i7 = i14;
                                rvVar = this.o;
                                if (z) {
                                    rvVar.z(view, tp1Var2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i19 = paddingTop;
                                    rvVar.z(view, tp1Var2, Math.round(f3), i19, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i19);
                                    paddingTop = i19;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) wp1Var).rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) wp1Var).leftMargin);
                            if (z) {
                                tp1Var = tp1Var2;
                                tp1Var.y(view, i10, 0, i9, 0);
                            } else {
                                tp1Var = tp1Var2;
                                tp1Var.y(view, i9, 0, i10, 0);
                            }
                            tp1Var2 = tp1Var;
                            f = measuredWidth2;
                        }
                        i5++;
                        c = c2;
                        i16 = i8;
                        z3 = z2;
                        i14 = i7;
                    } else {
                        z2 = z3;
                    }
                    i8 = i16;
                    i5 = i5;
                    i7 = i14;
                    i5++;
                    c = c2;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                }
                int i20 = tp1Var2.l;
                paddingTop += i20;
                paddingBottom = i14 - i20;
            } else {
                int i21 = tp1Var2.v;
                f = i21 - paddingLeft;
                measuredWidth = (i11 - i21) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < tp1Var2.j) {
                i6 = tp1Var2.i + i5;
                viewI = i(i6);
                char c3 = c;
                if (viewI != null) {
                    z2 = z3;
                    if (viewI.getVisibility() == 8) {
                        z2 = z2;
                    } else {
                        wp1 wp1Var2 = (wp1) viewI.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) wp1Var2).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) wp1Var2).rightMargin;
                        if (b(i6, i5)) {
                            int i110 = this.u;
                            float f10 = i110;
                            f3 += f10;
                            f4 -= f10;
                            i9 = i110;
                        } else {
                            i9 = 0;
                        }
                        f5 = f4;
                        if (i5 == tp1Var2.j - 1) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        if (this.t == i16) {
                            i8 = i16;
                            rvVar2 = this.o;
                            if (z) {
                                view = viewI;
                                rvVar2.z(view, tp1Var2, Math.round(f5) - viewI.getMeasuredWidth(), i14 - viewI.getMeasuredHeight(), Math.round(f5), i14);
                            } else {
                                view = viewI;
                                rvVar2.z(view, tp1Var2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                            }
                            i7 = i14;
                        } else {
                            i5 = i5;
                            view = viewI;
                            z2 = z2;
                            i8 = i16;
                            i7 = i14;
                            rvVar = this.o;
                            if (z) {
                                rvVar.z(view, tp1Var2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i111 = paddingTop;
                                rvVar.z(view, tp1Var2, Math.round(f3), i111, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i111);
                                paddingTop = i111;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) wp1Var2).rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) wp1Var2).leftMargin);
                        if (z) {
                            tp1Var = tp1Var2;
                            tp1Var.y(view, i10, 0, i9, 0);
                        } else {
                            tp1Var = tp1Var2;
                            tp1Var.y(view, i9, 0, i10, 0);
                        }
                        tp1Var2 = tp1Var;
                        f = measuredWidth3;
                    }
                    i5++;
                    c = c3;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                } else {
                    z2 = z3;
                }
                i8 = i16;
                i5 = i5;
                i7 = i14;
                i5++;
                c = c3;
                i16 = i8;
                z3 = z2;
                i14 = i7;
            }
            int i22 = tp1Var2.l;
            paddingTop += i22;
            paddingBottom = i14 - i22;
        }
    }

    public final void v(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            tp1 tp1Var = (tp1) this.f.get(i);
            for (int i2 = 0; i2 < tp1Var.j; i2++) {
                int i3 = tp1Var.i + i2;
                View viewI = i(i3);
                if (viewI != null && viewI.getVisibility() != 8) {
                    wp1 wp1Var = (wp1) viewI.getLayoutParams();
                    if (b(i3, i2)) {
                        c(canvas, z ? viewI.getRight() + ((ViewGroup.MarginLayoutParams) wp1Var).rightMargin : (viewI.getLeft() - ((ViewGroup.MarginLayoutParams) wp1Var).leftMargin) - this.u, tp1Var.y, tp1Var.l);
                    }
                    if (i2 == tp1Var.j - 1 && (this.s & 4) > 0) {
                        c(canvas, z ? (viewI.getLeft() - ((ViewGroup.MarginLayoutParams) wp1Var).leftMargin) - this.u : viewI.getRight() + ((ViewGroup.MarginLayoutParams) wp1Var).rightMargin, tp1Var.y, tp1Var.l);
                    }
                }
            }
            if (s(i)) {
                w(canvas, paddingLeft, z2 ? tp1Var.n : tp1Var.y - this.p, iMax);
            }
            if (p(i) && (this.b & 4) > 0) {
                w(canvas, paddingLeft, z2 ? tp1Var.y - this.p : tp1Var.n, iMax);
            }
        }
    }

    public final void w(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.c;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.p + i2);
        this.c.draw(canvas);
    }

    @Override // defpackage.rp1
    public final void x(tp1 tp1Var) {
        if (a()) {
            if ((this.s & 4) > 0) {
                int i = tp1Var.v;
                int i2 = this.u;
                tp1Var.v = i + i2;
                tp1Var.x += i2;
                return;
            }
            return;
        }
        if ((this.b & 4) > 0) {
            int i3 = tp1Var.v;
            int i4 = this.p;
            tp1Var.v = i3 + i4;
            tp1Var.x += i4;
        }
    }

    @Override // defpackage.rp1
    public final View y(int i) {
        return getChildAt(i);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    public final void z(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float measuredHeight;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        int i7;
        View viewI;
        char c;
        int i8;
        int i9;
        float f3;
        float f4;
        int i10;
        float f5;
        int i11;
        rv rvVar;
        tp1 tp1Var;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i12 = i4 - i2;
        int i13 = (i3 - i) - paddingRight;
        int size = this.f.size();
        for (int i14 = 0; i14 < size; i14++) {
            tp1 tp1Var2 = (tp1) this.f.get(i14);
            if (s(i14)) {
                int i15 = this.u;
                paddingLeft += i15;
                i13 -= i15;
            }
            int i16 = i13;
            int i17 = this.a;
            char c2 = 4;
            int i18 = 1;
            if (i17 == 0) {
                measuredHeight = paddingTop;
                f = i12 - paddingBottom;
            } else if (i17 != 1) {
                if (i17 == 2) {
                    float f6 = (i12 - tp1Var2.v) / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i12 - paddingBottom) - f6;
                } else if (i17 == 3) {
                    measuredHeight = paddingTop;
                    int iG = tp1Var2.g();
                    f2 = (i12 - tp1Var2.v) / (iG != 1 ? iG - 1 : 1.0f);
                    f = i12 - paddingBottom;
                } else if (i17 == 4) {
                    int iG2 = tp1Var2.g();
                    f2 = iG2 != 0 ? (i12 - tp1Var2.v) / iG2 : 0.0f;
                    float f7 = f2 / 2.0f;
                    measuredHeight = paddingTop + f7;
                    f = (i12 - paddingBottom) - f7;
                } else {
                    if (i17 != 5) {
                        uo1.z("Invalid justifyContent is set: ", this.a);
                        return;
                    }
                    int iG3 = tp1Var2.g();
                    f2 = iG3 != 0 ? (i12 - tp1Var2.v) / (iG3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i12 - paddingBottom) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < tp1Var2.j) {
                    i6 = tp1Var2.i + i5;
                    i7 = i18;
                    viewI = i(i6);
                    if (viewI != null) {
                        c = c2;
                        if (viewI.getVisibility() == 8) {
                            wp1 wp1Var = (wp1) viewI.getLayoutParams();
                            f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) wp1Var).topMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) wp1Var).bottomMargin;
                            if (b(i6, i5)) {
                                i10 = this.p;
                                float f8 = i10;
                                f3 += f8;
                                f4 -= f8;
                            } else {
                                i10 = 0;
                            }
                            f5 = f4;
                            if (i5 == tp1Var2.j - i7 || (this.b & 4) <= 0) {
                                i11 = 0;
                            } else {
                                i11 = this.p;
                            }
                            i9 = i5;
                            rvVar = this.o;
                            if (z) {
                                if (z2) {
                                    rvVar.h(viewI, tp1Var2, true, i16 - viewI.getMeasuredWidth(), Math.round(f5) - viewI.getMeasuredHeight(), i16, Math.round(f5));
                                } else {
                                    rvVar.h(viewI, tp1Var2, true, i16 - viewI.getMeasuredWidth(), Math.round(f3), i16, viewI.getMeasuredHeight() + Math.round(f3));
                                }
                                i8 = i16;
                            } else {
                                i9 = i9;
                                i7 = i7;
                                i8 = i16;
                                if (z2) {
                                    rvVar.h(viewI, tp1Var2, false, paddingLeft, Math.round(f5) - viewI.getMeasuredHeight(), viewI.getMeasuredWidth() + paddingLeft, Math.round(f5));
                                } else {
                                    int i19 = paddingLeft;
                                    rvVar.h(viewI, tp1Var2, false, i19, Math.round(f3), viewI.getMeasuredWidth() + i19, viewI.getMeasuredHeight() + Math.round(f3));
                                    paddingLeft = i19;
                                }
                            }
                            measuredHeight = f3 + viewI.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) wp1Var).bottomMargin;
                            float measuredHeight2 = f5 - ((viewI.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) wp1Var).topMargin);
                            if (z2) {
                                tp1Var = tp1Var2;
                                tp1Var.y(viewI, 0, i11, 0, i10);
                            } else {
                                tp1Var = tp1Var2;
                                tp1Var.y(viewI, 0, i10, 0, i11);
                            }
                            tp1Var2 = tp1Var;
                            f = measuredHeight2;
                        }
                        i5 = i9 + 1;
                        c2 = c;
                        i18 = i7;
                        i16 = i8;
                    } else {
                        c = c2;
                    }
                    i9 = i5;
                    i7 = i7;
                    i8 = i16;
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                }
                int i20 = tp1Var2.l;
                paddingLeft += i20;
                i13 = i16 - i20;
            } else {
                int i21 = tp1Var2.v;
                f = i21 - paddingTop;
                measuredHeight = (i12 - i21) + paddingBottom;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < tp1Var2.j) {
                i6 = tp1Var2.i + i5;
                i7 = i18;
                viewI = i(i6);
                if (viewI != null) {
                    c = c2;
                    if (viewI.getVisibility() == 8) {
                        wp1 wp1Var2 = (wp1) viewI.getLayoutParams();
                        f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) wp1Var2).topMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) wp1Var2).bottomMargin;
                        if (b(i6, i5)) {
                            i10 = this.p;
                            float f9 = i10;
                            f3 += f9;
                            f4 -= f9;
                        } else {
                            i10 = 0;
                        }
                        f5 = f4;
                        if (i5 == tp1Var2.j - i7) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        i9 = i5;
                        rvVar = this.o;
                        if (z) {
                            if (z2) {
                                rvVar.h(viewI, tp1Var2, true, i16 - viewI.getMeasuredWidth(), Math.round(f5) - viewI.getMeasuredHeight(), i16, Math.round(f5));
                            } else {
                                rvVar.h(viewI, tp1Var2, true, i16 - viewI.getMeasuredWidth(), Math.round(f3), i16, viewI.getMeasuredHeight() + Math.round(f3));
                            }
                            i8 = i16;
                        } else {
                            i9 = i9;
                            i7 = i7;
                            i8 = i16;
                            if (z2) {
                                rvVar.h(viewI, tp1Var2, false, paddingLeft, Math.round(f5) - viewI.getMeasuredHeight(), viewI.getMeasuredWidth() + paddingLeft, Math.round(f5));
                            } else {
                                int i110 = paddingLeft;
                                rvVar.h(viewI, tp1Var2, false, i110, Math.round(f3), viewI.getMeasuredWidth() + i110, viewI.getMeasuredHeight() + Math.round(f3));
                                paddingLeft = i110;
                            }
                        }
                        measuredHeight = f3 + viewI.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) wp1Var2).bottomMargin;
                        float measuredHeight3 = f5 - ((viewI.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) wp1Var2).topMargin);
                        if (z2) {
                            tp1Var = tp1Var2;
                            tp1Var.y(viewI, 0, i11, 0, i10);
                        } else {
                            tp1Var = tp1Var2;
                            tp1Var.y(viewI, 0, i10, 0, i11);
                        }
                        tp1Var2 = tp1Var;
                        f = measuredHeight3;
                    }
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                } else {
                    c = c2;
                }
                i9 = i5;
                i7 = i7;
                i8 = i16;
                i5 = i9 + 1;
                c2 = c;
                i18 = i7;
                i16 = i8;
            }
            int i22 = tp1Var2.l;
            paddingLeft += i22;
            i13 = i16 - i22;
        }
    }

    @Override // defpackage.rp1
    public final void j(View view, int i) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        wp1 wp1Var = new wp1(context, attributeSet);
        wp1Var.j = 1;
        wp1Var.t = 0.0f;
        wp1Var.a = 1.0f;
        wp1Var.m = -1;
        wp1Var.q = -1.0f;
        wp1Var.w = -1;
        wp1Var.c = -1;
        wp1Var.i = 16777215;
        wp1Var.b = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o24.y);
        wp1Var.j = typedArrayObtainStyledAttributes.getInt(8, 1);
        wp1Var.t = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        wp1Var.a = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        wp1Var.m = typedArrayObtainStyledAttributes.getInt(0, -1);
        wp1Var.q = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        wp1Var.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        wp1Var.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        wp1Var.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        wp1Var.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        wp1Var.s = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return wp1Var;
    }
}
