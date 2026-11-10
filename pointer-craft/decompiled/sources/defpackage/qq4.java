package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq4 extends i73 implements lm2 {
    public float d;
    public boolean e;
    public float f;
    public float k;
    public float o;

    @Override // defpackage.lm2
    public final int D(zy2 zy2Var, p33 p33Var, int i) {
        long jQ0 = Q0(zy2Var);
        if (ws0.x(jQ0)) {
            return ws0.j(jQ0);
        }
        if (!this.e) {
            i = zs0.l(i, jQ0);
        }
        return zs0.x(p33Var.Z(i), jQ0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long Q0(v33 v33Var) {
        int iV;
        int iV2;
        int iV3;
        int i = 0;
        if (Float.isNaN(this.k)) {
            iV = Integer.MAX_VALUE;
        } else {
            iV = v33Var.V(this.k);
            if (iV < 0) {
                iV = 0;
            }
        }
        if (Float.isNaN(this.d)) {
            iV2 = Integer.MAX_VALUE;
        } else {
            iV2 = v33Var.V(this.d);
            if (iV2 < 0) {
                iV2 = 0;
            }
        }
        if (Float.isNaN(this.o)) {
            iV3 = 0;
        } else {
            iV3 = v33Var.V(this.o);
            if (iV3 < 0) {
                iV3 = 0;
            }
            if (iV3 > iV) {
                iV3 = iV;
            }
            if (iV3 == Integer.MAX_VALUE) {
                iV3 = 0;
            }
        }
        if (!Float.isNaN(this.f)) {
            int iV4 = v33Var.V(this.f);
            if (iV4 < 0) {
                iV4 = 0;
            }
            if (iV4 > iV2) {
                iV4 = iV2;
            }
            if (iV4 != Integer.MAX_VALUE) {
                i = iV4;
            }
        }
        return zs0.g(iV3, iV, i, iV2);
    }

    @Override // defpackage.lm2
    public final int W(zy2 zy2Var, p33 p33Var, int i) {
        long jQ0 = Q0(zy2Var);
        if (ws0.l(jQ0)) {
            return ws0.t(jQ0);
        }
        if (!this.e) {
            i = zs0.x(i, jQ0);
        }
        return zs0.l(p33Var.P(i), jQ0);
    }

    @Override // defpackage.lm2
    public final int i(zy2 zy2Var, p33 p33Var, int i) {
        long jQ0 = Q0(zy2Var);
        if (ws0.x(jQ0)) {
            return ws0.j(jQ0);
        }
        if (!this.e) {
            i = zs0.l(i, jQ0);
        }
        return zs0.x(p33Var.x(i), jQ0);
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        int iM;
        int iT;
        int iA;
        int iJ;
        long jG;
        long jQ0 = Q0(v33Var);
        if (this.e) {
            jG = zs0.v(j, jQ0);
        } else {
            if (Float.isNaN(this.o)) {
                iM = ws0.m(j);
                int iT2 = ws0.t(jQ0);
                if (iM > iT2) {
                    iM = iT2;
                }
            } else {
                iM = ws0.m(jQ0);
            }
            if (Float.isNaN(this.k)) {
                iT = ws0.t(j);
                int iM2 = ws0.m(jQ0);
                if (iT < iM2) {
                    iT = iM2;
                }
            } else {
                iT = ws0.t(jQ0);
            }
            if (Float.isNaN(this.f)) {
                iA = ws0.a(j);
                int iJ2 = ws0.j(jQ0);
                if (iA > iJ2) {
                    iA = iJ2;
                }
            } else {
                iA = ws0.a(jQ0);
            }
            if (Float.isNaN(this.d)) {
                iJ = ws0.j(j);
                int iA2 = ws0.a(jQ0);
                if (iJ < iA2) {
                    iJ = iA2;
                }
            } else {
                iJ = ws0.j(jQ0);
            }
            jG = zs0.g(iM, iT, iA, iJ);
        }
        us3 us3VarV = p33Var.v(jG);
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new t9(us3VarV, (byte) 5));
    }

    @Override // defpackage.lm2
    public final int x(zy2 zy2Var, p33 p33Var, int i) {
        long jQ0 = Q0(zy2Var);
        if (ws0.l(jQ0)) {
            return ws0.t(jQ0);
        }
        if (!this.e) {
            i = zs0.x(i, jQ0);
        }
        return zs0.l(p33Var.Y(i), jQ0);
    }
}
