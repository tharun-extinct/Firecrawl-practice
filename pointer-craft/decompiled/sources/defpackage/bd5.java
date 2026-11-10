package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bd5 extends nb3 {
    public final boolean b;
    public final nb3 i;
    public xy1 p;
    public final boolean s;
    public xy1 u;
    public final long z;

    /* JADX WARN: Illegal instructions before constructor call */
    public bd5(nb3 nb3Var, xy1 xy1Var, xy1 xy1Var2, boolean z, boolean z2) {
        xy1 xy1VarT;
        xy1 xy1VarD;
        nd4 nd4Var = it4.g;
        super(0L, gt4.q, it4.t(xy1Var, (nb3Var == null || (xy1VarD = nb3Var.v()) == null) ? it4.a.v : xy1VarD, z), it4.a(xy1Var2, (nb3Var == null || (xy1VarT = nb3Var.t()) == null) ? it4.a.x : xy1VarT));
        this.i = nb3Var;
        this.b = z;
        this.s = z2;
        this.p = this.v;
        this.u = this.x;
        this.z = zq2.j();
    }

    @Override // defpackage.nb3
    public final void B(ib3 ib3Var) {
        gg6.r();
        throw null;
    }

    @Override // defpackage.nb3
    public final nb3 C(xy1 xy1Var, xy1 xy1Var2) {
        xy1 xy1VarT = it4.t(xy1Var, this.p, true);
        xy1 xy1VarA = it4.a(xy1Var2, this.u);
        return !this.b ? new bd5(D().C(null, xy1VarA), xy1VarT, xy1VarA, false, true) : D().C(xy1VarT, xy1VarA);
    }

    public final nb3 D() {
        nb3 nb3Var = this.i;
        return nb3Var == null ? it4.a : nb3Var;
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void c(ww4 ww4Var) {
        D().c(ww4Var);
    }

    @Override // defpackage.nb3
    /* JADX INFO: renamed from: d */
    public final xy1 v() {
        return this.p;
    }

    @Override // defpackage.nb3
    public final xs2 f() {
        return D().f();
    }

    @Override // defpackage.nb3, defpackage.at4
    public final at4 h(xy1 xy1Var) {
        xy1 xy1VarT = it4.t(xy1Var, this.p, true);
        return !this.b ? it4.v(D().h(null), xy1VarT, true) : D().h(xy1VarT);
    }

    @Override // defpackage.nb3, defpackage.at4
    public final int j() {
        return D().j();
    }

    @Override // defpackage.nb3
    public final ib3 k() {
        return D().k();
    }

    @Override // defpackage.at4
    public final long l() {
        return D().l();
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void m() {
        gg6.r();
        throw null;
    }

    @Override // defpackage.at4
    public final gt4 n() {
        return D().n();
    }

    @Override // defpackage.at4
    public final void p(gt4 gt4Var) {
        gg6.r();
        throw null;
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void q() {
        gg6.r();
        throw null;
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void r() {
        nb3 nb3Var;
        this.r = true;
        if (!this.s || (nb3Var = this.i) == null) {
            return;
        }
        nb3Var.r();
    }

    @Override // defpackage.nb3, defpackage.at4
    public final xy1 t() {
        return this.u;
    }

    @Override // defpackage.at4
    public final void u(long j) {
        gg6.r();
        throw null;
    }

    @Override // defpackage.nb3, defpackage.at4
    public final xy1 v() {
        return this.p;
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void w() {
        D().w();
    }

    @Override // defpackage.at4
    public final boolean x() {
        return D().x();
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void z(int i) {
        D().z(i);
    }
}
