package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class g21 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte g;
    public final /* synthetic */ View n;
    public final /* synthetic */ ViewPropertyAnimator r;
    public final /* synthetic */ j21 v;
    public final /* synthetic */ h21 y;

    public /* synthetic */ g21(j21 j21Var, h21 h21Var, ViewPropertyAnimator viewPropertyAnimator, View view, byte b) {
        this.g = b;
        this.v = j21Var;
        this.y = h21Var;
        this.r = viewPropertyAnimator;
        this.n = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.g;
        h21 h21Var = this.y;
        j21 j21Var = this.v;
        View view = this.n;
        ViewPropertyAnimator viewPropertyAnimator = this.r;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                j21Var.r(h21Var.g);
                j21Var.p.remove(h21Var.g);
                j21Var.t();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                j21Var.r(h21Var.y);
                j21Var.p.remove(h21Var.y);
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
}
