package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yk3 extends bm3 {
    public static final yk3 r = new yk3(0, 2, 1);

    @Override // defpackage.bm3
    public final void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        int i;
        oe2 oe2Var = (oe2) ti0Var.r(0);
        int iR = pr4Var.r((c02) ti0Var.r(1));
        if (pr4Var.z >= iR) {
            qo0.g("Check failed");
        }
        bc6.v(pr4Var, mqVar, iR);
        int i2 = pr4Var.z;
        int iD = pr4Var.o;
        while (iD >= 0 && !pr4Var.k(iD)) {
            iD = pr4Var.D(pr4Var.y, iD);
        }
        int iZ = iD + 1;
        int iK = 0;
        while (iZ < i2) {
            if (pr4Var.h(i2, iZ)) {
                if (pr4Var.k(iZ)) {
                    iK = 0;
                }
                iZ++;
            } else {
                iK += pr4Var.k(iZ) ? 1 : pr4Var.y[(pr4Var.s(iZ) * 5) + 1] & 67108863;
                iZ += pr4Var.z(iZ);
            }
        }
        while (true) {
            i = pr4Var.z;
            if (i >= iR) {
                break;
            }
            if (pr4Var.h(iR, i)) {
                int i3 = pr4Var.z;
                if (i3 < pr4Var.h && (pr4Var.y[(pr4Var.s(i3) * 5) + 1] & 1073741824) != 0) {
                    mqVar.r(pr4Var.C(pr4Var.z));
                    iK = 0;
                }
                pr4Var.O();
            } else {
                iK += pr4Var.K();
            }
        }
        if (i != iR) {
            qo0.g("Check failed");
        }
        oe2Var.g = iK;
    }
}
