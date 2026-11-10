package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class g11 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ g11(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        l76 l76Var = oo0.g;
        sx1 sx1Var = um2.Z;
        g73 g73Var = g73.g;
        og5 og5Var = og5.g;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Number) obj2).intValue();
                ty tyVar = (ty) obj3;
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    String strB = aq2.b(R.string.m3c_dialog, h02Var);
                    j73 j73Var = (j73) tyVar.a;
                    bo3 bo3Var = p6.g;
                    j73 j73VarM = mq4.m(j73Var, 280.0f, 0.0f, 560.0f, 10);
                    boolean zX = h02Var.x(strB);
                    Object objK = h02Var.K();
                    if (zX || objK == l76Var) {
                        objK = new oz(strB, (byte) 3);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN = j73VarM.n(dj4.g(g73Var, false, (xy1) objK));
                    t33 t33VarR = z50.r(hi0.t, true);
                    int iS = pw5.s(h02Var);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, j73VarN);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var);
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
                    du4.h(0, (nm0) tyVar.q, h02Var, true);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                pe3 pe3Var = (pe3) obj3;
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    j73 j73VarG = dj4.g(mq4.y(yf2.d0(mq4.r(g73Var, 1.0f), pe3Var.n), 0.0f, oe3.g, 1), false, new vy3((byte) 8));
                    yq yqVar = new yq(oe3.y, true, new l0((byte) 2));
                    j00 j00Var = hi0.u;
                    nm0 nm0Var = pe3Var.v;
                    kb4 kb4VarG = jb4.g(yqVar, j00Var, h02Var2, 54);
                    int iS2 = pw5.s(h02Var2);
                    tr3 tr3VarQ2 = h02Var2.q();
                    j73 j73VarW2 = m50.W(h02Var2, j73VarG);
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
            case 2:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    Object objK2 = h02Var3.K();
                    if (objK2 == l76Var) {
                        objK2 = new m92((byte) 14);
                        h02Var3.i0(objK2);
                    }
                    j73 j73VarG2 = dj4.g(g73Var, false, (xy1) objK2);
                    ob3 ob3Var = (ob3) obj3;
                    t33 t33VarR2 = z50.r(hi0.t, false);
                    int iS3 = pw5.s(h02Var3);
                    tr3 tr3VarQ3 = h02Var3.q();
                    j73 j73VarW3 = m50.W(h02Var3, j73VarG2);
                    jo0.n.getClass();
                    h02Var3.b0();
                    if (h02Var3.S) {
                        h02Var3.m(sx1Var);
                    } else {
                        h02Var3.l0();
                    }
                    xs2.E(tg1.w, h02Var3, t33VarR2);
                    xs2.E(tg1.q, h02Var3, tr3VarQ3);
                    on0 on0Var3 = tg1.c;
                    if (h02Var3.S || !yf2.p(h02Var3.K(), Integer.valueOf(iS3))) {
                        du4.f(iS3, h02Var3, iS3, on0Var3);
                    }
                    xs2.E(tg1.m, h02Var3, j73VarW3);
                    du4.o(0, (bz1) ob3Var.getValue(), h02Var3, true);
                }
                break;
            case 3:
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    h02Var4.Q();
                } else {
                    z50.g(db2.g(y94.h(ue5.X(g73Var, "indicatorRipple"), vn4.y(sc6.n, h02Var4)), (u13) obj3, k94.g(0.0f, 7, 0L, false)), h02Var4, 0);
                }
                break;
            case 4:
                h02 h02Var5 = (h02) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!h02Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    h02Var5.Q();
                } else {
                    g75.y((String) obj3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var5, 0, 0, 262142);
                }
                break;
            case 5:
                h02 h02Var6 = (h02) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!h02Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    h02Var6.Q();
                } else {
                    g75.y(((bs4) ((wr4) obj3)).g.g, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var6, 0, 0, 262142);
                }
                break;
            case 6:
                h02 h02Var7 = (h02) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!h02Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    h02Var7.Q();
                } else {
                    g75.y(xq2.n((o04) obj3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var7, 0, 0, 262142);
                }
                break;
            default:
                h02 h02Var8 = (h02) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!h02Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    h02Var8.Q();
                } else {
                    String strI = ((sk2) obj3).y;
                    if (strI == null) {
                        h02Var8.X(1474013795);
                        strI = xs2.I(R.string.widget_unnamed_layout, h02Var8);
                    } else {
                        h02Var8.X(1474013330);
                    }
                    h02Var8.b(false);
                    g75.y(strI, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var8, 0, 0, 262142);
                }
                break;
        }
        return og5Var;
    }
}
