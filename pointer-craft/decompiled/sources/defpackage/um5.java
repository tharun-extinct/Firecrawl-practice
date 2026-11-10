package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class um5 extends AnimatorListenerAdapter implements ic5 {
    public final View g;
    public final ViewGroup r;
    public boolean v;
    public final int y;
    public boolean x = false;
    public final boolean n = true;

    public um5(View view, int i) {
        this.g = view;
        this.y = i;
        this.r = (ViewGroup) view.getParent();
        l(true);
    }

    @Override // defpackage.ic5
    public final void g(lc5 lc5Var) {
        lc5Var.e(this);
    }

    public final void l(boolean z) {
        ViewGroup viewGroup;
        if (!this.n || this.v == z || (viewGroup = this.r) == null) {
            return;
        }
        this.v = z;
        za6.c(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.x = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.x) {
            jm5.v(this.g, this.y);
            ViewGroup viewGroup = this.r;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        l(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            jm5.v(this.g, 0);
            ViewGroup viewGroup = this.r;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // defpackage.ic5
    public final void r() {
        l(true);
        if (this.x) {
            return;
        }
        jm5.v(this.g, 0);
    }

    @Override // defpackage.ic5
    public final void y() {
        l(false);
        if (this.x) {
            return;
        }
        jm5.v(this.g, this.y);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.x) {
            jm5.v(this.g, this.y);
            ViewGroup viewGroup = this.r;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        l(false);
    }

    @Override // defpackage.ic5
    public final void n(lc5 lc5Var) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // defpackage.ic5
    public final void v(lc5 lc5Var) {
    }
}
