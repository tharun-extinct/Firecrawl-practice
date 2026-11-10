package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class n2 extends AccessibilityNodeProvider {
    public final y22 g;

    public n2(y22 y22Var) {
        this.g = y22Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        m2 m2VarW = this.g.w(i);
        if (m2VarW == null) {
            return null;
        }
        return m2VarW.o0();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        m2 m2VarP = this.g.p(i);
        if (m2VarP == null) {
            return null;
        }
        return m2VarP.o0();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.g.k(i, i2, bundle);
    }
}
