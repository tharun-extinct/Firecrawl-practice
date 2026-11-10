package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class qh0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte g;
    public final /* synthetic */ rh0 y;

    public /* synthetic */ qh0(rh0 rh0Var, byte b) {
        this.g = b;
        this.y = rh0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.g) {
            case 1:
                this.y.y.t(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.g) {
            case 0:
                this.y.y.t(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
