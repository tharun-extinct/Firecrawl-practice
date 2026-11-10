package defpackage;

import android.os.Bundle;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn0 implements cz1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ hn0(byte b) {
        this.j = b;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        qi1 qi1Var = qi1.j;
        sx1 sx1Var = um2.Z;
        l76 l76Var = oo0.g;
        g73 g73Var = g73.g;
        boolean z = false;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                ((Integer) obj3).getClass();
                ((mc3) obj).getClass();
                ho1 ho1Var = mq4.r;
                qx1 qx1VarI = pw5.I(h02Var);
                Bundle bundle = Bundle.EMPTY;
                wt2 wt2Var = (wt2) v13.a(((gu2) h02Var.a(ix2.g)).a(), h02Var).getValue();
                Object objK = h02Var.K();
                if (objK == l76Var) {
                    objK = in0.t;
                    h02Var.i0(objK);
                }
                c93.g(l83.class, ho1Var, qx1VarI, wt2Var, (xy1) objK, h02Var, 48);
                return og5Var;
            case 1:
                h02 h02Var2 = (h02) obj2;
                ((Integer) obj3).getClass();
                ((mc3) obj).getClass();
                ho1 ho1Var2 = mq4.r;
                qx1 qx1VarI2 = pw5.I(h02Var2);
                Bundle bundle2 = Bundle.EMPTY;
                wt2 wt2Var2 = (wt2) v13.a(((gu2) h02Var2.a(ix2.g)).a(), h02Var2).getValue();
                Object objK2 = h02Var2.K();
                if (objK2 == l76Var) {
                    objK2 = be.m;
                    h02Var2.i0(objK2);
                }
                c93.g(q93.class, ho1Var2, qx1VarI2, wt2Var2, (xy1) objK2, h02Var2, 48);
                return og5Var;
            case 2:
                h02 h02Var3 = (h02) obj2;
                ((Integer) obj3).getClass();
                ((mc3) obj).getClass();
                ho1 ho1Var3 = mq4.r;
                qx1 qx1VarI3 = pw5.I(h02Var3);
                Bundle bundle3 = Bundle.EMPTY;
                wt2 wt2Var3 = (wt2) v13.a(((gu2) h02Var3.a(ix2.g)).a(), h02Var3).getValue();
                Object objK3 = h02Var3.K();
                if (objK3 == l76Var) {
                    objK3 = be.q;
                    h02Var3.i0(objK3);
                }
                c93.g(hi3.class, ho1Var3, qx1VarI3, wt2Var3, (xy1) objK3, h02Var3, 48);
                return og5Var;
            case 3:
                h02 h02Var4 = (h02) obj2;
                ((Integer) obj3).getClass();
                ((mc3) obj).getClass();
                ho1 ho1Var4 = mq4.r;
                qx1 qx1VarI4 = pw5.I(h02Var4);
                Bundle bundle4 = Bundle.EMPTY;
                wt2 wt2Var4 = (wt2) v13.a(((gu2) h02Var4.a(ix2.g)).a(), h02Var4).getValue();
                Object objK4 = h02Var4.K();
                if (objK4 == l76Var) {
                    objK4 = be.a;
                    h02Var4.i0(objK4);
                }
                c93.g(hx3.class, ho1Var4, qx1VarI4, wt2Var4, (xy1) objK4, h02Var4, 48);
                return og5Var;
            case 4:
                v33 v33Var = (v33) obj;
                int iV = v33Var.V(10.0f);
                int i = iV * 2;
                us3 us3VarV = ((p33) obj2).v(zs0.t(i, 0, ((ws0) obj3).g));
                return v33Var.k0(us3VarV.j - i, us3VarV.t, qi1Var, new v2(us3VarV, iV, z ? (byte) 1 : (byte) 0));
            case 5:
                v33 v33Var2 = (v33) obj;
                final int iV2 = v33Var2.V(10.0f);
                int i2 = iV2 * 2;
                final us3 us3VarV2 = ((p33) obj2).v(zs0.t(0, i2, ((ws0) obj3).g));
                return v33Var2.k0(us3VarV2.j, us3VarV2.t - i2, qi1Var, new xy1() { // from class: u2
                    @Override // defpackage.xy1
                    public final Object a(Object obj4) {
                        ((ts3) obj4).j(us3VarV2, 0, -iV2, 0.0f);
                        return og5.g;
                    }
                });
            case 6:
                h02 h02Var5 = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var5.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    g75.y(xs2.I(R.string.message_purchase_pending_action, h02Var5), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var5, 0, 0, 262142);
                } else {
                    h02Var5.Q();
                }
                return og5Var;
            case 7:
                h02 h02Var6 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var6.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    g75.y(xs2.I(R.string.keyboard_banner_working, h02Var6), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var6, 0, 0, 262142);
                } else {
                    h02Var6.Q();
                }
                return og5Var;
            case 8:
                h02 h02Var7 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var7.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    g75.y(xs2.I(R.string.keyboard_banner_not_working, h02Var7), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var7, 0, 0, 262142);
                } else {
                    h02Var7.Q();
                }
                return og5Var;
            case 9:
                w75 w75Var = (w75) obj;
                h02 h02Var8 = (h02) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                w75Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? h02Var8.x(w75Var) : h02Var8.j(w75Var) ? 4 : 2;
                }
                if (h02Var8.N(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    g75.y(a11.C(w75Var, h02Var8), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((mf5) h02Var8.a(of5.g)).t, h02Var8, 0, 24960, 110590);
                } else {
                    h02Var8.Q();
                }
                return og5Var;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                h02 h02Var9 = (h02) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= h02Var9.l(zBooleanValue) ? 4 : 2;
                }
                if (!h02Var9.N(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    h02Var9.Q();
                } else if (zBooleanValue) {
                    h02Var9.X(1225810114);
                    b04.n(mq4.r(g73Var, 1.0f), 0L, 0L, 0, 0.0f, h02Var9, 6);
                    h02Var9.b(false);
                } else {
                    h02Var9.X(1225897813);
                    mq2.y(h02Var9, mq4.n(g73Var, 4.0f));
                    h02Var9.b(false);
                }
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                h02 h02Var10 = (h02) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var10.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    t92.g(k33.I(), null, mq4.j(g73Var, 48.0f), jj0.y(0.8f, ((rj0) h02Var10.a(tj0.g)).g), h02Var10, 432, 0);
                } else {
                    h02Var10.Q();
                }
                return og5Var;
            case 12:
                h02 h02Var11 = (h02) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var11.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    t92.g(k33.I(), null, mq4.j(g73Var, 48.0f), jj0.y(0.8f, ((rj0) h02Var11.a(tj0.g)).g), h02Var11, 432, 0);
                } else {
                    h02Var11.Q();
                }
                return og5Var;
            case 13:
                h02 h02Var12 = (h02) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var12.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    g75.y(xs2.I(R.string.device_button_use, h02Var12), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var12, 0, 0, 262142);
                } else {
                    h02Var12.Q();
                }
                return og5Var;
            case 14:
                h02 h02Var13 = (h02) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var13.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    j73 j73VarE0 = ue5.e0(g73Var, 16.0f);
                    kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var13, 48);
                    int iHashCode = Long.hashCode(h02Var13.T);
                    tr3 tr3VarQ = h02Var13.q();
                    j73 j73VarW = m50.W(h02Var13, j73VarE0);
                    jo0.n.getClass();
                    h02Var13.b0();
                    if (h02Var13.S) {
                        h02Var13.m(sx1Var);
                    } else {
                        h02Var13.l0();
                    }
                    xs2.E(tg1.w, h02Var13, kb4VarG);
                    xs2.E(tg1.q, h02Var13, tr3VarQ);
                    xs2.E(tg1.c, h02Var13, Integer.valueOf(iHashCode));
                    xs2.D(h02Var13);
                    xs2.E(tg1.m, h02Var13, j73VarW);
                    g75.y(xs2.I(R.string.device_list_enable_notifications, h02Var13), new tp2(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var13, 0, 0, 262140);
                    mq2.y(h02Var13, mq4.q(g73Var, 8.0f));
                    ue5.u(null, h02Var13, 0);
                    h02Var13.b(true);
                } else {
                    h02Var13.Q();
                }
                return og5Var;
            case kq2.x /* 15 */:
                h02 h02Var14 = (h02) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var14.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    g75.y(xs2.I(R.string.compatibility_mode_text, h02Var14), ue5.i0(g73.g, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var14.a(of5.g)).m, h02Var14, 48, 0, 131068);
                } else {
                    h02Var14.Q();
                }
                return og5Var;
            case 16:
                h02 h02Var15 = (h02) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var15.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    g75.y(xs2.I(R.string.compatibility_learn_more, h02Var15), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var15, 0, 0, 262142);
                } else {
                    h02Var15.Q();
                }
                return og5Var;
            case 17:
                h02 h02Var16 = (h02) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var16.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    t92.g(v70.h(), null, mq4.j(g73Var, 48.0f), jj0.y(0.8f, ((rj0) h02Var16.a(tj0.g)).g), h02Var16, 432, 0);
                } else {
                    h02Var16.Q();
                }
                return og5Var;
            case 18:
                h02 h02Var17 = (h02) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((bq2) obj).getClass();
                if (h02Var17.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    ue5.i(0, h02Var17);
                } else {
                    h02Var17.Q();
                }
                return og5Var;
            case 19:
                h02 h02Var18 = (h02) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var18.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    g75.y(xs2.I(R.string.device_setup_connect_another_device, h02Var18), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var18, 0, 0, 262142);
                } else {
                    h02Var18.Q();
                }
                return og5Var;
            case 20:
                h02 h02Var19 = (h02) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((bq2) obj).getClass();
                if (h02Var19.N(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    uz4.g(ue5.e0(mq4.r(g73Var, 1.0f), 8.0f), na4.y(16.0f), ((rj0) h02Var19.a(tj0.g)).F, 0L, 0.0f, 0.0f, null, a11.t, h02Var19, 12582918, 120);
                } else {
                    h02Var19.Q();
                }
                return og5Var;
            case 21:
                h02 h02Var20 = (h02) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var20.N(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    b04.g(mq4.j(ue5.i0(g73.g, 8.0f, 0.0f, 0.0f, 0.0f, 14), b80.v), ((rj0) h02Var20.a(tj0.g)).t, 2.0f, 0L, 0, 0.0f, h02Var20, 384, 56);
                } else {
                    h02Var20.Q();
                }
                return og5Var;
            case 22:
                h02 h02Var21 = (h02) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var21.N(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    g75.y(xs2.I(R.string.connect_from_button, h02Var21), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var21, 0, 0, 262142);
                } else {
                    h02Var21.Q();
                }
                return og5Var;
            case 23:
                h02 h02Var22 = (h02) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var22.N(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    m50.p(ue5.g0(g73Var, 0.0f, 16.0f, 1), 0.0f, 0L, h02Var22, 6, 6);
                    j73 j73VarR = mq4.r(g73Var, 1.0f);
                    kb4 kb4VarG2 = jb4.g(v70.y, hi0.u, h02Var22, 48);
                    int iHashCode2 = Long.hashCode(h02Var22.T);
                    tr3 tr3VarQ2 = h02Var22.q();
                    j73 j73VarW2 = m50.W(h02Var22, j73VarR);
                    jo0.n.getClass();
                    h02Var22.b0();
                    if (h02Var22.S) {
                        h02Var22.m(sx1Var);
                    } else {
                        h02Var22.l0();
                    }
                    xs2.E(tg1.w, h02Var22, kb4VarG2);
                    xs2.E(tg1.q, h02Var22, tr3VarQ2);
                    xs2.E(tg1.c, h02Var22, Integer.valueOf(iHashCode2));
                    xs2.D(h02Var22);
                    xs2.E(tg1.m, h02Var22, j73VarW2);
                    g75.y(xs2.I(R.string.connect_from_progress, h02Var22), new tp2(1.0f, true), ((rj0) h02Var22.a(tj0.g)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var22.a(of5.g)).w, h02Var22, 0, 0, 131064);
                    b04.g(mq4.j(ue5.e0(g73Var, 8.0f), 32.0f), 0L, 2.0f, 0L, 0, 0.0f, h02Var22, 390, 58);
                    h02Var22.b(true);
                } else {
                    h02Var22.Q();
                }
                return og5Var;
            case 24:
                h02 h02Var23 = (h02) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var23.N(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    b04.g(mq4.j(ue5.i0(g73.g, 8.0f, 0.0f, 0.0f, 0.0f, 14), b80.v), ((rj0) h02Var23.a(tj0.g)).t, 2.0f, 0L, 0, 0.0f, h02Var23, 384, 56);
                } else {
                    h02Var23.Q();
                }
                return og5Var;
            case 25:
                h02 h02Var24 = (h02) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var24.N(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    b04.g(mq4.j(ue5.i0(g73.g, 8.0f, 0.0f, 0.0f, 0.0f, 14), b80.v), 0L, 2.0f, 0L, 0, 0.0f, h02Var24, 384, 58);
                } else {
                    h02Var24.Q();
                }
                return og5Var;
            case 26:
                h02 h02Var25 = (h02) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var25.N(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    g75.y(xs2.I(R.string.connection_show_notifications, h02Var25), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var25, 0, 0, 262142);
                } else {
                    h02Var25.Q();
                }
                return og5Var;
            case 27:
                h02 h02Var26 = (h02) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var26.N(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    g75.y(xs2.I(R.string.device_setup_try_again, h02Var26), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var26, 0, 0, 262142);
                } else {
                    h02Var26.Q();
                }
                return og5Var;
            case 28:
                h02 h02Var27 = (h02) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (!h02Var27.N(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    h02Var27.Q();
                }
                return og5Var;
            default:
                h02 h02Var28 = (h02) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var28.N(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    g75.y("Pull me down (Enabled)", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var28, 6, 0, 262142);
                } else {
                    h02Var28.Q();
                }
                return og5Var;
        }
    }
}
