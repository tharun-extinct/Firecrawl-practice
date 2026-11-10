package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class kq5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View j;
    public final /* synthetic */ a44 t;

    public kq5(View view, a44 a44Var) {
        this.j = view;
        this.t = a44Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j.removeOnAttachStateChangeListener(this);
        this.t.k();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
