package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class s95 implements ox0 {
    public final /* synthetic */ up a;
    public final /* synthetic */ ox0 j;
    public final /* synthetic */ ox0 m;
    public final /* synthetic */ bz1 q;
    public final AtomicReference t = new AtomicReference(null);
    public final /* synthetic */ AtomicReference w;

    public s95(ox0 ox0Var, up upVar, ox0 ox0Var2, bz1 bz1Var, AtomicReference atomicReference) {
        this.a = upVar;
        this.m = ox0Var2;
        this.q = bz1Var;
        this.w = atomicReference;
        this.j = ox0Var;
    }

    public final long g() {
        Long l = (Long) this.t.get();
        if (l == null) {
            return mf1.t;
        }
        long jLongValue = l.longValue();
        this.a.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        aj6 aj6Var = mf1.j;
        return ye6.l(jCurrentTimeMillis, pf1.MILLISECONDS);
    }

    @Override // defpackage.ox0
    public final fx0 w() {
        return this.j.w();
    }

    public final void y(long j) {
        if (mf1.n(j) <= 0) {
            k33.d(this.m, new o95("Timed out immediately", this.q.hashCode()));
            return;
        }
        if (mf1.r(g(), j) < 0) {
            return;
        }
        this.a.getClass();
        this.t.set(Long.valueOf(mf1.n(j) + System.currentTimeMillis()));
        up upVar = this.a;
        ox0 ox0Var = this.m;
        dh2 dh2Var = (dh2) this.w.getAndSet(m50.T(ox0Var, null, new s3(this, upVar, ox0Var, this.q, null, (byte) 20), 3));
        if (dh2Var != null) {
            dh2Var.x(null);
        }
    }
}
