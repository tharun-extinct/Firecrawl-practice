package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class pk3 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final Runnable a;
    public final View j;
    public ViewTreeObserver t;

    public pk3(View view, Runnable runnable) {
        this.j = view;
        this.t = view.getViewTreeObserver();
        this.a = runnable;
    }

    public static void g(View view, Runnable runnable) {
        if (view == null) {
            l0.q("view == null");
            return;
        }
        pk3 pk3Var = new pk3(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pk3Var);
        view.addOnAttachStateChangeListener(pk3Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.t.isAlive();
        View view = this.j;
        if (zIsAlive) {
            this.t.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.a.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.t = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.t.isAlive();
        View view2 = this.j;
        if (zIsAlive) {
            this.t.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
