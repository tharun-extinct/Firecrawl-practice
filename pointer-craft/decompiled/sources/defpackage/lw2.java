package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lw2 extends BaseAdapter {
    public int g = -1;
    public final /* synthetic */ mw2 y;

    public lw2(mw2 mw2Var) {
        this.y = mw2Var;
        g();
    }

    public final void g() {
        i43 i43Var = this.y.a;
        n43 n43Var = i43Var.o;
        if (n43Var != null) {
            i43Var.a();
            ArrayList arrayList = i43Var.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((n43) arrayList.get(i)) == n43Var) {
                    this.g = i;
                    return;
                }
            }
        }
        this.g = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i43 i43Var = this.y.a;
        i43Var.a();
        int size = i43Var.a.size();
        return this.g < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.y.t.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((g53) view).r(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        g();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final n43 getItem(int i) {
        i43 i43Var = this.y.a;
        i43Var.a();
        ArrayList arrayList = i43Var.a;
        int i2 = this.g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (n43) arrayList.get(i);
    }
}
