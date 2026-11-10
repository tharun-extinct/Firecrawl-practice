package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nm2 extends gh3 {
    public static final cd l0;
    public lm2 j0;
    public mm2 k0;

    static {
        cd cdVarP = ue5.p();
        int i = jj0.t;
        cdVarP.x(jj0.x);
        cdVarP.q(1.0f);
        cdVarP.w(1);
        l0 = cdVarP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nm2(um2 um2Var, lm2 lm2Var) {
        super(um2Var);
        this.j0 = lm2Var;
        this.k0 = um2Var.i != null ? new mm2(this) : null;
        if ((((i73) lm2Var).j.a & 512) == 0) {
            return;
        }
        uo1.B();
        throw null;
    }

    public final void B1() {
        if (this.h) {
            return;
        }
        k1();
        gh3 gh3Var = this.C;
        gh3Var.getClass();
        boolean z = gh3Var.o;
        gh3Var.o = this.o;
        F0().n();
        gh3Var.o = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C1(lm2 lm2Var) {
        if (lm2Var.equals(this.j0) || (((i73) lm2Var).j.a & 512) == 0) {
            this.j0 = lm2Var;
        } else {
            uo1.B();
        }
    }

    @Override // defpackage.p33
    public final int P(int i) {
        lm2 lm2Var = this.j0;
        gh3 gh3Var = this.C;
        gh3Var.getClass();
        return lm2Var.W(this, gh3Var, i);
    }

    @Override // defpackage.gh3
    public final void T0() {
        if (this.k0 == null) {
            this.k0 = new mm2(this);
        }
    }

    @Override // defpackage.gh3
    public final bz2 W0() {
        return this.k0;
    }

    @Override // defpackage.p33
    public final int Y(int i) {
        lm2 lm2Var = this.j0;
        gh3 gh3Var = this.C;
        gh3Var.getClass();
        return lm2Var.x(this, gh3Var, i);
    }

    @Override // defpackage.gh3
    public final i73 Y0() {
        return ((i73) this.j0).j;
    }

    @Override // defpackage.p33
    public final int Z(int i) {
        lm2 lm2Var = this.j0;
        gh3 gh3Var = this.C;
        gh3Var.getClass();
        return lm2Var.D(this, gh3Var, i);
    }

    @Override // defpackage.us3
    public final void l0(long j, float f, xy1 xy1Var) {
        p1(j, f, xy1Var, null);
        B1();
    }

    @Override // defpackage.gh3, defpackage.us3
    public final void m0(long j, float f, x32 x32Var) {
        p1(j, f, null, x32Var);
        B1();
    }

    @Override // defpackage.gh3
    public final void o1(nb0 nb0Var, x32 x32Var) throws Throwable {
        gh3 gh3Var;
        gh3 gh3Var2 = this.C;
        gh3Var2.getClass();
        gh3Var2.R0(nb0Var, x32Var);
        if (!((ba) xm2.g(this.B)).getShowLayoutBounds() || (gh3Var = this.C) == null) {
            return;
        }
        if (qe2.g(this.a, gh3Var.a) && je2.y(gh3Var.M, 0L)) {
            return;
        }
        long j = this.a;
        nb0Var.b(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, l0);
    }

    @Override // defpackage.zy2
    public final int u0(v6 v6Var) {
        mm2 mm2Var = this.k0;
        return mm2Var != null ? mm2Var.N0(v6Var) : k33.k(this, v6Var);
    }

    @Override // defpackage.p33
    public final us3 v(long j) {
        p0(j);
        lm2 lm2Var = this.j0;
        gh3 gh3Var = this.C;
        gh3Var.getClass();
        s1(lm2Var.v(this, gh3Var, j));
        j1();
        return this;
    }

    @Override // defpackage.p33
    public final int x(int i) {
        lm2 lm2Var = this.j0;
        gh3 gh3Var = this.C;
        gh3Var.getClass();
        return lm2Var.i(this, gh3Var, i);
    }
}
