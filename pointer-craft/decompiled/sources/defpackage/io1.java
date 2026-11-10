package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class io1 extends i73 implements lm2 {
    public float f;
    public da1 o;

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        int iM;
        int iT;
        int iJ;
        int i;
        if (!ws0.v(j) || this.o == da1.j) {
            iM = ws0.m(j);
            iT = ws0.t(j);
        } else {
            int iRound = Math.round(ws0.t(j) * this.f);
            int iM2 = ws0.m(j);
            iM = ws0.t(j);
            if (iRound < iM2) {
                iRound = iM2;
            }
            if (iRound <= iM) {
                iM = iRound;
            }
            iT = iM;
        }
        if (!ws0.n(j) || this.o == da1.t) {
            int iA = ws0.a(j);
            int iJ2 = ws0.j(j);
            iJ = iA;
            i = iJ2;
        } else {
            int iRound2 = Math.round(ws0.j(j) * this.f);
            int iA2 = ws0.a(j);
            iJ = ws0.j(j);
            if (iRound2 < iA2) {
                iRound2 = iA2;
            }
            if (iRound2 <= iJ) {
                iJ = iRound2;
            }
            i = iJ;
        }
        us3 us3VarV = p33Var.v(zs0.g(iM, iT, iJ, i));
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new t9(us3VarV, (byte) 1));
    }
}
