package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cd5 extends at4 {
    public xy1 j;
    public final boolean l;
    public final long t;
    public final at4 v;
    public final boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd5(at4 at4Var, xy1 xy1Var, boolean z, boolean z2) {
        xy1 xy1VarV;
        super(0L, gt4.q);
        nd4 nd4Var = it4.g;
        this.v = at4Var;
        this.x = z;
        this.l = z2;
        this.j = it4.t(xy1Var, (at4Var == null || (xy1VarV = at4Var.v()) == null) ? it4.a.v : xy1VarV, z);
        this.t = zq2.j();
    }

    @Override // defpackage.at4
    public final void c(ww4 ww4Var) {
        o().c(ww4Var);
    }

    @Override // defpackage.at4
    public final at4 h(xy1 xy1Var) {
        xy1 xy1VarT = it4.t(xy1Var, this.j, true);
        return !this.x ? it4.v(o().h(null), xy1VarT, true) : o().h(xy1VarT);
    }

    @Override // defpackage.at4
    public final long l() {
        return o().l();
    }

    @Override // defpackage.at4
    public final void m() {
        gg6.r();
        throw null;
    }

    @Override // defpackage.at4
    public final gt4 n() {
        return o().n();
    }

    public final at4 o() {
        at4 at4Var = this.v;
        return at4Var == null ? it4.a : at4Var;
    }

    @Override // defpackage.at4
    public final void q() {
        gg6.r();
        throw null;
    }

    @Override // defpackage.at4
    public final void r() {
        at4 at4Var;
        this.r = true;
        if (!this.l || (at4Var = this.v) == null) {
            return;
        }
        at4Var.r();
    }

    @Override // defpackage.at4
    public final xy1 t() {
        return null;
    }

    @Override // defpackage.at4
    public final xy1 v() {
        return this.j;
    }

    @Override // defpackage.at4
    public final void w() {
        o().w();
    }

    @Override // defpackage.at4
    public final boolean x() {
        return o().x();
    }
}
