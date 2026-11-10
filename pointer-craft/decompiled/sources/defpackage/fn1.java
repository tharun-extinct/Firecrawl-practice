package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fn1 extends AnimatorListenerAdapter implements ic5 {
    public final View g;
    public boolean y = false;

    public fn1(View view) {
        this.g = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        jm5.n(this.g, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.y;
        View view = this.g;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        jm5.n(view, 1.0f);
        jm5.g.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.g;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.y = true;
            view.setLayerType(2, null);
        }
    }

    @Override // defpackage.ic5
    public final void r() {
        this.g.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.ic5
    public final void y() {
        View view = this.g;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? jm5.g.n(view) : 0.0f));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.ic5
    public final void g(lc5 lc5Var) {
    }

    @Override // defpackage.ic5
    public final void n(lc5 lc5Var) {
    }

    @Override // defpackage.ic5
    public final void v(lc5 lc5Var) {
    }

    @Override // defpackage.ic5
    public final void x(lc5 lc5Var) {
    }
}
