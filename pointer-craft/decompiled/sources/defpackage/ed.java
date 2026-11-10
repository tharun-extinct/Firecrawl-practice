package defpackage;

import android.bluetooth.BluetoothDevice;
import android.graphics.RectF;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ed implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ ed(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0281  */
    /* JADX WARN: Code duplicated, block: B:245:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ce A[Catch: all -> 0x01eb, LOOP:1: B:53:0x019a->B:63:0x01ce, LOOP_END, TryCatch #0 {, blocks: (B:50:0x0185, B:53:0x019a, B:55:0x01a9, B:57:0x01b5, B:59:0x01be, B:60:0x01c6, B:63:0x01ce, B:64:0x01d1, B:66:0x01d7, B:68:0x01dd), top: B:239:0x0185 }] */
    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        boolean zL;
        Object obj3;
        byte b = 2;
        z = false;
        boolean z = false;
        switch (this.j) {
            case 0:
                up upVar = (up) this.t;
                k44 k44VarX = oe6.x((RectF) obj);
                k44 k44VarX2 = oe6.x((RectF) obj2);
                switch (upVar.j) {
                    case 22:
                        zL = k44VarX.l(k44VarX2);
                        break;
                    default:
                        zL = k44VarX2.g(k44VarX.y());
                        break;
                }
                return Boolean.valueOf(zL);
            case 1:
                b90 b90Var = (b90) this.t;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                ArrayList arrayList = new ArrayList(b90Var.v().y);
                gx4 gx4Var = (gx4) arrayList.get(iIntValue);
                gx4Var.getClass();
                arrayList.set(iIntValue, gx4.g(gx4Var, null, null, iIntValue2, 3));
                b90Var.x(bg5.g(b90Var.v(), null, arrayList, 0, 5));
                return og5.g;
            case 2:
                ng0 ng0Var = (ng0) this.t;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                String str = (String) obj2;
                bluetoothDevice.getClass();
                str.getClass();
                ng0Var.n.g(bluetoothDevice, str);
                return og5.g;
            case 3:
                wr4 wr4Var = (wr4) this.t;
                h02 h02Var = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (h02Var.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g75.y(((bs4) wr4Var).g.g, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(of5.g)).m, h02Var, 0, 0, 131070);
                } else {
                    h02Var.Q();
                }
                return og5.g;
            case 4:
                ((Integer) obj2).getClass();
                vd6.n((b65) this.t, (h02) obj, aq2.J(1));
                return og5.g;
            case 5:
                c45 c45Var = (c45) this.t;
                h02 h02Var2 = (h02) obj;
                ((Integer) obj2).getClass();
                h02Var2.X(666084174);
                String str2 = c45Var.y;
                h02Var2.b(false);
                return str2;
            case 6:
                v81 v81Var = (v81) this.t;
                h02 h02Var3 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (h02Var3.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    y94.y(v81Var, null, null, null, null, null, og0.m, h02Var3, 1572872, 62);
                } else {
                    h02Var3.Q();
                }
                return og5.g;
            case 7:
                ((Integer) obj2).getClass();
                ((l91) this.t).g(aq2.J(1), (h02) obj);
                return og5.g;
            case 8:
                ce4 ce4Var = (ce4) this.t;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ce4Var.g.e(fFloatValue);
                return og5.g;
            case 9:
                h02 h02Var4 = (h02) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (h02Var4.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    throw null;
                }
                h02Var4.Q();
                return og5.g;
            case 10:
                vi2 vi2Var = (vi2) this.t;
                h02 h02Var5 = (h02) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (h02Var5.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objK = h02Var5.K();
                    l76 l76Var = oo0.g;
                    if (objK == l76Var) {
                        obj3 = objK;
                        ox0 ox0VarE = k33.E(h02Var5);
                        h02Var5.i0(ox0VarE);
                        obj3 = ox0VarE;
                    }
                    obj3 = objK;
                    ox0 ox0Var = (ox0) obj3;
                    ob3 ob3VarJ = v13.j(vi2Var.W().l, h02Var5);
                    boolean zJ = h02Var5.j(vi2Var);
                    Object objK2 = h02Var5.K();
                    Object obj4 = objK2;
                    if (zJ || objK2 == l76Var) {
                        h hVar = new h((Object) vi2Var, (byte) 27);
                        h02Var5.i0(hVar);
                        obj4 = hVar;
                    }
                    xy1 xy1Var = (xy1) obj4;
                    xy1Var.getClass();
                    Object objK3 = h02Var5.K();
                    Object obj5 = objK3;
                    if (objK3 == l76Var) {
                        ox0 ox0VarE2 = k33.E(h02Var5);
                        h02Var5.i0(ox0VarE2);
                        obj5 = ox0VarE2;
                    }
                    ox0 ox0Var2 = (ox0) obj5;
                    Object objK4 = h02Var5.K();
                    Object obj6 = objK4;
                    if (objK4 == l76Var) {
                        ol1 ol1Var = new ol1(ox0Var2, xy1Var);
                        h02Var5.i0(ol1Var);
                        obj6 = ol1Var;
                    }
                    ol1 ol1Var2 = (ol1) obj6;
                    g61 g61Var = (g61) v13.j(vi2Var.T().m, h02Var5).getValue();
                    if (g61Var != null && g61Var.l()) {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    boolean zL2 = h02Var5.l(z) | h02Var5.j(ol1Var2);
                    Object objK5 = h02Var5.K();
                    Object obj7 = objK5;
                    if (zL2 || objK5 == l76Var) {
                        dy dyVar = new dy(z, ol1Var2, (mu0) null);
                        h02Var5.i0(dyVar);
                        obj7 = dyVar;
                    }
                    k33.b((bz1) obj7, h02Var5, boolValueOf);
                    xq2.g(ue5.m0(1817275190, new vb0(ob3VarJ, ol1Var2, vi2Var, ox0Var, vi2Var.T().s, (byte) 1), h02Var5), h02Var5, 6);
                } else {
                    h02Var5.Q();
                }
                return og5.g;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                hm2 hm2Var = (hm2) this.t;
                h02 h02Var6 = (h02) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (h02Var6.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    g75.y(hm2Var.y, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var6, 0, 0, 262142);
                } else {
                    h02Var6.Q();
                }
                return og5.g;
            case 12:
                sk2 sk2Var = (sk2) this.t;
                h02 h02Var7 = (h02) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (h02Var7.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    g75.y(xs2.J(R.string.control_overview_delete_title, new Object[]{du4.i("\"", nc6.q(sk2Var, h02Var7), "\"")}, h02Var7), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var7, 0, 0, 262142);
                } else {
                    h02Var7.Q();
                }
                return og5.g;
            case 13:
                qp3 qp3Var = (qp3) this.t;
                h02 h02Var8 = (h02) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (h02Var8.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    h02Var8.X(1991066200);
                    oe3.g(null, 0L, 0L, new op1(0), ue5.m0(-585740004, new tn((Object) qp3Var, (byte) 10), h02Var8), h02Var8, 196608);
                    h02Var8.b(false);
                } else {
                    h02Var8.Q();
                }
                return og5.g;
            case 14:
                es4 es4Var = (es4) this.t;
                h02 h02Var9 = (h02) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (h02Var9.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    jr2.v(es4Var, null, mz5.v, h02Var9, 390, 2);
                } else {
                    h02Var9.Q();
                }
                return og5.g;
            case kq2.x /* 15 */:
                Locale locale = (Locale) this.t;
                h02 h02Var10 = (h02) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (h02Var10.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String displayLanguage = locale != null ? locale.getDisplayLanguage() : null;
                    if (displayLanguage == null) {
                        h02Var10.X(-848570754);
                        displayLanguage = xs2.I(R.string.share_dialog_only_symbols, h02Var10);
                    } else {
                        h02Var10.X(-848571870);
                    }
                    h02Var10.b(false);
                    g75.y(displayLanguage, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var10, 0, 0, 262142);
                } else {
                    h02Var10.Q();
                }
                return og5.g;
            case 16:
                ((r45) this.t).v(((wi3) obj2).g);
                return og5.g;
            case 17:
                ((Integer) obj2).getClass();
                rz5.n((ol1) this.t, (h02) obj, aq2.J(9));
                return og5.g;
            case 18:
                ((Integer) obj2).getClass();
                ((l63) this.t).g(aq2.J(1), (h02) obj);
                return og5.g;
            case 19:
                yo4 yo4Var = yo4.a;
                yo4 yo4Var2 = yo4.t;
                xo4 xo4Var = (xo4) this.t;
                qe2 qe2Var = (qe2) obj;
                float fJ = ws0.j(((ws0) obj2).g);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                yo4 yo4Var3 = yo4.j;
                linkedHashMap.put(yo4Var3, Float.valueOf(fJ));
                float f = fJ / 2.0f;
                if (((int) (qe2Var.g & 4294967295L)) > f && !xo4Var.g) {
                    linkedHashMap.put(yo4Var, Float.valueOf(f));
                }
                int i = (int) (qe2Var.g & 4294967295L);
                if (i != 0) {
                    linkedHashMap.put(yo4Var2, Float.valueOf(Math.max(0.0f, fJ - i)));
                }
                i13 i13Var = new i13(linkedHashMap);
                int iOrdinal = ((yo4) ((z51) xo4Var.n.a).getValue()).ordinal();
                if (iOrdinal == 0) {
                    yo4Var2 = yo4Var3;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        up.y();
                        return null;
                    }
                    if (!linkedHashMap.containsKey(yo4Var)) {
                        yo4Var = linkedHashMap.containsKey(yo4Var2) ? yo4Var2 : yo4Var3;
                    }
                    yo4Var2 = yo4Var;
                } else if (!linkedHashMap.containsKey(yo4Var2)) {
                    yo4Var2 = yo4Var3;
                }
                return new fp3(i13Var, yo4Var2);
            case 20:
                n93 n93Var = (n93) this.t;
                Set set = (Set) obj;
                u54 u54Var = new u54();
                synchronized (n93Var.g) {
                    hb3 hb3Var = n93Var.y;
                    q2 q2Var = new q2((Object) set, (Object) n93Var, (Object) u54Var, (byte) 18);
                    ue5.f(1, q2Var);
                    Object[] objArr = hb3Var.y;
                    long[] jArr = hb3Var.g;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        q2Var.a(objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i3 == 8) {
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            } else if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    List list = (List) u54Var.j;
                    if (list != null) {
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            ((wj4) list.get(i5)).z(og5.g);
                        }
                    }
                }
                return og5.g;
            case 21:
                te1 te1Var = (te1) this.t;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                te1Var.y.e(fFloatValue2);
                return og5.g;
            case 22:
                ((Integer) obj2).getClass();
                ((sv3) this.t).g(aq2.J(1), (h02) obj);
                return og5.g;
            case 23:
                ((Integer) obj2).getClass();
                ge6.g((b91) this.t, (h02) obj, aq2.J(1));
                return og5.g;
            case 24:
                ((Integer) obj2).getClass();
                ge6.r((z81) this.t, (h02) obj, aq2.J(1));
                return og5.g;
            case 25:
                jd3 jd3Var = (jd3) this.t;
                int[] iArr = (int[]) obj;
                ((Boolean) obj2).getClass();
                iArr.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "");
                int i6 = 0;
                for (int i7 : iArr) {
                    i6++;
                    if (i6 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    sb.append((CharSequence) String.valueOf(i7));
                }
                sb.append((CharSequence) "");
                jd3.v(jd3Var, "buttonedit?index=".concat(sb.toString()));
                return og5.g;
            case 26:
                ((Integer) obj2).getClass();
                ((th4) this.t).g(aq2.J(7), (h02) obj);
                return og5.g;
            case 27:
                t54 t54Var = (t54) this.t;
                ((qu3) obj).g();
                t54Var.j = ((wi3) obj2).g;
                return og5.g;
            case 28:
                Float f2 = (Float) this.t;
                h02 h02Var11 = (h02) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (h02Var11.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zX = h02Var11.x(f2);
                    Object objK6 = h02Var11.K();
                    if (zX || objK6 == oo0.g) {
                        objK6 = new m63(f2, b);
                        h02Var11.i0(objK6);
                    }
                    b04.r((my1) objK6, ue5.i0(mq4.r(g73.g, 1.0f), 0.0f, 8.0f, 16.0f, 16.0f, 1), 0L, 0L, 0, 0.0f, null, h02Var11, 0, 124);
                } else {
                    h02Var11.Q();
                }
                return og5.g;
            default:
                gm3 gm3Var = (gm3) this.t;
                h02 h02Var12 = (h02) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (h02Var12.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    yf6.v(gm3Var, h02Var12, 0);
                } else {
                    h02Var12.Q();
                }
                return og5.g;
        }
    }

    public /* synthetic */ ed(Object obj, int i, byte b) {
        this.j = b;
        this.t = obj;
    }
}
