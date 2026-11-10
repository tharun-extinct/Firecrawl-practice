package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class rn1 extends AnimatorListenerAdapter {
    public boolean g = false;
    public final /* synthetic */ sn1 y;

    public rn1(sn1 sn1Var) {
        this.y = sn1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.g = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.g) {
            this.g = false;
            return;
        }
        sn1 sn1Var = this.y;
        if (((Float) sn1Var.e.getAnimatedValue()).floatValue() == 0.0f) {
            sn1Var.A = (byte) 0;
            sn1Var.a(0);
        } else {
            sn1Var.A = (byte) 2;
            sn1Var.u.invalidate();
        }
    }
}
