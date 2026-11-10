package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s24 extends ConstraintLayout {
    public int d;
    public final g33 e;
    public final j4 k;

    public s24(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g33 g33Var = new g33();
        this.e = g33Var;
        g33Var.setShapeAppearanceModel(g33Var.t.g.v(new e64(0.5f)));
        this.e.p(ColorStateList.valueOf(-1));
        setBackground(this.e);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p24.C, R.attr.materialClockStyle, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.k = new j4(this, (byte) 8);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            j4 j4Var = this.k;
            handler.removeCallbacks(j4Var);
            handler.post(j4Var);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            j4 j4Var = this.k;
            handler.removeCallbacks(j4Var);
            handler.post(j4Var);
        }
    }

    public abstract void q();

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.e.p(ColorStateList.valueOf(i));
    }
}
