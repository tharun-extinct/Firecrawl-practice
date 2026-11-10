package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes2.dex */
public final class l31 implements Animation.AnimationListener {
    public final /* synthetic */ qu4 g;
    public final /* synthetic */ m31 n;
    public final /* synthetic */ View r;
    public final /* synthetic */ ViewGroup y;

    public l31(qu4 qu4Var, ViewGroup viewGroup, View view, m31 m31Var) {
        this.g = qu4Var;
        this.y = viewGroup;
        this.r = view;
        this.n = m31Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.y;
        viewGroup.post(new bf(viewGroup, this.r, this.n, (byte) 1));
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.g + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.g + " has reached onAnimationStart.");
        }
    }
}
