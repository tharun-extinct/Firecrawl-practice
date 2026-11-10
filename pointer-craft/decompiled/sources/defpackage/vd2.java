package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class vd2 extends qd2 implements lm2 {
    public qo5 k;

    public vd2(qo5 qo5Var) {
        this.k = qo5Var;
    }

    @Override // defpackage.qd2
    public final qo5 Q0(qo5 qo5Var) {
        return new lg5(qo5Var, this.k);
    }

    @Override // defpackage.qd2
    public final void R0() {
        super.R0();
        c93.B(this);
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        int iN = this.f.n(v33Var, v33Var.getLayoutDirection()) - this.o.n(v33Var, v33Var.getLayoutDirection());
        int iY = this.f.y(v33Var) - this.o.y(v33Var);
        int iR = (this.f.r(v33Var, v33Var.getLayoutDirection()) - this.o.r(v33Var, v33Var.getLayoutDirection())) + iN;
        int iG = (this.f.g(v33Var) - this.o.g(v33Var)) + iY;
        us3 us3VarV = p33Var.v(zs0.t(-iR, -iG, j));
        return v33Var.k0(zs0.l(us3VarV.j + iR, j), zs0.x(us3VarV.t + iG, j), qi1.j, new ud2(us3VarV, iN, iY, (byte) 0));
    }
}
