package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes2.dex */
public final class qw2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ sw2 g;

    public qw2(sw2 sw2Var) {
        this.g = sw2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        sw2 sw2Var = this.g;
        ow2 ow2Var = sw2Var.d;
        em emVar = sw2Var.G;
        if (i != 1 || emVar.getInputMethodMode() == 2 || emVar.getContentView() == null) {
            return;
        }
        sw2Var.C.removeCallbacks(ow2Var);
        ow2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
