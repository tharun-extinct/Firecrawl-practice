package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ye0 implements cz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ bz1 t;

    public ye0(bz1 bz1Var, long j) {
        this.j = (byte) 0;
        this.t = bz1Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        bz1 bz1Var = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                ((Number) obj3).intValue();
                bz1 bz1VarL = ff0.l(bz1Var, h02Var);
                Object objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = kq2.M(bz1VarL);
                    h02Var.i0(objK);
                }
                ob3 ob3Var = (ob3) objK;
                if (bz1VarL != null) {
                    ob3Var.setValue(bz1VarL);
                }
                t33 t33VarR = z50.r(hi0.w, false);
                int iS = pw5.s(h02Var);
                tr3 tr3VarQ = h02Var.q();
                j73 j73VarW = m50.W(h02Var, g73.g);
                jo0.n.getClass();
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(um2.Z);
                } else {
                    h02Var.l0();
                }
                xs2.E(tg1.w, h02Var, t33VarR);
                xs2.E(tg1.q, h02Var, tr3VarQ);
                on0 on0Var = tg1.c;
                if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                    du4.f(iS, h02Var, iS, on0Var);
                }
                xs2.E(tg1.m, h02Var, j73VarW);
                bz1 bz1Var2 = (bz1) ob3Var.getValue();
                if (bz1Var2 == null) {
                    h02Var.X(-1538103400);
                } else {
                    h02Var.X(-326710903);
                    bz1Var2.l(h02Var, 0);
                }
                h02Var.b(false);
                h02Var.b(true);
                break;
            case 1:
                h02 h02Var2 = (h02) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!h02Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h02Var2.Q();
                } else {
                    bz1Var.l(h02Var2, 0);
                }
                break;
            case 2:
                h02 h02Var3 = (h02) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (!h02Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    h02Var3.Q();
                } else {
                    p15.r(bz1Var, h02Var3, 0);
                }
                break;
            default:
                h02 h02Var4 = (h02) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (!h02Var4.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    h02Var4.Q();
                } else {
                    bz1Var.l(h02Var4, 0);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ ye0(bz1 bz1Var, byte b) {
        this.j = b;
        this.t = bz1Var;
    }
}
