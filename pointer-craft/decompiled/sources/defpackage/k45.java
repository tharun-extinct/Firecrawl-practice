package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k45 extends p41 implements zo0, w35 {
    public pw0 A;
    public iv4 B;
    public final z51 C = pt4.y(new m63(this, 7));
    public k44 D = k44.v;
    public u55 d;
    public v55 e;
    public rk4 k;

    public k45(rk4 rk4Var, u55 u55Var, v55 v55Var, pw0 pw0Var) {
        this.k = rk4Var;
        this.d = u55Var;
        this.e = v55Var;
        this.A = pw0Var;
    }

    @Override // defpackage.i73
    public final void I0() {
        rk4 rk4Var = this.k;
        rk4Var.a = ma5.a;
        rk4Var.t = this;
    }

    @Override // defpackage.i73
    public final void J0() {
        rk4 rk4Var = this.k;
        rk4Var.a = ma5.t;
        rk4Var.t = null;
    }

    @Override // defpackage.w35
    public final k44 c(bl2 bl2Var) {
        if (!this.h) {
            return this.D;
        }
        k44 k44Var = (k44) this.A.a(bl2Var);
        if (k44Var == null) {
            return this.D;
        }
        this.D = k44Var;
        return k44Var;
    }

    @Override // defpackage.w35
    public final long j(bl2 bl2Var) {
        return c(bl2Var).n();
    }

    @Override // defpackage.w35
    public final v35 z0() {
        return (v35) this.C.getValue();
    }
}
