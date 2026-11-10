package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;

/* JADX INFO: loaded from: classes2.dex */
public final class ro3 extends z44 {
    public RecyclerView g;
    public vm3 n;
    public vm3 r;
    public final xs4 y = new xs4(this);

    public static View r(g gVar, vm3 vm3Var) {
        int iG = gVar.G();
        View view = null;
        if (iG == 0) {
            return null;
        }
        int iM = (vm3Var.m() / 2) + vm3Var.a();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iG; i2++) {
            View viewF = gVar.F(i2);
            int iAbs = Math.abs(((vm3Var.r(viewF) / 2) + vm3Var.v(viewF)) - iM);
            if (iAbs < i) {
                view = viewF;
                i = iAbs;
            }
        }
        return view;
    }

    public static int y(View view, vm3 vm3Var) {
        return ((vm3Var.r(view) / 2) + vm3Var.v(view)) - ((vm3Var.m() / 2) + vm3Var.a());
    }

    public final int[] g(g gVar, View view) {
        int[] iArr = new int[2];
        if (gVar.i()) {
            iArr[0] = y(view, n(gVar));
        } else {
            iArr[0] = 0;
        }
        if (gVar.b()) {
            iArr[1] = y(view, v(gVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final vm3 n(g gVar) {
        vm3 vm3Var = this.n;
        if (vm3Var != null && vm3Var.g == gVar) {
            return vm3Var;
        }
        vm3 vm3Var2 = new vm3(gVar, (byte) 0);
        this.n = vm3Var2;
        return vm3Var2;
    }

    public final vm3 v(g gVar) {
        vm3 vm3Var = this.r;
        if (vm3Var != null && vm3Var.g == gVar) {
            return vm3Var;
        }
        vm3 vm3Var2 = new vm3(gVar, (byte) 1);
        this.r = vm3Var2;
        return vm3Var2;
    }

    public final void x() {
        g layoutManager;
        View viewR;
        RecyclerView recyclerView = this.g;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager.b()) {
            viewR = r(layoutManager, v(layoutManager));
        } else {
            viewR = layoutManager.i() ? r(layoutManager, n(layoutManager)) : null;
        }
        if (viewR == null) {
            return;
        }
        int[] iArrG = g(layoutManager, viewR);
        int i = iArrG[0];
        if (i == 0 && iArrG[1] == 0) {
            return;
        }
        this.g.m0(i, iArrG[1], false);
    }
}
