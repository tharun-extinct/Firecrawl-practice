package defpackage;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class bx2 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final tp3 j = kq2.M(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }
}
