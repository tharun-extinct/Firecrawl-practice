package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class c50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ c50(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g33 g33Var = ((BottomSheetBehavior) obj).a;
                if (g33Var != null) {
                    g33Var.u(fFloatValue);
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                sn1 sn1Var = (sn1) obj;
                sn1Var.r.setAlpha(iFloatValue);
                sn1Var.n.setAlpha(iFloatValue);
                sn1Var.u.invalidate();
                break;
            case 2:
                ((tg2) obj).w = valueAnimator.getAnimatedFraction();
                break;
            default:
                ((TextInputLayout) obj).D0.w(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
