package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class dc3 implements hb0, an5 {
    public final ib0 j;
    public final /* synthetic */ ec3 t;

    public dc3(ec3 ec3Var, ib0 ib0Var) {
        this.t = ec3Var;
        this.j = ib0Var;
    }

    @Override // defpackage.hb0
    public final void H(Object obj) throws ha1 {
        this.j.H(obj);
    }

    @Override // defpackage.an5
    public final void g(nh4 nh4Var, int i) {
        this.j.g(nh4Var, i);
    }

    @Override // defpackage.mu0
    public final void j(Object obj) {
        this.j.j(obj);
    }

    @Override // defpackage.hb0
    public final void m(Object obj, cz1 cz1Var) throws ha1 {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ec3.p;
        ec3 ec3Var = this.t;
        atomicReferenceFieldUpdater.set(ec3Var, null);
        ll2 ll2Var = new ll2(ec3Var, this, (byte) 4);
        ib0 ib0Var = this.j;
        ib0Var.D(og5.g, ib0Var.a, new tn((Object) ll2Var, (byte) 1));
    }

    @Override // defpackage.hb0
    public final ky2 q(Object obj, cz1 cz1Var) {
        ec3 ec3Var = this.t;
        tn tnVar = new tn(ec3Var, this);
        ky2 ky2VarG = this.j.G((og5) obj, tnVar);
        if (ky2VarG != null) {
            ec3.p.set(ec3Var, null);
        }
        return ky2VarG;
    }

    @Override // defpackage.hb0
    public final boolean s(Throwable th) {
        return this.j.s(th);
    }

    @Override // defpackage.mu0
    public final fx0 v() {
        return this.j.q;
    }
}
