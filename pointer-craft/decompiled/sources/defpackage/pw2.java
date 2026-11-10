package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class pw2 extends DataSetObserver {
    public final /* synthetic */ sw2 g;

    public pw2(sw2 sw2Var) {
        this.g = sw2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        sw2 sw2Var = this.g;
        if (sw2Var.G.isShowing()) {
            sw2Var.r();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.g.dismiss();
    }
}
