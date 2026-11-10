package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class bd0 extends ad0 {
    public final bz1 m;

    public bd0(bz1 bz1Var, fx0 fx0Var, int i, f70 f70Var) {
        super(fx0Var, i, f70Var);
        this.m = bz1Var;
    }

    @Override // defpackage.ad0
    public final String toString() {
        return "block[" + this.m + "] -> " + super.toString();
    }

    @Override // defpackage.ad0
    public Object v(ez3 ez3Var, mu0 mu0Var) {
        Object objL = this.m.l(ez3Var, mu0Var);
        return objL == px0.j ? objL : og5.g;
    }

    @Override // defpackage.ad0
    public ad0 x(fx0 fx0Var, int i, f70 f70Var) {
        return new bd0(this.m, fx0Var, i, f70Var);
    }
}
