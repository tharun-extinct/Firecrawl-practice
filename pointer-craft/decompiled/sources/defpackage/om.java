package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public final class om implements PopupWindow.OnDismissListener {
    public final /* synthetic */ km j;
    public final /* synthetic */ pm t;

    public om(pm pmVar, km kmVar) {
        this.t = pmVar;
        this.j = kmVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.t.N.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.j);
        }
    }
}
