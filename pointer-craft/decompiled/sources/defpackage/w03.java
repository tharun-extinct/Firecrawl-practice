package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w03 implements vv3 {
    public fl2 a;
    public final fa4 j;
    public qe2 m;
    public je2 q;
    public qe2 t;

    public w03(fa4 fa4Var) {
        this.j = fa4Var;
    }

    @Override // defpackage.vv3
    public final long v(ne2 ne2Var, long j, fl2 fl2Var, long j2) {
        je2 je2Var = this.q;
        if (je2Var != null) {
            qe2 qe2Var = this.t;
            if ((qe2Var == null ? false : qe2.g(qe2Var.g, j)) && this.a == fl2Var) {
                qe2 qe2Var2 = this.m;
                if (qe2Var2 != null ? qe2.g(qe2Var2.g, j2) : false) {
                    return je2Var.g;
                }
            }
        }
        long jV = this.j.v(ne2Var, j, fl2Var, j2);
        this.t = new qe2(j);
        this.a = fl2Var;
        this.m = new qe2(j2);
        this.q = new je2(jV);
        return jV;
    }
}
