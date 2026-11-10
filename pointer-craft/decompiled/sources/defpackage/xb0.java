package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class xb0 extends FrameLayout {
    public static final int[] w = {R.attr.colorBackground};
    public final Rect a;
    public boolean j;
    public final Rect m;
    public final ji q;
    public boolean t;

    public xb0(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, io.appground.blek.R.attr.materialCardViewStyle);
        Rect rect = new Rect();
        this.a = rect;
        this.m = new Rect();
        ji jiVar = new ji((Object) this, (byte) 3);
        this.q = jiVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i24.g, io.appground.blek.R.attr.materialCardViewStyle, io.appground.blek.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(w);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(io.appground.blek.R.color.cardview_light_background) : getResources().getColor(io.appground.blek.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.j = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.t = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ia4 ia4Var = new ia4(colorStateListValueOf, dimension);
        jiVar.t = ia4Var;
        setBackgroundDrawable(ia4Var);
        setClipToOutline(true);
        setElevation(dimension2);
        ra.S(jiVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((ia4) this.q.t).j;
    }

    public float getCardElevation() {
        return ((xb0) this.q.a).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.a.bottom;
    }

    public int getContentPaddingLeft() {
        return this.a.left;
    }

    public int getContentPaddingRight() {
        return this.a.right;
    }

    public int getContentPaddingTop() {
        return this.a.top;
    }

    public float getMaxCardElevation() {
        return ((ia4) this.q.t).v;
    }

    public boolean getPreventCornerOverlap() {
        return this.t;
    }

    public float getRadius() {
        return ((ia4) this.q.t).g;
    }

    public boolean getUseCompatPadding() {
        return this.j;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ia4 ia4Var = (ia4) this.q.t;
        if (colorStateListValueOf == null) {
            ia4Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        ia4Var.j = colorStateListValueOf;
        ia4Var.y.setColor(colorStateListValueOf.getColorForState(ia4Var.getState(), ia4Var.j.getDefaultColor()));
        ia4Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((xb0) this.q.a).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        ra.S(this.q, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.t) {
            this.t = z;
            ji jiVar = this.q;
            ra.S(jiVar, ((ia4) jiVar.t).v);
        }
    }

    public void setRadius(float f) {
        ia4 ia4Var = (ia4) this.q.t;
        if (f == ia4Var.g) {
            return;
        }
        ia4Var.g = f;
        ia4Var.y(null);
        ia4Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.j != z) {
            this.j = z;
            ji jiVar = this.q;
            ra.S(jiVar, ((ia4) jiVar.t).v);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ia4 ia4Var = (ia4) this.q.t;
        if (colorStateList == null) {
            ia4Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        ia4Var.j = colorStateList;
        ia4Var.y.setColor(colorStateList.getColorForState(ia4Var.getState(), ia4Var.j.getDefaultColor()));
        ia4Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
