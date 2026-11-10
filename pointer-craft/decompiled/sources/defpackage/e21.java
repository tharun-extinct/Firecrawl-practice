package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class e21 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte g = 1;
    public final /* synthetic */ ViewPropertyAnimator n;
    public final /* synthetic */ View r;
    public final /* synthetic */ j21 v;
    public final /* synthetic */ n54 y;

    public e21(j21 j21Var, n54 n54Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.v = j21Var;
        this.y = n54Var;
        this.n = viewPropertyAnimator;
        this.r = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.g) {
            case 1:
                this.r.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.g;
        n54 n54Var = this.y;
        j21 j21Var = this.v;
        ViewPropertyAnimator viewPropertyAnimator = this.n;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.r.setAlpha(1.0f);
                j21Var.r(n54Var);
                j21Var.s.remove(n54Var);
                j21Var.t();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                j21Var.r(n54Var);
                j21Var.i.remove(n54Var);
                j21Var.t();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.g) {
            case 0:
                this.v.getClass();
                break;
            default:
                this.v.getClass();
                break;
        }
    }

    public e21(j21 j21Var, n54 n54Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.v = j21Var;
        this.y = n54Var;
        this.r = view;
        this.n = viewPropertyAnimator;
    }
}
