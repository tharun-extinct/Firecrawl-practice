package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nj3 extends hf3 {
    public boolean l;
    public final oj3 x;

    public nj3(oj3 oj3Var, pj3 pj3Var) {
        super(pj3Var, oj3Var.y);
        this.x = oj3Var;
        this.l = true;
    }

    @Override // defpackage.hf3
    public final void g() {
        this.x.g();
    }

    public final void l(boolean z) {
        this.l = z;
        x(z && this.x.y);
    }

    @Override // defpackage.hf3
    public final void n(ff3 ff3Var) {
        ff3Var.getClass();
        this.x.n(new sv(ff3Var));
    }

    @Override // defpackage.hf3
    public final void r(ff3 ff3Var) {
        this.x.r(new sv(ff3Var));
    }

    @Override // defpackage.hf3
    public final void y() {
        this.x.y();
    }
}
