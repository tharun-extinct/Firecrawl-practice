package defpackage;

import android.view.GestureDetector;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b83 extends GestureDetector.SimpleOnGestureListener {
    public final d31 g;

    public b83(d31 d31Var, fa4 fa4Var, bi6 bi6Var) {
        this.g = d31Var;
    }

    public final void g(gm2 gm2Var) {
        vk2 vk2Var = gm2Var.g;
        xs2.l(vk2Var.r() != -1);
        gm2Var.g();
        Long lG = gm2Var.g();
        d31 d31Var = this.g;
        if (d31Var.m(lG)) {
            int iR = vk2Var.r();
            xs2.l(iR != -1);
            xs2.l(d31Var.g.contains(d31Var.r.D(iR)));
            d31Var.j = new hs0(iR, d31Var.v);
        }
        hi4 hi4Var = d31Var.g;
        hi4Var.j.size();
        hi4Var.t.size();
    }
}
