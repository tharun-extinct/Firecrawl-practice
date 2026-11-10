package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f43 extends BaseAdapter {
    public final i43 g;
    public final boolean n;
    public boolean r;
    public final LayoutInflater v;
    public final int x;
    public int y = -1;

    public f43(i43 i43Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.n = z;
        this.v = layoutInflater;
        this.g = i43Var;
        this.x = i;
        g();
    }

    public final void g() {
        i43 i43Var = this.g;
        n43 n43Var = i43Var.o;
        if (n43Var != null) {
            i43Var.a();
            ArrayList arrayList = i43Var.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((n43) arrayList.get(i)) == n43Var) {
                    this.y = i;
                    return;
                }
            }
        }
        this.y = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListW;
        boolean z = this.n;
        i43 i43Var = this.g;
        if (z) {
            i43Var.a();
            arrayListW = i43Var.a;
        } else {
            arrayListW = i43Var.w();
        }
        return this.y < 0 ? arrayListW.size() : arrayListW.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.v.inflate(this.x, viewGroup, false);
        }
        int i2 = getItem(i).y;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).y : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.g.c() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        g53 g53Var = (g53) view;
        if (this.r) {
            listMenuItemView.setForceShowIcon(true);
        }
        g53Var.r(getItem(i));
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
        ArrayList arrayListW;
        boolean z = this.n;
        i43 i43Var = this.g;
        if (z) {
            i43Var.a();
            arrayListW = i43Var.a;
        } else {
            arrayListW = i43Var.w();
        }
        int i2 = this.y;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (n43) arrayListW.get(i);
    }
}
