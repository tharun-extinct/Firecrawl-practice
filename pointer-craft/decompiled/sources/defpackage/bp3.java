package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bp3 implements bq1 {
    public final ts4 g;
    public final u21 y;

    public bp3(ts4 ts4Var, u21 u21Var) {
        this.g = ts4Var;
        this.y = u21Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.bq1
    public final Object g(pf4 pf4Var, float f, mu0 mu0Var) {
        ap3 ap3Var;
        u21 u21Var = this.y;
        oo3 oo3Var = u21Var.n;
        if (mu0Var instanceof ap3) {
            ap3Var = (ap3) mu0Var;
            int i = ap3Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ap3Var.w = i - Integer.MIN_VALUE;
            } else {
                ap3Var = new ap3(this, (ou0) mu0Var);
            }
        } else {
            ap3Var = new ap3(this, (ou0) mu0Var);
        }
        Object objR = ap3Var.m;
        int i2 = ap3Var.w;
        mu0 mu0Var2 = null;
        if (i2 == 0) {
            js2.o(objR);
            ll2 ll2Var = new ll2(this, pf4Var, (byte) 9);
            ap3Var.w = 1;
            objR = this.g.r(pf4Var, f, ll2Var, ap3Var);
            px0 px0Var = px0.j;
            if (objR == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objR);
        }
        float fFloatValue = ((Number) objR).floatValue();
        if (((pp3) oo3Var.n).d() != 0.0f && Math.abs(((pp3) oo3Var.n).d()) < 0.001d) {
            int iM = u21Var.m();
            if (u21Var.m.y()) {
                m50.T(((mo3) u21Var.w.getValue()).u, null, new nk3(u21Var, mu0Var2, (byte) 3), 3);
            }
            u21Var.u(iM, 0.0f, false);
        } else {
            new Float(((pp3) oo3Var.n).d());
        }
        return new Float(fFloatValue);
    }
}
