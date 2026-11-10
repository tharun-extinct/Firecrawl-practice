package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u43 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ bz1 m;
    public final /* synthetic */ Object t;

    public u43(nm0 nm0Var, bz1 bz1Var, cz1 cz1Var) {
        this.j = (byte) 4;
        this.m = nm0Var;
        this.t = bz1Var;
        this.a = cz1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        g73 g73Var = g73.g;
        l76 l76Var = oo0.g;
        sx1 sx1Var = um2.Z;
        og5 og5Var = og5.g;
        Object obj3 = this.a;
        bz1 bz1Var = this.m;
        Object obj4 = this.t;
        byte b2 = 2;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    j73 j73VarP = gp4.P(gc6.n(ue5.g0((j73) obj4, 0.0f, 8.0f, 1), tf2.t), (rf4) obj3, true);
                    nm0 nm0Var = (nm0) bz1Var;
                    ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var, 0);
                    int iS = pw5.s(h02Var);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, j73VarP);
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
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    if (1.0f <= 0.0d) {
                        kc2.g("invalid weight; must be greater than zero");
                    }
                    j73 j73VarI0 = ue5.i0(new tp2(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ((bz1) obj4) != null ? 12.0f : 0.0f, 0.0f, ((bz1) obj3) != null ? 12.0f : 0.0f, 0.0f, 10);
                    t33 t33VarR = z50.r(hi0.t, false);
                    int iS2 = pw5.s(h02Var2);
                    tr3 tr3VarQ2 = h02Var2.q();
                    j73 j73VarW2 = m50.W(h02Var2, j73VarI0);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, t33VarR);
                    xs2.E(tg1.q, h02Var2, tr3VarQ2);
                    on0 on0Var2 = tg1.c;
                    if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS2))) {
                        du4.f(iS2, h02Var2, iS2, on0Var2);
                    }
                    xs2.E(tg1.m, h02Var2, j73VarW2);
                    du4.o(0, bz1Var, h02Var2, true);
                }
                break;
            case 2:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    mf6.n((bz1) obj4, (nm0) bz1Var, (zn3) obj3, h02Var3, 0);
                }
                break;
            case 3:
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    h02Var4.Q();
                } else {
                    Object objK = h02Var4.K();
                    if (objK == l76Var) {
                        objK = k33.E(h02Var4);
                        h02Var4.i0(objK);
                    }
                    ox0 ox0Var = (ox0) objK;
                    zu4 zu4Var = (zu4) obj3;
                    Object objK2 = h02Var4.K();
                    if (objK2 == l76Var) {
                        objK2 = new sh4(ox0Var, zu4Var);
                        h02Var4.i0(objK2);
                    }
                    sh4 sh4Var = (sh4) objK2;
                    j73 j73VarY = gc6.y(g73Var);
                    nm0 nm0VarO = yf2.o(pw5.d((bz1) obj4, (nm0) bz1Var));
                    Object objK3 = h02Var4.K();
                    if (objK3 == l76Var) {
                        objK3 = new b93(sh4Var);
                        h02Var4.i0(objK3);
                    }
                    t33 t33Var = (t33) objK3;
                    int iS3 = pw5.s(h02Var4);
                    tr3 tr3VarQ3 = h02Var4.q();
                    j73 j73VarW3 = m50.W(h02Var4, j73VarY);
                    jo0.n.getClass();
                    h02Var4.b0();
                    if (h02Var4.S) {
                        h02Var4.m(sx1Var);
                    } else {
                        h02Var4.l0();
                    }
                    xs2.E(tg1.w, h02Var4, t33Var);
                    xs2.E(tg1.q, h02Var4, tr3VarQ3);
                    on0 on0Var3 = tg1.c;
                    if (h02Var4.S || !yf2.p(h02Var4.K(), Integer.valueOf(iS3))) {
                        du4.f(iS3, h02Var4, iS3, on0Var3);
                    }
                    xs2.E(tg1.m, h02Var4, j73VarW3);
                    du4.h(0, nm0VarO, h02Var4, true);
                }
                break;
            case 4:
                h02 h02Var5 = (h02) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!h02Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    h02Var5.Q();
                } else {
                    zu4 zu4VarF = jr2.F(f83.j, h02Var5);
                    Object objK4 = h02Var5.K();
                    if (objK4 == l76Var) {
                        objK4 = new b25(zu4VarF);
                        h02Var5.i0(objK4);
                    }
                    b25 b25Var = (b25) objK4;
                    j73 j73VarR = mq4.r(g73Var, 1.0f);
                    List listD = pw5.d((nm0) bz1Var, (bz1) obj4, ue5.m0(-1333331860, new k6((cz1) obj3, b25Var, (byte) 9), h02Var5));
                    Object objK5 = h02Var5.K();
                    if (objK5 == l76Var) {
                        objK5 = new a25(b25Var);
                        h02Var5.i0(objK5);
                    }
                    a93 a93Var = (a93) objK5;
                    nm0 nm0VarO2 = yf2.o(listD);
                    Object objK6 = h02Var5.K();
                    if (objK6 == l76Var) {
                        objK6 = new b93(a93Var);
                        h02Var5.i0(objK6);
                    }
                    t33 t33Var2 = (t33) objK6;
                    int iS4 = pw5.s(h02Var5);
                    tr3 tr3VarQ4 = h02Var5.q();
                    j73 j73VarW4 = m50.W(h02Var5, j73VarR);
                    jo0.n.getClass();
                    h02Var5.b0();
                    if (h02Var5.S) {
                        h02Var5.m(sx1Var);
                    } else {
                        h02Var5.l0();
                    }
                    xs2.E(tg1.w, h02Var5, t33Var2);
                    xs2.E(tg1.q, h02Var5, tr3VarQ4);
                    on0 on0Var4 = tg1.c;
                    if (h02Var5.S || !yf2.p(h02Var5.K(), Integer.valueOf(iS4))) {
                        du4.f(iS4, h02Var5, iS4, on0Var4);
                    }
                    xs2.E(tg1.m, h02Var5, j73VarW4);
                    du4.h(0, nm0VarO2, h02Var5, true);
                }
                break;
            default:
                h02 h02Var6 = (h02) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!h02Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    h02Var6.Q();
                } else {
                    no0 no0Var = new no0(new w31((nc5) obj4, b2));
                    nm0 nm0Var2 = (nm0) bz1Var;
                    xa5 xa5Var = (xa5) obj3;
                    t33 t33VarR2 = z50.r(hi0.t, false);
                    int iS5 = pw5.s(h02Var6);
                    tr3 tr3VarQ5 = h02Var6.q();
                    j73 j73VarW5 = m50.W(h02Var6, no0Var);
                    jo0.n.getClass();
                    h02Var6.b0();
                    if (h02Var6.S) {
                        h02Var6.m(sx1Var);
                    } else {
                        h02Var6.l0();
                    }
                    xs2.E(tg1.w, h02Var6, t33VarR2);
                    xs2.E(tg1.q, h02Var6, tr3VarQ5);
                    on0 on0Var5 = tg1.c;
                    if (h02Var6.S || !yf2.p(h02Var6.K(), Integer.valueOf(iS5))) {
                        du4.f(iS5, h02Var6, iS5, on0Var5);
                    }
                    xs2.E(tg1.m, h02Var6, j73VarW5);
                    nm0Var2.x(xa5Var, h02Var6, 6);
                    h02Var6.b(true);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ u43(Object obj, nm0 nm0Var, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.m = nm0Var;
        this.a = obj2;
    }

    public /* synthetic */ u43(Object obj, Object obj2, bz1 bz1Var, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = bz1Var;
    }
}
