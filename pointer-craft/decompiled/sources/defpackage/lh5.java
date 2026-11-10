package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lh5 extends i73 implements lm2 {
    public float f;
    public float o;

    @Override // defpackage.lm2
    public final int D(zy2 zy2Var, p33 p33Var, int i) {
        int iZ = p33Var.Z(i);
        int iV = !Float.isNaN(this.f) ? zy2Var.V(this.f) : 0;
        return iZ < iV ? iV : iZ;
    }

    @Override // defpackage.lm2
    public final int W(zy2 zy2Var, p33 p33Var, int i) {
        int iP = p33Var.P(i);
        int iV = !Float.isNaN(this.o) ? zy2Var.V(this.o) : 0;
        return iP < iV ? iV : iP;
    }

    @Override // defpackage.lm2
    public final int i(zy2 zy2Var, p33 p33Var, int i) {
        int iX = p33Var.x(i);
        int iV = !Float.isNaN(this.f) ? zy2Var.V(this.f) : 0;
        return iX < iV ? iV : iX;
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        int iM;
        int iA;
        if (Float.isNaN(this.o) || ws0.m(j) != 0) {
            iM = ws0.m(j);
        } else {
            int iV = v33Var.V(this.o);
            iM = ws0.t(j);
            if (iV < 0) {
                iV = 0;
            }
            if (iV <= iM) {
                iM = iV;
            }
        }
        int iT = ws0.t(j);
        if (Float.isNaN(this.f) || ws0.a(j) != 0) {
            iA = ws0.a(j);
        } else {
            int iV2 = v33Var.V(this.f);
            iA = ws0.j(j);
            int i = iV2 >= 0 ? iV2 : 0;
            if (i <= iA) {
                iA = i;
            }
        }
        us3 us3VarV = p33Var.v(zs0.g(iM, iT, iA, ws0.j(j)));
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new t9(us3VarV, (byte) 8));
    }

    @Override // defpackage.lm2
    public final int x(zy2 zy2Var, p33 p33Var, int i) {
        int iY = p33Var.Y(i);
        int iV = !Float.isNaN(this.o) ? zy2Var.V(this.o) : 0;
        return iY < iV ? iV : iY;
    }
}
