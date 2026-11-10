package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mw2 implements f53, AdapterView.OnItemClickListener {
    public i43 a;
    public Context j;
    public ExpandedMenuView m;
    public e53 q;
    public LayoutInflater t;
    public lw2 w;

    public mw2(ContextWrapper contextWrapper) {
        this.j = contextWrapper;
        this.t = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.f53
    public final boolean a(ly4 ly4Var) {
        if (!ly4Var.hasVisibleItems()) {
            return false;
        }
        k43 k43Var = new k43();
        k43Var.j = ly4Var;
        c6 c6Var = new c6(ly4Var.g);
        y5 y5Var = (y5) c6Var.y;
        mw2 mw2Var = new mw2(y5Var.g);
        k43Var.a = mw2Var;
        mw2Var.q = k43Var;
        ly4Var.y(mw2Var);
        y5Var.m = k43Var.a.g();
        y5Var.q = k43Var;
        View view = ly4Var.i;
        if (view != null) {
            y5Var.v = view;
        } else {
            y5Var.r = ly4Var.c;
            y5Var.n = ly4Var.w;
        }
        y5Var.a = k43Var;
        d6 d6VarV = c6Var.v();
        k43Var.t = d6VarV;
        d6VarV.setOnDismissListener(k43Var);
        WindowManager.LayoutParams attributes = k43Var.t.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        k43Var.t.show();
        e53 e53Var = this.q;
        if (e53Var == null) {
            return true;
        }
        e53Var.d(ly4Var);
        return true;
    }

    public final lw2 g() {
        lw2 lw2Var = this.w;
        if (lw2Var != null) {
            return lw2Var;
        }
        lw2 lw2Var2 = new lw2(this);
        this.w = lw2Var2;
        return lw2Var2;
    }

    @Override // defpackage.f53
    public final void l() {
        lw2 lw2Var = this.w;
        if (lw2Var != null) {
            lw2Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.f53
    public final boolean m() {
        return false;
    }

    @Override // defpackage.f53
    public final boolean n(n43 n43Var) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.p(this.w.getItem(i), this, 0);
    }

    public final h53 r(ViewGroup viewGroup) {
        if (this.m == null) {
            this.m = (ExpandedMenuView) this.t.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            lw2 lw2Var = this.w;
            if (lw2Var == null) {
                lw2Var = new lw2(this);
                this.w = lw2Var;
            }
            this.m.setAdapter((ListAdapter) lw2Var);
            this.m.setOnItemClickListener(this);
        }
        return this.m;
    }

    @Override // defpackage.f53
    public final void t(Context context, i43 i43Var) {
        if (this.j != null) {
            this.j = context;
            if (this.t == null) {
                this.t = LayoutInflater.from(context);
            }
        }
        this.a = i43Var;
        lw2 lw2Var = this.w;
        if (lw2Var != null) {
            lw2Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.f53
    public final void v(e53 e53Var) {
        this.q = e53Var;
    }

    @Override // defpackage.f53
    public final boolean x(n43 n43Var) {
        return false;
    }

    @Override // defpackage.f53
    public final void y(i43 i43Var, boolean z) {
        e53 e53Var = this.q;
        if (e53Var != null) {
            e53Var.y(i43Var, z);
        }
    }
}
