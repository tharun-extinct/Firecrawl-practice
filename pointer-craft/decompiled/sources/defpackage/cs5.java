package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cs5 extends i73 implements lm2 {
    public bz1 f;
    public da1 o;

    @Override // defpackage.lm2
    public final u33 v(final v33 v33Var, p33 p33Var, long j) {
        final us3 us3VarV = p33Var.v(zs0.g(this.o != da1.j ? 0 : ws0.m(j), ws0.t(j), this.o == da1.t ? ws0.a(j) : 0, ws0.j(j)));
        final int iW = xs2.w(us3VarV.j, ws0.m(j), ws0.t(j));
        final int iW2 = xs2.w(us3VarV.t, ws0.a(j), ws0.j(j));
        return v33Var.k0(iW, iW2, qi1.j, new xy1() { // from class: bs5
            @Override // defpackage.xy1
            public final Object a(Object obj) {
                bz1 bz1Var = this.j.f;
                us3 us3Var = us3VarV;
                ts3.a((ts3) obj, us3Var, ((je2) bz1Var.l(new qe2((((long) (iW - us3Var.j)) << 32) | (((long) (iW2 - us3Var.t)) & 4294967295L)), v33Var.getLayoutDirection())).g);
                return og5.g;
            }
        });
    }
}
