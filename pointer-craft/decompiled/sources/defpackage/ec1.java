package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ec1 extends i73 implements hd5, xk2 {
    public ec1 f;
    public long k;
    public ec1 o;

    @Override // defpackage.i73
    public final void J0() {
        this.f = null;
        this.o = null;
    }

    public final boolean Q0() {
        ec1 ec1Var = this.o;
        if (ec1Var != null) {
            return ec1Var.Q0();
        }
        ec1 ec1Var2 = this.f;
        if (ec1Var2 != null) {
            return ec1Var2.Q0();
        }
        return false;
    }

    public final void R0() {
        ec1 ec1Var = this.f;
        if (ec1Var != null) {
            ec1Var.R0();
            return;
        }
        ec1 ec1Var2 = this.o;
        if (ec1Var2 != null) {
            ec1Var2.R0();
        }
    }

    public final void S0() {
        ec1 ec1Var = this.f;
        if (ec1Var != null) {
            ec1Var.S0();
        }
        ec1 ec1Var2 = this.o;
        if (ec1Var2 != null) {
            ec1Var2.S0();
        }
        this.o = null;
    }

    public final void T0(v92 v92Var) {
        hd5 hd5Var;
        ec1 ec1Var;
        ec1 ec1Var2 = this.o;
        if (ec1Var2 == null || !re6.n(ec1Var2, se6.y(v92Var))) {
            if (this.j.h) {
                u54 u54Var = new u54();
                sp2.A(this, new dc1(u54Var, this, v92Var));
                hd5Var = (hd5) u54Var.j;
            } else {
                hd5Var = null;
            }
            ec1Var = (ec1) hd5Var;
        } else {
            ec1Var = ec1Var2;
        }
        if (ec1Var != null && ec1Var2 == null) {
            re6.y(ec1Var, v92Var);
            ec1 ec1Var3 = this.f;
            if (ec1Var3 != null) {
                ec1Var3.S0();
            }
        } else if (ec1Var == null && ec1Var2 != null) {
            ec1 ec1Var4 = this.f;
            if (ec1Var4 != null) {
                re6.y(ec1Var4, v92Var);
            }
            ec1Var2.S0();
        } else if (!yf2.p(ec1Var, ec1Var2)) {
            if (ec1Var != null) {
                re6.y(ec1Var, v92Var);
            }
            if (ec1Var2 != null) {
                ec1Var2.S0();
            }
        } else if (ec1Var != null) {
            ec1Var.T0(v92Var);
        } else {
            ec1 ec1Var5 = this.f;
            if (ec1Var5 != null) {
                ec1Var5.T0(v92Var);
            }
        }
        this.o = ec1Var;
    }

    public final void U0() {
        ec1 ec1Var = this.f;
        if (ec1Var != null) {
            ec1Var.U0();
            return;
        }
        ec1 ec1Var2 = this.o;
        if (ec1Var2 != null) {
            ec1Var2.U0();
        }
    }

    @Override // defpackage.xk2, defpackage.x33
    public final void r(long j) {
        this.k = j;
    }

    @Override // defpackage.hd5
    public final Object s() {
        return l76.t;
    }
}
