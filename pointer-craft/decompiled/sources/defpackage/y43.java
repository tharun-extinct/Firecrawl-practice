package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public final class y43 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ z43 j;

    public y43(z43 z43Var) {
        this.j = z43Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.j.r();
    }
}
