package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pd1 extends cd1 {
    public qd1 Q;
    public boolean R;
    public cz1 S;
    public cz1 T;
    public boolean U;

    @Override // defpackage.cd1
    public final Object U0(s3 s3Var, n10 n10Var) {
        Object objV;
        um3 um3Var = this.k;
        return (um3Var != null && (objV = this.Q.v(new s3((Object) s3Var, (Object) this, (Object) um3Var, (mu0) null, (byte) 8), n10Var)) == px0.j) ? objV : og5.g;
    }

    @Override // defpackage.cd1
    public final void Z0(long j) {
        if (!this.h || yf2.p(this.S, nd1.g)) {
            return;
        }
        m50.T(E0(), null, new od1(this, j, null), 1);
    }

    @Override // defpackage.cd1
    public final void a1(nc1 nc1Var) {
        um3 um3Var;
        if (!this.h || yf2.p(this.T, nd1.y) || (um3Var = this.k) == null) {
            return;
        }
        m50.T(E0(), null, new s3((Object) this, (Object) nc1Var, (Object) um3Var, (mu0) null, (byte) 9), 1);
    }

    @Override // defpackage.cd1
    public final boolean i1() {
        return this.R;
    }
}
