package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class os implements bz1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ os(byte b) {
        this.j = b;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        sx1 sx1Var = um2.Z;
        g73 g73Var = g73.g;
        l76 l76Var = oo0.g;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ot.r(aq2.J(1), (h02) obj);
                return og5Var;
            case 1:
                ((Integer) obj2).getClass();
                ot.z(aq2.J(1), (h02) obj);
                return og5Var;
            case 2:
                String str = (String) obj;
                dx0 dx0Var = (dx0) obj2;
                str.getClass();
                dx0Var.getClass();
                if (str.length() == 0) {
                    return dx0Var.toString();
                }
                return str + ", " + dx0Var;
            case 3:
                String str2 = (String) obj;
                n22 n22Var = (n22) obj2;
                if (str2.length() == 0) {
                    return n22Var.toString();
                }
                return str2 + ", " + n22Var;
            case 4:
                StringBuilder sb = (StringBuilder) obj;
                h73 h73Var = (h73) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(h73Var);
                return sb;
            case 5:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                }
                return og5Var;
            case 6:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                }
                return og5Var;
            case 7:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g75.y(xs2.I(R.string.dialog_quit_title, h02Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                } else {
                    h02Var3.Q();
                }
                return og5Var;
            case 8:
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    g75.y(xs2.I(R.string.dialog_quit_message, h02Var4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var4, 0, 0, 262142);
                } else {
                    h02Var4.Q();
                }
                return og5Var;
            case 9:
                h02 h02Var5 = (h02) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && h02Var5.e()) {
                    h02Var5.Q();
                }
                return og5Var;
            case 10:
                h02 h02Var6 = (h02) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (h02Var6.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ot.z(0, h02Var6);
                } else {
                    h02Var6.Q();
                }
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                h02 h02Var7 = (h02) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (h02Var7.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    j73 j73VarJ = mq4.j(g73Var, 64.0f);
                    vf1 vf1Var = tj0.g;
                    j73 j73VarA = og0.a(j73VarJ, jj0.y(0.5f, ((rj0) h02Var7.a(vf1Var)).p), na4.g);
                    t33 t33VarR = z50.r(hi0.w, false);
                    int iHashCode = Long.hashCode(h02Var7.T);
                    tr3 tr3VarQ = h02Var7.q();
                    j73 j73VarW = m50.W(h02Var7, j73VarA);
                    jo0.n.getClass();
                    h02Var7.b0();
                    if (h02Var7.S) {
                        h02Var7.m(sx1Var);
                    } else {
                        h02Var7.l0();
                    }
                    xs2.E(tg1.w, h02Var7, t33VarR);
                    xs2.E(tg1.q, h02Var7, tr3VarQ);
                    xs2.E(tg1.c, h02Var7, Integer.valueOf(iHashCode));
                    xs2.D(h02Var7);
                    xs2.E(tg1.m, h02Var7, j73VarW);
                    bc2 bc2VarX = og0.x(og0.G(0, h02Var7), 0.0f, 360.0f, m50.Q(m50.e0(2000, 0, dg1.r, 2), 4), h02Var7, 29112, 0);
                    ha2 ha2VarY = bh6.y;
                    if (ha2VarY == null) {
                        ga2 ga2Var = new ga2("Outlined.Sync", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = fj5.g;
                        cu4 cu4Var = new cu4(jj0.y);
                        kq3 kq3Var = new kq3();
                        kq3Var.j(12.0f, 4.0f);
                        kq3Var.x(12.0f, 1.0f);
                        kq3Var.x(8.0f, 5.0f);
                        kq3Var.l(4.0f, 4.0f);
                        kq3Var.x(12.0f, 6.0f);
                        kq3Var.r(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
                        kq3Var.r(0.0f, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f);
                        kq3Var.l(1.46f, 1.46f);
                        kq3Var.y(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f);
                        kq3Var.r(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
                        kq3Var.g();
                        kq3Var.j(12.0f, 18.0f);
                        kq3Var.r(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
                        kq3Var.r(0.0f, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f);
                        kq3Var.x(5.24f, 7.74f);
                        kq3Var.y(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f);
                        kq3Var.r(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
                        kq3Var.w(3.0f);
                        kq3Var.l(4.0f, -4.0f);
                        kq3Var.l(-4.0f, -4.0f);
                        kq3Var.w(3.0f);
                        kq3Var.g();
                        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
                        ha2VarY = ga2Var.y();
                        bh6.y = ha2VarY;
                    }
                    t92.g(ha2VarY, null, ze6.g(mq4.j(g73Var, 32.0f), ((Number) bc2VarX.a.getValue()).floatValue()), ((rj0) h02Var7.a(vf1Var)).g, h02Var7, 48, 0);
                    h02Var7.b(true);
                } else {
                    h02Var7.Q();
                }
                return og5Var;
            case 12:
                h02 h02Var8 = (h02) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (h02Var8.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    j73 j73VarE0 = ue5.e0(g73Var, 16.0f);
                    ek0 ek0VarG = ck0.g(v70.n, hi0.o, h02Var8, 48);
                    int iHashCode2 = Long.hashCode(h02Var8.T);
                    tr3 tr3VarQ2 = h02Var8.q();
                    j73 j73VarW2 = m50.W(h02Var8, j73VarE0);
                    jo0.n.getClass();
                    h02Var8.b0();
                    if (h02Var8.S) {
                        h02Var8.m(sx1Var);
                    } else {
                        h02Var8.l0();
                    }
                    xs2.E(tg1.w, h02Var8, ek0VarG);
                    xs2.E(tg1.q, h02Var8, tr3VarQ2);
                    xs2.E(tg1.c, h02Var8, Integer.valueOf(iHashCode2));
                    xs2.D(h02Var8);
                    xs2.E(tg1.m, h02Var8, j73VarW2);
                    Object objK = h02Var8.K();
                    if (objK == l76Var) {
                        objK = new h6((byte) 24);
                        h02Var8.i0(objK);
                    }
                    ot.g("Failed to load layout: Invalid format", (my1) objK, h02Var8, 54);
                    h02Var8.b(true);
                } else {
                    h02Var8.Q();
                }
                return og5Var;
            case 13:
                h02 h02Var9 = (h02) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (h02Var9.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    g61 g61Var = new g61("Pixel Tablet", "", 0, false, 131068);
                    Object objK2 = h02Var9.K();
                    if (objK2 == l76Var) {
                        objK2 = new m9((byte) 29);
                        h02Var9.i0(objK2);
                    }
                    xy1 xy1Var = (xy1) objK2;
                    Object objK3 = h02Var9.K();
                    if (objK3 == l76Var) {
                        objK3 = new h6((byte) 23);
                        h02Var9.i0(objK3);
                    }
                    ot.y(pi1.j, g61Var, true, xy1Var, (my1) objK3, h02Var9, 28038);
                } else {
                    h02Var9.Q();
                }
                return og5Var;
            case 14:
                h02 h02Var10 = (h02) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (h02Var10.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ot.r(0, h02Var10);
                } else {
                    h02Var10.Q();
                }
                return og5Var;
            case kq2.x /* 15 */:
                h02 h02Var11 = (h02) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (h02Var11.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    Object objK4 = h02Var11.K();
                    if (objK4 == l76Var) {
                        objK4 = new h6((byte) 25);
                        h02Var11.i0(objK4);
                    }
                    ot.n(0.45f, "Shift + A", (my1) objK4, h02Var11, 438);
                } else {
                    h02Var11.Q();
                }
                return og5Var;
            case 16:
                h02 h02Var12 = (h02) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (h02Var12.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    Object objK5 = h02Var12.K();
                    if (objK5 == l76Var) {
                        objK5 = new h6((byte) 22);
                        h02Var12.i0(objK5);
                    }
                    ot.v((my1) objK5, h02Var12, 6);
                } else {
                    h02Var12.Q();
                }
                return og5Var;
            case 17:
                h02 h02Var13 = (h02) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (h02Var13.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    Object objK6 = h02Var13.K();
                    if (objK6 == l76Var) {
                        objK6 = new m9((byte) 28);
                        h02Var13.i0(objK6);
                    }
                    xy1 xy1Var2 = (xy1) objK6;
                    Object objK7 = h02Var13.K();
                    if (objK7 == l76Var) {
                        objK7 = new h6((byte) 21);
                        h02Var13.i0(objK7);
                    }
                    ot.l("US English Layout", xy1Var2, (my1) objK7, h02Var13, 438);
                } else {
                    h02Var13.Q();
                }
                return og5Var;
            case 18:
                h02 h02Var14 = (h02) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (h02Var14.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    g75.y("No devices found", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var14, 6, 0, 262142);
                } else {
                    h02Var14.Q();
                }
                return og5Var;
            case 19:
                h02 h02Var15 = (h02) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (h02Var15.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ot.z(0, h02Var15);
                } else {
                    h02Var15.Q();
                }
                return og5Var;
            case 20:
                h02 h02Var16 = (h02) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (h02Var16.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    g75.y(xs2.I(R.string.keyboard_auto_setup_layout_name, h02Var16), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var16, 0, 0, 262142);
                } else {
                    h02Var16.Q();
                }
                return og5Var;
            case 21:
                h02 h02Var17 = (h02) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (h02Var17.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    g75.y(xs2.I(R.string.scanner_send_enter, h02Var17), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var17, 0, 0, 262142);
                } else {
                    h02Var17.Q();
                }
                return og5Var;
            case 22:
                h02 h02Var18 = (h02) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (h02Var18.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    g75.y(xs2.I(R.string.scanner_continuous_scanning, h02Var18), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var18, 0, 0, 262142);
                } else {
                    h02Var18.Q();
                }
                return og5Var;
            case 23:
                h02 h02Var19 = (h02) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (h02Var19.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    g75.y(xs2.I(R.string.scanner_reject_duplicate, h02Var19), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var19, 0, 0, 262142);
                } else {
                    h02Var19.Q();
                }
                return og5Var;
            case 24:
                h02 h02Var20 = (h02) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (h02Var20.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    g75.y(xs2.I(R.string.title_name, h02Var20), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var20, 0, 0, 262142);
                } else {
                    h02Var20.Q();
                }
                return og5Var;
            case 25:
                h02 h02Var21 = (h02) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (h02Var21.N(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    xs2.y(ue5.g0(g73Var, 4.0f, 0.0f, 2), h02Var21, 6, 0);
                } else {
                    h02Var21.Q();
                }
                return og5Var;
            case 26:
                h02 h02Var22 = (h02) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (h02Var22.N(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    g75.y(xs2.I(R.string.button_edit_delete_step, h02Var22), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var22, 0, 0, 262142);
                } else {
                    h02Var22.Q();
                }
                return og5Var;
            case 27:
                h02 h02Var23 = (h02) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (h02Var23.N(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    t92.g(hc6.l(), null, null, 0L, h02Var23, 48, 12);
                } else {
                    h02Var23.Q();
                }
                return og5Var;
            case 28:
                h02 h02Var24 = (h02) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (h02Var24.N(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ha2 ha2VarY2 = sz5.v;
                    if (ha2VarY2 == null) {
                        ga2 ga2Var2 = new ga2("Outlined.Update", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = fj5.g;
                        cu4 cu4Var2 = new cu4(jj0.y);
                        kq3 kq3Var2 = new kq3();
                        kq3Var2.j(11.0f, 8.0f);
                        kq3Var2.w(5.0f);
                        kq3Var2.l(4.25f, 2.52f);
                        kq3Var2.l(0.77f, -1.28f);
                        kq3Var2.l(-3.52f, -2.09f);
                        kq3Var2.q(8.0f);
                        kq3Var2.n(11.0f);
                        kq3Var2.g();
                        kq3Var2.j(21.0f, 10.0f);
                        kq3Var2.q(3.0f);
                        kq3Var2.l(-2.64f, 2.64f);
                        kq3Var2.y(16.74f, 4.01f, 14.49f, 3.0f, 12.0f, 3.0f);
                        kq3Var2.r(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
                        kq3Var2.m(4.03f, 9.0f, 9.0f, 9.0f);
                        kq3Var2.m(9.0f, -4.03f, 9.0f, -9.0f);
                        kq3Var2.v(-2.0f);
                        kq3Var2.r(0.0f, 3.86f, -3.14f, 7.0f, -7.0f, 7.0f);
                        kq3Var2.m(-7.0f, -3.14f, -7.0f, -7.0f);
                        kq3Var2.m(3.14f, -7.0f, 7.0f, -7.0f);
                        kq3Var2.r(1.93f, 0.0f, 3.68f, 0.79f, 4.95f, 2.05f);
                        kq3Var2.x(14.0f, 10.0f);
                        kq3Var2.n(21.0f);
                        kq3Var2.g();
                        ga2.g(ga2Var2, kq3Var2.g, 0, cu4Var2);
                        ha2VarY2 = ga2Var2.y();
                        sz5.v = ha2VarY2;
                    }
                    t92.g(ha2VarY2, null, null, 0L, h02Var24, 48, 12);
                } else {
                    h02Var24.Q();
                }
                return og5Var;
            default:
                h02 h02Var25 = (h02) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (h02Var25.N(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    g75.y(xs2.I(R.string.control_layout_no_delay, h02Var25), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var25, 0, 0, 262142);
                } else {
                    h02Var25.Q();
                }
                return og5Var;
        }
    }
}
