package defpackage;

import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class vp5 extends up5 {
    public vp5(Window window, jy3 jy3Var) {
        super(window, jy3Var, 0);
    }

    @Override // defpackage.aq2
    public final void E(boolean z) {
        if (!z) {
            M(16);
            return;
        }
        Window window = this.y;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        L(16);
    }
}
