package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class p31 extends pu4 {
    public AnimatorSet n;
    public final n31 r;

    public p31(n31 n31Var) {
        this.r = n31Var;
    }

    @Override // defpackage.pu4
    public final void n(ViewGroup viewGroup) {
        viewGroup.getClass();
        qu4 qu4Var = (qu4) this.r.g;
        AnimatorSet animatorSet = this.n;
        if (animatorSet == null) {
            qu4Var.r(this);
            return;
        }
        animatorSet.start();
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Animator from operation " + qu4Var + " has started.");
        }
    }

    @Override // defpackage.pu4
    public final void r(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.n;
        qu4 qu4Var = (qu4) this.r.g;
        if (animatorSet == null) {
            qu4Var.r(this);
            return;
        }
        if (!qu4Var.l) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            tm.a(animatorSet);
        }
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Animator from operation " + qu4Var + " has been canceled" + (qu4Var.l ? " with seeking." : ".") + " ");
        }
    }

    @Override // defpackage.pu4
    public final void v(sv svVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        qu4 qu4Var = (qu4) this.r.g;
        AnimatorSet animatorSet = this.n;
        if (animatorSet == null) {
            qu4Var.r(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !qu4Var.r.z) {
            return;
        }
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + qu4Var);
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (svVar.r * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = totalDuration - 1;
        }
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + qu4Var);
        }
        tm.c(animatorSet, j);
    }

    @Override // defpackage.pu4
    public final void x(ViewGroup viewGroup) {
        p31 p31Var;
        viewGroup.getClass();
        n31 n31Var = this.r;
        if (n31Var.x()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        rk4 rk4VarU = n31Var.u(context);
        this.n = rk4VarU != null ? (AnimatorSet) rk4VarU.a : null;
        qu4 qu4Var = (qu4) n31Var.g;
        pw1 pw1Var = qu4Var.r;
        boolean z = qu4Var.g == su4.m;
        View view = pw1Var.O;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            p31Var = this;
            animatorSet.addListener(new o31(viewGroup, view, z, qu4Var, p31Var));
        } else {
            p31Var = this;
        }
        AnimatorSet animatorSet2 = p31Var.n;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
