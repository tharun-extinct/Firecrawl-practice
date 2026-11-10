package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class fw0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout j;

    public fw0(CoordinatorLayout coordinatorLayout) {
        this.j = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.j.i(0);
        return true;
    }
}
