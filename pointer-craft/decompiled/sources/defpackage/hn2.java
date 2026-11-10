package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hn2 implements oy4 {
    public final ia3 g;
    public final /* synthetic */ Object r;
    public final /* synthetic */ in2 y;

    public hn2(in2 in2Var, Object obj) {
        this.y = in2Var;
        this.r = obj;
        int[] iArr = pe2.g;
        this.g = new ia3();
    }

    @Override // defpackage.oy4
    public final void g() {
        this.y.j(this.r);
    }

    @Override // defpackage.oy4
    public final void n(int i, long j) {
        in2 in2Var = this.y;
        um2 um2Var = (um2) in2Var.s.l(this.r);
        if (um2Var == null || !um2Var.J()) {
            return;
        }
        int i2 = ((qb3) um2Var.i()).j.a;
        if (i < 0 || i >= i2) {
            mc2.n("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (um2Var.K()) {
            mc2.g("Pre-measure called on node that is not placed");
        }
        um2 um2Var2 = in2Var.j;
        um2Var2.k = true;
        ((ba) xm2.g(um2Var)).e((um2) ((qb3) um2Var.i()).get(i), j);
        um2Var2.k = false;
        this.g.g(i);
    }

    @Override // defpackage.oy4
    public final int r() {
        um2 um2Var = (um2) this.y.s.l(this.r);
        if (um2Var != null) {
            return ((qb3) um2Var.i()).j.a;
        }
        return 0;
    }

    @Override // defpackage.oy4
    public final void y(j9 j9Var) {
        ah3 ah3Var;
        um2 um2Var = (um2) this.y.s.l(this.r);
        i73 i73Var = (um2Var == null || (ah3Var = um2Var.M) == null) ? null : ah3Var.x;
        if (i73Var == null || !i73Var.h) {
            return;
        }
        sp2.e(i73Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", j9Var);
    }
}
