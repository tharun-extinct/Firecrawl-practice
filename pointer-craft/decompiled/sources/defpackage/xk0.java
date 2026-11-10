package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xk0 implements dz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ List t;

    public /* synthetic */ xk0(List list, Object obj, byte b) {
        this.j = b;
        this.t = list;
        this.a = obj;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.j;
        g73 g73Var = g73.g;
        l76 l76Var = oo0.g;
        og5 og5Var = og5.g;
        List list = this.t;
        boolean z = true;
        Object obj5 = this.a;
        byte b2 = 6;
        switch (b) {
            case 0:
                bq2 bq2Var = (bq2) obj;
                int iIntValue = ((Number) obj2).intValue();
                h02 h02Var = (h02) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (h02Var.x(bq2Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= h02Var.n(iIntValue) ? 32 : 16;
                }
                if (!h02Var.N(i & 1, (i & 147) != 146)) {
                    h02Var.Q();
                } else {
                    il2 il2Var = (il2) list.get(iIntValue);
                    h02Var.X(-1018983335);
                    vx5.g(il2Var, (xy1) obj5, h02Var, 0);
                    m50.p(ue5.g0(g73Var, 16.0f, 0.0f, 2), 0.0f, 0L, h02Var, 6, 6);
                    h02Var.b(false);
                }
                break;
            case 1:
                bq2 bq2Var2 = (bq2) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                h02 h02Var2 = (h02) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                xy1 xy1Var = (xy1) obj5;
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (h02Var2.x(bq2Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= h02Var2.n(iIntValue3) ? 32 : 16;
                }
                if (!h02Var2.N(i2 & 1, (i2 & 147) != 146)) {
                    h02Var2.Q();
                } else {
                    qp0 qp0Var = (qp0) list.get(iIntValue3);
                    h02Var2.X(-1435090816);
                    boolean zX = h02Var2.x(xy1Var) | h02Var2.x(qp0Var);
                    Object objK = h02Var2.K();
                    if (zX || objK == l76Var) {
                        objK = new b71(xy1Var, qp0Var, b2);
                        h02Var2.i0(objK);
                    }
                    c93.x((my1) objK, ue5.g0(mq4.r(g73Var, 1.0f), 0.0f, 8.0f, 1), false, null, null, null, null, null, ue5.m0(-578037313, new w31(qp0Var, (byte) 3), h02Var2), h02Var2, 805306416, 508);
                    h02Var2.b(false);
                }
                break;
            case 2:
                bq2 bq2Var3 = (bq2) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                h02 h02Var3 = (h02) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                xy1 xy1Var2 = (xy1) obj5;
                int i3 = (iIntValue6 & 6) == 0 ? iIntValue6 | (h02Var3.x(bq2Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i3 |= h02Var3.n(iIntValue5) ? 32 : 16;
                }
                if (!h02Var3.N(i3 & 1, (i3 & 147) != 146)) {
                    h02Var3.Q();
                } else {
                    sk2 sk2Var = (sk2) list.get(iIntValue5);
                    h02Var3.X(757358123);
                    nm0 nm0VarM0 = ue5.m0(1525554485, new g11(sk2Var, (byte) 7), h02Var3);
                    boolean zX2 = h02Var3.x(xy1Var2) | h02Var3.j(sk2Var);
                    Object objK2 = h02Var3.K();
                    if (zX2 || objK2 == l76Var) {
                        objK2 = new vn2(xy1Var2, sk2Var, (byte) 4);
                        h02Var3.i0(objK2);
                    }
                    lr2.r(nm0VarM0, ue5.I(g73.g, false, null, null, (my1) objK2, 15), null, null, null, null, null, 0.0f, h02Var3, 6, 508);
                    m50.p(null, 0.0f, 0L, h02Var3, 0, 7);
                    h02Var3.b(false);
                }
                break;
            default:
                bq2 bq2Var4 = (bq2) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                h02 h02Var4 = (h02) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                st4 st4Var = (st4) obj5;
                int i4 = (iIntValue8 & 6) == 0 ? iIntValue8 | (h02Var4.x(bq2Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i4 |= h02Var4.n(iIntValue7) ? 32 : 16;
                }
                if (!h02Var4.N(i4 & 1, (i4 & 147) != 146)) {
                    h02Var4.Q();
                } else {
                    o04 o04Var = (o04) list.get(iIntValue7);
                    h02Var4.X(-1081939676);
                    boolean zX3 = h02Var4.x(st4Var);
                    if ((((i4 & 112) ^ 48) <= 32 || !h02Var4.n(iIntValue7)) && (i4 & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = zX3 | z;
                    Object objK3 = h02Var4.K();
                    if (z2 || objK3 == l76Var) {
                        objK3 = new on5(st4Var, iIntValue7);
                        h02Var4.i0(objK3);
                    }
                    lr2.r(ue5.m0(571352839, new g11(o04Var, b2), h02Var4), ue5.I(g73.g, false, null, null, (my1) objK3, 15), null, null, null, ue5.m0(-867467742, new qn5(st4Var, iIntValue7), h02Var4), null, 0.0f, h02Var4, 196614, 476);
                    m50.p(null, 0.0f, 0L, h02Var4, 0, 7);
                    h02Var4.b(false);
                }
                break;
        }
        return og5Var;
    }
}
