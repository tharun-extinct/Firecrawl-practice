package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class es2 extends mq2 {
    public final bm g = new bm();
    public ga3 y;

    public es2(xy1 xy1Var) {
        xy1Var.a(this);
    }

    public static /* synthetic */ void G(es2 es2Var, Object obj, nm0 nm0Var, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        es2Var.F(obj, null, nm0Var);
    }

    public final void F(Object obj, Object obj2, nm0 nm0Var) {
        this.g.g(1, new cs2(obj != null ? new zg0(obj, (byte) 1) : null, new zg0(obj2, (byte) 1), new nm0(-857469575, true, new jd(nm0Var, (byte) 3))));
    }

    public final void H(int i, xy1 xy1Var, xy1 xy1Var2, nm0 nm0Var) {
        this.g.g(i, new cs2(xy1Var, xy1Var2, nm0Var));
    }

    public final void I(String str, String str2, final nm0 nm0Var) {
        ga3 ga3Var = this.y;
        if (ga3Var == null) {
            ga3Var = new ga3();
            this.y = ga3Var;
        }
        bm bmVar = this.g;
        ga3Var.g(bmVar.g);
        final int i = bmVar.g;
        F(str, str2, new nm0(-1588696110, true, new cz1() { // from class: ds2
            @Override // defpackage.cz1
            public final Object x(Object obj, Object obj2, Object obj3) {
                bq2 bq2Var = (bq2) obj;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= h02Var.x(bq2Var) ? 4 : 2;
                }
                if (h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    nm0Var.i(bq2Var, Integer.valueOf(i), h02Var, Integer.valueOf(iIntValue & 14));
                } else {
                    h02Var.Q();
                }
                return og5.g;
            }
        }));
    }

    @Override // defpackage.mq2
    public final bm j() {
        return this.g;
    }
}
