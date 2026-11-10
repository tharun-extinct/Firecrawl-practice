package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jt1 {
    public final nt1 g;
    public final ib3 n;
    public final ib3 r;
    public boolean v;
    public final ba y;

    public jt1(nt1 nt1Var, ba baVar) {
        this.g = nt1Var;
        this.y = baVar;
        ib3 ib3Var = fe4.g;
        this.r = new ib3();
        this.n = new ib3();
    }

    public final void g() {
        if (this.v) {
            return;
        }
        w9 w9Var = new w9(0, this, jt1.class, "invalidateNodes", "invalidateNodes()V", 0, (byte) 1);
        xa3 xa3Var = this.y.x0;
        if (!xa3Var.v(w9Var)) {
            xa3Var.g(w9Var);
        }
        this.v = true;
    }
}
