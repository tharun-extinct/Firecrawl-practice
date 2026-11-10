package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public final class hl {
    public final CompoundButton g;
    public boolean x;
    public ColorStateList y = null;
    public PorterDuff.Mode r = null;
    public boolean n = false;
    public boolean v = false;

    public hl(CompoundButton compoundButton) {
        this.g = compoundButton;
    }

    public final void g() {
        CompoundButton compoundButton = this.g;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.n || this.v) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.n) {
                    drawableMutate.setTintList(this.y);
                }
                if (this.v) {
                    drawableMutate.setTintMode(this.r);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void y(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.g;
        Context context = compoundButton.getContext();
        int[] iArr = r24.w;
        ro roVarP = ro.P(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) roVarP.t;
        xk5.m(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) roVarP.t, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(k33.J(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(k33.J(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(k33.J(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(roVarP.s(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(fe1.y(typedArray.getInt(3, -1), null));
            }
        } finally {
            roVarP.S();
        }
    }
}
