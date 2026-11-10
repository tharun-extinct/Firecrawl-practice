package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class d03 extends i73 implements a32, wd1, ej4, ti3 {
    public dt3 D;
    public View E;
    public j51 F;
    public ct3 G;
    public z51 I;
    public qe2 K;
    public m70 L;
    public e65 f;
    public tz2 o;
    public float k = Float.NaN;
    public boolean d = true;
    public long e = 9205357640488583168L;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public boolean C = true;
    public final tp3 H = new tp3(null, hi0.B);
    public long J = 9205357640488583168L;

    public d03(tz2 tz2Var, e65 e65Var, dt3 dt3Var) {
        this.o = tz2Var;
        this.f = e65Var;
        this.D = dt3Var;
    }

    @Override // defpackage.i73
    public final void I0() {
        N();
        this.L = v70.y(0, 7, null);
        m50.T(E0(), null, new a90(this, null, (byte) 3), 1);
    }

    @Override // defpackage.i73
    public final void J0() {
        ct3 ct3Var = this.G;
        if (ct3Var != null) {
            ((et3) ct3Var).y();
        }
        this.G = null;
    }

    @Override // defpackage.ti3
    public final void N() {
        mq2.b(this, new c03(this, (byte) 0));
    }

    public final long Q0() {
        z51 z51VarY = this.I;
        if (z51VarY == null) {
            z51VarY = pt4.y(new c03(this, (byte) 2));
            this.I = z51VarY;
        }
        return ((wi3) z51VarY.getValue()).g;
    }

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        wm2Var.g();
        m70 m70Var = this.L;
        if (m70Var != null) {
            m70Var.z(og5.g);
        }
    }

    public final void R0() {
        ct3 ct3Var = this.G;
        if (ct3Var != null) {
            ((et3) ct3Var).y();
        }
        View viewD = this.E;
        if (viewD == null) {
            viewD = c93.D(this);
        }
        View view = viewD;
        this.E = view;
        j51 j51Var = this.F;
        if (j51Var == null) {
            j51Var = k33.V(this).F;
        }
        j51 j51Var2 = j51Var;
        this.F = j51Var2;
        this.G = this.D.y(view, this.d, this.e, this.A, this.B, this.C, j51Var2, this.k);
        T0();
    }

    public final void S0() {
        j51 j51Var = this.F;
        if (j51Var == null) {
            j51Var = k33.V(this).F;
            this.F = j51Var;
        }
        long j = ((wi3) this.o.a(j51Var)).g;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & Q0()) == 9205357640488583168L) {
            this.J = 9205357640488583168L;
            ct3 ct3Var = this.G;
            if (ct3Var != null) {
                ((et3) ct3Var).y();
                return;
            }
            return;
        }
        this.J = wi3.v(Q0(), j);
        if (this.G == null) {
            R0();
        }
        ct3 ct3Var2 = this.G;
        if (ct3Var2 != null) {
            ct3Var2.g(this.J, 9205357640488583168L, this.k);
        }
        T0();
    }

    public final void T0() {
        j51 j51Var;
        ct3 ct3Var = this.G;
        if (ct3Var == null || (j51Var = this.F) == null) {
            return;
        }
        et3 et3Var = (et3) ct3Var;
        long jR = et3Var.r();
        qe2 qe2Var = this.K;
        if (qe2Var != null && jR == qe2Var.g) {
            return;
        }
        e65 e65Var = this.f;
        if (e65Var != null) {
            e65Var.a(new yb1(j51Var.d(y94.N(et3Var.r()))));
        }
        this.K = new qe2(et3Var.r());
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        nj4Var.g(e03.g, new c03(this, (byte) 1));
    }

    @Override // defpackage.a32
    public final void o(gh3 gh3Var) {
        this.H.setValue(gh3Var);
    }
}
