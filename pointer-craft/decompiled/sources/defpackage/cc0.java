package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class cc0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ cc0(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.j) {
            case 1:
                View view2 = (View) this.t;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = xk5.g;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                fc0 fc0Var = (fc0) obj;
                ViewTreeObserver viewTreeObserver = fc0Var.F;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fc0Var.F = view.getViewTreeObserver();
                    }
                    fc0Var.F.removeGlobalOnLayoutListener(fc0Var.s);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                break;
            case 2:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                o62 o62Var = hideBottomViewOnScrollBehavior.j;
                if (o62Var != null && (accessibilityManager = hideBottomViewOnScrollBehavior.l) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(o62Var);
                    hideBottomViewOnScrollBehavior.j = null;
                    break;
                }
                break;
            case 3:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                o62 o62Var2 = hideViewOnScrollBehavior.r;
                if (o62Var2 != null && (accessibilityManager2 = hideViewOnScrollBehavior.y) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(o62Var2);
                    hideViewOnScrollBehavior.r = null;
                    break;
                }
                break;
            default:
                kv4 kv4Var = (kv4) obj;
                ViewTreeObserver viewTreeObserver2 = kv4Var.f;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        kv4Var.f = view.getViewTreeObserver();
                    }
                    kv4Var.f.removeGlobalOnLayoutListener(kv4Var.s);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void g(View view) {
    }

    private final void n(View view) {
    }

    private final void r(View view) {
    }

    private final void v(View view) {
    }

    private final void y(View view) {
    }
}
