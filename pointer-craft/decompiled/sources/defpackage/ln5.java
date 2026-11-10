package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ln5 implements cz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ob3 t;

    public /* synthetic */ ln5(ob3 ob3Var, byte b) {
        this.j = b;
        this.t = ob3Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        l76 l76Var = oo0.g;
        g73 g73Var = g73.g;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.t;
        switch (b) {
            case 0:
                zn3 zn3Var = (zn3) obj;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                zn3Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= h02Var.x(zn3Var) ? 4 : 2;
                }
                if (!h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    h02Var.Q();
                } else {
                    j73 j73VarF0 = ue5.f0(gp4.P(ue5.d0(mq4.r, zn3Var), gp4.O(h02Var), true), 32.0f, 24.0f);
                    ek0 ek0VarG = ck0.g(v70.v, hi0.o, h02Var, 54);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, j73VarF0);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, ek0VarG);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    m50.u(aq2.k(R.drawable.ic_tv_remote, h02Var), mq4.j(g73Var, 96.0f), null, null, 0.0f, h02Var, 440, 120);
                    mq2.y(h02Var, mq4.n(g73Var, 16.0f));
                    xs2.y(null, h02Var, 0, 1);
                    mq2.y(h02Var, mq4.n(g73Var, 16.0f));
                    String strI = xs2.I(R.string.widget_pro_title, h02Var);
                    vf1 vf1Var = of5.g;
                    g75.y(strI, null, 0L, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(vf1Var)).l, h02Var, 0, 0, 130046);
                    mq2.y(h02Var, mq4.n(g73Var, 8.0f));
                    g75.y(xs2.I(R.string.widget_pro_description, h02Var), null, ((rj0) h02Var.a(tj0.g)).u, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(vf1Var)).m, h02Var, 0, 0, 130042);
                    mq2.y(h02Var, mq4.n(g73Var, 24.0f));
                    Object objK = h02Var.K();
                    if (objK == l76Var) {
                        objK = new za4(ob3Var, (byte) 12);
                        h02Var.i0(objK);
                    }
                    c93.x((my1) objK, null, false, null, null, null, null, null, d06.r, h02Var, 805306374, 510);
                    h02Var.b(true);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    h02Var2.Q();
                } else {
                    Object objK2 = h02Var2.K();
                    if (objK2 == l76Var) {
                        objK2 = new za4(ob3Var, (byte) 2);
                        h02Var2.i0(objK2);
                    }
                    k33.w((my1) objK2, null, false, null, null, gp4.c, h02Var2, 1572870, 62);
                }
                break;
            default:
                xa5 xa5Var = (xa5) obj;
                h02 h02Var3 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                xa5Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? h02Var3.x(xa5Var) : h02Var3.j(xa5Var) ? 4 : 2;
                }
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    h02Var3.Q();
                } else {
                    ua5.g(xa5Var, mq4.b(g73Var), 0.0f, na4.g, 0L, 0L, ue5.m0(1391863021, new hb(ob3Var, (byte) 8), h02Var3), h02Var3, (iIntValue3 & 14) | 805306416, 246);
                }
                break;
        }
        return og5Var;
    }
}
