package defpackage;

import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gg implements bz1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ gg(int i) {
        this.j = (byte) 10;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        byte b2 = 16;
        byte b3 = 6;
        l76 l76Var = oo0.g;
        byte b4 = 2;
        byte b5 = 0;
        byte b6 = 1;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                k33.X((um2) obj).setDensity((j51) obj2);
                return og5Var;
            case 1:
                k33.X((um2) obj).setLifecycleOwner((gu2) obj2);
                return og5Var;
            case 2:
                k33.X((um2) obj).setSavedStateRegistryOwner((id4) obj2);
                return og5Var;
            case 3:
                fl5 fl5VarX = k33.X((um2) obj);
                int iOrdinal = ((fl2) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        uo1.g();
                        return null;
                    }
                    b5 = 1;
                }
                fl5VarX.setLayoutDirection(b5);
                return og5Var;
            case 4:
                k33.X((um2) obj).setResetBlock((xy1) obj2);
                return og5Var;
            case 5:
                k33.X((um2) obj).setUpdateBlock((xy1) obj2);
                return og5Var;
            case 6:
                k33.X((um2) obj).setReleaseBlock((xy1) obj2);
                return og5Var;
            case 7:
                k33.X((um2) obj).setUpdateBlock((xy1) obj2);
                return og5Var;
            case 8:
                k33.X((um2) obj).setReleaseBlock((xy1) obj2);
                return og5Var;
            case 9:
                k33.X((um2) obj).setModifier((j73) obj2);
                return og5Var;
            case 10:
                ((Integer) obj2).getClass();
                k33.u(aq2.J(1), (h02) obj);
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((bh1) obj).r = (o22) obj2;
                return og5Var;
            case 12:
                ((bh1) obj).n = (t6) obj2;
                return og5Var;
            case 13:
                ((ch1) obj).r = (o22) obj2;
                return og5Var;
            case 14:
                ((ch1) obj).v = ((q6) obj2).g;
                return og5Var;
            case kq2.x /* 15 */:
                ((ch1) obj).n = ((s6) obj2).g;
                return og5Var;
            case 16:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t92.g(yf2.F(), "Back", null, 0L, h02Var, 48, 12);
                } else {
                    h02Var.Q();
                }
                return og5Var;
            case 17:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    t92.g(df6.x(), "Edit", null, 0L, h02Var2, 48, 12);
                } else {
                    h02Var2.Q();
                }
                return og5Var;
            case 18:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ha2 ha2VarY = xs2.y;
                    if (ha2VarY == null) {
                        ga2 ga2Var = new ga2("Outlined.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = fj5.g;
                        cu4 cu4Var = new cu4(jj0.y);
                        kq3 kq3VarJ = du4.j(19.43f, 12.98f);
                        kq3VarJ.r(0.04f, -0.32f, 0.07f, -0.64f, 0.07f, -0.98f);
                        kq3VarJ.r(0.0f, -0.34f, -0.03f, -0.66f, -0.07f, -0.98f);
                        kq3VarJ.l(2.11f, -1.65f);
                        kq3VarJ.r(0.19f, -0.15f, 0.24f, -0.42f, 0.12f, -0.64f);
                        kq3VarJ.l(-2.0f, -3.46f);
                        kq3VarJ.r(-0.09f, -0.16f, -0.26f, -0.25f, -0.44f, -0.25f);
                        kq3VarJ.r(-0.06f, 0.0f, -0.12f, 0.01f, -0.17f, 0.03f);
                        kq3VarJ.l(-2.49f, 1.0f);
                        kq3VarJ.r(-0.52f, -0.4f, -1.08f, -0.73f, -1.69f, -0.98f);
                        kq3VarJ.l(-0.38f, -2.65f);
                        kq3VarJ.y(14.46f, 2.18f, 14.25f, 2.0f, 14.0f, 2.0f);
                        kq3VarJ.v(-4.0f);
                        kq3VarJ.r(-0.25f, 0.0f, -0.46f, 0.18f, -0.49f, 0.42f);
                        kq3VarJ.l(-0.38f, 2.65f);
                        kq3VarJ.r(-0.61f, 0.25f, -1.17f, 0.59f, -1.69f, 0.98f);
                        kq3VarJ.l(-2.49f, -1.0f);
                        kq3VarJ.r(-0.06f, -0.02f, -0.12f, -0.03f, -0.18f, -0.03f);
                        kq3VarJ.r(-0.17f, 0.0f, -0.34f, 0.09f, -0.43f, 0.25f);
                        kq3VarJ.l(-2.0f, 3.46f);
                        kq3VarJ.r(-0.13f, 0.22f, -0.07f, 0.49f, 0.12f, 0.64f);
                        kq3VarJ.l(2.11f, 1.65f);
                        kq3VarJ.r(-0.04f, 0.32f, -0.07f, 0.65f, -0.07f, 0.98f);
                        kq3VarJ.r(0.0f, 0.33f, 0.03f, 0.66f, 0.07f, 0.98f);
                        kq3VarJ.l(-2.11f, 1.65f);
                        kq3VarJ.r(-0.19f, 0.15f, -0.24f, 0.42f, -0.12f, 0.64f);
                        kq3VarJ.l(2.0f, 3.46f);
                        kq3VarJ.r(0.09f, 0.16f, 0.26f, 0.25f, 0.44f, 0.25f);
                        kq3VarJ.r(0.06f, 0.0f, 0.12f, -0.01f, 0.17f, -0.03f);
                        kq3VarJ.l(2.49f, -1.0f);
                        kq3VarJ.r(0.52f, 0.4f, 1.08f, 0.73f, 1.69f, 0.98f);
                        kq3VarJ.l(0.38f, 2.65f);
                        kq3VarJ.r(0.03f, 0.24f, 0.24f, 0.42f, 0.49f, 0.42f);
                        kq3VarJ.v(4.0f);
                        kq3VarJ.r(0.25f, 0.0f, 0.46f, -0.18f, 0.49f, -0.42f);
                        kq3VarJ.l(0.38f, -2.65f);
                        kq3VarJ.r(0.61f, -0.25f, 1.17f, -0.59f, 1.69f, -0.98f);
                        kq3VarJ.l(2.49f, 1.0f);
                        kq3VarJ.r(0.06f, 0.02f, 0.12f, 0.03f, 0.18f, 0.03f);
                        kq3VarJ.r(0.17f, 0.0f, 0.34f, -0.09f, 0.43f, -0.25f);
                        kq3VarJ.l(2.0f, -3.46f);
                        kq3VarJ.r(0.12f, -0.22f, 0.07f, -0.49f, -0.12f, -0.64f);
                        kq3VarJ.l(-2.11f, -1.65f);
                        kq3VarJ.g();
                        kq3VarJ.j(17.45f, 11.27f);
                        kq3VarJ.r(0.04f, 0.31f, 0.05f, 0.52f, 0.05f, 0.73f);
                        kq3VarJ.r(0.0f, 0.21f, -0.02f, 0.43f, -0.05f, 0.73f);
                        kq3VarJ.l(-0.14f, 1.13f);
                        kq3VarJ.l(0.89f, 0.7f);
                        kq3VarJ.l(1.08f, 0.84f);
                        kq3VarJ.l(-0.7f, 1.21f);
                        kq3VarJ.l(-1.27f, -0.51f);
                        kq3VarJ.l(-1.04f, -0.42f);
                        kq3VarJ.l(-0.9f, 0.68f);
                        kq3VarJ.r(-0.43f, 0.32f, -0.84f, 0.56f, -1.25f, 0.73f);
                        kq3VarJ.l(-1.06f, 0.43f);
                        kq3VarJ.l(-0.16f, 1.13f);
                        kq3VarJ.l(-0.2f, 1.35f);
                        kq3VarJ.v(-1.4f);
                        kq3VarJ.l(-0.19f, -1.35f);
                        kq3VarJ.l(-0.16f, -1.13f);
                        kq3VarJ.l(-1.06f, -0.43f);
                        kq3VarJ.r(-0.43f, -0.18f, -0.83f, -0.41f, -1.23f, -0.71f);
                        kq3VarJ.l(-0.91f, -0.7f);
                        kq3VarJ.l(-1.06f, 0.43f);
                        kq3VarJ.l(-1.27f, 0.51f);
                        kq3VarJ.l(-0.7f, -1.21f);
                        kq3VarJ.l(1.08f, -0.84f);
                        kq3VarJ.l(0.89f, -0.7f);
                        kq3VarJ.l(-0.14f, -1.13f);
                        kq3VarJ.r(-0.03f, -0.31f, -0.05f, -0.54f, -0.05f, -0.74f);
                        kq3VarJ.m(0.02f, -0.43f, 0.05f, -0.73f);
                        kq3VarJ.l(0.14f, -1.13f);
                        kq3VarJ.l(-0.89f, -0.7f);
                        kq3VarJ.l(-1.08f, -0.84f);
                        kq3VarJ.l(0.7f, -1.21f);
                        kq3VarJ.l(1.27f, 0.51f);
                        kq3VarJ.l(1.04f, 0.42f);
                        kq3VarJ.l(0.9f, -0.68f);
                        kq3VarJ.r(0.43f, -0.32f, 0.84f, -0.56f, 1.25f, -0.73f);
                        kq3VarJ.l(1.06f, -0.43f);
                        kq3VarJ.l(0.16f, -1.13f);
                        kq3VarJ.l(0.2f, -1.35f);
                        kq3VarJ.v(1.39f);
                        kq3VarJ.l(0.19f, 1.35f);
                        kq3VarJ.l(0.16f, 1.13f);
                        kq3VarJ.l(1.06f, 0.43f);
                        kq3VarJ.r(0.43f, 0.18f, 0.83f, 0.41f, 1.23f, 0.71f);
                        kq3VarJ.l(0.91f, 0.7f);
                        kq3VarJ.l(1.06f, -0.43f);
                        kq3VarJ.l(1.27f, -0.51f);
                        kq3VarJ.l(0.7f, 1.21f);
                        kq3VarJ.l(-1.07f, 0.85f);
                        kq3VarJ.l(-0.89f, 0.7f);
                        kq3VarJ.l(0.14f, 1.13f);
                        kq3VarJ.g();
                        kq3VarJ.j(12.0f, 8.0f);
                        kq3VarJ.r(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
                        kq3VarJ.m(1.79f, 4.0f, 4.0f, 4.0f);
                        kq3VarJ.m(4.0f, -1.79f, 4.0f, -4.0f);
                        kq3VarJ.m(-1.79f, -4.0f, -4.0f, -4.0f);
                        kq3VarJ.g();
                        kq3VarJ.j(12.0f, 14.0f);
                        kq3VarJ.r(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                        kq3VarJ.m(0.9f, -2.0f, 2.0f, -2.0f);
                        kq3VarJ.m(2.0f, 0.9f, 2.0f, 2.0f);
                        kq3VarJ.m(-0.9f, 2.0f, -2.0f, 2.0f);
                        kq3VarJ.g();
                        ga2.g(ga2Var, kq3VarJ.g, 0, cu4Var);
                        ha2VarY = ga2Var.y();
                        xs2.y = ha2VarY;
                    }
                    t92.g(ha2VarY, "Settings", null, 0L, h02Var3, 48, 12);
                } else {
                    h02Var3.Q();
                }
                return og5Var;
            case 19:
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    t92.g(yf2.F(), "Back", null, 0L, h02Var4, 48, 12);
                } else {
                    h02Var4.Q();
                }
                return og5Var;
            case 20:
                h02 h02Var5 = (h02) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (h02Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ha2 ha2VarY2 = kq2.g;
                    if (ha2VarY2 == null) {
                        ga2 ga2Var2 = new ga2("Filled.Menu", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = fj5.g;
                        cu4 cu4Var2 = new cu4(jj0.y);
                        kq3 kq3Var = new kq3();
                        kq3Var.j(3.0f, 18.0f);
                        kq3Var.v(18.0f);
                        kq3Var.w(-2.0f);
                        kq3Var.x(3.0f, 16.0f);
                        kq3Var.w(2.0f);
                        kq3Var.g();
                        du4.e(kq3Var, 3.0f, 13.0f, 18.0f, -2.0f);
                        kq3Var.x(3.0f, 11.0f);
                        kq3Var.w(2.0f);
                        kq3Var.g();
                        kq3Var.j(3.0f, 6.0f);
                        kq3Var.w(2.0f);
                        kq3Var.v(18.0f);
                        kq3Var.x(21.0f, 6.0f);
                        kq3Var.x(3.0f, 6.0f);
                        kq3Var.g();
                        ga2.g(ga2Var2, kq3Var.g, 0, cu4Var2);
                        ha2VarY2 = ga2Var2.y();
                        kq2.g = ha2VarY2;
                    }
                    t92.g(ha2VarY2, "Menu", null, 0L, h02Var5, 48, 12);
                } else {
                    h02Var5.Q();
                }
                return og5Var;
            case 21:
                h02 h02Var6 = (h02) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (h02Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    k33.p(new bi6(b2), h02Var6, 0);
                } else {
                    h02Var6.Q();
                }
                return og5Var;
            case 22:
                h02 h02Var7 = (h02) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (h02Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    k33.p(new t32(b2), h02Var7, 0);
                } else {
                    h02Var7.Q();
                }
                return og5Var;
            case 23:
                h02 h02Var8 = (h02) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (h02Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Object objK = h02Var8.K();
                    if (objK == l76Var) {
                        objK = new h6((byte) 26);
                        h02Var8.i0(objK);
                    }
                    k33.r((my1) objK, h02Var8, 6);
                } else {
                    h02Var8.Q();
                }
                return og5Var;
            case 24:
                h02 h02Var9 = (h02) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (h02Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    k33.u(0, h02Var9);
                } else {
                    h02Var9.Q();
                }
                return og5Var;
            case 25:
                h02 h02Var10 = (h02) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (h02Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    g75.y(xs2.I(R.string.devices_button_add_device, h02Var10), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var10, 0, 0, 262142);
                } else {
                    h02Var10.Q();
                }
                return og5Var;
            case 26:
                h02 h02Var11 = (h02) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (h02Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    t92.g(ic6.g(), "Remove device", null, 0L, h02Var11, 48, 12);
                } else {
                    h02Var11.Q();
                }
                return og5Var;
            case 27:
                h02 h02Var12 = (h02) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (h02Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    t92.g(ic6.g(), "Remove device", null, 0L, h02Var12, 48, 12);
                } else {
                    h02Var12.Q();
                }
                return og5Var;
            case 28:
                h02 h02Var13 = (h02) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (h02Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    g61 g61Var = new g61("Active device", "a", 0, false, 131068);
                    List listD = pw5.d(new g61("First device", "b", 0, false, 131068), new g61("Second device", "c", 0, false, 131068));
                    Object objK2 = h02Var13.K();
                    if (objK2 == l76Var) {
                        objK2 = new wm0(b5);
                        h02Var13.i0(objK2);
                    }
                    xy1 xy1Var = (xy1) objK2;
                    Object objK3 = h02Var13.K();
                    if (objK3 == l76Var) {
                        objK3 = new wm0(b6);
                        h02Var13.i0(objK3);
                    }
                    xy1 xy1Var2 = (xy1) objK3;
                    Object objK4 = h02Var13.K();
                    if (objK4 == l76Var) {
                        objK4 = new wm0(b4);
                        h02Var13.i0(objK4);
                    }
                    xy1 xy1Var3 = (xy1) objK4;
                    Object objK5 = h02Var13.K();
                    if (objK5 == l76Var) {
                        objK5 = new wm0((byte) 3);
                        h02Var13.i0(objK5);
                    }
                    xy1 xy1Var4 = (xy1) objK5;
                    Object objK6 = h02Var13.K();
                    if (objK6 == l76Var) {
                        objK6 = new h6((byte) 27);
                        h02Var13.i0(objK6);
                    }
                    my1 my1Var = (my1) objK6;
                    Object objK7 = h02Var13.K();
                    if (objK7 == l76Var) {
                        objK7 = new wm0((byte) 4);
                        h02Var13.i0(objK7);
                    }
                    ue5.m(g61Var, listD, true, xy1Var, xy1Var2, xy1Var3, xy1Var4, my1Var, (xy1) objK7, h02Var13, 115043712);
                } else {
                    h02Var13.Q();
                }
                return og5Var;
            default:
                h02 h02Var14 = (h02) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (h02Var14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    Object objK8 = h02Var14.K();
                    if (objK8 == l76Var) {
                        objK8 = new wm0((byte) 5);
                        h02Var14.i0(objK8);
                    }
                    xy1 xy1Var5 = (xy1) objK8;
                    Object objK9 = h02Var14.K();
                    if (objK9 == l76Var) {
                        objK9 = new wm0(b3);
                        h02Var14.i0(objK9);
                    }
                    xy1 xy1Var6 = (xy1) objK9;
                    Object objK10 = h02Var14.K();
                    if (objK10 == l76Var) {
                        objK10 = new wm0((byte) 7);
                        h02Var14.i0(objK10);
                    }
                    xy1 xy1Var7 = (xy1) objK10;
                    Object objK11 = h02Var14.K();
                    if (objK11 == l76Var) {
                        objK11 = new wm0((byte) 8);
                        h02Var14.i0(objK11);
                    }
                    xy1 xy1Var8 = (xy1) objK11;
                    Object objK12 = h02Var14.K();
                    if (objK12 == l76Var) {
                        objK12 = new h6((byte) 28);
                        h02Var14.i0(objK12);
                    }
                    my1 my1Var2 = (my1) objK12;
                    Object objK13 = h02Var14.K();
                    if (objK13 == l76Var) {
                        objK13 = new wm0((byte) 9);
                        h02Var14.i0(objK13);
                    }
                    ue5.m(null, pi1.j, false, xy1Var5, xy1Var6, xy1Var7, xy1Var8, my1Var2, (xy1) objK13, h02Var14, 115043766);
                } else {
                    h02Var14.Q();
                }
                return og5Var;
        }
    }

    public /* synthetic */ gg(byte b) {
        this.j = b;
    }
}
