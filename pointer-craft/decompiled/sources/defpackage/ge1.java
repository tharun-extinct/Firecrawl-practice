package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ge1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte g;
    public final /* synthetic */ he1 y;

    public /* synthetic */ ge1(he1 he1Var, byte b) {
        this.g = b;
        this.y = he1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.g) {
            case 1:
                super.onAnimationEnd(animator);
                he1 he1Var = this.y;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = he1Var.c;
                if (arrayList != null && !he1Var.i) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ky) obj).g(he1Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.g) {
            case 0:
                super.onAnimationStart(animator);
                he1 he1Var = this.y;
                ArrayList arrayList = he1Var.c;
                if (arrayList != null && !he1Var.i) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ky) obj).y(he1Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
