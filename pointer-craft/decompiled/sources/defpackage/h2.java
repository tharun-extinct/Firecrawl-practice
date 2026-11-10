package defpackage;

import android.app.LocaleManager;
import android.content.pm.ShortcutInfo;
import android.os.LocaleList;
import android.os.PowerManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h2 {
    public static final void a(sv3 sv3Var, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = sv3Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static void b(ef1 ef1Var, boolean z) {
        ef1Var.setSelectedChildViewEnabled(z);
    }

    public static final void c(CursorAnchorInfo.Builder builder, k44 k44Var) {
        builder.setEditorBoundsInfo(e2.x().setEditorBounds(oe6.n(k44Var)).setHandwritingBounds(oe6.n(k44Var)).build());
    }

    public static final void g(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
        accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
    }

    public static void i(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    public static LocaleList j(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }

    public static LocaleList l(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static final void m(sv3 sv3Var, wj wjVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (wjVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = sv3Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(wjVar);
    }

    public static boolean n(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }

    public static void p(Object obj, wj wjVar) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(wjVar);
    }

    public static final void q(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
        accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
    }

    public static String r(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static void s(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void t(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static boolean v(ef1 ef1Var) {
        return ef1Var.isSelectedChildViewEnabled();
    }

    public static final void w(CursorAnchorInfo.Builder builder, k44 k44Var) {
        builder.setEditorBoundsInfo(e2.x().setEditorBounds(oe6.n(k44Var)).setHandwritingBounds(oe6.n(k44Var)).build());
    }

    public static boolean x(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static OnBackInvokedDispatcher y(Toolbar toolbar) {
        return toolbar.findOnBackInvokedDispatcher();
    }
}
