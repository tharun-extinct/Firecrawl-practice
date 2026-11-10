package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class f21 extends AnimatorListenerAdapter {
    public final /* synthetic */ n54 g;
    public final /* synthetic */ int n;
    public final /* synthetic */ View r;
    public final /* synthetic */ ViewPropertyAnimator v;
    public final /* synthetic */ j21 x;
    public final /* synthetic */ int y;

    public f21(j21 j21Var, n54 n54Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.x = j21Var;
        this.g = n54Var;
        this.y = i;
        this.r = view;
        this.n = i2;
        this.v = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.y;
        View view = this.r;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.n != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.v.setListener(null);
        j21 j21Var = this.x;
        n54 n54Var = this.g;
        j21Var.r(n54Var);
        j21Var.b.remove(n54Var);
        j21Var.t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.x.getClass();
    }
}
