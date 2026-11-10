package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class tg2 implements Animator.AnimatorListener {
    public float a;
    public final /* synthetic */ wg2 b;
    public final /* synthetic */ int c;
    public final float g;
    public final /* synthetic */ n54 i;
    public boolean j;
    public final ValueAnimator l;
    public final float n;
    public final float r;
    public float t;
    public final n54 v;
    public float w;
    public final byte x;
    public final float y;
    public boolean m = false;
    public boolean q = false;

    /* JADX WARN: Multi-variable type inference failed */
    public tg2(wg2 wg2Var, n54 n54Var, int i, float f, float f2, float f3, float f4, int i2, n54 n54Var2) {
        this.b = wg2Var;
        this.c = i2;
        this.i = n54Var2;
        this.x = i;
        this.v = n54Var;
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new c50(this, (byte) 2));
        valueAnimatorOfFloat.setTarget(n54Var.g);
        valueAnimatorOfFloat.addListener(this);
        this.w = 0.0f;
    }

    public final void g(Animator animator) {
        if (!this.q) {
            this.v.b(true);
        }
        this.q = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.w = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g(animator);
        if (this.m) {
            return;
        }
        int i = this.c;
        n54 n54Var = this.i;
        wg2 wg2Var = this.b;
        if (i <= 0) {
            wg2Var.w.g(wg2Var.p, n54Var);
        } else {
            wg2Var.g.add(n54Var.g);
            this.j = true;
            if (i > 0) {
                wg2Var.p.post(new i26(wg2Var, this, i));
            }
        }
        View view = wg2Var.f;
        View view2 = n54Var.g;
        if (view == view2 && view2 == view) {
            wg2Var.f = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
