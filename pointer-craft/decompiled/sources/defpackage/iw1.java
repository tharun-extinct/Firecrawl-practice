package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class iw1 extends nw1 {
    public final /* synthetic */ q64 g;
    public final /* synthetic */ d5 n;
    public final /* synthetic */ u4 r;
    public final /* synthetic */ av0 v;
    public final /* synthetic */ AtomicReference y;

    public iw1(av0 av0Var, q64 q64Var, AtomicReference atomicReference, u4 u4Var, d5 d5Var) {
        this.v = av0Var;
        this.g = q64Var;
        this.y = atomicReference;
        this.r = u4Var;
        this.n = d5Var;
    }

    @Override // defpackage.nw1
    public final void g() {
        StringBuilder sb = new StringBuilder("fragment_");
        av0 av0Var = this.v;
        sb.append(av0Var.q);
        sb.append("_rq#");
        sb.append(av0Var.e0.getAndIncrement());
        String string = sb.toString();
        av0 av0Var2 = (av0) this.g.t;
        rw1 rw1Var = av0Var2.B;
        this.y.set((rw1Var != null ? rw1Var.A : av0Var2.M()).b.r(string, av0Var, this.r, this.n));
    }
}
