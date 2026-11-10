package defpackage;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
public final class o63 extends oj3 {
    public final ox0 n;
    public final qg v;
    public final m63 x;

    public o63(ox0 ox0Var, qg qgVar, m63 m63Var) {
        super(true);
        this.n = ox0Var;
        this.v = qgVar;
        this.x = m63Var;
    }

    @Override // defpackage.oj3
    public final void g() {
        m50.T(this.n, null, new dy(this, (mu0) null, (byte) 19), 3);
    }

    @Override // defpackage.oj3
    public final void n(sv svVar) {
        m50.T(this.n, null, new n63(this, svVar, null, (byte) 1), 3);
    }

    @Override // defpackage.oj3
    public final void r(sv svVar) {
        m50.T(this.n, null, new n63(this, svVar, null, (byte) 0), 3);
    }

    @Override // defpackage.oj3
    public final void y() throws PendingIntent.CanceledException {
        this.x.g();
    }
}
