package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e34 extends at4 {
    public final xy1 v;
    public int x;

    public e34(long j, gt4 gt4Var, xy1 xy1Var) {
        super(j, gt4Var);
        this.v = xy1Var;
        this.x = 1;
    }

    @Override // defpackage.at4
    public final void c(ww4 ww4Var) {
        nd4 nd4Var = it4.g;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.at4
    public final at4 h(xy1 xy1Var) {
        it4.o(this);
        return new wf3(this.y, this.g, it4.t(xy1Var, this.v, true), this);
    }

    @Override // defpackage.at4
    public final void m() {
        this.x++;
    }

    @Override // defpackage.at4
    public final void q() {
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            g();
        }
    }

    @Override // defpackage.at4
    public final void r() {
        if (this.r) {
            return;
        }
        q();
        this.r = true;
        synchronized (it4.r) {
            i();
        }
    }

    @Override // defpackage.at4
    public final xy1 t() {
        return null;
    }

    @Override // defpackage.at4
    public final xy1 v() {
        return this.v;
    }

    @Override // defpackage.at4
    public final boolean x() {
        return true;
    }

    @Override // defpackage.at4
    public final void w() {
    }
}
