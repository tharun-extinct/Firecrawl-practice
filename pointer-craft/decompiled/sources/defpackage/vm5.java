package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class vm5 extends AnimatorListenerAdapter implements ic5 {
    public final ViewGroup g;
    public boolean n = true;
    public final View r;
    public final /* synthetic */ gn1 v;
    public final View y;

    public vm5(gn1 gn1Var, ViewGroup viewGroup, View view, View view2) {
        this.v = gn1Var;
        this.g = viewGroup;
        this.y = view;
        this.r = view2;
    }

    @Override // defpackage.ic5
    public final void g(lc5 lc5Var) {
        lc5Var.e(this);
    }

    public final void l() {
        this.r.setTag(R.id.save_overlay_view, null);
        this.g.getOverlay().remove(this.y);
        this.n = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        l();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.g.getOverlay().remove(this.y);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.y;
        if (view.getParent() == null) {
            this.g.getOverlay().add(view);
        } else {
            this.v.r();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.r;
            View view2 = this.y;
            view.setTag(R.id.save_overlay_view, view2);
            this.g.getOverlay().add(view2);
            this.n = true;
        }
    }

    @Override // defpackage.ic5
    public final void v(lc5 lc5Var) {
        if (this.n) {
            l();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l();
    }

    @Override // defpackage.ic5
    public final void r() {
    }

    @Override // defpackage.ic5
    public final void y() {
    }

    @Override // defpackage.ic5
    public final void n(lc5 lc5Var) {
    }
}
