package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rc2 extends bz2 {
    public rc2(sc2 sc2Var) {
        super(sc2Var);
    }

    @Override // defpackage.p33
    public final int P(int i) {
        ji jiVarH = this.B.B.h();
        t33 t33VarF = jiVarH.F();
        um2 um2Var = (um2) jiVarH.t;
        return t33VarF.v(um2Var.M.n, um2Var.w(), i);
    }

    @Override // defpackage.bz2
    public final void Q0() {
        fz2 fz2Var = this.B.B.N.s;
        fz2Var.getClass();
        fz2Var.N0();
    }

    @Override // defpackage.p33
    public final int Y(int i) {
        ji jiVarH = this.B.B.h();
        t33 t33VarF = jiVarH.F();
        um2 um2Var = (um2) jiVarH.t;
        return t33VarF.y(um2Var.M.n, um2Var.w(), i);
    }

    @Override // defpackage.p33
    public final int Z(int i) {
        ji jiVarH = this.B.B.h();
        t33 t33VarF = jiVarH.F();
        um2 um2Var = (um2) jiVarH.t;
        return t33VarF.n(um2Var.M.n, um2Var.w(), i);
    }

    @Override // defpackage.zy2
    public final int u0(v6 v6Var) {
        fz2 fz2Var = this.B.B.N.s;
        fz2Var.getClass();
        vy2 vy2Var = fz2Var.e;
        if (!fz2Var.p) {
            ym2 ym2Var = fz2Var.w;
            if (ym2Var.n == qm2.t) {
                vy2Var.x = true;
                if (vy2Var.y) {
                    ym2Var.x = true;
                    ym2Var.l = true;
                }
            } else {
                vy2Var.l = true;
            }
        }
        rc2 rc2Var = fz2Var.i().k0;
        Boolean boolValueOf = rc2Var != null ? Boolean.valueOf(rc2Var.o) : null;
        rc2 rc2Var2 = fz2Var.i().k0;
        if (rc2Var2 != null) {
            rc2Var2.o = true;
        }
        fz2Var.s();
        rc2 rc2Var3 = fz2Var.i().k0;
        if (rc2Var3 != null) {
            rc2Var3.o = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) vy2Var.t.get(v6Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.G.l(iIntValue, v6Var);
        return iIntValue;
    }

    @Override // defpackage.p33
    public final us3 v(long j) {
        p0(j);
        gh3 gh3Var = this.B;
        rb3 rb3VarB = gh3Var.B.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            fz2 fz2Var = ((um2) objArr[i2]).N.s;
            fz2Var.getClass();
            fz2Var.s = sm2.a;
        }
        um2 um2Var = gh3Var.B;
        T0(um2Var.D.r(this, um2Var.w(), j));
        return this;
    }

    @Override // defpackage.p33
    public final int x(int i) {
        ji jiVarH = this.B.B.h();
        t33 t33VarF = jiVarH.F();
        um2 um2Var = (um2) jiVarH.t;
        return t33VarF.g(um2Var.M.n, um2Var.w(), i);
    }
}
