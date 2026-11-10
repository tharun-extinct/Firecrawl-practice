package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j11 extends i73 implements wd1 {
    public boolean d;
    public boolean f;
    public boolean k;
    public final ve2 o;

    public j11(ve2 ve2Var) {
        this.o = ve2Var;
    }

    @Override // defpackage.i73
    public final void I0() {
        m50.T(E0(), null, new dy((Object) this, (mu0) null, (byte) 8), 3);
    }

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        wm2Var.g();
        pb0 pb0Var = wm2Var.j;
        if (this.f) {
            xd1.B(wm2Var, jj0.y(0.3f, jj0.y), 0L, pb0Var.n(), 0.0f, 122);
        } else if (this.k || this.d) {
            xd1.B(wm2Var, jj0.y(0.1f, jj0.y), 0L, pb0Var.n(), 0.0f, 122);
        }
    }
}
