package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.j04;
import defpackage.j4;
import defpackage.l0;
import defpackage.pj0;
import defpackage.u05;
import defpackage.xi3;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object a = new Object();
    public final ArrayList j;
    public j04 t;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.j = new ArrayList();
    }

    private u05 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof u05) {
            return (u05) tag;
        }
        u05 u05Var = new u05(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, u05Var);
        return u05Var;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != a) {
            j04 j04Var = this.t;
            int childCount = getChildCount() - (j04Var != null ? j04Var.g.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void g() {
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            y();
            return;
        }
        u05 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        y();
        this.t = new j04(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.t.g.size() <= 0) {
            return;
        }
        pj0 pj0Var = (pj0) this.t.g.get(0);
        getContext();
        pj0Var.getClass();
        l0.u(xi3.j("Unexpected side: ", 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof u05) {
            u05 u05Var = (u05) tag;
            if (u05Var.y.isEmpty()) {
                u05Var.g.post(new j4(u05Var, (byte) 13));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<pj0> list) {
        ArrayList arrayList = this.j;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            g();
            requestApplyInsets();
        }
    }

    public final void y() {
        if (this.t != null) {
            removeViews(getChildCount() - this.t.g.size(), this.t.g.size());
            int size = this.t.g.size();
            j04 j04Var = this.t;
            if (size > 0) {
                ((pj0) j04Var.g.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = j04Var.g;
            if (!j04Var.x) {
                j04Var.x = true;
                j04Var.y.y.remove(j04Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((pj0) arrayList.get(size2)).r = null;
                }
                arrayList.clear();
            }
            this.t = null;
        }
    }
}
