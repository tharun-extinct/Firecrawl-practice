package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
public final class nm implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ nm(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                pm pmVar = (pm) obj;
                sm smVar = pmVar.N;
                smVar.setSelection(i);
                if (smVar.getOnItemClickListener() != null) {
                    smVar.performItemClick(view, i, pmVar.K.getItemId(i));
                }
                pmVar.dismiss();
                break;
            default:
                f23 f23Var = (f23) obj;
                sw2 sw2Var = f23Var.q;
                if (i < 0) {
                    item = !sw2Var.G.isShowing() ? null : sw2Var.a.getSelectedItem();
                } else {
                    item = f23Var.getAdapter().getItem(i);
                }
                f23Var.setText(f23Var.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = f23Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !sw2Var.G.isShowing() ? null : sw2Var.a.getSelectedView();
                        i = !sw2Var.G.isShowing() ? -1 : sw2Var.a.getSelectedItemPosition();
                        j = !sw2Var.G.isShowing() ? Long.MIN_VALUE : sw2Var.a.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(sw2Var.a, view, i, j);
                }
                sw2Var.dismiss();
                break;
        }
    }
}
