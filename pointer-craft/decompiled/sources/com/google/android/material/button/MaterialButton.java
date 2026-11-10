package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.br2;
import defpackage.cl;
import defpackage.d5;
import defpackage.d61;
import defpackage.dn4;
import defpackage.fn4;
import defpackage.g23;
import defpackage.g33;
import defpackage.gp4;
import defpackage.h23;
import defpackage.i23;
import defpackage.iw4;
import defpackage.j23;
import defpackage.jw4;
import defpackage.k;
import defpackage.k33;
import defpackage.kw4;
import defpackage.l0;
import defpackage.l23;
import defpackage.lr2;
import defpackage.m23;
import defpackage.mq2;
import defpackage.n94;
import defpackage.p24;
import defpackage.q64;
import defpackage.sn4;
import defpackage.ue5;
import defpackage.uo1;
import defpackage.va;
import defpackage.wu4;
import defpackage.xj;
import defpackage.xu4;
import defpackage.zq2;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends cl implements Checkable, sn4 {
    public static final int[] V = {R.attr.state_checkable};
    public static final int[] W = {R.attr.state_checked};
    public static final d61 a0 = new d61(1);
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public float H;
    public int I;
    public int J;
    public LinearLayout.LayoutParams K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public kw4 P;
    public int Q;
    public j23 R;
    public float S;
    public float T;
    public wu4 U;
    public ColorStateList b;
    public h23 c;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public PorterDuff.Mode i;
    public int k;
    public String o;
    public PorterDuff.Mode p;
    public final m23 q;
    public Drawable s;
    public ColorStateList u;
    public final LinkedHashSet w;
    public Drawable z;

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(gp4.W(i, io.appground.blek.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{io.appground.blek.R.attr.materialSizeOverlay}), attributeSet, i);
        this.w = new LinkedHashSet();
        this.C = false;
        this.D = false;
        this.G = Integer.MIN_VALUE;
        this.H = -2.14748365E9f;
        this.I = Integer.MIN_VALUE;
        this.J = Integer.MIN_VALUE;
        this.O = Integer.MIN_VALUE;
        this.R = j23.m;
        Context context2 = getContext();
        TypedArray typedArrayY = ue5.Y(context2, attributeSet, p24.c, i, io.appground.blek.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.e = typedArrayY.getDimensionPixelSize(13, 0);
        int i2 = typedArrayY.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.i = mq2.s(i2, mode);
        this.b = zq2.b(getContext(), typedArrayY, 15);
        this.s = zq2.p(getContext(), typedArrayY, 11);
        this.E = typedArrayY.getInteger(12, 1);
        this.f = typedArrayY.getDimensionPixelSize(14, 0);
        this.p = mq2.s(typedArrayY.getInt(22, -1), mode);
        this.u = typedArrayY.hasValue(21) ? zq2.b(getContext(), typedArrayY, 21) : this.b;
        this.F = typedArrayY.getInteger(20, 3);
        Drawable drawableP = zq2.p(getContext(), typedArrayY, 19);
        this.z = drawableP;
        this.h = drawableP == null;
        dn4 dn4VarL = iw4.l(context2, typedArrayY, 23);
        dn4VarL = dn4VarL == null ? fn4.l(context2, attributeSet, i, io.appground.blek.R.style.Widget_MaterialComponents_Button).g() : dn4VarL;
        boolean z = typedArrayY.getBoolean(17, false);
        m23 m23Var = new m23(this, dn4VarL);
        this.q = m23Var;
        m23Var.v = typedArrayY.getDimensionPixelOffset(2, 0);
        m23Var.x = typedArrayY.getDimensionPixelOffset(3, 0);
        m23Var.l = typedArrayY.getDimensionPixelOffset(4, 0);
        m23Var.j = typedArrayY.getDimensionPixelOffset(5, 0);
        if (typedArrayY.hasValue(9)) {
            int dimensionPixelSize = typedArrayY.getDimensionPixelSize(9, -1);
            m23Var.t = dimensionPixelSize;
            m23Var.y = m23Var.y.g(dimensionPixelSize);
            m23Var.n();
            m23Var.p = true;
        }
        m23Var.a = typedArrayY.getDimensionPixelSize(26, 0);
        m23Var.m = mq2.s(typedArrayY.getInt(8, -1), mode);
        m23Var.q = zq2.b(getContext(), typedArrayY, 7);
        m23Var.w = zq2.b(getContext(), typedArrayY, 25);
        m23Var.c = zq2.b(getContext(), typedArrayY, 18);
        m23Var.u = typedArrayY.getBoolean(6, false);
        m23Var.o = typedArrayY.getDimensionPixelSize(10, 0);
        m23Var.z = typedArrayY.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayY.hasValue(0)) {
            m23Var.s = true;
            setSupportBackgroundTintList(m23Var.q);
            setSupportBackgroundTintMode(m23Var.m);
        } else {
            m23Var.r();
        }
        setPaddingRelative(paddingStart + m23Var.v, paddingTop + m23Var.l, paddingEnd + m23Var.x, paddingBottom + m23Var.j);
        setCheckedInternal(typedArrayY.getBoolean(1, false));
        if (dn4VarL instanceof iw4) {
            m23Var.r = lr2.F(getContext());
            if (m23Var.y instanceof iw4) {
                m23Var.n();
            }
        }
        setOpticalCenterEnabled(z);
        typedArrayY.recycle();
        setCompoundDrawablePadding(this.e);
        h(this.s != null);
        k(this.z != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.S;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        g33 g33VarG;
        if (this.L && this.N && (g33VarG = this.q.g(false)) != null) {
            return (int) (g33VarG.j() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        if (!a() || this.C == z) {
            return;
        }
        this.C = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.C;
            if (!materialButtonToggleGroup.h) {
                materialButtonToggleGroup.q(getId(), z2);
            }
        }
        if (this.D) {
            return;
        }
        this.D = true;
        Iterator it = this.w.iterator();
        if (!it.hasNext()) {
            this.D = false;
        } else {
            it.next().getClass();
            uo1.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.S != f) {
            this.S = f;
            f();
            invalidate();
            if (getParent() instanceof l23) {
                l23 l23Var = (l23) getParent();
                int i = (int) this.S;
                int iIndexOfChild = l23Var.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                MaterialButton materialButtonJ = l23Var.j(iIndexOfChild);
                MaterialButton materialButtonL = l23Var.l(iIndexOfChild);
                if (materialButtonJ == null && materialButtonL == null) {
                    return;
                }
                if (materialButtonJ == null) {
                    materialButtonL.setDisplayedWidthDecrease(i);
                }
                if (materialButtonL == null) {
                    materialButtonJ.setDisplayedWidthDecrease(i);
                }
                if (materialButtonJ == null || materialButtonL == null) {
                    return;
                }
                materialButtonJ.setDisplayedWidthDecrease(i / 2);
                materialButtonL.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final boolean a() {
        m23 m23Var = this.q;
        return m23Var != null && m23Var.u;
    }

    public final boolean b() {
        int i = this.F;
        return i == 16 || i == 32;
    }

    public final boolean c() {
        int i = this.F;
        return i == 3 || i == 4;
    }

    public final void d(int i, int i2) {
        if (this.z == null || getLayout() == null) {
            return;
        }
        if (i() || c()) {
            this.B = 0;
            if (v(this.F)) {
                this.A = 0;
                k(false);
                return;
            }
            int iX = x(i, this.F);
            if (this.A != iX) {
                this.A = iX;
                k(false);
                return;
            }
            return;
        }
        if (b()) {
            this.A = 0;
            if (this.F == 16) {
                this.B = 0;
                k(false);
                return;
            }
            int intrinsicHeight = this.f;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.z.getIntrinsicHeight();
            }
            int iL = l(i2, intrinsicHeight);
            if (this.B != iL) {
                this.B = iL;
                k(false);
            }
        }
    }

    public final void f() {
        int i = (int) (this.S - this.T);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.M;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.H + i);
        }
        setPaddingRelative(this.I + i3, getPaddingTop(), (this.J + i) - i3, getPaddingBottom());
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.o)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.o;
    }

    public int getAllowedWidthDecrease() {
        return this.O;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (s()) {
            return this.q.t;
        }
        return 0;
    }

    public xu4 getCornerSpringForce() {
        return this.q.r;
    }

    public Drawable getIcon() {
        return this.s;
    }

    public int getIconGravity() {
        return this.E;
    }

    public int getIconPadding() {
        return this.e;
    }

    public int getIconSize() {
        return this.f;
    }

    public ColorStateList getIconTint() {
        return this.b;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.i;
    }

    public int getInsetBottom() {
        return this.q.j;
    }

    public int getInsetLeft() {
        return this.q.v;
    }

    public int getInsetRight() {
        return this.q.x;
    }

    public int getInsetTop() {
        return this.q.l;
    }

    public ColorStateList getRippleColor() {
        if (s()) {
            return this.q.c;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.z;
    }

    public int getSecondaryIconGravity() {
        return this.F;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.u;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.p;
    }

    public dn4 getShapeAppearance() {
        if (s()) {
            return this.q.y;
        }
        l0.z("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public fn4 getShapeAppearanceModel() {
        if (s()) {
            return this.q.y.n();
        }
        l0.z("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (s()) {
            return this.q.w;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (s()) {
            return this.q.a;
        }
        return 0;
    }

    @Override // defpackage.cl
    public ColorStateList getSupportBackgroundTintList() {
        return s() ? this.q.q : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.cl
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return s() ? this.q.m : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.s;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.s = drawableMutate;
            drawableMutate.setTintList(this.b);
            PorterDuff.Mode mode = this.i;
            if (mode != null) {
                this.s.setTintMode(mode);
            }
            int intrinsicWidth = this.f;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.s.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.s.getIntrinsicHeight();
            }
            Drawable drawable2 = this.s;
            int i = this.k;
            int i2 = this.d;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.s.setVisible(true, z);
        }
        if (this.s != null && this.z != null && n()) {
            l0.u("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.s == null && this.z != null && n()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (q() && compoundDrawablesRelative[0] != this.s) || (m() && compoundDrawablesRelative[2] != this.s) || (w() && compoundDrawablesRelative[1] != this.s);
        if (z || z2) {
            if (q()) {
                setCompoundDrawablesRelative(this.s, j(1), j(2), null);
            } else if (m()) {
                setCompoundDrawablesRelative(j(0), j(1), this.s, null);
            } else if (w()) {
                setCompoundDrawablesRelative(j(0), this.s, j(2), null);
            }
        }
    }

    public final boolean i() {
        int i = this.F;
        return i == 1 || i == 2;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.C;
    }

    public final Drawable j(int i) {
        if (i == 0) {
            if (this.z == null || !i()) {
                return null;
            }
            return this.z;
        }
        if (i == 1) {
            if (this.z == null || !b()) {
                return null;
            }
            return this.z;
        }
        if (i == 2 && this.z != null && c()) {
            return this.z;
        }
        return null;
    }

    public final void k(boolean z) {
        Drawable drawable = this.z;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.z = drawableMutate;
            drawableMutate.setTintList(this.u);
            PorterDuff.Mode mode = this.p;
            if (mode != null) {
                this.z.setTintMode(mode);
            }
            int intrinsicWidth = this.f;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.z.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.z.getIntrinsicHeight();
            }
            Drawable drawable2 = this.z;
            int i = this.A;
            int i2 = this.B;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.z.setVisible(true, z);
        }
        if (this.z != null && this.s != null && n()) {
            l0.u("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.z == null) {
            if (this.h) {
                return;
            }
            if (this.s != null && n()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (i() && compoundDrawablesRelative[0] != this.z) || (c() && compoundDrawablesRelative[2] != this.z) || (b() && compoundDrawablesRelative[1] != this.z);
        if (z || z2) {
            if (i()) {
                setCompoundDrawablesRelative(this.z, t(1), t(2), null);
            } else if (c()) {
                setCompoundDrawablesRelative(t(0), t(1), this.z, null);
            } else if (b()) {
                setCompoundDrawablesRelative(t(0), this.z, t(2), null);
            }
        }
    }

    public final int l(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.e) - getPaddingBottom()) / 2);
    }

    public final boolean m() {
        int i = this.E;
        return i == 3 || i == 4;
    }

    public final boolean n() {
        if (q() && i()) {
            return true;
        }
        if (m() && c()) {
            return true;
        }
        return w() && b();
    }

    public final void o(int i, int i2) {
        if (this.s == null || getLayout() == null) {
            return;
        }
        if (q() || m()) {
            this.d = 0;
            if (v(this.E)) {
                this.k = 0;
                h(false);
                return;
            }
            int iX = x(i, this.E);
            if (this.k != iX) {
                this.k = iX;
                h(false);
                return;
            }
            return;
        }
        if (w()) {
            this.k = 0;
            if (this.E == 16) {
                this.d = 0;
                h(false);
                return;
            }
            int intrinsicHeight = this.f;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.s.getIntrinsicHeight();
            }
            int iL = l(i2, intrinsicHeight);
            if (this.d != iL) {
                this.d = iL;
                h(false);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (s()) {
            br2.B(this, this.q.g(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        if (this.C) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, W);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.cl, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.C);
    }

    @Override // defpackage.cl, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.C);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.cl, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        o(getMeasuredWidth(), getMeasuredHeight());
        d(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.G != i6) {
            this.G = i6;
            this.H = -2.14748365E9f;
        }
        if (this.H == -2.14748365E9f) {
            this.H = getMeasuredWidth();
            if (this.K == null && (getParent() instanceof l23) && ((l23) getParent()).getButtonSizeChange() != null) {
                this.K = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.K);
                layoutParams.width = (int) this.H;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.O == Integer.MIN_VALUE) {
            if (this.s == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.s.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.O = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.I == Integer.MIN_VALUE) {
            this.I = getPaddingStart();
        }
        if (this.J == Integer.MIN_VALUE) {
            this.J = getPaddingEnd();
        }
        if ((getParent() instanceof l23) && ((l23) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.N = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i23)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i23 i23Var = (i23) parcelable;
        super.onRestoreInstanceState(i23Var.j);
        setChecked(i23Var.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        i23 i23Var = new i23(super.onSaveInstanceState());
        i23Var.a = this.C;
        return i23Var;
    }

    @Override // defpackage.cl, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        o(getMeasuredWidth(), getMeasuredHeight());
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final /* synthetic */ void p() {
        this.M = getOpticalCenterShift();
        f();
        invalidate();
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.q.z) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    public final boolean q() {
        int i = this.E;
        return i == 1 || i == 2;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.s != null) {
            if (this.s.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final boolean s() {
        m23 m23Var = this.q;
        return (m23Var == null || m23Var.s) ? false : true;
    }

    public void setA11yClassName(String str) {
        this.o = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!s()) {
            super.setBackgroundColor(i);
            return;
        }
        m23 m23Var = this.q;
        if (m23Var.g(false) != null) {
            m23Var.g(false).setTint(i);
        }
    }

    @Override // defpackage.cl, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!s()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        m23 m23Var = this.q;
        m23Var.s = true;
        MaterialButton materialButton = m23Var.g;
        materialButton.setSupportBackgroundTintList(m23Var.q);
        materialButton.setSupportBackgroundTintMode(m23Var.m);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.cl, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? k33.J(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (s()) {
            this.q.u = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.H = -2.14748365E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (s()) {
            m23 m23Var = this.q;
            if (m23Var.p && m23Var.t == i) {
                return;
            }
            m23Var.t = i;
            m23Var.p = true;
            m23Var.y = m23Var.y.g(i);
            m23Var.n();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (s()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(xu4 xu4Var) {
        m23 m23Var = this.q;
        m23Var.r = xu4Var;
        if (m23Var.y instanceof iw4) {
            m23Var.n();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.T = Math.min(i, this.O);
        f();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (s()) {
            this.q.g(false).s(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.s == drawable || z(new g23(this, drawable, (byte) 1))) {
            return;
        }
        this.H = -2.14748365E9f;
        this.s = drawable;
        h(true);
        o(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.E != i) {
            if (this.s != null && this.z != null && n()) {
                l0.u("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.E = i;
                o(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.e != i) {
            this.e = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? k33.J(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            l0.u("iconSize cannot be less than 0");
            return;
        }
        if (this.f == i || z(new xj(this, i, (byte) 1))) {
            return;
        }
        this.H = -2.14748365E9f;
        this.f = i;
        h(true);
        k(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(ue5.R(getContext(), i));
    }

    public void setInsetBottom(int i) {
        m23 m23Var = this.q;
        m23Var.y(m23Var.v, m23Var.l, m23Var.x, i);
    }

    public void setInsetLeft(int i) {
        m23 m23Var = this.q;
        m23Var.y(i, m23Var.l, m23Var.x, m23Var.j);
    }

    public void setInsetRight(int i) {
        m23 m23Var = this.q;
        m23Var.y(m23Var.v, m23Var.l, i, m23Var.j);
    }

    public void setInsetTop(int i) {
        m23 m23Var = this.q;
        m23Var.y(m23Var.v, i, m23Var.x, m23Var.j);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(h23 h23Var) {
        this.c = h23Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.L != z) {
            this.L = z;
            m23 m23Var = this.q;
            if (z) {
                d5 d5Var = new d5(this, (byte) 4);
                m23Var.n = d5Var;
                g33 g33VarG = m23Var.g(false);
                if (g33VarG != null) {
                    g33VarG.K = d5Var;
                }
            } else {
                m23Var.n = null;
                g33 g33VarG2 = m23Var.g(false);
                if (g33VarG2 != null) {
                    g33VarG2.K = null;
                }
            }
            post(new k(this, (byte) 5));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        h23 h23Var = this.c;
        if (h23Var != null) {
            ((MaterialButtonToggleGroup) ((q64) h23Var).t).invalidate();
        }
        super.setPressed(z);
        u(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (s()) {
            m23 m23Var = this.q;
            MaterialButton materialButton = m23Var.g;
            if (m23Var.c != colorStateList) {
                m23Var.c = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(n94.g(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (s()) {
            setRippleColor(ue5.R(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.z == drawable || z(new g23(this, drawable, (byte) 0))) {
            return;
        }
        this.H = -2.14748365E9f;
        this.z = drawable;
        this.h = false;
        k(true);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.F != i) {
            if (this.z != null && this.s != null && n()) {
                l0.u("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.F = i;
                d(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? k33.J(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            k(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.p != mode) {
            this.p = mode;
            k(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(ue5.R(getContext(), i));
    }

    public void setShapeAppearance(dn4 dn4Var) {
        if (!s()) {
            l0.z("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        m23 m23Var = this.q;
        if (m23Var.r == null && dn4Var.x()) {
            m23Var.r = lr2.F(getContext());
            if (m23Var.y instanceof iw4) {
                m23Var.n();
            }
        }
        m23Var.y = dn4Var;
        m23Var.n();
    }

    @Override // defpackage.sn4
    public void setShapeAppearanceModel(fn4 fn4Var) {
        if (!s()) {
            l0.z("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        m23 m23Var = this.q;
        m23Var.y = fn4Var;
        m23Var.n();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (s()) {
            m23 m23Var = this.q;
            m23Var.b = z;
            m23Var.v();
        }
    }

    public void setSizeChange(kw4 kw4Var) {
        if (this.P != kw4Var) {
            this.P = kw4Var;
            u(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (s()) {
            m23 m23Var = this.q;
            if (m23Var.w != colorStateList) {
                m23Var.w = colorStateList;
                m23Var.v();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (s()) {
            setStrokeColor(ue5.R(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (s()) {
            m23 m23Var = this.q;
            if (m23Var.a != i) {
                m23Var.a = i;
                m23Var.v();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (s()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.cl
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!s()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        m23 m23Var = this.q;
        if (m23Var.q != colorStateList) {
            m23Var.q = colorStateList;
            if (m23Var.g(false) != null) {
                m23Var.g(false).setTintList(m23Var.q);
            }
        }
    }

    @Override // defpackage.cl
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!s()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        m23 m23Var = this.q;
        if (m23Var.m != mode) {
            m23Var.m = mode;
            if (m23Var.g(false) == null || m23Var.m == null) {
                return;
            }
            m23Var.g(false).setTintMode(m23Var.m);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.H = -2.14748365E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        o(getMeasuredWidth(), getMeasuredHeight());
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // defpackage.cl, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.H = -2.14748365E9f;
        super.setTextAppearance(context, i);
    }

    @Override // defpackage.cl, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.H = -2.14748365E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.q.z = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.H = -2.14748365E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(j23 j23Var) {
        if (this.R != j23Var) {
            this.R = j23Var;
            u(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.Q != i) {
            this.Q = i;
            u(true);
        }
    }

    public final Drawable t(int i) {
        if (i == 0) {
            if (this.s == null || !q()) {
                return null;
            }
            return this.s;
        }
        if (i == 1) {
            if (this.s == null || !m()) {
                return null;
            }
            return this.s;
        }
        if (i == 2 && this.s != null && m()) {
            return this.s;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.C);
    }

    public final void u(boolean z) {
        int i;
        if (this.P == null) {
            return;
        }
        if (this.U == null) {
            wu4 wu4Var = new wu4(this, a0);
            this.U = wu4Var;
            wu4Var.w = lr2.F(getContext());
        }
        if (this.N) {
            int iOrdinal = this.R.ordinal();
            if (iOrdinal == 1 || iOrdinal == 2) {
                i = this.Q / 2;
            } else {
                i = iOrdinal != 3 ? 0 : this.Q;
            }
            this.U.g(Math.min(i, ((jw4) this.P.r(getDrawableState()).t).g(getWidth())));
            if (z) {
                this.U.n();
            }
        }
    }

    public final boolean v(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final boolean w() {
        int i = this.E;
        return i == 16 || i == 32;
    }

    public final int x(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.s;
        if (drawable != null) {
            intrinsicWidth = this.f;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.z;
        if (drawable2 != null) {
            intrinsicWidth2 = this.f;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.e) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public final boolean z(Runnable runnable) {
        wu4 wu4Var = this.U;
        if (wu4Var == null || !wu4Var.x) {
            return false;
        }
        post(new va(this, runnable, (byte) 5));
        return true;
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, io.appground.blek.R.attr.materialButtonStyle);
    }
}
