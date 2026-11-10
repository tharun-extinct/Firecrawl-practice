package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class es5 implements so0, du2 {
    public boolean a;
    public final ba j;
    public ju2 m;
    public nm0 q = ra.c;
    public final yo0 t;

    public es5(ba baVar, yo0 yo0Var) {
        this.j = baVar;
        this.t = yo0Var;
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        if (vt2Var == vt2.ON_DESTROY) {
            g();
        } else {
            if (vt2Var != vt2.ON_CREATE || this.a) {
                return;
            }
            r(this.q);
        }
    }

    @Override // defpackage.so0
    public final void g() {
        if (!this.a) {
            this.a = true;
            ba baVar = this.j;
            baVar.getView().setTag(R.id.wrapped_composition_tag, null);
            ju2 ju2Var = this.m;
            if (ju2Var != null) {
                ju2Var.x(this);
            }
            this.m = null;
            za1 za1Var = baVar.c;
            if (za1Var != null) {
                za1Var.t.g();
            }
            baVar.c = null;
        }
        this.t.g();
    }

    public final void r(bz1 bz1Var) {
        this.j.setOnReadyForComposition(new pc5(this, (nm0) bz1Var, (byte) 5));
    }
}
