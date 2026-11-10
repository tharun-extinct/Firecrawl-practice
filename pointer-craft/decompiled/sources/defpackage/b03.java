package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class b03 extends o73 {
    public final tz2 g;
    public final dt3 r;
    public final e65 y;

    public b03(tz2 tz2Var, e65 e65Var, dt3 dt3Var) {
        this.g = tz2Var;
        this.y = e65Var;
        this.r = dt3Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.r.hashCode() + ((this.y.hashCode() + xi3.l(fj.y(Float.NaN, fj.y(Float.NaN, xi3.v(xi3.l(fj.y(Float.NaN, this.g.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        d03 d03Var = (d03) i73Var;
        float f = d03Var.k;
        long j = d03Var.e;
        float f2 = d03Var.A;
        boolean z = d03Var.d;
        float f3 = d03Var.B;
        boolean z2 = d03Var.C;
        dt3 dt3Var = d03Var.D;
        View view = d03Var.E;
        j51 j51Var = d03Var.F;
        d03Var.o = this.g;
        d03Var.k = Float.NaN;
        d03Var.d = true;
        d03Var.e = 9205357640488583168L;
        d03Var.A = Float.NaN;
        d03Var.B = Float.NaN;
        d03Var.C = true;
        d03Var.f = this.y;
        dt3 dt3Var2 = this.r;
        d03Var.D = dt3Var2;
        View viewD = c93.D(d03Var);
        j51 j51Var2 = k33.V(d03Var).F;
        if (d03Var.G != null) {
            mj4 mj4Var = e03.g;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !dt3Var2.g()) || 9205357640488583168L != j || !vb1.y(Float.NaN, f2) || !vb1.y(Float.NaN, f3) || true != z || true != z2 || !dt3Var2.equals(dt3Var) || !viewD.equals(view) || !yf2.p(j51Var2, j51Var)) {
                d03Var.R0();
            }
        }
        d03Var.S0();
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new d03(this.g, this.y, this.r);
    }
}
