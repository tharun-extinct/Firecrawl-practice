package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class q23 extends LinearLayoutManager {
    public final /* synthetic */ int L;
    public final /* synthetic */ u23 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q23(u23 u23Var, int i, int i2) {
        super(i);
        this.M = u23Var;
        this.L = i2;
    }

    @Override // androidx.recyclerview.widget.g
    public final void N0(RecyclerView recyclerView, int i) {
        zb0 zb0Var = new zb0(recyclerView.getContext());
        zb0Var.g = i;
        O0(zb0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q0(j54 j54Var, int[] iArr) {
        u23 u23Var = this.M;
        RecyclerView recyclerView = u23Var.q0;
        if (this.L == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = u23Var.q0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = u23Var.q0.getHeight();
        }
    }
}
