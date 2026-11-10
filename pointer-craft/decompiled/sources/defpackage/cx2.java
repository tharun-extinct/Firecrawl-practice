package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cx2 implements AccessibilityManager.AccessibilityStateChangeListener, bw4 {
    public final tp3 a = kq2.M(Boolean.FALSE);
    public final boolean j;
    public final bx2 m;
    public final ax2 q;
    public final boolean t;

    public cx2(boolean z, boolean z2, boolean z3) {
        this.j = z2;
        this.t = z3;
        ax2 ax2Var = null;
        this.m = z ? new bx2() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            ax2Var = new ax2(this);
        }
        this.q = ax2Var;
    }

    public static boolean g(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && tx4.Q(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean y(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && tx4.Q(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    @Override // defpackage.bw4
    public final Object getValue() {
        boolean z;
        if (((Boolean) this.a.getValue()).booleanValue()) {
            z = true;
            bx2 bx2Var = this.m;
            if (bx2Var == null || !((Boolean) bx2Var.j.getValue()).booleanValue()) {
                boolean z2 = this.j;
                ax2 ax2Var = this.q;
                if ((!z2 || ax2Var == null || !((Boolean) ax2Var.g.getValue()).booleanValue()) && (!this.t || ax2Var == null || !((Boolean) ax2Var.y.getValue()).booleanValue())) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}
