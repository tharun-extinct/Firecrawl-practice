package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* JADX INFO: loaded from: classes2.dex */
public final class ax2 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final tp3 g;
    public final tp3 y;

    public ax2(cx2 cx2Var) {
        Boolean bool = Boolean.FALSE;
        this.g = kq2.M(bool);
        this.y = kq2.M(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.g.setValue(Boolean.valueOf(cx2.g(accessibilityManager)));
        this.y.setValue(Boolean.valueOf(cx2.y(accessibilityManager)));
    }
}
