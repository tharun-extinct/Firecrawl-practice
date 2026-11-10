package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class eu1 extends i73 implements qt1 {
    @Override // defpackage.qt1
    public final void Y(ot1 ot1Var) {
        View viewM = m50.M(this);
        ot1Var.r(this.j.h && m50.M(this).hasFocusable());
        View viewFindFocus = viewM.findFocus();
        if (viewFindFocus != null) {
            ot1Var.n(it1.g(viewFindFocus, viewM));
        }
    }
}
