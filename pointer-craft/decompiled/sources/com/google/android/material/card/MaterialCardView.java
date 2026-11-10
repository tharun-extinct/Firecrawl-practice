package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import defpackage.br2;
import defpackage.e33;
import defpackage.fn4;
import defpackage.g33;
import defpackage.gp4;
import defpackage.iw4;
import defpackage.k33;
import defpackage.lr2;
import defpackage.mq2;
import defpackage.p24;
import defpackage.sn4;
import defpackage.ue5;
import defpackage.v23;
import defpackage.x23;
import defpackage.xb0;
import defpackage.xq2;
import defpackage.xu4;
import defpackage.zq2;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends xb0 implements Checkable, sn4 {
    public boolean b;
    public final x23 c;
    public final boolean i;
    public boolean s;
    public static final int[] p = {R.attr.state_checkable};
    public static final int[] u = {R.attr.state_checked};
    public static final int[] z = {io.appground.blek.R.attr.state_dragged};
    public static final int[] h = {R.attr.state_hovered};

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        iw4 iw4VarL;
        super(gp4.X(context, attributeSet, io.appground.blek.R.attr.materialCardViewStyle, io.appground.blek.R.style.Widget_MaterialComponents_CardView), attributeSet);
        this.b = false;
        this.s = false;
        this.i = true;
        TypedArray typedArrayY = ue5.Y(getContext(), attributeSet, p24.z, io.appground.blek.R.attr.materialCardViewStyle, io.appground.blek.R.style.Widget_MaterialComponents_CardView, new int[0]);
        x23 x23Var = new x23(this, attributeSet);
        this.c = x23Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        g33 g33Var = x23Var.r;
        g33Var.p(cardBackgroundColor);
        x23Var.y.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        x23Var.q();
        MaterialCardView materialCardView = x23Var.g;
        ColorStateList colorStateListB = zq2.b(materialCardView.getContext(), typedArrayY, 11);
        x23Var.i = colorStateListB;
        if (colorStateListB == null) {
            x23Var.i = ColorStateList.valueOf(-1);
        }
        x23Var.t = typedArrayY.getDimensionPixelSize(12, 0);
        boolean z2 = typedArrayY.getBoolean(0, false);
        x23Var.z = z2;
        materialCardView.setLongClickable(z2);
        x23Var.w = zq2.b(materialCardView.getContext(), typedArrayY, 6);
        x23Var.l(zq2.p(materialCardView.getContext(), typedArrayY, 2));
        x23Var.l = typedArrayY.getDimensionPixelSize(5, 0);
        x23Var.x = typedArrayY.getDimensionPixelSize(4, 0);
        x23Var.j = typedArrayY.getInteger(3, 8388661);
        ColorStateList colorStateListB2 = zq2.b(materialCardView.getContext(), typedArrayY, 7);
        x23Var.q = colorStateListB2;
        if (colorStateListB2 == null) {
            x23Var.q = ColorStateList.valueOf(xq2.B(materialCardView.getContext(), mq2.f(materialCardView, io.appground.blek.R.attr.colorControlHighlight)));
        }
        ColorStateList colorStateListB3 = zq2.b(materialCardView.getContext(), typedArrayY, 1);
        colorStateListB3 = colorStateListB3 == null ? ColorStateList.valueOf(0) : colorStateListB3;
        g33 g33Var2 = x23Var.n;
        g33Var2.p(colorStateListB3);
        RippleDrawable rippleDrawable = x23Var.b;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(x23Var.q);
        }
        g33Var.s(materialCardView.getCardElevation());
        float f = x23Var.t;
        ColorStateList colorStateList = x23Var.i;
        g33Var2.t.a = f;
        g33Var2.invalidateSelf();
        e33 e33Var = g33Var2.t;
        if (e33Var.n != colorStateList) {
            e33Var.n = colorStateList;
            g33Var2.onStateChange(g33Var2.getState());
        }
        materialCardView.setBackgroundInternal(x23Var.n(g33Var));
        Drawable drawableR = x23Var.a() ? x23Var.r() : g33Var2;
        x23Var.a = drawableR;
        materialCardView.setForeground(x23Var.n(drawableR));
        if (x23Var.v == -1.0f && (iw4VarL = iw4.l(materialCardView.getContext(), typedArrayY, 8)) != null) {
            xu4 xu4VarF = lr2.F(materialCardView.getContext());
            g33Var.b(xu4VarF);
            g33Var2.b(xu4VarF);
            g33 g33Var3 = x23Var.p;
            if (g33Var3 != null) {
                g33Var3.b(xu4VarF);
            }
            x23Var.j(iw4VarL);
        }
        typedArrayY.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.c.r.getBounds());
        return rectF;
    }

    @Override // defpackage.xb0
    public ColorStateList getCardBackgroundColor() {
        return this.c.r.t.r;
    }

    public ColorStateList getCardForegroundColor() {
        return this.c.n.t.r;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.c.m;
    }

    public int getCheckedIconGravity() {
        return this.c.j;
    }

    public int getCheckedIconMargin() {
        return this.c.x;
    }

    public int getCheckedIconSize() {
        return this.c.l;
    }

    public ColorStateList getCheckedIconTint() {
        return this.c.w;
    }

    @Override // defpackage.xb0
    public int getContentPaddingBottom() {
        return this.c.y.bottom;
    }

    @Override // defpackage.xb0
    public int getContentPaddingLeft() {
        return this.c.y.left;
    }

    @Override // defpackage.xb0
    public int getContentPaddingRight() {
        return this.c.y.right;
    }

    @Override // defpackage.xb0
    public int getContentPaddingTop() {
        return this.c.y.top;
    }

    public float getProgress() {
        return this.c.r.t.t;
    }

    @Override // defpackage.xb0
    public float getRadius() {
        return this.c.r.m();
    }

    public ColorStateList getRippleColor() {
        return this.c.q;
    }

    public fn4 getShapeAppearanceModel() {
        return this.c.c.n();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.c.i;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.c.i;
    }

    public int getStrokeWidth() {
        return this.c.t;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x23 x23Var = this.c;
        x23Var.m();
        br2.B(this, x23Var.r);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 8);
        x23 x23Var = this.c;
        if (x23Var != null && x23Var.z) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, p);
        }
        if (this.b) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, u);
        }
        if (this.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, h);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.b);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        x23 x23Var = this.c;
        accessibilityNodeInfo.setCheckable(x23Var != null && x23Var.z);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.b);
    }

    @Override // defpackage.xb0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c.v(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.i) {
            x23 x23Var = this.c;
            if (!x23Var.u) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                x23Var.u = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.xb0
    public void setCardBackgroundColor(int i) {
        this.c.r.p(ColorStateList.valueOf(i));
    }

    @Override // defpackage.xb0
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        x23 x23Var = this.c;
        x23Var.r.s(x23Var.g.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g33 g33Var = this.c.n;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        g33Var.p(colorStateList);
    }

    public void setCheckable(boolean z2) {
        this.c.z = z2;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.b != z2) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.c.l(drawable);
    }

    public void setCheckedIconGravity(int i) {
        x23 x23Var = this.c;
        if (x23Var.j != i) {
            x23Var.j = i;
            MaterialCardView materialCardView = x23Var.g;
            x23Var.v(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.c.x = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.c.x = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.c.l(k33.J(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.c.l = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.c.l = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        x23 x23Var = this.c;
        x23Var.w = colorStateList;
        Drawable drawable = x23Var.m;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        x23 x23Var = this.c;
        if (x23Var != null) {
            x23Var.m();
        }
    }

    public void setDragged(boolean z2) {
        if (this.s != z2) {
            this.s = z2;
            refreshDrawableState();
            y();
            invalidate();
        }
    }

    @Override // defpackage.xb0
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.c.w();
    }

    @Override // defpackage.xb0
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        x23 x23Var = this.c;
        x23Var.w();
        x23Var.q();
    }

    public void setProgress(float f) {
        x23 x23Var = this.c;
        x23Var.r.u(f);
        g33 g33Var = x23Var.n;
        if (g33Var != null) {
            g33Var.u(f);
        }
        g33 g33Var2 = x23Var.p;
        if (g33Var2 != null) {
            g33Var2.u(f);
        }
    }

    @Override // defpackage.xb0
    public void setRadius(float f) {
        super.setRadius(f);
        x23 x23Var = this.c;
        x23Var.v = f;
        x23Var.j(x23Var.c.n().g(f));
        x23Var.a.invalidateSelf();
        if (x23Var.t() || (x23Var.g.getPreventCornerOverlap() && !x23Var.r.i())) {
            x23Var.q();
        }
        if (x23Var.t()) {
            x23Var.w();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        x23 x23Var = this.c;
        x23Var.q = colorStateList;
        RippleDrawable rippleDrawable = x23Var.b;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListR = ue5.R(getContext(), i);
        x23 x23Var = this.c;
        x23Var.q = colorStateListR;
        RippleDrawable rippleDrawable = x23Var.b;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListR);
        }
    }

    @Override // defpackage.sn4
    public void setShapeAppearanceModel(fn4 fn4Var) {
        setClipToOutline(fn4Var.a(getBoundsAsRectF()));
        this.c.j(fn4Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        x23 x23Var = this.c;
        if (x23Var.i != colorStateList) {
            x23Var.i = colorStateList;
            g33 g33Var = x23Var.n;
            g33Var.t.a = x23Var.t;
            g33Var.invalidateSelf();
            e33 e33Var = g33Var.t;
            if (e33Var.n != colorStateList) {
                e33Var.n = colorStateList;
                g33Var.onStateChange(g33Var.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        x23 x23Var = this.c;
        if (i != x23Var.t) {
            x23Var.t = i;
            g33 g33Var = x23Var.n;
            ColorStateList colorStateList = x23Var.i;
            g33Var.t.a = i;
            g33Var.invalidateSelf();
            e33 e33Var = g33Var.t;
            if (e33Var.n != colorStateList) {
                e33Var.n = colorStateList;
                g33Var.onStateChange(g33Var.getState());
            }
        }
        invalidate();
    }

    @Override // defpackage.xb0
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        x23 x23Var = this.c;
        x23Var.w();
        x23Var.q();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        x23 x23Var = this.c;
        if (x23Var != null && x23Var.z && isEnabled()) {
            this.b = !this.b;
            refreshDrawableState();
            y();
            x23Var.x(this.b, true);
        }
    }

    public final void y() {
        x23 x23Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (x23Var = this.c).b) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        x23Var.b.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        x23Var.b.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // defpackage.xb0
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.c.r.p(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(v23 v23Var) {
    }
}
