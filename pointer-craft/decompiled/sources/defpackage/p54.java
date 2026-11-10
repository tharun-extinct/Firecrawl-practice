package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;

/* JADX INFO: loaded from: classes2.dex */
public final class p54 extends s1 {
    public final RecyclerView m;
    public final o54 q;

    public p54(RecyclerView recyclerView) {
        this.m = recyclerView;
        o54 o54Var = this.q;
        if (o54Var != null) {
            this.q = o54Var;
        } else {
            this.q = new o54(this);
        }
    }

    @Override // defpackage.s1
    public final boolean l(View view, int i, Bundle bundle) {
        if (super.l(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.m;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().u0(i, bundle);
    }

    @Override // defpackage.s1
    public final void n(View view, m2 m2Var) {
        this.j.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
        RecyclerView recyclerView = this.m;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return;
        }
        g layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.t;
        layoutManager.g0(recyclerView2.a, recyclerView2.o0, m2Var);
    }

    @Override // defpackage.s1
    public final void r(View view, AccessibilityEvent accessibilityEvent) {
        super.r(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.m.Q()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().f0(accessibilityEvent);
        }
    }
}
