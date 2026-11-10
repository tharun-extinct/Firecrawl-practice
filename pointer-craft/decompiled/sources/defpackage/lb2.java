package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class lb2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte g;
    public final /* synthetic */ TextView n;
    public final /* synthetic */ byte r;
    public final /* synthetic */ mb2 v;
    public final /* synthetic */ TextView y;

    /* JADX WARN: Multi-variable type inference failed */
    public lb2(mb2 mb2Var, int i, TextView textView, int i2, TextView textView2) {
        this.v = mb2Var;
        this.g = i;
        this.y = textView;
        this.r = i2;
        this.n = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        en enVar;
        byte b = this.g;
        mb2 mb2Var = this.v;
        mb2Var.c = b;
        mb2Var.q = null;
        TextView textView = this.y;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.r == 1 && (enVar = mb2Var.p) != null) {
                enVar.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.n;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
