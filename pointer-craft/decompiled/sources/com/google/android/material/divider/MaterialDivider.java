package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.g33;
import defpackage.gp4;
import defpackage.p24;
import defpackage.ue5;
import defpackage.zq2;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {
    public int a;
    public final g33 j;
    public int m;
    public int q;
    public int t;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(gp4.X(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.j = new g33();
        TypedArray typedArrayY = ue5.Y(context2, attributeSet, p24.o, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.t = typedArrayY.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.m = typedArrayY.getDimensionPixelOffset(2, 0);
        this.q = typedArrayY.getDimensionPixelOffset(1, 0);
        setDividerColor(zq2.b(context2, typedArrayY, 0).getDefaultColor());
        typedArrayY.recycle();
    }

    public int getDividerColor() {
        return this.a;
    }

    public int getDividerInsetEnd() {
        return this.q;
    }

    public int getDividerInsetStart() {
        return this.m;
    }

    public int getDividerThickness() {
        return this.t;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.q : this.m;
        if (z) {
            width = getWidth();
            i = this.m;
        } else {
            width = getWidth();
            i = this.q;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        g33 g33Var = this.j;
        g33Var.setBounds(i2, 0, i3, bottom);
        g33Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.t;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.a != i) {
            this.a = i;
            this.j.p(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.q = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.m = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.t != i) {
            this.t = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
