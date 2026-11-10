package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wl3 extends bm3 {
    public static final wl3 r = new wl3(1, 0, 2);

    @Override // defpackage.bm3
    public final void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        int iY = ti0Var.y(0);
        int i = pr4Var.o;
        int iM = pr4Var.M(pr4Var.y, pr4Var.s(i));
        int iX = pr4Var.x(pr4Var.y, pr4Var.s(i + 1));
        for (int iMax = Math.max(iM, iX - iY); iMax < iX; iMax++) {
            Object obj = pr4Var.r[pr4Var.l(iMax)];
            if (obj instanceof l02) {
                i64Var.x((l02) obj);
            } else if (obj instanceof u34) {
                ((u34) obj).r();
            }
        }
        if (iY <= 0) {
            qo0.g("Check failed");
        }
        int i2 = pr4Var.o;
        int iM2 = pr4Var.M(pr4Var.y, pr4Var.s(i2));
        int iX2 = pr4Var.x(pr4Var.y, pr4Var.s(i2 + 1)) - iY;
        if (iX2 < iM2) {
            qo0.g("Check failed");
        }
        pr4Var.I(iX2, iY, i2);
        int i3 = pr4Var.t;
        if (i3 >= iM2) {
            pr4Var.t = i3 - iY;
        }
    }
}
