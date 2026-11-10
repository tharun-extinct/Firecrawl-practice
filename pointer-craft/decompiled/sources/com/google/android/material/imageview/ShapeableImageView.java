package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import defpackage.cm;
import defpackage.fn4;
import defpackage.g33;
import defpackage.gn4;
import defpackage.gp4;
import defpackage.i64;
import defpackage.p24;
import defpackage.sn4;
import defpackage.tn4;
import defpackage.ue5;
import defpackage.zq2;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends cm implements sn4 {
    public final int A;
    public boolean B;
    public final Path b;
    public final Paint c;
    public final int d;
    public final int e;
    public final int f;
    public final Path h;
    public final Paint i;
    public final int k;
    public final i64 m;
    public final int o;
    public g33 p;
    public final RectF q;
    public ColorStateList s;
    public fn4 u;
    public final RectF w;
    public float z;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(gp4.X(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.m = gn4.g;
        this.b = new Path();
        this.B = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.q = new RectF();
        this.w = new RectF();
        this.h = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p24.F, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.s = zq2.b(context2, typedArrayObtainStyledAttributes, 9);
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.o = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.u = fn4.l(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).g();
        setOutlineProvider(new tn4(this));
    }

    public int getContentPaddingBottom() {
        return this.d;
    }

    public final int getContentPaddingEnd() {
        int i = this.A;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return r() ? this.o : this.k;
    }

    public int getContentPaddingLeft() {
        int i = this.A;
        int i2 = this.e;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (r() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!r() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.o;
    }

    public int getContentPaddingRight() {
        int i = this.A;
        int i2 = this.e;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (r() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!r() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.k;
    }

    public final int getContentPaddingStart() {
        int i = this.e;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return r() ? this.k : this.o;
    }

    public int getContentPaddingTop() {
        return this.f;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public fn4 getShapeAppearanceModel() {
        return this.u;
    }

    public ColorStateList getStrokeColor() {
        return this.s;
    }

    public float getStrokeWidth() {
        return this.z;
    }

    public final void n(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.q;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        fn4 fn4Var = this.u;
        i64 i64Var = this.m;
        Path path = this.b;
        i64Var.g(fn4Var, null, 1.0f, rectF, null, path);
        Path path2 = this.h;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.w;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.h, this.i);
        if (this.s == null) {
            return;
        }
        float f = this.z;
        Paint paint = this.c;
        paint.setStrokeWidth(f);
        int colorForState = this.s.getColorForState(getDrawableState(), this.s.getDefaultColor());
        if (this.z <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.b, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.B && isLayoutDirectionResolved()) {
            this.B = true;
            if (!isPaddingRelative() && this.e == Integer.MIN_VALUE && this.A == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        n(i, i2);
    }

    public final boolean r() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // defpackage.sn4
    public void setShapeAppearanceModel(fn4 fn4Var) {
        this.u = fn4Var;
        g33 g33Var = this.p;
        if (g33Var != null) {
            g33Var.setShapeAppearanceModel(fn4Var);
        }
        n(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.s = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(ue5.R(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.z != f) {
            this.z = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }
}
