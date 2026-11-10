package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class lf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte g;
    public final /* synthetic */ nf0 y;

    public /* synthetic */ lf0(nf0 nf0Var, byte b) {
        this.g = b;
        this.y = nf0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.g) {
            case 1:
                super.onAnimationEnd(animator);
                nf0 nf0Var = this.y;
                nf0Var.g();
                ky kyVar = nf0Var.a;
                if (kyVar != null) {
                    kyVar.g((ab2) nf0Var.g);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.g) {
            case 0:
                super.onAnimationRepeat(animator);
                nf0 nf0Var = this.y;
                nf0Var.l = (nf0Var.l + 4) % nf0Var.x.v.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
