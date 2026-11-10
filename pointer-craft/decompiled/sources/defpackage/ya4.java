package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ya4 implements cz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ ya4(pl5 pl5Var, Object obj, jd3 jd3Var, byte b) {
        this.j = b;
        this.t = pl5Var;
        this.m = obj;
        this.a = jd3Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        byte b = this.j;
        g73 g73Var = g73.g;
        byte b2 = 2;
        l76 l76Var = oo0.g;
        og5 og5Var = og5.g;
        Object obj4 = this.m;
        Object obj5 = this.a;
        Object obj6 = this.t;
        switch (b) {
            case 0:
                xl2 xl2Var = (xl2) obj6;
                jd3 jd3Var = (jd3) obj5;
                qp3 qp3Var = (qp3) obj4;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ho1 ho1Var = mq4.r;
                    boolean zJ = h02Var.j(xl2Var) | h02Var.j(jd3Var);
                    Object objK = h02Var.K();
                    if (zJ || objK == l76Var) {
                        objK = new q2(xl2Var, jd3Var, qp3Var, (byte) 20);
                        h02Var.i0(objK);
                    }
                    qx1 qx1VarI = pw5.I(h02Var);
                    Bundle bundle = Bundle.EMPTY;
                    c93.g(tl2.class, ho1Var, qx1VarI, (wt2) v13.a(((gu2) h02Var.a(ix2.g)).a(), h02Var).getValue(), (xy1) objK, h02Var, 48);
                } else {
                    h02Var.Q();
                }
                break;
            case 1:
                List list = (List) obj6;
                st4 st4Var = (st4) obj5;
                xy1 xy1Var = (xy1) obj4;
                zn3 zn3Var = (zn3) obj;
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                zn3Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= h02Var2.x(zn3Var) ? 4 : 2;
                }
                if (h02Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ho1 ho1Var2 = mq4.r;
                    j73 j73VarD0 = ue5.d0(ho1Var2, zn3Var);
                    t33 t33VarR = z50.r(hi0.t, false);
                    int iHashCode = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ = h02Var2.q();
                    j73 j73VarW = m50.W(h02Var2, j73VarD0);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(um2.Z);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, t33VarR);
                    xs2.E(tg1.q, h02Var2, tr3VarQ);
                    xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
                    xs2.D(h02Var2);
                    xs2.E(tg1.m, h02Var2, j73VarW);
                    boolean zJ2 = h02Var2.j(list) | h02Var2.x(st4Var);
                    Object objK2 = h02Var2.K();
                    if (zJ2 || objK2 == l76Var) {
                        objK2 = new kn2(list, st4Var, (byte) 27);
                        h02Var2.i0(objK2);
                    }
                    aq2.g(ho1Var2, null, null, null, null, null, false, null, (xy1) objK2, h02Var2, 6, 510);
                    if (st4Var == null || !st4Var.isEmpty()) {
                        ListIterator listIterator = st4Var.listIterator();
                        while (true) {
                            tv2 tv2Var = (tv2) listIterator;
                            if (!tv2Var.hasNext()) {
                                z = false;
                            } else if (((Boolean) tv2Var.next()).booleanValue()) {
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    j73 j73VarE0 = ue5.e0(e60.g.g(g73Var, hi0.b), 16.0f);
                    boolean zX = h02Var2.x(xy1Var) | h02Var2.j(list) | h02Var2.x(st4Var);
                    Object objK3 = h02Var2.K();
                    if (zX || objK3 == l76Var) {
                        objK3 = new lt(xy1Var, list, st4Var, (byte) 16);
                        h02Var2.i0(objK3);
                    }
                    c93.x((my1) objK3, j73VarE0, z, null, null, null, null, null, d06.t, h02Var2, 805306368, 504);
                    h02Var2.b(true);
                } else {
                    h02Var2.Q();
                }
                break;
            case 2:
                b90 b90Var = (b90) obj6;
                g90 g90Var = (g90) obj5;
                bw4 bw4Var = (bw4) obj4;
                h02 h02Var3 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    j73 j73VarN = mq4.n(mq4.q(g73Var, 1.0f), 48.0f);
                    float f = fb1.g;
                    z50.g(og0.a(j73VarN, tj0.v(v70.a, h02Var3), yf2.b), h02Var3, 0);
                    g61 g61Var = (g61) bw4Var.getValue();
                    if (g61Var == null || (str = g61Var.j) == null) {
                        str = "???";
                    }
                    rz5.a(b90Var, g90Var, str, h02Var3, 8);
                } else {
                    h02Var3.Q();
                }
                break;
            case 3:
                bg5 bg5Var = (bg5) obj6;
                xy1 xy1Var2 = (xy1) obj5;
                ox0 ox0Var = (ox0) obj4;
                h02 h02Var4 = (h02) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((bq2) obj).getClass();
                if (h02Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean z2 = bg5Var.y.size() > 1;
                    boolean zX2 = h02Var4.x(xy1Var2) | h02Var4.j(bg5Var);
                    Object objK4 = h02Var4.K();
                    if (zX2 || objK4 == l76Var) {
                        objK4 = new p2(xy1Var2, bg5Var, (byte) 14);
                        h02Var4.i0(objK4);
                    }
                    rz5.g(z2, (my1) objK4, ox0Var, h02Var4, 0);
                } else {
                    h02Var4.Q();
                }
                break;
            case 4:
                xy1 xy1Var3 = (xy1) obj6;
                DecimalFormat decimalFormat = (DecimalFormat) obj5;
                ob3 ob3Var = (ob3) obj4;
                h02 h02Var5 = (h02) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    h02Var5.X(405981984);
                    Integer[] numArr = {3000, 2000, 1000, 500};
                    for (int i = 0; i < 4; i++) {
                        int iIntValue6 = numArr[i].intValue();
                        nm0 nm0VarM0 = ue5.m0(1182254859, new u80(decimalFormat, iIntValue6), h02Var5);
                        boolean zX3 = h02Var5.x(xy1Var3) | h02Var5.n(iIntValue6);
                        Object objK5 = h02Var5.K();
                        if (zX3 || objK5 == l76Var) {
                            objK5 = new t80(xy1Var3, iIntValue6, ob3Var, (byte) 1);
                            h02Var5.i0(objK5);
                        }
                        ad.y(nm0VarM0, (my1) objK5, null, ny5.c, null, false, null, null, h02Var5, 3078, 500);
                    }
                    h02Var5.b(false);
                    boolean zX4 = h02Var5.x(xy1Var3);
                    Object objK6 = h02Var5.K();
                    if (zX4 || objK6 == l76Var) {
                        objK6 = new y80((byte) 0, xy1Var3, ob3Var);
                        h02Var5.i0(objK6);
                    }
                    ad.y(ny5.i, (my1) objK6, null, null, null, false, null, null, h02Var5, 6, 508);
                } else {
                    h02Var5.Q();
                }
                break;
            case 5:
                my1 my1Var = (my1) obj6;
                xy1 xy1Var4 = (xy1) obj5;
                ob3 ob3Var2 = (ob3) obj4;
                h02 h02Var6 = (h02) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var6.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    boolean zX5 = h02Var6.x(my1Var);
                    Object objK7 = h02Var6.K();
                    if (zX5 || objK7 == l76Var) {
                        objK7 = new bm0(my1Var, ob3Var2, (byte) 0);
                        h02Var6.i0(objK7);
                    }
                    ad.y(wy5.g, (my1) objK7, null, wy5.y, null, false, null, null, h02Var6, 3078, 500);
                    boolean zX6 = h02Var6.x(xy1Var4);
                    Object objK8 = h02Var6.K();
                    if (zX6 || objK8 == l76Var) {
                        objK8 = new y80((byte) 3, xy1Var4, ob3Var2);
                        h02Var6.i0(objK8);
                    }
                    ad.y(wy5.r, (my1) objK8, null, wy5.n, null, false, null, null, h02Var6, 3078, 500);
                    boolean zX7 = h02Var6.x(xy1Var4);
                    Object objK9 = h02Var6.K();
                    if (zX7 || objK9 == l76Var) {
                        objK9 = new y80((byte) 1, xy1Var4, ob3Var2);
                        h02Var6.i0(objK9);
                    }
                    ad.y(wy5.v, (my1) objK9, null, wy5.x, null, false, null, null, h02Var6, 3078, 500);
                    boolean zX8 = h02Var6.x(xy1Var4);
                    Object objK10 = h02Var6.K();
                    if (zX8 || objK10 == l76Var) {
                        objK10 = new y80((byte) 2, xy1Var4, ob3Var2);
                        h02Var6.i0(objK10);
                    }
                    ad.y(wy5.l, (my1) objK10, null, wy5.j, null, false, null, null, h02Var6, 3078, 500);
                } else {
                    h02Var6.Q();
                }
                break;
            case 6:
                ao2 ao2Var = (ao2) obj6;
                Context context = (Context) obj4;
                jd3 jd3Var2 = (jd3) obj5;
                h02 h02Var7 = (h02) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var7.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    boolean zJ3 = h02Var7.j(context);
                    Object objK11 = h02Var7.K();
                    if (zJ3 || objK11 == l76Var) {
                        objK11 = new jt(context, (byte) 2);
                        h02Var7.i0(objK11);
                    }
                    xy1 xy1Var5 = (xy1) objK11;
                    boolean zJ4 = h02Var7.j(jd3Var2);
                    Object objK12 = h02Var7.K();
                    if (zJ4 || objK12 == l76Var) {
                        objK12 = new xa4(jd3Var2, (byte) 1);
                        h02Var7.i0(objK12);
                    }
                    xy1 xy1VarS = kq2.S((xy1) objK12, h02Var7);
                    boolean zJ5 = h02Var7.j(jd3Var2);
                    Object objK13 = h02Var7.K();
                    if (zJ5 || objK13 == l76Var) {
                        objK13 = new xa4(jd3Var2, (byte) 2);
                        h02Var7.i0(objK13);
                    }
                    xy1 xy1VarS2 = kq2.S((xy1) objK13, h02Var7);
                    boolean zJ6 = h02Var7.j(jd3Var2);
                    Object objK14 = h02Var7.K();
                    if (zJ6 || objK14 == l76Var) {
                        objK14 = new xa4(jd3Var2, (byte) 3);
                        h02Var7.i0(objK14);
                    }
                    nc6.x(ao2Var, xy1Var5, xy1VarS, xy1VarS2, kq2.S((xy1) objK14, h02Var7), h02Var7, 8);
                } else {
                    h02Var7.Q();
                }
                break;
            case 7:
                b90 b90Var2 = (b90) obj6;
                qr0 qr0Var = (qr0) obj5;
                cb4 cb4Var = (cb4) obj4;
                h02 h02Var8 = (h02) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var8.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    rz5.y(b90Var2, qr0Var, cb4Var, h02Var8, 582);
                } else {
                    h02Var8.Q();
                }
                break;
            case 8:
                qr0 qr0Var2 = (qr0) obj6;
                String str2 = (String) obj4;
                jd3 jd3Var3 = (jd3) obj5;
                h02 h02Var9 = (h02) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var9.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    boolean zJ7 = h02Var9.j(jd3Var3);
                    Object objK15 = h02Var9.K();
                    if (zJ7 || objK15 == l76Var) {
                        objK15 = new wa4(jd3Var3, (byte) 4);
                        h02Var9.i0(objK15);
                    }
                    ot.x(qr0Var2, str2, (my1) objK15, h02Var9, 8);
                } else {
                    h02Var9.Q();
                }
                break;
            case 9:
                ja3 ja3Var = (ja3) obj6;
                ob3 ob3Var3 = (ob3) obj5;
                ob3 ob3Var4 = (ob3) obj4;
                h02 h02Var10 = (h02) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((kr4) obj).getClass();
                if (h02Var10.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    hy5.y(ue5.m0(517046271, new ln5(ob3Var4, b2), h02Var10), null, ja3Var, ((Boolean) ob3Var3.getValue()).booleanValue(), ue5.m0(-1100485190, new zl4(ja3Var, (byte) 5), h02Var10), h02Var10, 24966);
                } else {
                    h02Var10.Q();
                }
                break;
            default:
                xy1 xy1Var6 = (xy1) obj6;
                my1 my1Var2 = (my1) obj5;
                xy1 xy1Var7 = (xy1) obj4;
                xl4 xl4Var = (xl4) obj;
                h02 h02Var11 = (h02) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                xl4Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= h02Var11.n(xl4Var.ordinal()) ? (byte) 4 : (byte) 2;
                }
                if (h02Var11.N(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    boolean zX9 = h02Var11.x(xy1Var6) | ((iIntValue12 & 14) == 4) | h02Var11.x(my1Var2) | h02Var11.x(xy1Var7);
                    Object objK16 = h02Var11.K();
                    if (zX9 || objK16 == l76Var) {
                        objK16 = new mg(xy1Var6, xl4Var, my1Var2, xy1Var7);
                        h02Var11.i0(objK16);
                    }
                    aq2.g(null, null, null, null, null, null, false, null, (xy1) objK16, h02Var11, 0, 511);
                } else {
                    h02Var11.Q();
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ ya4(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }
}
