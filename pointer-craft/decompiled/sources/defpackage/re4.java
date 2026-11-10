package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class re4 extends e implements qx0 {
    public final mu0 q;

    public re4(mu0 mu0Var, fx0 fx0Var) {
        super(fx0Var, true);
        this.q = mu0Var;
    }

    @Override // defpackage.nh2
    public void B(Object obj) throws ha1 {
        pw5.K(pw5.o(this.q), gp4.M(obj));
    }

    @Override // defpackage.nh2
    public void G(Object obj) {
        this.q.j(gp4.M(obj));
    }

    @Override // defpackage.nh2
    public final boolean e0() {
        return true;
    }

    @Override // defpackage.qx0
    public final qx0 n() {
        mu0 mu0Var = this.q;
        if (mu0Var instanceof qx0) {
            return (qx0) mu0Var;
        }
        return null;
    }

    public void u0() {
    }
}
