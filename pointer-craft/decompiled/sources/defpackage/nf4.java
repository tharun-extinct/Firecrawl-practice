package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nf4 extends i73 implements lm2, ej4 {
    public boolean f;
    public rf4 o;

    @Override // defpackage.lm2
    public final int D(zy2 zy2Var, p33 p33Var, int i) {
        if (!this.f) {
            i = Integer.MAX_VALUE;
        }
        return p33Var.Z(i);
    }

    @Override // defpackage.lm2
    public final int W(zy2 zy2Var, p33 p33Var, int i) {
        if (this.f) {
            i = Integer.MAX_VALUE;
        }
        return p33Var.P(i);
    }

    @Override // defpackage.lm2
    public final int i(zy2 zy2Var, p33 p33Var, int i) {
        if (!this.f) {
            i = Integer.MAX_VALUE;
        }
        return p33Var.x(i);
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        lj4.q(nj4Var);
        final byte b = 0;
        final byte b2 = 1;
        cf4 cf4Var = new cf4(new my1(this) { // from class: mf4
            public final /* synthetic */ nf4 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                int iD;
                byte b3 = b;
                nf4 nf4Var = this.t;
                switch (b3) {
                    case 0:
                        iD = nf4Var.o.g.d();
                        break;
                    default:
                        iD = nf4Var.o.x.d();
                        break;
                }
                return Float.valueOf(iD);
            }
        }, new my1(this) { // from class: mf4
            public final /* synthetic */ nf4 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                int iD;
                byte b3 = b2;
                nf4 nf4Var = this.t;
                switch (b3) {
                    case 0:
                        iD = nf4Var.o.g.d();
                        break;
                    default:
                        iD = nf4Var.o.x.d();
                        break;
                }
                return Float.valueOf(iD);
            }
        });
        if (this.f) {
            mj4 mj4Var = kj4.f;
            ci2 ci2Var = lj4.g[13];
            mj4Var.getClass();
            nj4Var.g(mj4Var, cf4Var);
            return;
        }
        mj4 mj4Var2 = kj4.o;
        ci2 ci2Var2 = lj4.g[12];
        mj4Var2.getClass();
        nj4Var.g(mj4Var2, cf4Var);
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        yf2.h(j, this.f ? um3.j : um3.t);
        us3 us3VarV = p33Var.v(ws0.y(j, 0, this.f ? ws0.t(j) : Integer.MAX_VALUE, 0, this.f ? Integer.MAX_VALUE : ws0.j(j), 5));
        int i = us3VarV.j;
        int iT = ws0.t(j);
        if (i > iT) {
            i = iT;
        }
        int i2 = us3VarV.t;
        int iJ = ws0.j(j);
        if (i2 > iJ) {
            i2 = iJ;
        }
        int i3 = us3VarV.t - i2;
        int i4 = us3VarV.j - i;
        if (!this.f) {
            i3 = i4;
        }
        rf4 rf4Var = this.o;
        qp3 qp3Var = rf4Var.x;
        qp3 qp3Var2 = rf4Var.g;
        qp3Var.e(i3);
        at4 at4VarM = js2.m();
        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
        at4 at4VarB = js2.b(at4VarM);
        try {
            if (qp3Var2.d() > i3) {
                qp3Var2.e(i3);
            }
            js2.z(at4VarM, at4VarB, xy1VarV);
            this.o.y.e(this.f ? i2 : i);
            this.o.r.e(this.f ? us3VarV.t : us3VarV.j);
            this.o.n.setValue(Boolean.FALSE);
            return v33Var.k0(i, i2, qi1.j, new t34((byte) 1, i3, this, us3VarV));
        } catch (Throwable th) {
            js2.z(at4VarM, at4VarB, xy1VarV);
            throw th;
        }
    }

    @Override // defpackage.lm2
    public final int x(zy2 zy2Var, p33 p33Var, int i) {
        if (this.f) {
            i = Integer.MAX_VALUE;
        }
        return p33Var.Y(i);
    }
}
