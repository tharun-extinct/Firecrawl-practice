package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m90 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ m90(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        sx1 sx1Var = um2.Z;
        g73 g73Var = g73.g;
        og5 og5Var = og5.g;
        Object obj3 = this.a;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    j73 j73VarD0 = ue5.d0(mq4.g(g73Var, b80.r, b80.n), (zn3) obj4);
                    cz1 cz1Var = (cz1) obj3;
                    kb4 kb4VarG = jb4.g(v70.v, hi0.u, h02Var, 54);
                    int iS = pw5.s(h02Var);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, j73VarD0);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, kb4VarG);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    on0 on0Var = tg1.c;
                    if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                        du4.f(iS, h02Var, iS, on0Var);
                    }
                    xs2.E(tg1.m, h02Var, j73VarW);
                    cz1Var.x(nb4.g, h02Var, 6);
                    h02Var.b(true);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    lr2.j(((aw2) obj4).y, k33.c, (nm0) obj3, h02Var2, 48);
                }
                break;
            case 2:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    g75.g(((mf5) obj4).a, (nm0) obj3, h02Var3, 0);
                }
                break;
            default:
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    h02Var4.Q();
                } else {
                    nm0 nm0Var = (nm0) obj4;
                    yd4 yd4Var = (yd4) obj3;
                    t33 t33VarR = z50.r(hi0.t, false);
                    int iS2 = pw5.s(h02Var4);
                    tr3 tr3VarQ2 = h02Var4.q();
                    j73 j73VarW2 = m50.W(h02Var4, g73Var);
                    jo0.n.getClass();
                    h02Var4.b0();
                    if (h02Var4.S) {
                        h02Var4.m(sx1Var);
                    } else {
                        h02Var4.l0();
                    }
                    xs2.E(tg1.w, h02Var4, t33VarR);
                    xs2.E(tg1.q, h02Var4, tr3VarQ2);
                    on0 on0Var2 = tg1.c;
                    if (h02Var4.S || !yf2.p(h02Var4.K(), Integer.valueOf(iS2))) {
                        du4.f(iS2, h02Var4, iS2, on0Var2);
                    }
                    xs2.E(tg1.m, h02Var4, j73VarW2);
                    nm0Var.x(yd4Var, h02Var4, 6);
                    h02Var4.b(true);
                }
                break;
        }
        return og5Var;
    }
}
