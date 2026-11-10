package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i65 extends i73 implements zo0, lm2 {
    public kf5 f;
    public g65 k;
    public final k85 o;

    public i65(k85 k85Var) {
        this.o = k85Var;
    }

    @Override // defpackage.o41
    public final void A0() {
        g65 g65Var = this.k;
        if (g65Var != null) {
            g65.g(g65Var, k33.V(this).G, null, null, 30);
        }
        c93.B(this);
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.i73
    public final void I0() {
        k85 k85VarD = v13.D(this.o, k33.V(this).G);
        ku1 ku1Var = (ku1) v70.b(this, hp0.m);
        Q0(k85VarD, ku1Var);
        fl2 fl2Var = k33.V(this).G;
        j51 j51Var = k33.V(this).F;
        kf5 kf5Var = this.f;
        if (kf5Var != null) {
            this.k = new g65(fl2Var, j51Var, ku1Var, k85VarD, kf5Var.getValue());
        } else {
            pc2.y("Font resolution state is not set.");
            up.q();
        }
    }

    @Override // defpackage.i73
    public final void J0() {
        this.f = null;
        this.k = null;
    }

    public final void Q0(k85 k85Var, ku1 ku1Var) {
        ju4 ju4Var = k85Var.g;
        lu1 lu1Var = ju4Var.x;
        qv1 qv1Var = ju4Var.r;
        if (qv1Var == null) {
            qv1Var = qv1.z;
        }
        lv1 lv1Var = ju4Var.n;
        int i = lv1Var != null ? lv1Var.g : 0;
        mv1 mv1Var = ju4Var.v;
        this.f = ((mu1) ku1Var).y(lu1Var, qv1Var, i, mv1Var != null ? mv1Var.g : 65535);
        c93.B(this);
    }

    @Override // defpackage.o41, defpackage.tu3
    public final void g() {
        g65 g65Var = this.k;
        if (g65Var != null) {
            g65.g(g65Var, null, k33.V(this).F, null, 29);
        }
        c93.B(this);
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        g65 g65Var = this.k;
        if (g65Var == null) {
            pc2.y("Min size state is not set.");
            up.q();
            return null;
        }
        tp3 tp3Var = g65Var.x;
        kf5 kf5Var = this.f;
        if (kf5Var == null) {
            pc2.y("Font resolution state is not set.");
            up.q();
            return null;
        }
        Object value = kf5Var.getValue();
        if (!yf2.p(value, g65Var.v)) {
            g65Var.v = value;
            tp3Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) tp3Var.getValue()).booleanValue()) {
            g65Var.l = v45.g(g65Var.n, g65Var.y, g65Var.r);
            tp3Var.setValue(Boolean.FALSE);
        }
        long j2 = g65Var.l;
        us3 us3VarV = p33Var.v(zs0.v(j, zs0.y((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new sw(us3VarV, (byte) 7));
    }
}
