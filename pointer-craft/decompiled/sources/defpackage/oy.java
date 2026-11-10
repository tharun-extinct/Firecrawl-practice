package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oy extends FrameLayout {
    public static final ny b = new ny();
    public final float a;
    public ColorStateList c;
    public PorterDuff.Mode i;
    public final fn4 j;
    public final float m;
    public final int q;
    public int t;
    public final int w;

    public oy(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(gp4.X(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p24.H);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.t = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.j = fn4.l(context2, attributeSet, 0, 0).g();
        }
        this.a = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(zq2.b(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(mq2.s(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.m = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(b);
        setFocusable(true);
        if (getBackground() == null) {
            int iH = xq2.h(getBackgroundOverlayColorAlpha(), xq2.B(getContext(), mq2.f(this, R.attr.colorSurface)), xq2.B(getContext(), mq2.f(this, R.attr.colorOnSurface)));
            fn4 fn4Var = this.j;
            if (fn4Var != null) {
                int i = py.g;
                g33 g33Var = new g33(fn4Var);
                g33Var.p(ColorStateList.valueOf(iH));
                drawable = g33Var;
            } else {
                Resources resources = getResources();
                int i2 = py.g;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iH);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.m;
    }

    public int getAnimationMode() {
        return this.t;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.a;
    }

    public int getMaxInlineActionWidth() {
        return this.w;
    }

    public int getMaxWidth() {
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.q;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.t = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.c != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.c);
            drawable.setTintMode(this.i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.c = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.i);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : b);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(py pyVar) {
    }
}
