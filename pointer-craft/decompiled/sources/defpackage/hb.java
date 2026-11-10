package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hb implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ob3 t;

    public /* synthetic */ hb(ob3 ob3Var, byte b) {
        this.j = b;
        this.t = ob3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        g73 g73Var = g73.g;
        l76 l76Var = oo0.g;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    Object objK = h02Var.K();
                    if (objK == l76Var) {
                        objK = new m9((byte) 3);
                        h02Var.i0(objK);
                    }
                    tg6.y(dj4.g(g73Var, false, (xy1) objK), (bz1) ob3Var.getValue(), h02Var, 0);
                }
                break;
            case 1:
                ob3Var.setValue(new vb5(v13.x((ne2) obj, (ne2) obj2)));
                break;
            case 2:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    Object objK2 = h02Var2.K();
                    if (objK2 == l76Var) {
                        objK2 = new ef(ob3Var, (byte) 18);
                        h02Var2.i0(objK2);
                    }
                    c93.s((my1) objK2, null, false, null, null, null, iz5.y, h02Var2, 805306374, 510);
                }
                break;
            case 3:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    g75.y(xs2.I(((Boolean) ob3Var.getValue()).booleanValue() ? R.string.connection_help_troubleshooting : R.string.menu_help, h02Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                }
                break;
            case 4:
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    h02Var4.Q();
                } else {
                    String str = (String) ob3Var.getValue();
                    Object objK3 = h02Var4.K();
                    if (objK3 == l76Var) {
                        objK3 = new ff(ob3Var, (byte) 11);
                        h02Var4.i0(objK3);
                    }
                    zy5.g(str, (xy1) objK3, null, null, false, null, h02Var4, 48);
                }
                break;
            case 5:
                h02 h02Var5 = (h02) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!h02Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    h02Var5.Q();
                } else {
                    km1.g.g(((Boolean) ob3Var.getValue()).booleanValue(), null, h02Var5, 384);
                }
                break;
            case 6:
                h02 h02Var6 = (h02) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!h02Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    h02Var6.Q();
                } else {
                    Object objK4 = h02Var6.K();
                    if (objK4 == l76Var) {
                        objK4 = new za4(ob3Var, (byte) 1);
                        h02Var6.i0(objK4);
                    }
                    c93.s((my1) objK4, null, false, null, null, null, gp4.m, h02Var6, 805306374, 510);
                }
                break;
            case 7:
                h02 h02Var7 = (h02) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!h02Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    h02Var7.Q();
                } else {
                    Object objK5 = h02Var7.K();
                    if (objK5 == l76Var) {
                        objK5 = new za4(ob3Var, (byte) 0);
                        h02Var7.i0(objK5);
                    }
                    c93.s((my1) objK5, null, false, null, null, null, gp4.j, h02Var7, 805306374, 510);
                }
                break;
            default:
                h02 h02Var8 = (h02) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!h02Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    h02Var8.Q();
                } else {
                    g75.y(String.valueOf(((Number) ob3Var.getValue()).intValue()), ue5.g0(mq4.m(g73Var, 32.0f, 0.0f, 0.0f, 14), 0.0f, 10.0f, 1), 0L, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, ((mf5) h02Var8.a(of5.g)).c, h02Var8, 48, 0, 130044);
                }
                break;
        }
        return og5Var;
    }
}
