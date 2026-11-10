package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class k12 {
    public final RecyclerView g;

    public k12(RecyclerView recyclerView) {
        xs2.l(recyclerView != null);
        this.g = recyclerView;
    }

    public int g() {
        Rect rect = new Rect();
        this.g.getGlobalVisibleRect(rect);
        return rect.height();
    }

    public void n(int i) {
        RecyclerView recyclerView = this.g;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.p(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void r(n54 n54Var, u44 u44Var, u44 u44Var2) {
        boolean zL;
        RecyclerView recyclerView = this.g;
        recyclerView.a.w(n54Var);
        recyclerView.j(n54Var);
        n54Var.b(false);
        j21 j21Var = (j21) recyclerView.T;
        j21Var.getClass();
        int i = u44Var.j;
        int i2 = u44Var.t;
        View view = n54Var.g;
        int left = u44Var2 == null ? view.getLeft() : u44Var2.j;
        int top = u44Var2 == null ? view.getTop() : u44Var2.t;
        if (n54Var.a() || (i == left && i2 == top)) {
            j21Var.q(n54Var);
            j21Var.j.add(n54Var);
            zL = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zL = j21Var.l(n54Var, i, i2, left, top);
        }
        if (zL) {
            recyclerView.Z();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public void y(n54 n54Var, u44 u44Var, u44 u44Var2) {
        boolean zL;
        n54Var.b(false);
        RecyclerView recyclerView = this.g;
        j21 j21Var = (j21) recyclerView.T;
        if (u44Var != null) {
            j21Var.getClass();
            int i = u44Var.j;
            int i2 = u44Var2.j;
            if (i == i2 && u44Var.t == u44Var2.t) {
                j21Var.q(n54Var);
                n54Var.g.setAlpha(0.0f);
                j21Var.t.add(n54Var);
                zL = true;
            } else {
                zL = j21Var.l(n54Var, i, u44Var.t, i2, u44Var2.t);
            }
        } else {
            j21Var.q(n54Var);
            n54Var.g.setAlpha(0.0f);
            j21Var.t.add(n54Var);
            zL = true;
        }
        if (zL) {
            recyclerView.Z();
        }
    }

    public /* synthetic */ k12(RecyclerView recyclerView, boolean z) {
        this.g = recyclerView;
    }
}
