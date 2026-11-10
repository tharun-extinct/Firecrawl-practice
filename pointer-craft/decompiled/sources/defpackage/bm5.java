package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class bm5 {
    public final WeakReference g;

    public bm5(View view) {
        this.g = new WeakReference(view);
    }

    public final void g(float f) {
        View view = (View) this.g.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void n(em5 em5Var) {
        View view = (View) this.g.get();
        if (view != null) {
            if (em5Var != null) {
                view.animate().setListener(new m3(em5Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void r(long j) {
        View view = (View) this.g.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void v(float f) {
        View view = (View) this.g.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void y() {
        View view = (View) this.g.get();
        if (view != null) {
            view.animate().cancel();
        }
    }
}
