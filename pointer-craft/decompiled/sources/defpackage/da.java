package defpackage;

import android.app.Notification;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class da {
    public static void g(Notification.Action.Builder builder) {
        builder.setEmphasisHint(0);
    }

    public static void r(Notification.Action.Builder builder) {
        builder.setStyleHint(0);
    }

    public static final void y(gj4 gj4Var, AccessibilityEvent accessibilityEvent) {
        aj4 aj4Var = gj4Var.n;
        Object objL = aj4Var.j.l(kj4.M);
        if (objL == null) {
            objL = null;
        }
        if (objL != null) {
            uo1.B();
        } else {
            Object objL2 = aj4Var.j.l(kj4.I);
            accessibilityEvent.setTextChangeTypes((((u75) (objL2 != null ? objL2 : null)) != null ? 1 : 0) | accessibilityEvent.getTextChangeTypes());
        }
    }
}
