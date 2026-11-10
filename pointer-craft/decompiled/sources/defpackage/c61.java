package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import io.appground.blek.utils.PointerPathView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ c61(ha5 ha5Var, View view) {
        this.g = (byte) 4;
        this.y = ha5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                e61 e61Var = (e61) obj;
                e61Var.f.n = e61Var.B.getInterpolation(e61Var.A.getAnimatedFraction());
                break;
            case 1:
                ((jf1) obj).n.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                x23 x23Var = (x23) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x23Var.m.setAlpha((int) (255.0f * fFloatValue));
                x23Var.d = fFloatValue;
                break;
            case 3:
                PointerPathView pointerPathView = (PointerPathView) obj;
                int i = PointerPathView.R;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                pointerPathView.M = ((Float) animatedValue).floatValue();
                pointerPathView.N = (int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f);
                pointerPathView.invalidate();
                break;
            default:
                ((View) ((no5) ((ha5) obj).t).n.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ c61(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }
}
