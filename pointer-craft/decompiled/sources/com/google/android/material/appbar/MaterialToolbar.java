package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.br2;
import defpackage.fn4;
import defpackage.fu1;
import defpackage.g33;
import defpackage.gf6;
import defpackage.gp4;
import defpackage.p24;
import defpackage.ue5;
import defpackage.y94;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] g0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer b0;
    public boolean c0;
    public boolean d0;
    public ImageView.ScaleType e0;
    public Boolean f0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(gp4.X(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayY = ue5.Y(context2, attributeSet, p24.B, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayY.hasValue(2)) {
            setNavigationIconTint(typedArrayY.getColor(2, -1));
        }
        this.c0 = typedArrayY.getBoolean(6, false);
        this.d0 = typedArrayY.getBoolean(5, false);
        int i = typedArrayY.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = g0;
            if (i < scaleTypeArr.length) {
                this.e0 = scaleTypeArr[i];
            }
        }
        if (typedArrayY.hasValue(0)) {
            this.f0 = Boolean.valueOf(typedArrayY.getBoolean(0, false));
        }
        typedArrayY.recycle();
        fn4 fn4VarG = fn4.l(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).g();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : y94.B(background);
        if (colorStateListValueOf != null) {
            g33 g33Var = new g33(fn4VarG);
            g33Var.p(colorStateListValueOf);
            g33Var.c(context2);
            g33Var.s(getElevation());
            setBackground(g33Var);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.e0;
    }

    public Integer getNavigationIconTint() {
        return this.b0;
    }

    public final void h(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g33) {
            br2.B(this, (g33) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ImageView imageView2 = null;
        if (this.c0 || this.d0) {
            ArrayList arrayListR = gf6.r(this, getTitle());
            boolean zIsEmpty = arrayListR.isEmpty();
            fu1 fu1Var = gf6.g;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListR, fu1Var);
            ArrayList arrayListR2 = gf6.r(this, getSubtitle());
            TextView textView2 = arrayListR2.isEmpty() ? null : (TextView) Collections.max(arrayListR2, fu1Var);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.c0 && textView != null) {
                    h(textView, pair);
                }
                if (this.d0 && textView2 != null) {
                    h(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.e0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof g33) {
            ((g33) background).s(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f0;
        if (bool == null || bool.booleanValue() != z) {
            this.f0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.e0 != scaleType) {
            this.e0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.b0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.b0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.b0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            requestLayout();
        }
    }
}
