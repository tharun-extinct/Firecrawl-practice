package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wf3 extends at4 {
    public final xy1 v;
    public final at4 x;

    public wf3(long j, gt4 gt4Var, xy1 xy1Var, at4 at4Var) {
        super(j, gt4Var);
        this.v = xy1Var;
        this.x = at4Var;
        at4Var.m();
    }

    @Override // defpackage.at4
    public final at4 h(xy1 xy1Var) {
        return new wf3(this.y, this.g, it4.t(xy1Var, this.v, true), this.x);
    }

    @Override // defpackage.at4
    public final void r() {
        at4 at4Var = this.x;
        if (this.r) {
            return;
        }
        if (this.y != at4Var.l()) {
            g();
        }
        at4Var.q();
        this.r = true;
        synchronized (it4.r) {
            i();
        }
    }

    @Override // defpackage.at4
    public final xy1 v() {
        return this.v;
    }

    @Override // defpackage.at4
    public final boolean x() {
        return true;
    }
}
