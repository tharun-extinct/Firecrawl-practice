package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class we1 {
    public final xy1 g;
    public no1 n;
    public final tp3 r;
    public no1 v;
    public final q8 y;

    public we1(xe1 xe1Var, xy1 xy1Var) {
        this.g = xy1Var;
        qe5 qe5Var = ef3.g;
        c11 c11Var = h7.r;
        q21 q21Var = new q21((byte) 7);
        ie1 ie1Var = new ie1(this, (byte) 1);
        q8 q8Var = new q8(xe1Var, xy1Var);
        q8Var.y = q21Var;
        q8Var.r = ie1Var;
        q8Var.n = qe5Var;
        q8Var.v = c11Var;
        this.y = q8Var;
        this.r = kq2.M(null);
        this.n = m50.a0();
        this.v = m50.a0();
    }

    public static Object g(we1 we1Var, xe1 xe1Var, oi oiVar, zz4 zz4Var) {
        q8 q8Var = we1Var.y;
        Object objG = q8Var.g(xe1Var, ub3.j, new ve1(we1Var, q8Var.m.d(), oiVar, null, (byte) 0), zz4Var);
        return objG == px0.j ? objG : og5.g;
    }

    public final boolean r() {
        return ((xe1) this.y.j.getValue()) == xe1.t;
    }

    public final Object y(zz4 zz4Var) {
        Object objG = g(this, xe1.j, this.v, zz4Var);
        return objG == px0.j ? objG : og5.g;
    }
}
