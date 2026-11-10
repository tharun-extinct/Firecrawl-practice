package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class pf implements Choreographer.FrameCallback {
    public final /* synthetic */ ib0 j;
    public final /* synthetic */ xy1 t;

    public pf(ib0 ib0Var, qf qfVar, xy1 xy1Var) {
        this.j = ib0Var;
        this.t = xy1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object g84Var;
        try {
            g84Var = this.t.a(Long.valueOf(j));
        } catch (Throwable th) {
            g84Var = new g84(th);
        }
        this.j.j(g84Var);
    }
}
