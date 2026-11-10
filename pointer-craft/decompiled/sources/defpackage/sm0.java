package defpackage;

import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sm0 implements bz1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ sm0(byte b) {
        this.j = b;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    g75.y(xs2.I(R.string.control_layout_send_text, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262142);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    g75.y(xs2.I(R.string.button_edit_add_step_before, h02Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262142);
                }
                break;
            case 2:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    ha2 ha2VarY = sf6.g;
                    if (ha2VarY == null) {
                        ga2 ga2Var = new ga2("Outlined.FirstPage", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = fj5.g;
                        cu4 cu4Var = new cu4(jj0.y);
                        kq3 kq3Var = new kq3();
                        kq3Var.j(18.41f, 16.59f);
                        kq3Var.x(13.82f, 12.0f);
                        kq3Var.l(4.59f, -4.59f);
                        kq3Var.x(17.0f, 6.0f);
                        kq3Var.l(-6.0f, 6.0f);
                        kq3Var.l(6.0f, 6.0f);
                        kq3Var.l(1.41f, -1.41f);
                        kq3Var.g();
                        du4.e(kq3Var, 6.0f, 6.0f, 2.0f, 12.0f);
                        kq3Var.n(6.0f);
                        kq3Var.q(6.0f);
                        kq3Var.g();
                        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
                        ha2VarY = ga2Var.y();
                        sf6.g = ha2VarY;
                    }
                    t92.g(ha2VarY, null, null, 0L, h02Var3, 48, 12);
                }
                break;
            case 3:
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    h02Var4.Q();
                } else {
                    xs2.y(ue5.g0(g73.g, 4.0f, 0.0f, 2), h02Var4, 6, 0);
                }
                break;
            case 4:
                h02 h02Var5 = (h02) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!h02Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    h02Var5.Q();
                } else {
                    g75.y(xs2.I(R.string.button_edit_add_step_after, h02Var5), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var5, 0, 0, 262142);
                }
                break;
            case 5:
                h02 h02Var6 = (h02) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!h02Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    h02Var6.Q();
                } else {
                    ha2 ha2VarY2 = ry5.y;
                    if (ha2VarY2 == null) {
                        ga2 ga2Var2 = new ga2("Outlined.LastPage", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = fj5.g;
                        cu4 cu4Var2 = new cu4(jj0.y);
                        kq3 kq3Var2 = new kq3();
                        kq3Var2.j(5.59f, 7.41f);
                        kq3Var2.x(10.18f, 12.0f);
                        kq3Var2.l(-4.59f, 4.59f);
                        kq3Var2.x(7.0f, 18.0f);
                        kq3Var2.l(6.0f, -6.0f);
                        kq3Var2.l(-6.0f, -6.0f);
                        kq3Var2.l(-1.41f, 1.41f);
                        kq3Var2.g();
                        du4.e(kq3Var2, 16.0f, 6.0f, 2.0f, 12.0f);
                        kq3Var2.v(-2.0f);
                        kq3Var2.q(6.0f);
                        kq3Var2.g();
                        ga2.g(ga2Var2, kq3Var2.g, 0, cu4Var2);
                        ha2VarY2 = ga2Var2.y();
                        ry5.y = ha2VarY2;
                    }
                    t92.g(ha2VarY2, null, null, 0L, h02Var6, 48, 12);
                }
                break;
            case 6:
                h02 h02Var7 = (h02) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && h02Var7.e()) {
                    h02Var7.Q();
                }
                break;
            case 7:
                h02 h02Var8 = (h02) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!h02Var8.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    h02Var8.Q();
                } else {
                    ha2 ha2VarY3 = ge6.n;
                    if (ha2VarY3 == null) {
                        ga2 ga2Var3 = new ga2("Outlined.Dashboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = fj5.g;
                        cu4 cu4Var3 = new cu4(jj0.y);
                        kq3 kq3Var3 = new kq3();
                        kq3Var3.j(19.0f, 5.0f);
                        kq3Var3.w(2.0f);
                        kq3Var3.v(-4.0f);
                        kq3Var3.x(15.0f, 5.0f);
                        kq3Var3.v(4.0f);
                        kq3Var3.j(9.0f, 5.0f);
                        kq3Var3.w(6.0f);
                        kq3Var3.x(5.0f, 11.0f);
                        kq3Var3.x(5.0f, 5.0f);
                        kq3Var3.v(4.0f);
                        kq3Var3.t(10.0f, 8.0f);
                        kq3Var3.w(6.0f);
                        kq3Var3.v(-4.0f);
                        kq3Var3.w(-6.0f);
                        kq3Var3.v(4.0f);
                        kq3Var3.j(9.0f, 17.0f);
                        kq3Var3.w(2.0f);
                        kq3Var3.x(5.0f, 19.0f);
                        kq3Var3.w(-2.0f);
                        kq3Var3.v(4.0f);
                        kq3Var3.j(21.0f, 3.0f);
                        kq3Var3.v(-8.0f);
                        kq3Var3.w(6.0f);
                        kq3Var3.v(8.0f);
                        kq3Var3.x(21.0f, 3.0f);
                        kq3Var3.g();
                        kq3Var3.j(11.0f, 3.0f);
                        kq3Var3.x(3.0f, 3.0f);
                        kq3Var3.w(10.0f);
                        kq3Var3.v(8.0f);
                        kq3Var3.x(11.0f, 3.0f);
                        kq3Var3.g();
                        kq3Var3.j(21.0f, 11.0f);
                        kq3Var3.v(-8.0f);
                        kq3Var3.w(10.0f);
                        kq3Var3.v(8.0f);
                        kq3Var3.x(21.0f, 11.0f);
                        kq3Var3.g();
                        kq3Var3.j(11.0f, 15.0f);
                        kq3Var3.x(3.0f, 15.0f);
                        kq3Var3.w(6.0f);
                        kq3Var3.v(8.0f);
                        kq3Var3.w(-6.0f);
                        kq3Var3.g();
                        ga2.g(ga2Var3, kq3Var3.g, 0, cu4Var3);
                        ha2VarY3 = ga2Var3.y();
                        ge6.n = ha2VarY3;
                    }
                    t92.g(ha2VarY3, null, null, ((rj0) h02Var8.a(tj0.g)).a, h02Var8, 48, 4);
                }
                break;
            case 8:
                h02 h02Var9 = (h02) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!h02Var9.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    h02Var9.Q();
                } else {
                    g75.y(xs2.I(R.string.component_touch_pad, h02Var9), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var9, 0, 0, 262142);
                }
                break;
            case 9:
                h02 h02Var10 = (h02) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!h02Var10.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    h02Var10.Q();
                } else {
                    t92.g(js2.q(), null, null, 0L, h02Var10, 48, 12);
                }
                break;
            case 10:
                h02 h02Var11 = (h02) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!h02Var11.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    h02Var11.Q();
                } else {
                    g75.y(xs2.I(R.string.component_speech_input, h02Var11), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var11, 0, 0, 262142);
                }
                break;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                h02 h02Var12 = (h02) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!h02Var12.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    h02Var12.Q();
                } else {
                    ha2 ha2VarY4 = d06.a;
                    if (ha2VarY4 == null) {
                        ga2 ga2Var4 = new ga2("Outlined.Mic", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = fj5.g;
                        long j = jj0.y;
                        cu4 cu4Var4 = new cu4(j);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new rq3(12.0f, 14.0f));
                        arrayList.add(new wq3(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f));
                        arrayList.add(new er3(5.0f));
                        arrayList.add(new wq3(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f));
                        arrayList.add(new tq3(9.0f, 3.34f, 9.0f, 5.0f));
                        arrayList.add(new dr3(6.0f));
                        arrayList.add(new oq3(9.0f, 12.66f, 10.34f, 14.0f, 12.0f, 14.0f));
                        arrayList.add(nq3.r);
                        ga2.g(ga2Var4, arrayList, 0, cu4Var4);
                        cu4 cu4Var5 = new cu4(j);
                        kq3 kq3VarJ = du4.j(17.0f, 11.0f);
                        kq3VarJ.r(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
                        kq3VarJ.m(-5.0f, -2.24f, -5.0f, -5.0f);
                        kq3VarJ.n(5.0f);
                        kq3VarJ.r(0.0f, 3.53f, 2.61f, 6.43f, 6.0f, 6.92f);
                        kq3VarJ.q(21.0f);
                        kq3VarJ.v(2.0f);
                        kq3VarJ.w(-3.08f);
                        kq3VarJ.r(3.39f, -0.49f, 6.0f, -3.39f, 6.0f, -6.92f);
                        kq3VarJ.n(17.0f);
                        kq3VarJ.g();
                        ga2.g(ga2Var4, kq3VarJ.g, 0, cu4Var5);
                        ha2VarY4 = ga2Var4.y();
                        d06.a = ha2VarY4;
                    }
                    t92.g(ha2VarY4, null, null, 0L, h02Var12, 48, 12);
                }
                break;
            case 12:
                h02 h02Var13 = (h02) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!h02Var13.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    h02Var13.Q();
                } else {
                    g75.y(xs2.I(R.string.component_keyboard_toggle, h02Var13), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var13, 0, 0, 262142);
                }
                break;
            case 13:
                h02 h02Var14 = (h02) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!h02Var14.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    h02Var14.Q();
                } else {
                    t92.g(y94.D(), null, null, 0L, h02Var14, 48, 12);
                }
                break;
            case 14:
                h02 h02Var15 = (h02) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!h02Var15.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    h02Var15.Q();
                } else {
                    g75.y(xs2.I(R.string.component_fullscreen_toggle, h02Var15), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var15, 0, 0, 262142);
                }
                break;
            case kq2.x /* 15 */:
                h02 h02Var16 = (h02) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!h02Var16.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    h02Var16.Q();
                } else {
                    t92.g(m50.N(), null, null, 0L, h02Var16, 48, 12);
                }
                break;
            case 16:
                h02 h02Var17 = (h02) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!h02Var17.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    h02Var17.Q();
                } else {
                    g75.y(xs2.I(R.string.button_stop_mouse_jiggle, h02Var17), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var17, 0, 0, 262142);
                }
                break;
            case 17:
                h02 h02Var18 = (h02) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!h02Var18.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    h02Var18.Q();
                } else {
                    ha2 ha2VarY5 = og6.g;
                    if (ha2VarY5 == null) {
                        ga2 ga2Var5 = new ga2("Filled.Stop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = fj5.g;
                        cu4 cu4Var6 = new cu4(jj0.y);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new rq3(6.0f, 6.0f));
                        arrayList2.add(new xq3(12.0f));
                        arrayList2.add(new dr3(12.0f));
                        arrayList2.add(new pq3(6.0f));
                        arrayList2.add(nq3.r);
                        ga2.g(ga2Var5, arrayList2, 0, cu4Var6);
                        ha2VarY5 = ga2Var5.y();
                        og6.g = ha2VarY5;
                    }
                    t92.g(ha2VarY5, null, null, 0L, h02Var18, 48, 12);
                }
                break;
            case 18:
                h02 h02Var19 = (h02) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!h02Var19.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    h02Var19.Q();
                } else {
                    t92.g(br2.o(), null, null, 0L, h02Var19, 48, 12);
                }
                break;
            case 19:
                h02 h02Var20 = (h02) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!h02Var20.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    h02Var20.Q();
                } else {
                    g75.y(xs2.I(R.string.devices_button_add_device, h02Var20), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var20, 0, 0, 262142);
                }
                break;
            case 20:
                h02 h02Var21 = (h02) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!h02Var21.N(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    h02Var21.Q();
                } else {
                    t92.g(m50.L(), null, null, 0L, h02Var21, 48, 12);
                }
                break;
            case 21:
                h02 h02Var22 = (h02) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!h02Var22.N(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    h02Var22.Q();
                } else {
                    t92.g(ic6.g(), null, null, 0L, h02Var22, 48, 12);
                }
                break;
            case 22:
                h02 h02Var23 = (h02) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!h02Var23.N(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    h02Var23.Q();
                } else {
                    g75.y("Search function", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var23, 6, 0, 262142);
                }
                break;
            case 23:
                h02 h02Var24 = (h02) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!h02Var24.N(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    h02Var24.Q();
                } else {
                    ha2 ha2VarY6 = lf6.y;
                    if (ha2VarY6 == null) {
                        ga2 ga2Var6 = new ga2("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = fj5.g;
                        cu4 cu4Var7 = new cu4(jj0.y);
                        kq3 kq3Var4 = new kq3();
                        kq3Var4.j(15.5f, 14.0f);
                        kq3Var4.v(-0.79f);
                        kq3Var4.l(-0.28f, -0.27f);
                        kq3Var4.y(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
                        kq3Var4.y(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
                        kq3Var4.a(3.0f, 5.91f, 3.0f, 9.5f);
                        kq3Var4.a(5.91f, 16.0f, 9.5f, 16.0f);
                        kq3Var4.r(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
                        kq3Var4.l(0.27f, 0.28f);
                        kq3Var4.w(0.79f);
                        kq3Var4.l(5.0f, 4.99f);
                        kq3Var4.x(20.49f, 19.0f);
                        kq3Var4.l(-4.99f, -5.0f);
                        kq3Var4.g();
                        kq3Var4.j(9.5f, 14.0f);
                        kq3Var4.y(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
                        kq3Var4.a(7.01f, 5.0f, 9.5f, 5.0f);
                        kq3Var4.a(14.0f, 7.01f, 14.0f, 9.5f);
                        kq3Var4.a(11.99f, 14.0f, 9.5f, 14.0f);
                        kq3Var4.g();
                        ga2.g(ga2Var6, kq3Var4.g, 0, cu4Var7);
                        ha2VarY6 = ga2Var6.y();
                        lf6.y = ha2VarY6;
                    }
                    t92.g(ha2VarY6, null, null, 0L, h02Var24, 48, 12);
                }
                break;
            case 24:
                h02 h02Var25 = (h02) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!h02Var25.N(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    h02Var25.Q();
                } else {
                    xs2.y(null, h02Var25, 0, 1);
                }
                break;
            case 25:
                h02 h02Var26 = (h02) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!h02Var26.N(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    h02Var26.Q();
                } else {
                    g75.y(xs2.I(R.string.keyboard_auto_setup_title, h02Var26), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var26, 0, 0, 262142);
                }
                break;
            case 26:
                h02 h02Var27 = (h02) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!h02Var27.N(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    h02Var27.Q();
                } else {
                    g75.y(xs2.I(R.string.keyboard_layout_previous_layouts, h02Var27), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var27.a(of5.g)).j, h02Var27, 0, 0, 131070);
                }
                break;
            case 27:
                h02 h02Var28 = (h02) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (!h02Var28.N(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    h02Var28.Q();
                } else {
                    g75.y(xs2.I(R.string.keyboard_layout_system_language_layouts, h02Var28), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var28.a(of5.g)).j, h02Var28, 0, 0, 131070);
                }
                break;
            case 28:
                h02 h02Var29 = (h02) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (!h02Var29.N(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    h02Var29.Q();
                } else {
                    g75.y(xs2.I(R.string.title_required_for_android_tv, h02Var29), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var29.a(of5.g)).j, h02Var29, 0, 0, 131070);
                }
                break;
            default:
                h02 h02Var30 = (h02) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (!h02Var30.N(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    h02Var30.Q();
                } else {
                    g75.y("English US", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var30, 6, 0, 262142);
                }
                break;
        }
        return og5Var;
    }
}
