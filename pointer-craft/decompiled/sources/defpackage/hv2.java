package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hv2 {
    public int a;
    public boolean g;
    public int j;
    public int l;
    public List m;
    public int n;
    public boolean q;
    public int r;
    public int t;
    public int v;
    public int x;
    public int y;

    public final void g(View view) {
        int iN;
        int size = this.m.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((n54) this.m.get(i2)).g;
            y44 y44Var = (y44) view3.getLayoutParams();
            if (view3 != view && !y44Var.j.a() && (iN = (y44Var.j.n() - this.n) * this.v) >= 0 && iN < i) {
                view2 = view3;
                if (iN == 0) {
                    break;
                } else {
                    i = iN;
                }
            }
        }
        if (view2 == null) {
            this.n = -1;
        } else {
            this.n = ((y44) view2.getLayoutParams()).j.n();
        }
    }

    public final View y(e54 e54Var) {
        List list = this.m;
        if (list == null) {
            View viewN = e54Var.n(this.n);
            this.n += this.v;
            return viewN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((n54) this.m.get(i)).g;
            y44 y44Var = (y44) view.getLayoutParams();
            if (!y44Var.j.a() && this.n == y44Var.j.n()) {
                g(view);
                return view;
            }
        }
        return null;
    }
}
