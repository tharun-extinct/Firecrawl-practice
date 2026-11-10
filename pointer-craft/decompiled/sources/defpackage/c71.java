package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c71 implements dz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object w;

    public c71(List list, xy1 xy1Var, ox0 ox0Var, ss2 ss2Var, xy1 xy1Var2) {
        this.j = (byte) 0;
        this.t = list;
        this.a = xy1Var;
        this.q = ox0Var;
        this.w = ss2Var;
        this.m = xy1Var2;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        my1 my1Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        l76 l76Var = oo0.g;
        Object obj5 = this.t;
        Object obj6 = this.a;
        Object obj7 = this.m;
        Object obj8 = this.q;
        Object obj9 = this.w;
        switch (b) {
            case 0:
                bq2 bq2Var = (bq2) obj;
                int iIntValue = ((Number) obj2).intValue();
                h02 h02Var = (h02) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                xy1 xy1Var = (xy1) obj7;
                ss2 ss2Var = (ss2) obj9;
                ox0 ox0Var = (ox0) obj8;
                xy1 xy1Var2 = (xy1) obj6;
                int i = (iIntValue2 & 6) == 0 ? (h02Var.x(bq2Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= h02Var.n(iIntValue) ? 32 : 16;
                }
                if (!h02Var.N(i & 1, (i & 147) != 146)) {
                    h02Var.Q();
                } else {
                    g61 g61Var = (g61) ((List) obj5).get(iIntValue);
                    h02Var.X(-1679969917);
                    boolean zX = h02Var.x(xy1Var2) | h02Var.j(g61Var) | h02Var.j(ox0Var) | h02Var.x(ss2Var);
                    Object objK = h02Var.K();
                    if (zX || objK == l76Var) {
                        objK = new a71(xy1Var2, g61Var, ox0Var, ss2Var);
                        h02Var.i0(objK);
                    }
                    my1 my1Var2 = (my1) objK;
                    boolean zX2 = h02Var.x(xy1Var) | h02Var.j(g61Var);
                    Object objK2 = h02Var.K();
                    if (zX2 || objK2 == l76Var) {
                        objK2 = new b71(xy1Var, g61Var, (byte) 0);
                        h02Var.i0(objK2);
                    }
                    ue5.q(g61Var, my1Var2, (my1) objK2, bq2.g(bq2Var), h02Var, 0);
                    h02Var.b(false);
                }
                break;
            case 1:
                bq2 bq2Var2 = (bq2) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                h02 h02Var2 = (h02) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                gx3 gx3Var = (gx3) obj7;
                ob3 ob3Var = (ob3) obj9;
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (h02Var2.x(bq2Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= h02Var2.n(iIntValue3) ? 32 : 16;
                }
                if (!h02Var2.N(i2 & 1, (i2 & 147) != 146)) {
                    h02Var2.Q();
                } else {
                    ft0 ft0Var = (ft0) ((List) obj5).get(iIntValue3);
                    h02Var2.X(283720009);
                    boolean z2 = ((jk1) ((ik1) obj6)).indexOf(ft0Var) > 30 && !gx3Var.g;
                    j73 j73VarR = mq4.r(g73.g, 1.0f);
                    boolean zJ = h02Var2.j(gx3Var) | h02Var2.l(z2) | h02Var2.x((bz1) obj8) | h02Var2.n(ft0Var.ordinal()) | h02Var2.x(ob3Var);
                    Object objK3 = h02Var2.K();
                    if (zJ || objK3 == l76Var) {
                        boolean z3 = z2;
                        objK3 = new xz1((gx3) obj7, z3, (bz1) obj8, ft0Var, (ob3) obj9);
                        z = z3;
                        h02Var2.i0(objK3);
                    } else {
                        z = z2;
                    }
                    lr2.r(ue5.m0(37139344, new yz1(ft0Var, (byte) 0), h02Var2), ue5.I(j73VarR, false, null, null, (my1) objK3, 15), null, ue5.m0(-2061301587, new yz1(ft0Var, (byte) 1), h02Var2), null, ue5.m0(-596950677, new zz1(z, ft0Var, ob3Var), h02Var2), null, ((ft0) ob3Var.getValue()) == ft0Var ? 12.0f : 0.0f, h02Var2, 199686, 340);
                    h02Var2.b(false);
                }
                break;
            case 2:
                bq2 bq2Var3 = (bq2) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                h02 h02Var3 = (h02) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                sj2 sj2Var = (sj2) obj7;
                xy1 xy1Var3 = (xy1) obj6;
                int i3 = (iIntValue6 & 6) == 0 ? iIntValue6 | (h02Var3.x(bq2Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i3 |= h02Var3.n(iIntValue5) ? 32 : 16;
                }
                if (!h02Var3.N(i3 & 1, (i3 & 147) != 146)) {
                    h02Var3.Q();
                } else {
                    hm2 hm2Var = (hm2) ((List) obj5).get(iIntValue5);
                    h02Var3.X(1360558593);
                    bw4 bw4VarR = ug.r((yf2.p(hm2Var.r, (String) ((bw4) obj8).getValue()) ? qv1.o : qv1.u).j, h02Var3);
                    boolean z4 = hm2Var.n;
                    boolean zX3 = h02Var3.x(xy1Var3) | h02Var3.j(hm2Var);
                    Object objK4 = h02Var3.K();
                    if (zX3 || objK4 == l76Var) {
                        objK4 = new b71(xy1Var3, hm2Var, (byte) 2);
                        h02Var3.i0(objK4);
                    }
                    my1 my1Var3 = (my1) objK4;
                    j73 j73VarG = bq2.g(bq2Var3);
                    byte b2 = 3;
                    if (((List) ((bw4) obj9).getValue()).size() > 1) {
                        h02Var3.X(1360929104);
                        boolean zJ2 = h02Var3.j(sj2Var) | h02Var3.j(hm2Var);
                        Object objK5 = h02Var3.K();
                        if (zJ2 || objK5 == l76Var) {
                            objK5 = new b71(sj2Var, hm2Var, (byte) 3);
                            h02Var3.i0(objK5);
                        }
                        my1Var = (my1) objK5;
                        h02Var3.b(false);
                    } else {
                        h02Var3.X(1361066836);
                        h02Var3.b(false);
                        my1Var = null;
                    }
                    zx5.y(z4, my1Var3, j73VarG, my1Var, ue5.m0(-1118920428, new k6(hm2Var, bw4VarR, b2), h02Var3), h02Var3, 24576, 0);
                    h02Var3.b(false);
                }
                break;
            default:
                hm3 hm3Var = (hm3) obj8;
                bq2 bq2Var4 = (bq2) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                h02 h02Var4 = (h02) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                xy1 xy1Var4 = (xy1) obj6;
                int i4 = (iIntValue8 & 6) == 0 ? iIntValue8 | (h02Var4.x(bq2Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i4 |= h02Var4.n(iIntValue7) ? 32 : 16;
                }
                if (!h02Var4.N(i4 & 1, (i4 & 147) != 146)) {
                    h02Var4.Q();
                } else {
                    String str = (String) ((Object[]) obj5)[iIntValue7];
                    h02Var4.X(-168720980);
                    nm0 nm0VarM0 = ue5.m0(480640773, new fm4((String[]) obj7, iIntValue7, hm3Var, (st4) obj9, str), h02Var4);
                    boolean zX4 = h02Var4.x(xy1Var4) | h02Var4.x(str);
                    Object objK6 = h02Var4.K();
                    if (zX4 || objK6 == l76Var) {
                        objK6 = new gm4(xy1Var4, str, (byte) 0);
                        h02Var4.i0(objK6);
                    }
                    lr2.r(nm0VarM0, ue5.I(g73.g, false, null, null, (my1) objK6, 15), null, null, null, ue5.m0(764707978, new hm4(hm3Var, (st4) obj9, str, xy1Var4, (byte) 0), h02Var4), null, 0.0f, h02Var4, 196614, 476);
                    h02Var4.b(false);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ c71(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
        this.w = obj5;
    }
}
