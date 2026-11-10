package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fy4 extends p41 implements tu3, ct1, tt1 {
    public boolean d;
    public final g05 e;
    public my1 k;

    public fy4(my1 my1Var) {
        this.k = my1Var;
        qm1 qm1Var = new qm1(this, (byte) 3);
        ju3 ju3Var = b05.g;
        g05 g05Var = new g05(null, null, qm1Var);
        Q0(g05Var);
        this.e = g05Var;
    }

    @Override // defpackage.tu3
    public final void L(ju3 ju3Var, ku3 ku3Var, long j) {
        this.e.L(ju3Var, ku3Var, j);
    }

    @Override // defpackage.ct1
    public final void c0(xt1 xt1Var) {
        this.d = xt1Var.y();
    }

    @Override // defpackage.tu3
    public final void m0() {
        this.e.m0();
    }

    @Override // defpackage.tu3
    public final long p() {
        j51 j51Var = k33.V(this).F;
        qe6.g.getClass();
        int i = eb5.y;
        return az5.x(j51Var.V(10.0f), j51Var.V(40.0f), j51Var.V(10.0f), j51Var.V(40.0f));
    }
}
