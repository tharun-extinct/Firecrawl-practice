package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mu1 implements ku1 {
    public final q64 g;
    public final su1 n;
    public final wh4 r;
    public final y22 v;
    public final z6 x;
    public final zb y;

    public mu1(q64 q64Var, zb zbVar) {
        wh4 wh4Var = nu1.g;
        su1 su1Var = new su1(nu1.y);
        y22 y22Var = new y22((byte) 25);
        this.g = q64Var;
        this.y = zbVar;
        this.r = wh4Var;
        this.n = su1Var;
        this.v = y22Var;
        this.x = new z6(this, (byte) 13);
    }

    public final kf5 g(hf5 hf5Var) {
        wh4 wh4Var = this.r;
        xf xfVar = new xf(this, hf5Var, (byte) 5);
        synchronized (((l76) wh4Var.j)) {
            kf5 kf5Var = (kf5) ((kz2) wh4Var.t).r(hf5Var);
            if (kf5Var != null) {
                if (kf5Var.r()) {
                    return kf5Var;
                }
            }
            try {
                kf5 kf5Var2 = (kf5) xfVar.a(new pc5(wh4Var, hf5Var, (byte) 3));
                synchronized (((l76) wh4Var.j)) {
                    if (((kz2) wh4Var.t).r(hf5Var) == null && kf5Var2.r()) {
                        ((kz2) wh4Var.t).n(hf5Var, kf5Var2);
                    }
                }
                return kf5Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final kf5 y(lu1 lu1Var, qv1 qv1Var, int i, int i2) {
        int i3 = this.y.j;
        return g(new hf5(lu1Var, (i3 == 0 || i3 == Integer.MAX_VALUE) ? qv1Var : new qv1(xs2.w(qv1Var.j + i3, 1, 1000)), i, i2, null));
    }
}
