package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.appground.blek.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends View.AccessibilityDelegate {
    public final s1 g;

    public r1(s1 s1Var) {
        this.g = s1Var;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.g.g(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        y22 y22VarY = this.g.y(view);
        if (y22VarY != null) {
            return (AccessibilityNodeProvider) y22VarY.t;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.g.r(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        m2 m2VarP0 = m2.p0(accessibilityNodeInfo);
        WeakHashMap weakHashMap = xk5.g;
        Boolean bool = (Boolean) new lk5((byte) 0).g(view);
        m2VarP0.Z(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new lk5((byte) 3).g(view);
        m2VarP0.K(bool2 != null && bool2.booleanValue());
        m2VarP0.T(xk5.n(view));
        m2VarP0.e0((CharSequence) new lk5((byte) 2).g(view));
        this.g.n(view, m2VarP0);
        m2VarP0.v(view, accessibilityNodeInfo.getText());
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i = 0; i < list.size(); i++) {
            m2VarP0.y((f2) list.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.g.v(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.g.x(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.g.l(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.g.j(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.g.t(view, accessibilityEvent);
    }
}
