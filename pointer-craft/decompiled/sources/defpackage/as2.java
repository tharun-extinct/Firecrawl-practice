package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class as2 extends i73 implements ej4 {
    public final yr2 A = new yr2(this, 0);
    public yr2 B;
    public boolean d;
    public cf4 e;
    public tr2 f;
    public um3 k;
    public my1 o;

    public as2(my1 my1Var, tr2 tr2Var, um3 um3Var, boolean z) {
        this.o = my1Var;
        this.f = tr2Var;
        this.k = um3Var;
        this.d = z;
        Q0();
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    public final void Q0() {
        this.e = new cf4(new zr2(this, (byte) 0), new zr2(this, (byte) 1));
        this.B = this.d ? new yr2(this, (byte) 1) : null;
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        ci2[] ci2VarArr;
        lj4.q(nj4Var);
        nj4Var.g(kj4.P, this.A);
        um3 um3Var = this.k;
        cf4 cf4Var = this.e;
        if (um3Var == um3.j) {
            if (cf4Var == null) {
                yf2.Y("scrollAxisRange");
                throw null;
            }
            mj4 mj4Var = kj4.f;
            ci2VarArr = lj4.g;
            ci2 ci2Var = ci2VarArr[13];
            mj4Var.getClass();
            nj4Var.g(mj4Var, cf4Var);
        } else {
            if (cf4Var == null) {
                yf2.Y("scrollAxisRange");
                throw null;
            }
            mj4 mj4Var2 = kj4.o;
            ci2VarArr = lj4.g;
            ci2 ci2Var2 = ci2VarArr[12];
            mj4Var2.getClass();
            nj4Var.g(mj4Var2, cf4Var);
        }
        yr2 yr2Var = this.B;
        if (yr2Var != null) {
            nj4Var.g(yi4.x, new p1(null, yr2Var));
        }
        nj4Var.g(yi4.C, new p1(null, new s94(new zr2(this, (byte) 2), (byte) 5)));
        bj0 bj0VarR = this.f.r();
        mj4 mj4Var3 = kj4.x;
        ci2 ci2Var3 = ci2VarArr[24];
        mj4Var3.getClass();
        nj4Var.g(mj4Var3, bj0VarR);
    }
}
