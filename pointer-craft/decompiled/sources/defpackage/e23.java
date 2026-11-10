package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class e23 extends ArrayAdapter {
    public ColorStateList g;
    public final /* synthetic */ f23 r;
    public ColorStateList y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e23(f23 f23Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.r = f23Var;
        g();
    }

    public final void g() {
        ColorStateList colorStateList;
        f23 f23Var = this.r;
        ColorStateList colorStateList2 = f23Var.z;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.y = colorStateList;
        if (f23Var.u != 0 && f23Var.z != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{zj0.y(f23Var.z.getColorForState(iArr3, 0), f23Var.u), zj0.y(f23Var.z.getColorForState(iArr2, 0), f23Var.u), f23Var.u});
        }
        this.g = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            f23 f23Var = this.r;
            Drawable drawable = null;
            if (f23Var.getText().toString().contentEquals(textView.getText()) && f23Var.u != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(f23Var.u);
                if (this.y != null) {
                    colorDrawable.setTintList(this.g);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.y, colorDrawable, null);
                    FocusRingDrawable focusRingDrawableV = FocusRingDrawable.v(getContext(), rippleDrawable, null);
                    if (focusRingDrawableV != null) {
                        focusRingDrawableV.o.k = f23Var.c;
                    }
                    drawable = rippleDrawable;
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
