package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.datepicker.v;

/* JADX INFO: loaded from: classes2.dex */
public final class t23 extends b54 {
    public final /* synthetic */ v g;
    public final /* synthetic */ u23 y;

    public t23(u23 u23Var, v vVar) {
        this.y = u23Var;
        this.g = vVar;
    }

    @Override // defpackage.b54
    public final void g(RecyclerView recyclerView, int i) {
        u23 u23Var;
        ro3 ro3Var;
        View viewR;
        if (i != 0 || (ro3Var = (u23Var = this.y).x0) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) u23Var.q0.getLayoutManager();
        if (linearLayoutManager.b()) {
            viewR = ro3.r(linearLayoutManager, ro3Var.v(linearLayoutManager));
        } else {
            viewR = linearLayoutManager.i() ? ro3.r(linearLayoutManager, ro3Var.n(linearLayoutManager)) : null;
        }
        if (viewR != null) {
            n54 n54VarO = RecyclerView.O(viewR);
            int iY = n54VarO != null ? n54VarO.y() : -1;
            if (iY != -1) {
                v vVar = this.g;
                u23Var.m0 = vVar.x(iY);
                u23Var.v0.setText(vVar.x(iY).l());
                u23Var.X(iY);
            }
        }
        u23Var.W();
    }

    @Override // defpackage.b54
    public final void y(RecyclerView recyclerView, int i, int i2) {
        int iA1;
        u23 u23Var = this.y;
        RecyclerView recyclerView2 = u23Var.q0;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View viewC1 = linearLayoutManager.c1(0, linearLayoutManager.G(), false);
            iA1 = viewC1 == null ? -1 : g.R(viewC1);
        } else {
            iA1 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).a1();
        }
        ro3 ro3Var = u23Var.x0;
        v vVar = this.g;
        if (ro3Var == null) {
            u23Var.m0 = vVar.x(iA1);
        }
        u23Var.v0.setText(vVar.x(iA1).l());
        u23Var.X(iA1);
    }
}
