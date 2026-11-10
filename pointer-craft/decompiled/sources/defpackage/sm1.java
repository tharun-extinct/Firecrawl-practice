package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class sm1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ my1 a;
    public boolean j;
    public final /* synthetic */ View t;

    public sm1(View view, my1 my1Var) {
        this.t = view;
        this.a = my1Var;
        view.addOnAttachStateChangeListener(this);
        if (this.j || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.j = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.j) {
            return;
        }
        View view2 = this.t;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.j = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.j) {
            this.t.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.j = false;
        }
    }
}
