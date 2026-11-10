package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q94 extends gz4 {
    public final /* synthetic */ t51 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q94(t51 t51Var, int i) {
        super(i);
        this.y = t51Var;
    }

    @Override // defpackage.gz4
    public final void n(zx1 zx1Var, int i, int i2) {
        x(zx1Var, i, i2);
    }

    @Override // defpackage.gz4
    public final void r(zx1 zx1Var) {
        this.y.f(new fz4(zx1Var));
    }

    @Override // defpackage.gz4
    public final void v(zx1 zx1Var) throws Throwable {
        fz4 fz4Var = new fz4(zx1Var);
        t51 t51Var = this.y;
        t51Var.d(fz4Var);
        t51Var.j = zx1Var;
    }

    @Override // defpackage.gz4
    public final void x(zx1 zx1Var, int i, int i2) {
        this.y.k(new fz4(zx1Var), i, i2);
    }
}
