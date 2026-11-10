package defpackage;

import android.os.Bundle;
import io.appground.blek.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ab4 implements cz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ ab4(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        l76 l76Var = oo0.g;
        boolean z = false;
        og5 og5Var = og5.g;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                jd3 jd3Var = (jd3) obj4;
                h02 h02Var = (h02) obj2;
                ((Integer) obj3).getClass();
                ((mc3) obj).getClass();
                ho1 ho1Var = mq4.r;
                boolean zJ = h02Var.j(jd3Var);
                Object objK = h02Var.K();
                if (zJ || objK == l76Var) {
                    objK = new xa4(jd3Var, z ? (byte) 1 : (byte) 0);
                    h02Var.i0(objK);
                }
                qx1 qx1VarI = pw5.I(h02Var);
                Bundle bundle = Bundle.EMPTY;
                c93.g(vi2.class, ho1Var, qx1VarI, (wt2) v13.a(((gu2) h02Var.a(ix2.g)).a(), h02Var).getValue(), (xy1) objK, h02Var, 48);
                break;
            case 1:
                ik ikVar = (ik) obj4;
                h02 h02Var2 = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h02Var2.Q();
                } else {
                    g75.y(((hk) ikVar).y(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262142);
                }
                break;
            case 2:
                my1 my1Var = (my1) obj4;
                String str = (String) obj;
                h02 h02Var3 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                str.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= h02Var3.x(str) ? 4 : 2;
                }
                if (!h02Var3.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    h02Var3.Q();
                } else {
                    g73 g73Var = g73.g;
                    j73 j73VarR = mq4.r(g73Var, 1.0f);
                    t33 t33VarR = z50.r(hi0.t, false);
                    int iHashCode = Long.hashCode(h02Var3.T);
                    tr3 tr3VarQ = h02Var3.q();
                    j73 j73VarW = m50.W(h02Var3, j73VarR);
                    jo0.n.getClass();
                    h02Var3.b0();
                    if (h02Var3.S) {
                        h02Var3.m(um2.Z);
                    } else {
                        h02Var3.l0();
                    }
                    xs2.E(tg1.w, h02Var3, t33VarR);
                    xs2.E(tg1.q, h02Var3, tr3VarQ);
                    xs2.E(tg1.c, h02Var3, Integer.valueOf(iHashCode));
                    xs2.D(h02Var3);
                    xs2.E(tg1.m, h02Var3, j73VarW);
                    fg6.y(e60.g.g(ue5.e0(ue5.I(g73Var, false, null, null, my1Var, 15), 8.0f), hi0.w), null, null, null, 0L, 0L, 0L, 0L, ue5.m0(431825347, new wo(str, z ? (byte) 1 : (byte) 0), h02Var3), h02Var3, 805306368, 510);
                    h02Var3.b(true);
                }
                break;
            case 3:
                uk1 uk1Var = (uk1) obj4;
                h02 h02Var4 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (!h02Var4.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    h02Var4.Q();
                } else {
                    g75.r(xs2.e(uk1Var.g, new Object[0], h02Var4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((mf5) h02Var4.a(of5.g)).m, h02Var4, 0, 0, 262142);
                }
                break;
            case 4:
                ob3 ob3Var = (ob3) obj4;
                zn3 zn3Var = (zn3) obj;
                h02 h02Var5 = (h02) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i = MainActivity.Q;
                zn3Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= h02Var5.x(zn3Var) ? 4 : 2;
                }
                if (!h02Var5.N(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    h02Var5.Q();
                } else {
                    Object objK2 = h02Var5.K();
                    if (objK2 == l76Var) {
                        objK2 = new ln(ob3Var, (byte) 7);
                        h02Var5.i0(objK2);
                    }
                    c93.c(6, (my1) objK2, h02Var5, ue5.d0(g73.g, zn3Var));
                }
                break;
            default:
                ((sj4) obj4).r();
                break;
        }
        return og5Var;
    }
}
