package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ao0 extends vv {
    public boolean l;
    public bz1 n;
    public final ox0 r;
    public m70 v;
    public iv4 x;

    public ao0(ox0 ox0Var, hw3 hw3Var) {
        super(hw3Var);
        this.r = ox0Var;
        this.n = new zn0(2, null, (byte) 0);
    }

    @Override // defpackage.vv
    public final void j() {
        v();
        if (super.n()) {
            this.l = true;
            this.v = v70.y(-2, 4, f70.j);
            this.x = m50.T(this.r, null, new q(this, null, (byte) 12), 3);
        }
    }

    @Override // defpackage.vv
    public final void l(sv svVar) {
        m70 m70Var = this.v;
        if (m70Var != null) {
            m70Var.z(svVar);
        }
    }

    @Override // defpackage.vv
    public final void v() {
        m70 m70Var = this.v;
        if (m70Var != null) {
            m70Var.n(new CancellationException("onBack cancelled"), true);
        }
        iv4 iv4Var = this.x;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        this.v = null;
        this.x = null;
        this.l = false;
    }

    public final void w(boolean z) {
        iv4 iv4Var;
        if (!z && super.n() && (iv4Var = this.x) != null && !iv4Var.y()) {
            v();
        }
        ((uv) this.g).x(z);
        ((tv) this.y).x(z);
    }

    @Override // defpackage.vv
    public final void x() {
        if (this.v != null && !this.l) {
            v();
        }
        if (this.v == null) {
            this.l = false;
            this.v = v70.y(-2, 4, f70.j);
            this.x = m50.T(this.r, null, new q(this, null, (byte) 12), 3);
        }
        m70 m70Var = this.v;
        if (m70Var != null) {
            m70Var.g(null);
        }
        this.l = false;
    }
}
