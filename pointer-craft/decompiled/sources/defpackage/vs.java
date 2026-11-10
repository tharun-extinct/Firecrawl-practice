package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vs implements cz1 {
    public final /* synthetic */ g61 a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ xy1 m;
    public final /* synthetic */ ob3 q;
    public final /* synthetic */ List t;

    public /* synthetic */ vs(List list, g61 g61Var, xy1 xy1Var, ob3 ob3Var) {
        this.t = list;
        this.a = g61Var;
        this.m = xy1Var;
        this.q = ob3Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        l76 l76Var = oo0.g;
        ob3 ob3Var = this.q;
        xy1 xy1Var = this.m;
        g61 g61Var = this.a;
        List<g61> list = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h02Var.X(347775711);
                    for (g61 g61Var2 : list) {
                        nm0 nm0VarM0 = ue5.m0(-1647708777, new ft(g61Var2, g61Var, (byte) 0), h02Var);
                        boolean zX = h02Var.x(xy1Var) | h02Var.j(g61Var2);
                        Object objK = h02Var.K();
                        if (zX || objK == l76Var) {
                            objK = new gt(xy1Var, g61Var2, ob3Var, (byte) 0);
                            h02Var.i0(objK);
                        }
                        h02 h02Var2 = h02Var;
                        ad.y(nm0VarM0, (my1) objK, null, ue5.m0(1511401524, new ht(g61Var2, (byte) 0), h02Var), null, false, null, null, h02Var2, 3078, 500);
                        h02Var = h02Var2;
                    }
                    h02 h02Var3 = h02Var;
                    h02Var3.b(false);
                    if (list.isEmpty()) {
                        h02Var3.X(-2102939012);
                        Object objK2 = h02Var3.K();
                        if (objK2 == l76Var) {
                            objK2 = new ef(ob3Var, (byte) 3);
                            h02Var3.i0(objK2);
                        }
                        ad.y(hy5.j, (my1) objK2, null, null, null, false, null, null, h02Var3, 196662, 476);
                        h02Var3.b(false);
                    } else {
                        h02Var3.X(-2102735280);
                        h02Var3.b(false);
                    }
                } else {
                    h02Var.Q();
                }
                break;
            default:
                h02 h02Var4 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var4.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (g61 g61Var3 : list) {
                        boolean zP = yf2.p(g61Var3.t, g61Var != null ? g61Var.t : null);
                        nm0 nm0VarM1 = ue5.m0(-1987312819, new db((byte) 6, g61Var3, zP), h02Var4);
                        boolean zX2 = h02Var4.x(xy1Var) | h02Var4.j(g61Var3);
                        Object objK3 = h02Var4.K();
                        if (zX2 || objK3 == l76Var) {
                            objK3 = new gt(xy1Var, g61Var3, ob3Var, (byte) 2);
                            h02Var4.i0(objK3);
                        }
                        h02 h02Var5 = h02Var4;
                        ad.y(nm0VarM1, (my1) objK3, null, ue5.m0(595687786, new ht(g61Var3, (byte) 3), h02Var4), ue5.m0(-1406623543, new q80((byte) 3, zP), h02Var4), false, null, null, h02Var5, 27654, 484);
                        h02Var4 = h02Var5;
                    }
                } else {
                    h02Var4.Q();
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ vs(List list, xy1 xy1Var, g61 g61Var, ob3 ob3Var) {
        this.t = list;
        this.m = xy1Var;
        this.a = g61Var;
        this.q = ob3Var;
    }
}
