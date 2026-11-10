package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class of0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte g;
    public final /* synthetic */ pf0 y;

    public /* synthetic */ of0(pf0 pf0Var, byte b) {
        this.g = b;
        this.y = pf0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.g) {
            case 1:
                super.onAnimationEnd(animator);
                pf0 pf0Var = this.y;
                pf0Var.g();
                ky kyVar = pf0Var.a;
                if (kyVar != null) {
                    kyVar.g((ab2) pf0Var.g);
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
                pf0 pf0Var = this.y;
                pf0Var.l = (pf0Var.l + pf0.q.length) % pf0Var.x.v.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
