package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class cf implements e45 {
    public Runnable a;
    public final View g;
    public ActionMode j;
    public final my1 r;
    public bf t;
    public final xy1 y;
    public final ac3 n = new ac3();
    public final ut4 v = new ut4(new ve(this, 0));
    public final ve x = new ve(this, 1);
    public final ve l = new ve(this, 2);

    public cf(View view, xy1 xy1Var, my1 my1Var) {
        this.g = view;
        this.y = xy1Var;
        this.r = my1Var;
    }

    @Override // defpackage.e45
    public final Object g(w35 w35Var, zz4 zz4Var) {
        mu0 mu0Var = null;
        h8 h8Var = new h8(this, w35Var, mu0Var, (byte) 2);
        ac3 ac3Var = this.n;
        ac3Var.getClass();
        Object objB = k33.B(new jf2(ub3.j, ac3Var, h8Var, mu0Var, (byte) 1), zz4Var);
        return objB == px0.j ? objB : og5.g;
    }
}
