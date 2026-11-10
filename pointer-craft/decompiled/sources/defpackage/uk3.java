package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uk3 extends bm3 {
    public static final uk3 r = new uk3(0, 2, 1);

    @Override // defpackage.bm3
    public final void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        oe2 oe2Var = (oe2) ti0Var.r(1);
        int i = oe2Var != null ? oe2Var.g : 0;
        vc0 vc0Var = (vc0) ti0Var.r(0);
        if (i > 0) {
            mqVar = new hs0(mqVar, i);
        }
        vc0Var.P(mqVar, pr4Var, i64Var, cm3Var != null ? new cd2((byte) 16, cm3Var, pr4Var, false) : null);
    }
}
