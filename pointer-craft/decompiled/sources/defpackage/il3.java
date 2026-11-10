package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class il3 extends bm3 {
    public static final il3 r = new il3(0, 3, 1);

    @Override // defpackage.bm3
    public final void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        cd2 cd2VarY;
        mr4 mr4Var = (mr4) ti0Var.r(1);
        c02 c02Var = (c02) ti0Var.r(0);
        qp1 qp1Var = (qp1) ti0Var.r(2);
        pr4 pr4VarV = mr4Var.v();
        if (cm3Var != null) {
            try {
                cd2VarY = bc6.y(cm3Var, pr4Var);
            } catch (Throwable th) {
                pr4VarV.v(false);
                throw th;
            }
        } else {
            cd2VarY = null;
        }
        if (!qp1Var.r.M()) {
            qo0.g("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        qp1Var.y.L(mqVar, pr4VarV, i64Var, cd2VarY);
        pr4VarV.v(true);
        pr4Var.n();
        c02Var.getClass();
        pr4Var.e(mr4Var, mr4Var.g(c02Var));
        pr4Var.a();
    }
}
