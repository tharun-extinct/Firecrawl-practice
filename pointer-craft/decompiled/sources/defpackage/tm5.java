package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tm5 extends n52 {
    public int A0;
    public vy B0;
    public gs0 C0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.n52
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            ts0 ts0Var = this.q0[i];
            if (ts0Var != null) {
                ts0Var.F = true;
            }
        }
    }

    public final void T(int i, int i2, int i3, int i4, ts0 ts0Var) {
        gs0 gs0Var;
        us0 us0Var;
        vy vyVar = this.B0;
        while (true) {
            gs0Var = this.C0;
            if (gs0Var != null || (us0Var = this.T) == null) {
                break;
            } else {
                this.C0 = us0Var.u0;
            }
        }
        vyVar.g = i;
        vyVar.y = i3;
        vyVar.r = i2;
        vyVar.n = i4;
        gs0Var.y(ts0Var, vyVar);
        ts0Var.O(vyVar.v);
        ts0Var.L(vyVar.x);
        ts0Var.E = vyVar.j;
        ts0Var.I(vyVar.l);
    }
}
