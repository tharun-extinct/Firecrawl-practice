package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iq3 implements fq0 {
    public final bz1 a;
    public final ub4 j;
    public final o05 m = new o05(new gf(this, (byte) 25));
    public final String t;

    public iq3(ub4 ub4Var, String str, bz1 bz1Var) {
        this.j = ub4Var;
        this.t = str;
        this.a = bz1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        o05 o05Var = this.m;
        if (o05Var.g()) {
            ((tb4) o05Var.getValue()).close();
        }
    }

    @Override // defpackage.fq0
    public final Object s(boolean z, bz1 bz1Var, ou0 ou0Var) {
        hq3 hq3Var = (hq3) ou0Var.v().h(hq3.t);
        gq3 gq3Var = hq3Var != null ? hq3Var.j : null;
        if (gq3Var != null) {
            return bz1Var.l(gq3Var, ou0Var);
        }
        gq3 gq3Var2 = new gq3(this.a, (tb4) this.m.getValue());
        return m50.f0(new hq3(gq3Var2), new op(bz1Var, gq3Var2, null, (byte) 12), ou0Var);
    }
}
