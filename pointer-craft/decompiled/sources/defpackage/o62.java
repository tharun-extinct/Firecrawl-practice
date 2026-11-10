package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o62 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ bw0 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ View t;

    public /* synthetic */ o62(bw0 bw0Var, View view, byte b) {
        this.j = b;
        this.a = bw0Var;
        this.t = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        byte b = this.j;
        View view = this.t;
        bw0 bw0Var = this.a;
        switch (b) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) bw0Var;
                if (z && hideBottomViewOnScrollBehavior.a == 1) {
                    hideBottomViewOnScrollBehavior.p(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) bw0Var;
                if (z && hideViewOnScrollBehavior.a == 1) {
                    hideViewOnScrollBehavior.u(view);
                    break;
                }
                break;
        }
    }
}
