package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fe0 {
    public boolean g;
    public Object n;
    public Object r;
    public Object v;
    public Object y;

    public int g(rk4 rk4Var, ba baVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        z62 z62Var = (z62) this.r;
        c72 c72Var = (c72) this.v;
        if (this.g) {
            return jd6.g(false, false, false);
        }
        boolean z4 = true;
        try {
            this.g = true;
            mf2 mf2VarA = ((q64) this.n).a(rk4Var, baVar);
            int iL = mf2VarA.y().l();
            while (true) {
                if (i >= iL) {
                    z2 = true;
                    break;
                }
                qu3 qu3Var = (qu3) mf2VarA.y().j(i);
                i = (qu3Var.x() || qu3Var.t()) ? 0 : i + 1;
                z2 = false;
                break;
            }
            int iL2 = mf2VarA.y().l();
            for (int i2 = 0; i2 < iL2; i2++) {
                qu3 qu3Var2 = (qu3) mf2VarA.y().j(i2);
                if (z2 || fd6.y(qu3Var2)) {
                    ((um2) this.y).C(qu3Var2.v(), c72Var, qu3Var2.a(), true);
                    if (!c72Var.j.t()) {
                        z62Var.g(qu3Var2.n(), c72Var, fd6.y(qu3Var2));
                        c72Var.clear();
                    }
                }
            }
            boolean zY = z62Var.y(mf2VarA, z);
            if (mf2VarA.v()) {
                z3 = false;
                break;
            }
            int iL3 = mf2VarA.y().l();
            int i3 = 0;
            while (true) {
                if (i3 >= iL3) {
                    z3 = false;
                    break;
                }
                qu3 qu3Var3 = (qu3) mf2VarA.y().j(i3);
                if (fd6.a(qu3Var3) && qu3Var3.q()) {
                    z3 = true;
                    break;
                }
                i3++;
            }
            int iL4 = mf2VarA.y().l();
            int i4 = 0;
            while (true) {
                if (i4 >= iL4) {
                    z4 = false;
                    break;
                }
                if (((qu3) mf2VarA.y().j(i4)).q()) {
                    break;
                }
                i4++;
            }
            return jd6.g(zY, z3, z4);
        } finally {
            this.g = false;
        }
    }

    public void y(int i, int i2) {
        if (i < 0.0f) {
            pc2.g("Index should be non-negative (" + i + ")");
        }
        ((qp3) this.y).e(i);
        ((er2) this.v).g(i);
        ((qp3) this.r).e(i2);
    }
}
