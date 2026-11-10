package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o30 extends i73 implements lm2, ej4 {
    public xy1 o;

    public o30(xy1 xy1Var) {
        this.o = xy1Var;
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        cn4 cn4Var;
        boolean z;
        gh3 gh3VarT = k33.T(this, 2);
        if (gh3VarT.U) {
            cn4Var = gh3VarT.Q;
            z = gh3VarT.T;
        } else {
            o84 o84Var = yf2.i;
            if (o84Var == null) {
                yf2.i = new o84();
            } else {
                o84Var.g();
            }
            o84 o84Var2 = yf2.i;
            o84Var2.getClass();
            o84Var2.A = gh3VarT.B.F;
            o84Var2.d = y94.N(gh3VarT.a);
            at4 at4VarM = js2.m();
            xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
            at4 at4VarB = js2.b(at4VarM);
            try {
                this.o.a(o84Var2);
                js2.z(at4VarM, at4VarB, xy1VarV);
                cn4Var = o84Var2.o;
                z = o84Var2.f;
            } catch (Throwable th) {
                js2.z(at4VarM, at4VarB, xy1VarV);
                throw th;
            }
        }
        if (z) {
            lj4.a(nj4Var, cn4Var);
        }
    }

    @Override // defpackage.ej4
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.o + ")";
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        us3 us3VarV = p33Var.v(j);
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new xf(us3VarV, this, (byte) 2));
    }
}
