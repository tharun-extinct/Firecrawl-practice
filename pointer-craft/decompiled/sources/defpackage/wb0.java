package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wb0 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ nm0 t;

    public /* synthetic */ wb0(nm0 nm0Var, byte b) {
        this.j = b;
        this.t = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        sx1 sx1Var = um2.Z;
        nm0 nm0Var = this.t;
        g73 g73Var = g73.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var, 0);
                    int iS = pw5.s(h02Var);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, g73Var);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, ek0VarG);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    on0 on0Var = tg1.c;
                    if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                        du4.f(iS, h02Var, iS, on0Var);
                    }
                    xs2.E(tg1.m, h02Var, j73VarW);
                    nm0Var.x(gk0.g, h02Var, 6);
                    h02Var.b(true);
                }
                break;
            default:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    float f = m50.A;
                    j73 j73VarM = mq4.m(g73Var, 80.0f, 0.0f, 0.0f, 14);
                    float f2 = m50.e;
                    j73 j73VarG0 = ue5.g0(j73VarM, 20.0f, 0.0f, 2);
                    kb4 kb4VarG = jb4.g(v70.v, hi0.u, h02Var2, 54);
                    int iS2 = pw5.s(h02Var2);
                    tr3 tr3VarQ2 = h02Var2.q();
                    j73 j73VarW2 = m50.W(h02Var2, j73VarG0);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, kb4VarG);
                    xs2.E(tg1.q, h02Var2, tr3VarQ2);
                    on0 on0Var2 = tg1.c;
                    if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS2))) {
                        du4.f(iS2, h02Var2, iS2, on0Var2);
                    }
                    xs2.E(tg1.m, h02Var2, j73VarW2);
                    nm0Var.x(nb4.g, h02Var2, 6);
                    h02Var2.b(true);
                }
                break;
        }
        return og5Var;
    }
}
