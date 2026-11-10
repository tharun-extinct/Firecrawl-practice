package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gq4 extends om2 {
    public boolean d;
    public zu4 o;
    public long f = -9223372034707292160L;
    public long k = zs0.y(0, 0, 0, 0, 15);
    public final tp3 e = kq2.M(null);

    public gq4(zu4 zu4Var) {
        this.o = zu4Var;
    }

    @Override // defpackage.i73
    public final void I0() {
        this.f = -9223372034707292160L;
        this.d = false;
    }

    @Override // defpackage.i73
    public final void K0() {
        this.e.setValue(null);
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        us3 us3VarV;
        eq4 eq4Var;
        long jN;
        eq4 eq4Var2;
        if (v33Var.u()) {
            this.k = j;
            this.d = true;
            us3VarV = p33Var.v(j);
        } else {
            us3VarV = p33Var.v(this.d ? this.k : j);
        }
        us3 us3Var = us3VarV;
        char c = ' ';
        long j2 = (((long) us3Var.t) & 4294967295L) | (((long) us3Var.j) << 32);
        if (v33Var.u()) {
            this.f = j2;
            c = ' ';
            jN = j2;
            j2 = jN;
        } else {
            long j3 = !qe2.g(this.f, -9223372034707292160L) ? this.f : j2;
            tp3 tp3Var = this.e;
            eq4 eq4Var3 = (eq4) tp3Var.getValue();
            if (eq4Var3 != null) {
                qg qgVar = eq4Var3.g;
                boolean z = (qe2.g(j3, ((qe2) qgVar.n()).g) || ((Boolean) qgVar.n.getValue()).booleanValue()) ? false : true;
                if (!qe2.g(j3, ((qe2) qgVar.v.getValue()).g) || z) {
                    eq4Var3.y = ((qe2) qgVar.n()).g;
                    eq4Var2 = eq4Var3;
                    m50.T(E0(), null, new od1(eq4Var2, j3, this, null), 3);
                } else {
                    eq4Var2 = eq4Var3;
                }
                eq4Var = eq4Var2;
            } else {
                long j4 = j3;
                eq4Var = new eq4(new qg(new qe2(j4), m50.z, new qe2(4294967297L), 8), j4);
            }
            tp3Var.setValue(eq4Var);
            jN = zs0.n(j, ((qe2) eq4Var.g.n()).g);
        }
        int i = (int) (jN >> c);
        int i2 = (int) (jN & 4294967295L);
        return v33Var.k0(i, i2, qi1.j, new fq4(this, j2, i, i2, v33Var, us3Var));
    }
}
