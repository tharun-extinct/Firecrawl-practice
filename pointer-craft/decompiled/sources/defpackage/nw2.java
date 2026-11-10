package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
public final class nw2 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ sw2 j;

    public nw2(sw2 sw2Var) {
        this.j = sw2Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ef1 ef1Var;
        if (i == -1 || (ef1Var = this.j.a) == null) {
            return;
        }
        ef1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
