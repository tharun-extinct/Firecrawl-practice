package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i95 extends i73 implements lm2 {
    public qg A;
    public float B;
    public float C;
    public boolean d;
    public qg e;
    public boolean f;
    public zu4 k;
    public ve2 o;

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.i73
    public final void I0() {
        m50.T(E0(), null, new x55(this, null, (byte) 3), 3);
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        float f;
        byte b = 0;
        byte b2 = 1;
        boolean z = (p33Var.x(ws0.t(j)) == 0 || p33Var.Y(ws0.j(j)) == 0) ? false : true;
        if (this.d) {
            f = we6.c;
        } else {
            f = (z || this.f) ? k05.g : k05.y;
        }
        float fE = v33Var.e(f);
        qg qgVar = this.A;
        int iFloatValue = (int) (qgVar != null ? ((Number) qgVar.n()).floatValue() : fE);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            oc2.g("width and height must be >= 0");
        }
        us3 us3VarV = p33Var.v(zs0.j(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fE2 = v33Var.e((k05.n - v33Var.B0(fE)) / 2.0f);
        float fE3 = v33Var.e((k05.r - k05.g) - k05.v);
        boolean z2 = this.d;
        float f2 = we6.h;
        if (z2 && this.f) {
            fE2 = fE3 - v33Var.e(f2);
        } else if (z2 && !this.f) {
            fE2 = v33Var.e(f2);
        } else if (this.f) {
            fE2 = fE3;
        }
        qg qgVar2 = this.A;
        mu0 mu0Var = null;
        Float f3 = qgVar2 != null ? (Float) qgVar2.v.getValue() : null;
        byte b3 = 3;
        if (f3 == null || f3.floatValue() != fE) {
            m50.T(E0(), null, new h95(this, fE, mu0Var, b), 3);
        }
        qg qgVar3 = this.e;
        Float f4 = qgVar3 != null ? (Float) qgVar3.v.getValue() : null;
        if (f4 == null || f4.floatValue() != fE2) {
            m50.T(E0(), null, new h95(this, fE2, mu0Var, b2), 3);
        }
        if (Float.isNaN(this.C) && Float.isNaN(this.B)) {
            this.C = fE;
            this.B = fE2;
        }
        return v33Var.k0(iFloatValue, iFloatValue, qi1.j, new fb(us3VarV, this, fE2, b3));
    }
}
