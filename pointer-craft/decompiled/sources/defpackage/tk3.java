package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tk3 extends bm3 {
    public static final tk3 r = new tk3(0, 2, 1);

    @Override // defpackage.bm3
    public final void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        c02 c02Var = (c02) ti0Var.r(0);
        Object objR = ti0Var.r(1);
        if (objR instanceof l02) {
            l02 l02Var = (l02) objR;
            ((rb3) i64Var.n).y(l02Var);
            ((ib3) i64Var.l).g(l02Var);
        }
        if (pr4Var.c != 0) {
            qo0.g("Can only append a slot if not current inserting");
        }
        int i = pr4Var.t;
        int i2 = pr4Var.a;
        int iR = pr4Var.r(c02Var);
        int iX = pr4Var.x(pr4Var.y, pr4Var.s(iR + 1));
        pr4Var.t = iX;
        pr4Var.a = iX;
        pr4Var.f(1, iR);
        if (i >= iX) {
            i++;
            i2++;
        }
        pr4Var.r[iX] = objR;
        pr4Var.t = i;
        pr4Var.a = i2;
    }
}
