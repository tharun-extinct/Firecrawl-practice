package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class o31 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup g;
    public final /* synthetic */ qu4 n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ p31 v;
    public final /* synthetic */ View y;

    public o31(ViewGroup viewGroup, View view, boolean z, qu4 qu4Var, p31 p31Var) {
        this.g = viewGroup;
        this.y = view;
        this.r = z;
        this.n = qu4Var;
        this.v = p31Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.g;
        View view = this.y;
        viewGroup.endViewTransition(view);
        boolean z = this.r;
        qu4 qu4Var = this.n;
        if (z || qu4Var.g == su4.m) {
            su4 su4Var = qu4Var.g;
            view.getClass();
            su4Var.g(view, viewGroup);
        }
        p31 p31Var = this.v;
        ((qu4) p31Var.r.g).r(p31Var);
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Animator from operation " + qu4Var + " has ended.");
        }
    }
}
