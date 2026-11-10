package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
public final class x5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ b6 j;
    public final /* synthetic */ y5 t;

    public x5(y5 y5Var, b6 b6Var) {
        this.t = y5Var;
        this.j = b6Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        y5 y5Var = this.t;
        DialogInterface.OnClickListener onClickListener = y5Var.q;
        b6 b6Var = this.j;
        onClickListener.onClick(b6Var.y, i);
        if (y5Var.w) {
            return;
        }
        b6Var.y.dismiss();
    }
}
