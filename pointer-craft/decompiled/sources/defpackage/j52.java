package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j52 extends i73 implements zo0, lm2, ti3 {
    public int A;
    public k85 B;
    public kf5 C;
    public boolean d;
    public int e;
    public boolean f;
    public int k;
    public k85 o;

    @Override // defpackage.o41
    public final void A0() {
        this.B = v13.D(this.o, k33.V(this).G);
        this.d = true;
        c93.B(this);
    }

    @Override // defpackage.lm2
    public final int D(zy2 zy2Var, p33 p33Var, int i) {
        R0(zy2Var);
        int i2 = this.e;
        if (i2 == this.A) {
            return i2;
        }
        int iZ = p33Var.Z(i);
        int i3 = this.e;
        int i4 = this.A;
        if (iZ < i3) {
            iZ = i3;
        }
        return iZ > i4 ? i4 : iZ;
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.i73
    public final void I0() {
        ku1 ku1Var = (ku1) v70.b(this, hp0.m);
        this.B = v13.D(this.o, k33.V(this).G);
        lu1 lu1Var = S0().g.x;
        qv1 qv1Var = S0().g.r;
        if (qv1Var == null) {
            qv1Var = qv1.z;
        }
        lv1 lv1Var = S0().g.n;
        int i = lv1Var != null ? lv1Var.g : 0;
        mv1 mv1Var = S0().g.v;
        this.C = ((mu1) ku1Var).y(lu1Var, qv1Var, i, mv1Var != null ? mv1Var.g : 65535);
        mq2.b(this, new i52(this, (byte) 0));
        this.d = true;
    }

    @Override // defpackage.i73
    public final void J0() {
        this.B = null;
        this.C = null;
        this.d = false;
    }

    @Override // defpackage.ti3
    public final void N() {
        if (this.C != null) {
            mq2.b(this, new i52(this, (byte) 1));
        }
        this.d = true;
        c93.B(this);
    }

    public final void Q0(v33 v33Var, k85 k85Var, ku1 ku1Var) {
        h75 h75Var = v45.y(k85Var, v33Var, ku1Var, 3, true).n;
        float fL = h75Var.l(0);
        float fL2 = h75Var.l(1);
        float fL3 = h75Var.l(2);
        this.e = c93.k(fL, fL2, fL3, this.f ? 1 : 0, 1);
        this.A = c93.k(fL, fL2, fL3, this.k, Integer.MAX_VALUE);
    }

    public final void R0(zy2 zy2Var) {
        if (this.d) {
            Q0(zy2Var, S0(), (ku1) v70.b(this, hp0.m));
            this.d = false;
        }
        int i = this.e;
        this.e = i >= 0 ? i : 0;
        int i2 = this.A;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.A = i2;
    }

    public final k85 S0() {
        k85 k85Var = this.B;
        if (k85Var != null) {
            return k85Var;
        }
        pc2.y("Resolved style is not set.");
        up.q();
        return null;
    }

    @Override // defpackage.o41, defpackage.tu3
    public final void g() {
        this.d = true;
        c93.B(this);
    }

    @Override // defpackage.lm2
    public final int i(zy2 zy2Var, p33 p33Var, int i) {
        R0(zy2Var);
        int i2 = this.e;
        int i3 = this.A;
        if (i2 == i3) {
            return i3;
        }
        int iX = p33Var.x(i);
        int i4 = this.e;
        int i5 = this.A;
        if (iX < i4) {
            iX = i4;
        }
        return iX > i5 ? i5 : iX;
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        if (this.d) {
            Q0(v33Var, S0(), (ku1) v70.b(this, hp0.m));
            this.d = false;
        }
        int i = this.e;
        int iW = i != -1 ? xs2.w(i, ws0.a(j), ws0.j(j)) : ws0.a(j);
        int i2 = this.A;
        us3 us3VarV = p33Var.v(ws0.y(j, 0, 0, iW, i2 != -1 ? xs2.w(i2, ws0.a(j), ws0.j(j)) : ws0.j(j), 3));
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new sw(us3VarV, (byte) 2));
    }
}
