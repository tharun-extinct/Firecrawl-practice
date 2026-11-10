package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes2.dex */
public final class m31 extends pu4 {
    public final n31 r;

    public m31(n31 n31Var) {
        this.r = n31Var;
    }

    @Override // defpackage.pu4
    public final void n(ViewGroup viewGroup) {
        viewGroup.getClass();
        n31 n31Var = this.r;
        qu4 qu4Var = (qu4) n31Var.g;
        if (n31Var.x()) {
            qu4Var.r(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = qu4Var.r.O;
        context.getClass();
        rk4 rk4VarU = n31Var.u(context);
        if (rk4VarU == null) {
            l0.z("Required value was null.");
            return;
        }
        Animation animation = (Animation) rk4VarU.t;
        if (animation == null) {
            l0.z("Required value was null.");
            return;
        }
        if (qu4Var.g != su4.t) {
            view.startAnimation(animation);
            qu4Var.r(this);
            return;
        }
        viewGroup.startViewTransition(view);
        sw1 sw1Var = new sw1(animation, viewGroup, view);
        sw1Var.setAnimationListener(new l31(qu4Var, viewGroup, view, this));
        view.startAnimation(sw1Var);
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Animation from operation " + qu4Var + " has started.");
        }
    }

    @Override // defpackage.pu4
    public final void r(ViewGroup viewGroup) {
        viewGroup.getClass();
        qu4 qu4Var = (qu4) this.r.g;
        View view = qu4Var.r.O;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        qu4Var.r(this);
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Animation from operation " + qu4Var + " has been cancelled.");
        }
    }
}
