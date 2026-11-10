package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ew2 implements bz1 {
    public final /* synthetic */ bz1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ aw2 t;

    public /* synthetic */ ew2(aw2 aw2Var, bz1 bz1Var, byte b) {
        this.j = b;
        this.t = aw2Var;
        this.a = bz1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        aw2 aw2Var = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    j73 j73VarI0 = ue5.i0(g73.g, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    t33 t33VarR = z50.r(hi0.t, false);
                    int iS = pw5.s(h02Var);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, j73VarI0);
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
                    og0.y(du4.t(aw2Var.r, mt0.g), this.a, h02Var, 8);
                    h02Var.b(true);
                }
                break;
            default:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    lr2.j(aw2Var.v, k33.h, this.a, h02Var2, 48);
                }
                break;
        }
        return og5Var;
    }
}
