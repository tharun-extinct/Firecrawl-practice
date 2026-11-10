package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gt2 extends i73 implements zo0, a32 {
    public final tp3 d = kq2.M(null);
    public mt2 f;
    public b65 k;
    public uc o;

    public gt2(uc ucVar, mt2 mt2Var, b65 b65Var) {
        this.o = ucVar;
        this.f = mt2Var;
        this.k = b65Var;
    }

    @Override // defpackage.i73
    public final void I0() {
        uc ucVar = this.o;
        if (ucVar.g != null) {
            pc2.r("Expected textInputModifierNode to be null");
        }
        ucVar.g = this;
    }

    @Override // defpackage.i73
    public final void J0() {
        this.o.m(this);
    }

    @Override // defpackage.a32
    public final void o(gh3 gh3Var) {
        this.d.setValue(gh3Var);
    }
}
