package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a02 implements dz1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ ob3 m;
    public final /* synthetic */ ob3 q;
    public final /* synthetic */ Object s;
    public final /* synthetic */ List t;
    public final /* synthetic */ Object w;

    public a02(List list, ik1 ik1Var, gx3 gx3Var, ob3 ob3Var, xy1 xy1Var, ox0 ox0Var, ss2 ss2Var, ob3 ob3Var2, bz1 bz1Var) {
        this.t = list;
        this.w = ik1Var;
        this.c = gx3Var;
        this.m = ob3Var;
        this.a = xy1Var;
        this.i = ox0Var;
        this.b = ss2Var;
        this.q = ob3Var2;
        this.s = bz1Var;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        ob3 ob3Var;
        boolean z;
        byte b = this.j;
        og5 og5Var = og5.g;
        ob3 ob3Var2 = this.q;
        List list = this.t;
        l76 l76Var = oo0.g;
        xy1 xy1Var = this.a;
        Object obj5 = this.c;
        Object obj6 = this.s;
        Object obj7 = this.w;
        Object obj8 = this.i;
        Object obj9 = this.b;
        switch (b) {
            case 0:
                bq2 bq2Var = (bq2) obj;
                int iIntValue = ((Number) obj2).intValue();
                h02 h02Var = (h02) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ik1 ik1Var = (ik1) obj7;
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (h02Var.x(bq2Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= h02Var.n(iIntValue) ? 32 : 16;
                }
                if (!h02Var.N(i & 1, (i & 147) != 146)) {
                    h02Var.Q();
                } else {
                    ft0 ft0Var = (ft0) list.get(iIntValue);
                    h02Var.X(-652323487);
                    boolean z2 = ((jk1) ik1Var).indexOf(ft0Var) >= 30 && !((gx3) obj5).g;
                    nm0 nm0Var = z2 ? gz5.n : null;
                    ob3 ob3Var3 = this.m;
                    boolean zX = h02Var.x(ob3Var2) | h02Var.j(ik1Var) | h02Var.x(xy1Var) | h02Var.x(ob3Var3) | h02Var.l(z2) | h02Var.j((ox0) obj8) | h02Var.x((ss2) obj9) | h02Var.n(ft0Var.ordinal()) | h02Var.x((bz1) obj6);
                    Object objK = h02Var.K();
                    if (zX || objK == l76Var) {
                        objK = new wz1(this.a, z2, (ox0) obj8, ft0Var, (bz1) obj6, ob3Var3, (ss2) obj9, (ik1) obj7, this.q);
                        ob3Var = ob3Var3;
                        h02Var.i0(objK);
                    } else {
                        ob3Var = ob3Var3;
                    }
                    lr2.r(ue5.m0(1159575202, new k6(ft0Var, ob3Var, (byte) 2), h02Var), ue5.f0(mq4.r(ue5.I(g73.g, false, null, null, (my1) objK, 15), 1.0f), 16.0f, 4.0f), null, null, null, nm0Var, null, 0.0f, h02Var, 6, 476);
                    h02Var.b(false);
                }
                break;
            default:
                bq2 bq2Var2 = (bq2) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                h02 h02Var2 = (h02) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                xy1 xy1Var2 = (xy1) obj9;
                xy1 xy1Var3 = (xy1) obj8;
                xy1 xy1Var4 = (xy1) obj5;
                ao2 ao2Var = (ao2) obj7;
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (h02Var2.x(bq2Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= h02Var2.n(iIntValue3) ? 32 : 16;
                }
                int i3 = i2;
                if (!h02Var2.N(i3 & 1, (i3 & 147) != 146)) {
                    h02Var2.Q();
                } else {
                    sk2 sk2Var = (sk2) list.get(iIntValue3);
                    h02Var2.X(-1205167492);
                    j73 j73VarG = bq2.g(bq2Var2);
                    if (iIntValue3 > 0) {
                        h02Var2.X(1900789400);
                        boolean z3 = !((gx3) h02Var2.a(gp0.y)).g;
                        h02Var2.b(false);
                        z = z3;
                    } else {
                        h02Var2.X(-1205069507);
                        h02Var2.b(false);
                        z = false;
                    }
                    boolean z4 = !((gx3) h02Var2.a(gp0.y)).g;
                    Integer num = ao2Var.x().y;
                    boolean z5 = num != null && num.intValue() == sk2Var.g;
                    boolean zX2 = h02Var2.x(xy1Var) | h02Var2.j(sk2Var);
                    Object objK2 = h02Var2.K();
                    if (zX2 || objK2 == l76Var) {
                        objK2 = new vn2(xy1Var, sk2Var, (byte) 0);
                        h02Var2.i0(objK2);
                    }
                    my1 my1Var = (my1) objK2;
                    boolean zX3 = h02Var2.x(xy1Var4) | h02Var2.j(sk2Var);
                    Object objK3 = h02Var2.K();
                    if (zX3 || objK3 == l76Var) {
                        objK3 = new vn2(xy1Var4, sk2Var, (byte) 1);
                        h02Var2.i0(objK3);
                    }
                    my1 my1Var2 = (my1) objK3;
                    boolean zJ = h02Var2.j(sk2Var);
                    Object objK4 = h02Var2.K();
                    if (zJ || objK4 == l76Var) {
                        objK4 = new wn2(sk2Var, this.m, (byte) 0);
                        h02Var2.i0(objK4);
                    }
                    my1 my1Var3 = (my1) objK4;
                    boolean zJ2 = h02Var2.j(ao2Var) | h02Var2.j(sk2Var);
                    Object objK5 = h02Var2.K();
                    if (zJ2 || objK5 == l76Var) {
                        objK5 = new b71(ao2Var, sk2Var, (byte) 5);
                        h02Var2.i0(objK5);
                    }
                    my1 my1Var4 = (my1) objK5;
                    boolean zX4 = h02Var2.x(xy1Var3) | h02Var2.j(sk2Var);
                    Object objK6 = h02Var2.K();
                    if (zX4 || objK6 == l76Var) {
                        objK6 = new vn2(xy1Var3, sk2Var, (byte) 2);
                        h02Var2.i0(objK6);
                    }
                    my1 my1Var5 = (my1) objK6;
                    boolean zJ3 = h02Var2.j(sk2Var);
                    Object objK7 = h02Var2.K();
                    if (zJ3 || objK7 == l76Var) {
                        objK7 = new wn2(sk2Var, ob3Var2, (byte) 1);
                        h02Var2.i0(objK7);
                    }
                    my1 my1Var6 = (my1) objK7;
                    boolean zJ4 = h02Var2.j(sk2Var);
                    Object objK8 = h02Var2.K();
                    if (zJ4 || objK8 == l76Var) {
                        objK8 = new wn2(sk2Var, (ob3) obj6, (byte) 2);
                        h02Var2.i0(objK8);
                    }
                    my1 my1Var7 = (my1) objK8;
                    boolean zJ5 = h02Var2.j(sk2Var) | h02Var2.x(xy1Var2);
                    Object objK9 = h02Var2.K();
                    if (zJ5 || objK9 == l76Var) {
                        objK9 = new vn2(sk2Var, xy1Var2);
                        h02Var2.i0(objK9);
                    }
                    nc6.r(sk2Var, j73VarG, z, z4, z5, my1Var, my1Var2, my1Var3, my1Var4, my1Var5, my1Var6, my1Var7, (my1) objK9, h02Var2, 8);
                    h02Var2.b(false);
                }
                break;
        }
        return og5Var;
    }

    public a02(List list, ao2 ao2Var, xy1 xy1Var, xy1 xy1Var2, xy1 xy1Var3, xy1 xy1Var4, ob3 ob3Var, ob3 ob3Var2, ob3 ob3Var3) {
        this.t = list;
        this.w = ao2Var;
        this.a = xy1Var;
        this.c = xy1Var2;
        this.i = xy1Var3;
        this.b = xy1Var4;
        this.m = ob3Var;
        this.q = ob3Var2;
        this.s = ob3Var3;
    }
}
