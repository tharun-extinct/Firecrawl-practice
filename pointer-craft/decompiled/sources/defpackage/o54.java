package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o54 extends s1 {
    public final p54 m;
    public final WeakHashMap q = new WeakHashMap();

    public o54(p54 p54Var) {
        this.m = p54Var;
    }

    @Override // defpackage.s1
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        s1 s1Var = (s1) this.q.get(view);
        return s1Var != null ? s1Var.g(view, accessibilityEvent) : this.j.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.s1
    public final void j(View view, int i) {
        s1 s1Var = (s1) this.q.get(view);
        if (s1Var != null) {
            s1Var.j(view, i);
        } else {
            super.j(view, i);
        }
    }

    @Override // defpackage.s1
    public final boolean l(View view, int i, Bundle bundle) {
        p54 p54Var = this.m;
        RecyclerView recyclerView = p54Var.m;
        RecyclerView recyclerView2 = p54Var.m;
        if (recyclerView.Q() || recyclerView2.getLayoutManager() == null) {
            return super.l(view, i, bundle);
        }
        s1 s1Var = (s1) this.q.get(view);
        if (s1Var != null) {
            if (s1Var.l(view, i, bundle)) {
                return true;
            }
        } else if (super.l(view, i, bundle)) {
            return true;
        }
        e54 e54Var = recyclerView2.getLayoutManager().t.a;
        return false;
    }

    @Override // defpackage.s1
    public final void n(View view, m2 m2Var) {
        p54 p54Var = this.m;
        RecyclerView recyclerView = p54Var.m;
        RecyclerView recyclerView2 = p54Var.m;
        boolean zQ = recyclerView.Q();
        View.AccessibilityDelegate accessibilityDelegate = this.j;
        if (zQ || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
            return;
        }
        recyclerView2.getLayoutManager().i0(view, m2Var);
        s1 s1Var = (s1) this.q.get(view);
        if (s1Var != null) {
            s1Var.n(view, m2Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
        }
    }

    @Override // defpackage.s1
    public final void r(View view, AccessibilityEvent accessibilityEvent) {
        s1 s1Var = (s1) this.q.get(view);
        if (s1Var != null) {
            s1Var.r(view, accessibilityEvent);
        } else {
            super.r(view, accessibilityEvent);
        }
    }

    @Override // defpackage.s1
    public final void t(View view, AccessibilityEvent accessibilityEvent) {
        s1 s1Var = (s1) this.q.get(view);
        if (s1Var != null) {
            s1Var.t(view, accessibilityEvent);
        } else {
            super.t(view, accessibilityEvent);
        }
    }

    @Override // defpackage.s1
    public final void v(View view, AccessibilityEvent accessibilityEvent) {
        s1 s1Var = (s1) this.q.get(view);
        if (s1Var != null) {
            s1Var.v(view, accessibilityEvent);
        } else {
            super.v(view, accessibilityEvent);
        }
    }

    @Override // defpackage.s1
    public final boolean x(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        s1 s1Var = (s1) this.q.get(viewGroup);
        return s1Var != null ? s1Var.x(viewGroup, view, accessibilityEvent) : this.j.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.s1
    public final y22 y(View view) {
        s1 s1Var = (s1) this.q.get(view);
        return s1Var != null ? s1Var.y(view) : super.y(view);
    }
}
