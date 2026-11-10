package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gv4 {
    public final int v;
    public final /* synthetic */ StaggeredGridLayoutManager x;
    public final ArrayList g = new ArrayList();
    public int y = Integer.MIN_VALUE;
    public int r = Integer.MIN_VALUE;
    public int n = 0;

    public gv4(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.x = staggeredGridLayoutManager;
        this.v = i;
    }

    public final void g() {
        ArrayList arrayList = this.g;
        View view = (View) arrayList.get(arrayList.size() - 1);
        dv4 dv4Var = (dv4) view.getLayoutParams();
        this.r = this.x.d.y(view);
        dv4Var.getClass();
    }

    public final int j(int i) {
        int i2 = this.y;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.g;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        dv4 dv4Var = (dv4) view.getLayoutParams();
        this.y = this.x.d.v(view);
        dv4Var.getClass();
        return this.y;
    }

    public final View l(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.x;
        View view = null;
        ArrayList arrayList = this.g;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.D && g.R(view2) >= i) || ((!staggeredGridLayoutManager.D && g.R(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.D && g.R(view3) <= i) || ((!staggeredGridLayoutManager.D && g.R(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public final int n() {
        boolean z = this.x.D;
        ArrayList arrayList = this.g;
        return z ? v(0, arrayList.size()) : v(arrayList.size() - 1, -1);
    }

    public final int r() {
        boolean z = this.x.D;
        ArrayList arrayList = this.g;
        return z ? v(arrayList.size() - 1, -1) : v(0, arrayList.size());
    }

    public final int v(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.x;
        int iA = staggeredGridLayoutManager.d.a();
        int iL = staggeredGridLayoutManager.d.l();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.g.get(i);
            int iV = staggeredGridLayoutManager.d.v(view);
            int iY = staggeredGridLayoutManager.d.y(view);
            boolean z = iV <= iL;
            boolean z2 = iY >= iA;
            if (z && z2 && (iV < iA || iY > iL)) {
                return g.R(view);
            }
            i += i3;
        }
        return -1;
    }

    public final int x(int i) {
        int i2 = this.r;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.g.size() == 0) {
            return i;
        }
        g();
        return this.r;
    }

    public final void y() {
        this.g.clear();
        this.y = Integer.MIN_VALUE;
        this.r = Integer.MIN_VALUE;
        this.n = 0;
    }
}
