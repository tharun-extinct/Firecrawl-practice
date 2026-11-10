package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f34 implements cw4, er1, b02 {
    public final /* synthetic */ cw4 j;
    private final dh2 job;

    public f34(ew4 ew4Var, iv4 iv4Var) {
        this.j = ew4Var;
        this.job = iv4Var;
    }

    @Override // defpackage.zn4
    public final List g() {
        return this.j.g();
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        return this.j.getValue();
    }

    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) {
        return this.j.r(gr1Var, mu0Var);
    }

    @Override // defpackage.b02
    public final er1 y(fx0 fx0Var, int i, f70 f70Var) {
        return (((i < 0 || i >= 2) && i != -2) || f70Var != f70.t) ? v70.u(this, fx0Var, i, f70Var) : this;
    }
}
