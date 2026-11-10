package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eb6 implements em5 {
    public static final na2 g = new na2(false);

    public static final boolean n(int i, int i2) {
        return (i & i2) == i2;
    }

    public static tb0 v(int i) {
        return new tb0((i & 1) != 0 ? 0.0f : 6.0f, 0.0f, 0.0f, gb6.x, gb6.v, 0.0f);
    }

    public static sb0 x(rj0 rj0Var) {
        sb0 sb0Var = rj0Var.a0;
        if (sb0Var != null) {
            return sb0Var;
        }
        sj0 sj0Var = gb6.g;
        sb0 sb0Var2 = new sb0(tj0.n(rj0Var, sj0Var), tj0.g(rj0Var, tj0.n(rj0Var, sj0Var)), ra.c(jj0.y(gb6.n, tj0.n(rj0Var, gb6.r)), tj0.n(rj0Var, sj0Var)), jj0.y(0.38f, tj0.g(rj0Var, tj0.n(rj0Var, sj0Var))));
        rj0Var.a0 = sb0Var2;
        return sb0Var2;
    }

    @Override // defpackage.em5
    public void r() {
    }

    @Override // defpackage.em5
    public void y() {
    }
}
