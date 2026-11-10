package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y84 implements sb1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ c94 t;

    public /* synthetic */ y84(c94 c94Var, byte b) {
        this.j = b;
        this.t = c94Var;
    }

    @Override // defpackage.sb1
    public final double n(double d) {
        byte b = this.j;
        c94 c94Var = this.t;
        switch (b) {
            case 0:
                return xs2.m(c94Var.m.n(d), c94Var.v, c94Var.x);
            default:
                return c94Var.c.n(xs2.m(d, c94Var.v, c94Var.x));
        }
    }
}
