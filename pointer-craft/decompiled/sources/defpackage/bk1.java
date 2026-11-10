package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bk1 extends kk2 implements xy1 {
    public final /* synthetic */ dk1 a;
    public final /* synthetic */ long m;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk1(dk1 dk1Var, long j, byte b) {
        super(1);
        this.t = b;
        this.a = dk1Var;
        this.m = j;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        xy1 xy1Var;
        xy1 xy1Var2;
        xy1 xy1Var3;
        xy1 xy1Var4;
        int iOrdinal;
        byte b = this.t;
        long j = this.m;
        long jR = 0;
        dk1 dk1Var = this.a;
        switch (b) {
            case 0:
                int iOrdinal2 = ((mj1) obj).ordinal();
                if (iOrdinal2 == 0) {
                    wc0 wc0Var = dk1Var.e.g.r;
                    if (wc0Var != null && (xy1Var = wc0Var.y) != null) {
                        j = ((qe2) xy1Var.a(new qe2(j))).g;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        uo1.g();
                        return null;
                    }
                    wc0 wc0Var2 = dk1Var.A.g.r;
                    if (wc0Var2 != null && (xy1Var2 = wc0Var2.y) != null) {
                        j = ((qe2) xy1Var2.a(new qe2(j))).g;
                    }
                }
                return new qe2(j);
            case 1:
                mj1 mj1Var = (mj1) obj;
                if (mj1Var == mj1.a && dk1Var.A.g.y == null) {
                    jR = dk1Var.B.t;
                } else {
                    vq4 vq4Var = dk1Var.e.g.y;
                    long j2 = (vq4Var == null || (xy1Var4 = vq4Var.g) == null) ? 0L : ((je2) xy1Var4.a(new qe2(j))).g;
                    vq4 vq4Var2 = dk1Var.A.g.y;
                    long j3 = (vq4Var2 == null || (xy1Var3 = vq4Var2.g) == null) ? 0L : ((je2) xy1Var3.a(new qe2(j))).g;
                    int iOrdinal3 = mj1Var.ordinal();
                    if (iOrdinal3 == 0) {
                        jR = j2;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            uo1.g();
                            return null;
                        }
                        jR = j3;
                    }
                }
                return new je2(jR);
            default:
                mj1 mj1Var2 = (mj1) obj;
                if (dk1Var.F != null && dk1Var.Q0() != null && !yf2.p(dk1Var.F, dk1Var.Q0()) && (iOrdinal = mj1Var2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        uo1.g();
                        return null;
                    }
                    wc0 wc0Var3 = dk1Var.A.g.r;
                    if (wc0Var3 != null) {
                        xy1 xy1Var5 = wc0Var3.y;
                        long j4 = this.m;
                        long j5 = ((qe2) xy1Var5.a(new qe2(j4))).g;
                        u6 u6VarQ0 = dk1Var.Q0();
                        u6VarQ0.getClass();
                        fl2 fl2Var = fl2.j;
                        long jG = u6VarQ0.g(j4, j5, fl2Var);
                        u6 u6Var = dk1Var.F;
                        u6Var.getClass();
                        jR = je2.r(jG, u6Var.g(j4, j5, fl2Var));
                    }
                }
                return new je2(jR);
        }
    }
}
