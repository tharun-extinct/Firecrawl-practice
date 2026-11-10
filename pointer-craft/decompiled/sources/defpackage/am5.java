package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class am5 extends bw0 {
    public hs0 g;

    @Override // defpackage.bw0
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        p(coordinatorLayout, view, i);
        hs0 hs0Var = this.g;
        if (hs0Var == null) {
            hs0Var = new hs0(view);
            this.g = hs0Var;
        }
        View view2 = (View) hs0Var.m;
        hs0Var.t = view2.getTop();
        hs0Var.a = view2.getLeft();
        hs0 hs0Var2 = this.g;
        View view3 = (View) hs0Var2.m;
        int top = 0 - (view3.getTop() - hs0Var2.t);
        WeakHashMap weakHashMap = xk5.g;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - hs0Var2.a));
        return true;
    }

    public void p(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.b(view, i);
    }
}
