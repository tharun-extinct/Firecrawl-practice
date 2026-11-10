package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ev0 implements cz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ ev0(zn3 zn3Var, nm0 nm0Var) {
        this.j = (byte) 10;
        this.t = zn3Var;
        this.a = nm0Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        String str;
        byte b = this.j;
        sx1 sx1Var = um2.Z;
        g73 g73Var = g73.g;
        byte b2 = 2;
        l76 l76Var = oo0.g;
        og5 og5Var = og5.g;
        byte b3 = 1;
        Object obj4 = this.t;
        Object obj5 = this.a;
        switch (b) {
            case 0:
                q04 q04Var = (q04) obj4;
                ob3 ob3Var = (ob3) obj5;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h02Var.Q();
                } else if (q04Var != null) {
                    h02Var.X(1971274359);
                    wa6.r(q04Var, h02Var, 0);
                    h02Var.b(false);
                } else if (((tv0) ob3Var.getValue()).x) {
                    h02Var.X(1971375295);
                    b04.g(null, 0L, 0.0f, 0L, 0, 0.0f, h02Var, 0, 63);
                    h02Var.b(false);
                } else {
                    h02Var.X(1971459708);
                    ho1 ho1Var = mq4.r;
                    t33 t33VarR = z50.r(hi0.w, false);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, ho1Var);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, t33VarR);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    zl2 zl2Var = ((tv0) ob3Var.getValue()).v;
                    if (zl2Var != null) {
                        int iOrdinal = zl2Var.ordinal();
                        if (iOrdinal == 0) {
                            str = "Layout not found";
                        } else if (iOrdinal == 1) {
                            str = "Network error occurred while loading layout";
                        } else if (iOrdinal == 2) {
                            str = "Failed to save layout";
                        } else {
                            if (iOrdinal != 3) {
                                up.y();
                                return null;
                            }
                            str = "An unexpected error occurred";
                        }
                    } else {
                        str = "";
                    }
                    g75.y(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262142);
                    h02Var.b(true);
                    h02Var.b(false);
                }
                return og5Var;
            case 1:
                nm0 nm0Var = (nm0) obj5;
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var2.N(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    y94.l(this.t, null, null, null, ue5.m0(-1022911042, new qh(nm0Var, (byte) 0), h02Var2), h02Var2, 24576, 14);
                } else {
                    h02Var2.Q();
                }
                return og5Var;
            case 2:
                my1 my1Var = (my1) obj4;
                my1 my1Var2 = (my1) obj5;
                h02 h02Var3 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((xs1) obj).getClass();
                if (h02Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c93.x(my1Var, null, false, null, null, null, null, null, ra.q, h02Var3, 805306368, 510);
                    c93.x(my1Var2, null, false, null, null, null, null, null, ra.w, h02Var3, 805306368, 510);
                } else {
                    h02Var3.Q();
                }
                return og5Var;
            case 3:
                String str2 = (String) obj4;
                bw4 bw4Var = (bw4) obj5;
                h02 h02Var4 = (h02) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    g75.y(str2, ue5.f0(g73Var, 4.0f, 16.0f), ((jj0) bw4Var.getValue()).g, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((mf5) h02Var4.a(of5.g)).t, h02Var4, 48, 24960, 110584);
                } else {
                    h02Var4.Q();
                }
                return og5Var;
            case 4:
                bg5 bg5Var = (bg5) obj4;
                b90 b90Var = (b90) obj5;
                h02 h02Var5 = (h02) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    String str3 = bg5Var.g;
                    boolean zJ = h02Var5.j(b90Var);
                    Object objK = h02Var5.K();
                    if (zJ || objK == l76Var) {
                        objK = new c80(b90Var, (byte) 5);
                        h02Var5.i0(objK);
                    }
                    ec6.g(str3, (xy1) objK, mq4.r(ue5.e0(g73Var, 4.0f), 1.0f), false, null, ny5.r, false, null, null, null, true, 0, 0, null, null, h02Var5, 1573248, 12582912, 8257464);
                } else {
                    h02Var5.Q();
                }
                return og5Var;
            case 5:
                ha2 ha2Var = (ha2) obj4;
                String str4 = (String) obj5;
                h02 h02Var6 = (h02) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    t92.g(ha2Var, null, mq4.j(ue5.i0(g73.g, 0.0f, 0.0f, 4.0f, 0.0f, 11), 20.0f), 0L, h02Var6, 432, 8);
                    g75.y(str4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var6, 0, 0, 262142);
                } else {
                    h02Var6.Q();
                }
                return og5Var;
            case 6:
                uk1 uk1Var = (uk1) obj4;
                bw4 bw4Var2 = (bw4) obj5;
                h02 h02Var7 = (h02) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var7.N(1 & iIntValue7, (iIntValue7 & 17) != 16)) {
                    int i = uk1Var.g;
                    ok1 ok1Var = (ok1) uk1Var;
                    String str5 = ok1Var.r;
                    String str6 = (String) bw4Var2.getValue();
                    if (str6 == null) {
                        str6 = "name";
                    }
                    g75.r(xs2.e(i, new Object[]{str5, str6}, h02Var7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((mf5) h02Var7.a(of5.g)).m, h02Var7, 0, 0, 262142);
                    Integer num = ok1Var.n;
                    if (num == null) {
                        h02Var7.X(1968215049);
                        h02Var7.b(false);
                    } else {
                        h02Var7.X(1968215050);
                        g75.y(xs2.I(num.intValue(), h02Var7), ue5.i0(g73.g, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, qv1.f, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var7, 1572912, 0, 262076);
                        h02Var7.b(false);
                    }
                } else {
                    h02Var7.Q();
                }
                return og5Var;
            case 7:
                xy1 xy1Var = (xy1) obj4;
                gu0 gu0Var = (gu0) obj5;
                h02 h02Var8 = (h02) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (h02Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    Object objK2 = h02Var8.K();
                    if (objK2 == l76Var) {
                        objK2 = new hu0();
                        h02Var8.i0(objK2);
                    }
                    hu0 hu0Var = (hu0) objK2;
                    hu0Var.g.clear();
                    xy1Var.a(hu0Var);
                    hu0Var.g(gu0Var, h02Var8, 0);
                } else {
                    h02Var8.Q();
                }
                return og5Var;
            case 8:
                String str7 = (String) obj4;
                my1 my1Var3 = (my1) obj5;
                de4 de4Var = (de4) obj;
                h02 h02Var9 = (h02) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                de4Var.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= h02Var9.n(de4Var.ordinal()) ? (byte) 4 : (byte) 2;
                }
                if (!h02Var9.N(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    h02Var9.Q();
                } else if (de4Var != de4.a) {
                    h02Var9.X(-1985317925);
                    gp4.t(xs2.I(R.string.connection_option_b, h02Var9), xs2.I(R.string.connection_new_device_title, h02Var9), xs2.I(R.string.connect_from_subtitle, h02Var9), 0L, ue5.m0(984758227, new th0(my1Var3, b3), h02Var9), h02Var9, 24576, 8);
                    h02Var9.b(false);
                } else {
                    h02Var9.X(-1984794335);
                    gp4.t(xs2.I(R.string.connection_option_b, h02Var9), xs2.I(R.string.connection_new_device_title, h02Var9), xs2.J(R.string.connection_new_device_message, new Object[]{str7}, h02Var9), 0L, a11.i, h02Var9, 24576, 8);
                    h02Var9.b(false);
                }
                return og5Var;
            case 9:
                g61 g61Var = (g61) obj4;
                my1 my1Var4 = (my1) obj5;
                h02 h02Var10 = (h02) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    g73 g73Var2 = g73.g;
                    j73 j73VarR = mq4.r(ue5.h0(g73Var2, 16.0f, 16.0f, 16.0f, 4.0f), 1.0f);
                    ek0 ek0VarG = ck0.g(v70.v, hi0.o, h02Var10, 54);
                    int iHashCode2 = Long.hashCode(h02Var10.T);
                    tr3 tr3VarQ2 = h02Var10.q();
                    j73 j73VarW2 = m50.W(h02Var10, j73VarR);
                    jo0.n.getClass();
                    h02Var10.b0();
                    if (h02Var10.S) {
                        h02Var10.m(sx1Var);
                    } else {
                        h02Var10.l0();
                    }
                    xs2.E(tg1.w, h02Var10, ek0VarG);
                    xs2.E(tg1.q, h02Var10, tr3VarQ2);
                    xs2.E(tg1.c, h02Var10, Integer.valueOf(iHashCode2));
                    xs2.D(h02Var10);
                    xs2.E(tg1.m, h02Var10, j73VarW2);
                    String strValueOf = String.valueOf(g61Var.j);
                    j73 j73VarI0 = ue5.i0(g73Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    vf1 vf1Var = of5.g;
                    g75.y(strValueOf, j73VarI0, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var10.a(vf1Var)).a, h02Var10, 48, 0, 131068);
                    g75.y(xi3.t("Address: ", g61Var.t), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var10.a(vf1Var)).m, h02Var10, 0, 0, 131070);
                    c93.s(my1Var4, null, false, null, null, null, a11.l, h02Var10, 805306368, 510);
                    h02Var10.b(true);
                } else {
                    h02Var10.Q();
                }
                return og5Var;
            case 10:
                zn3 zn3Var = (zn3) obj4;
                nm0 nm0Var2 = (nm0) obj5;
                ce4 ce4Var = (ce4) obj;
                h02 h02Var11 = (h02) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ce4Var.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= h02Var11.x(ce4Var) ? 4 : 2;
                }
                if (h02Var11.N(1 & iIntValue11, (iIntValue11 & 19) != 18)) {
                    j73 j73VarL = yf2.L(mq4.w(ue5.d0(g73Var, zn3Var), 640.0f), new h(ce4Var, (byte) 22));
                    ma4 ma4Var = hn4.x;
                    vf1 vf1Var2 = tj0.g;
                    long j = ((rj0) h02Var11.a(vf1Var2)).D;
                    long jY = tj0.y(j, h02Var11);
                    long j2 = jj0.j;
                    long jY2 = jj0.y(0.38f, jY);
                    sb0 sb0VarX = eb6.x((rj0) h02Var11.a(vf1Var2));
                    if (j == 16) {
                        j = sb0VarX.g;
                    }
                    long j3 = j;
                    if (jY == 16) {
                        jY = sb0VarX.y;
                    }
                    long j4 = jY;
                    if (j2 == 16) {
                        j2 = sb0VarX.r;
                    }
                    long j5 = j2;
                    if (jY2 == 16) {
                        jY2 = sb0VarX.n;
                    }
                    fb6.g(j73VarL, ma4Var, new sb0(j3, j4, j5, jY2), eb6.v(62), null, ue5.m0(729409046, new qh(nm0Var2, (byte) 2), h02Var11), h02Var11, 196608, 16);
                } else {
                    h02Var11.Q();
                }
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                String str8 = (String) obj4;
                xy1 xy1Var2 = (xy1) obj5;
                h02 h02Var12 = (h02) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var12.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    hm2[] hm2VarArr = (hm2[]) vp2.g.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (hm2 hm2Var : hm2VarArr) {
                        if (yf2.p(hm2Var.g, str8)) {
                            arrayList.add(hm2Var);
                        }
                    }
                    j73 j73VarI1 = ue5.i0(g73.g, 36.0f, 0.0f, 0.0f, 0.0f, 14);
                    ek0 ek0VarG2 = ck0.g(v70.n, hi0.h, h02Var12, 0);
                    int iHashCode3 = Long.hashCode(h02Var12.T);
                    tr3 tr3VarQ3 = h02Var12.q();
                    j73 j73VarW3 = m50.W(h02Var12, j73VarI1);
                    jo0.n.getClass();
                    h02Var12.b0();
                    if (h02Var12.S) {
                        h02Var12.m(sx1Var);
                    } else {
                        h02Var12.l0();
                    }
                    xs2.E(tg1.w, h02Var12, ek0VarG2);
                    xs2.E(tg1.q, h02Var12, tr3VarQ3);
                    xs2.E(tg1.c, h02Var12, Integer.valueOf(iHashCode3));
                    xs2.D(h02Var12);
                    xs2.E(tg1.m, h02Var12, j73VarW3);
                    h02Var12.X(-1585107729);
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj6 = arrayList.get(i2);
                        i2++;
                        hm2 hm2Var2 = (hm2) obj6;
                        boolean z = hm2Var2.n;
                        boolean zX = h02Var12.x(xy1Var2) | h02Var12.j(hm2Var2);
                        Object objK3 = h02Var12.K();
                        if (zX || objK3 == l76Var) {
                            objK3 = new o82(xy1Var2, hm2Var2, b2);
                            h02Var12.i0(objK3);
                        }
                        zx5.y(z, (my1) objK3, null, null, ue5.m0(1519254352, new ed(hm2Var2, (byte) 11), h02Var12), h02Var12, 24576, 12);
                    }
                    h02Var12.b(false);
                    h02Var12.b(true);
                } else {
                    h02Var12.Q();
                }
                return og5Var;
            case 12:
                r04 r04Var = (r04) obj4;
                xl2 xl2Var = (xl2) obj5;
                h02 h02Var13 = (h02) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var13.N(1 & iIntValue13, (iIntValue13 & 17) != 16)) {
                    boolean zJ2 = h02Var13.j(xl2Var);
                    Object objK4 = h02Var13.K();
                    if (zJ2 || objK4 == l76Var) {
                        objK4 = new ll2(xl2Var, (byte) 14);
                        h02Var13.i0(objK4);
                    }
                    cz5.r(r04Var, (xy1) objK4, h02Var13, 0);
                } else {
                    h02Var13.Q();
                }
                return og5Var;
            case 13:
                my1 my1Var5 = (my1) obj4;
                xy1 xy1Var3 = (xy1) obj5;
                h02 h02Var14 = (h02) obj2;
                ((Integer) obj3).getClass();
                h02Var14.X(759876635);
                Object objK5 = h02Var14.K();
                if (objK5 == l76Var) {
                    objK5 = pt4.y(my1Var5);
                    h02Var14.i0(objK5);
                }
                bw4 bw4Var3 = (bw4) objK5;
                Object objK6 = h02Var14.K();
                if (objK6 == l76Var) {
                    wi3 wi3Var = (wi3) bw4Var3.getValue();
                    long j6 = wi3Var.g;
                    objK6 = new qg(wi3Var, ti4.y, new wi3(ti4.r), 8);
                    h02Var14.i0(objK6);
                }
                qg qgVar = (qg) objK6;
                boolean zJ3 = h02Var14.j(qgVar);
                Object objK7 = h02Var14.K();
                if (zJ3 || objK7 == l76Var) {
                    objK7 = new u03(bw4Var3, qgVar, null, (byte) 5);
                    h02Var14.i0(objK7);
                }
                k33.b((bz1) objK7, h02Var14, og5Var);
                pi piVar = qgVar.r;
                boolean zX2 = h02Var14.x(piVar);
                Object objK8 = h02Var14.K();
                if (zX2 || objK8 == l76Var) {
                    objK8 = new zs(piVar, (byte) 3);
                    h02Var14.i0(objK8);
                }
                j73 j73Var = (j73) xy1Var3.a((my1) objK8);
                h02Var14.b(false);
                return j73Var;
            case 14:
                m55 m55Var = (m55) obj4;
                ja3 ja3Var = (ja3) obj5;
                h02 h02Var15 = (h02) obj2;
                ((Integer) obj3).getClass();
                h02Var15.X(-102778667);
                Object objK9 = h02Var15.K();
                if (objK9 == l76Var) {
                    objK9 = k33.E(h02Var15);
                    h02Var15.i0(objK9);
                }
                ox0 ox0Var = (ox0) objK9;
                Object objK10 = h02Var15.K();
                if (objK10 == l76Var) {
                    objK10 = kq2.M(null);
                    h02Var15.i0(objK10);
                }
                ob3 ob3Var2 = (ob3) objK10;
                ob3 ob3VarQ = kq2.Q(m55Var, h02Var15);
                boolean zX3 = h02Var15.x(ja3Var);
                Object objK11 = h02Var15.K();
                if (zX3 || objK11 == l76Var) {
                    objK11 = new kn2(ob3Var2, ja3Var, (byte) 21);
                    h02Var15.i0(objK11);
                }
                k33.j(ja3Var, (xy1) objK11, h02Var15);
                boolean zJ4 = h02Var15.j(ox0Var) | h02Var15.x(ja3Var) | h02Var15.x(ob3VarQ);
                Object objK12 = h02Var15.K();
                if (zJ4 || objK12 == l76Var) {
                    objK12 = new p55(ox0Var, ob3Var2, ja3Var, ob3VarQ);
                    h02Var15.i0(objK12);
                }
                j73 j73VarG = b05.g(g73Var, ja3Var, (PointerInputEventHandler) objK12);
                h02Var15.b(false);
                return j73VarG;
            case kq2.x /* 15 */:
                b30 b30Var = (b30) obj4;
                ob3 ob3Var3 = (ob3) obj5;
                h02 h02Var16 = (h02) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var16.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    Object objK13 = h02Var16.K();
                    if (objK13 == l76Var) {
                        objK13 = new za4(ob3Var3, (byte) 11);
                        h02Var16.i0(objK13);
                    }
                    my1 my1Var6 = (my1) objK13;
                    z14 z14VarL = gy3.l(b30Var);
                    int i3 = b30.l;
                    gy3.y(b30Var, my1Var6, z14VarL, "widget_config", h02Var16, 27704);
                } else {
                    h02Var16.Q();
                }
                return og5Var;
            default:
                Context context = (Context) obj4;
                Intent intent = (Intent) obj5;
                h02 h02Var17 = (h02) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((fk0) obj).getClass();
                if (h02Var17.N(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    String string = context.getString(R.string.widget_pro_locked);
                    string.getClass();
                    y94.t(string, jg6.g(intent), null, false, null, 0, h02Var17, 0, 124);
                } else {
                    h02Var17.Q();
                }
                return og5Var;
        }
    }

    public /* synthetic */ ev0(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }
}
