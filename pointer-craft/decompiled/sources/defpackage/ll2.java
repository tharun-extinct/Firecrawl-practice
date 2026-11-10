package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ll2 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ ll2(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        Object value;
        vl2 vl2Var;
        mt2 mt2Var;
        Map mapSingletonMap;
        le5 le5Var;
        byte b = this.j;
        boolean z = false;
        mu0 mu0Var = null;
        og5 og5Var = og5.g;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                xl2 xl2Var = ((tl2) obj2).o0;
                if (xl2Var != null) {
                    r04 r04Var = new r04();
                    o04 o04Var = new o04();
                    o04Var.m = i3Var.name();
                    o04Var.w = i3Var.t.ordinal();
                    n04 n04Var = new n04();
                    byte b2 = i3Var.j;
                    n04Var.t = (byte) 5;
                    n04Var.a = Integer.valueOf(b2);
                    o04Var.t = new n04[]{n04Var};
                    r04Var.t = (byte) 2;
                    r04Var.a = o04Var;
                    s04 s04Var = new s04();
                    s04Var.m = 2;
                    r04Var.q = s04Var;
                    xl2Var.v(r04Var);
                }
                return og5Var;
            case 1:
                return ((b23) obj2).y(((Integer) obj).intValue());
            case 2:
                o84 o84Var = (o84) obj;
                float fFloatValue = ((Number) ((qg) obj2).n()).floatValue();
                float fN = b73.n(o84Var, fFloatValue);
                float fV = b73.v(o84Var, fFloatValue);
                o84Var.t(fV == 0.0f ? 1.0f : fN / fV);
                o84Var.c(b73.g);
                return og5Var;
            case 3:
                p63 p63Var = (p63) obj2;
                p63Var.show();
                return new kb(p63Var, (byte) 8);
            case 4:
                ((ec3) obj2).x(null);
                return og5Var;
            case 5:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(!((Bundle) obj2).containsKey(str));
            case 6:
                sf3 sf3Var = (sf3) obj2;
                mc3 mc3Var = (mc3) obj;
                mc3Var.getClass();
                ad3 ad3Var = mc3Var.t;
                if (ad3Var == null) {
                    ad3Var = null;
                }
                if (ad3Var == null) {
                    return null;
                }
                mc3Var.g();
                ad3 ad3VarR = sf3Var.r(ad3Var);
                if (ad3VarR == null) {
                    return null;
                }
                return ad3VarR.equals(ad3Var) ? mc3Var : sf3Var.y().y(ad3VarR, ad3VarR.g(mc3Var.g()));
            case 7:
                return obj == ((xa3) obj2) ? "(this)" : String.valueOf(obj);
            case 8:
                return obj == ((ya3) obj2) ? "(this)" : String.valueOf(obj);
            case 9:
                float fFloatValue2 = ((Float) obj).floatValue();
                u21 u21Var = ((bp3) obj2).y;
                u21Var.s.e(u21Var.a(u21Var.m() + k33.Z(u21Var.i() != 0 ? fFloatValue2 / u21Var.i() : 0.0f)));
                return og5Var;
            case 10:
                jk4 jk4Var = (jk4) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return jk4Var.n(iIntValue) + ": " + jk4Var.x(iIntValue).g();
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                kw3 kw3Var = (kw3) obj2;
                o84 o84Var2 = (o84) obj;
                o84Var2.getClass();
                o84Var2.j(kw3Var.y.d());
                o84Var2.t(kw3Var.y.d());
                o84Var2.i(kw3Var.r.d());
                o84Var2.c(vb5.y);
                return og5Var;
            case 12:
                ((h44) obj2).g((ug1) obj);
                return og5Var;
            case 13:
                ao2 ao2Var = (ao2) obj2;
                InputStream inputStream = (InputStream) obj;
                inputStream.getClass();
                ao2Var.getClass();
                ji0 ji0VarD = v70.d(ao2Var);
                x21 x21Var = na1.g;
                m50.T(ji0VarD, c21.a, new s12(ao2Var, inputStream, mu0Var, (byte) 4), 2);
                return og5Var;
            case 14:
                ((r04) obj).getClass();
                ew4 ew4Var = ((xl2) obj2).v;
                do {
                    value = ew4Var.getValue();
                    vl2Var = (vl2) value;
                } while (!ew4Var.t(value, new vl2(vl2Var.g, vl2Var.y + 1)));
                return og5Var;
            case kq2.x /* 15 */:
                return obj == ((ib3) obj2) ? "(this)" : String.valueOf(obj);
            case 16:
                mf2 mf2Var = (mf2) obj2;
                qu3 qu3Var = (qu3) obj;
                long j = qu3Var.r;
                b65 b65Var = (b65) mf2Var.n;
                if (b65Var.t() && b65Var.q().g.t.length() != 0 && (mt2Var = b65Var.n) != null && mt2Var.n() != null) {
                    mf2Var.j(b65Var.q(), j, false, bi6.i);
                    z = true;
                }
                if (z) {
                    qu3Var.g();
                }
                return og5Var;
            case 17:
                ((dh2) obj2).x(null);
                return og5Var;
            case 18:
                zm4 zm4Var = (zm4) obj2;
                o84 o84Var3 = (o84) obj;
                o84Var3.a(o84Var3.A.y() * zm4Var.g);
                o84Var3.m(zm4Var.y);
                o84Var3.x(zm4Var.r);
                o84Var3.v(zm4Var.n);
                o84Var3.q(zm4Var.v);
                return og5Var;
            case 19:
                return Boolean.valueOf(yf2.p(((in1) obj).g, (wr4) obj2));
            case 20:
                obj.getClass();
                return Boolean.valueOf(((sw4) obj2).g.isInstance(obj));
            case 21:
                Drawable drawable = (Drawable) obj2;
                xd1 xd1Var = (xd1) obj;
                nb0 nb0VarB = xd1Var.E().b();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (xd1Var.n() >> 32)), (int) Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)));
                drawable.draw(d9.g(nb0VarB));
                return og5Var;
            case 22:
                ((xy1) obj).a((t35) obj2);
                return og5Var;
            case 23:
                ll2 ll2Var = (ll2) obj2;
                hd5 hd5Var = (hd5) obj;
                if (hd5Var instanceof q5) {
                    ll2Var.a(((q5) hd5Var).o);
                    return Boolean.TRUE;
                }
                l0.z("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 24:
                s55 s55Var = (s55) obj2;
                float fFloatValue3 = ((Float) obj).floatValue();
                pp3 pp3Var = s55Var.g;
                float fD = pp3Var.d() + fFloatValue3;
                pp3 pp3Var2 = s55Var.y;
                if (fD > pp3Var2.d()) {
                    fFloatValue3 = pp3Var2.d() - pp3Var.d();
                } else if (fD < 0.0f) {
                    fFloatValue3 = -pp3Var.d();
                }
                pp3Var.e(pp3Var.d() + fFloatValue3);
                return Float.valueOf(fFloatValue3);
            default:
                ne5 ne5Var = (ne5) obj2;
                tp3 tp3Var = ne5Var.n;
                jj jjVar = (jj) obj;
                jjVar.getClass();
                jt jtVar = ne5Var.y;
                tp3 tp3Var2 = ne5Var.r;
                me5 me5Var = (me5) tp3Var2.getValue();
                le5 le5Var2 = me5Var instanceof le5 ? (le5) me5Var : null;
                if (le5Var2 != null) {
                    Map map = (Map) tp3Var.getValue();
                    Integer numValueOf = Integer.valueOf(le5Var2.g());
                    map.getClass();
                    if (map.isEmpty()) {
                        mapSingletonMap = Collections.singletonMap(numValueOf, jjVar);
                        mapSingletonMap.getClass();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put(numValueOf, jjVar);
                        mapSingletonMap = linkedHashMap;
                    }
                    tp3Var.setValue(mapSingletonMap);
                    tp3Var2.setValue(le5Var2.n(jjVar));
                    if (((me5) tp3Var2.getValue()) instanceof ce5) {
                        ne5Var.v.setValue(Boolean.TRUE);
                        me5 me5Var2 = (me5) tp3Var2.getValue();
                        me5Var2.getClass();
                        ce5 ce5Var = (ce5) me5Var2;
                        StringBuilder sb = new StringBuilder();
                        for (Map.Entry entry : ((Map) tp3Var.getValue()).entrySet()) {
                            int iIntValue2 = ((Number) entry.getKey()).intValue();
                            jj jjVar2 = (jj) entry.getValue();
                            switch (iIntValue2) {
                                case 1:
                                    le5Var = fe5.g;
                                    break;
                                case 2:
                                    le5Var = ie5.g;
                                    break;
                                case 3:
                                    le5Var = de5.g;
                                    break;
                                case 4:
                                    le5Var = ke5.g;
                                    break;
                                case 5:
                                    le5Var = ge5.g;
                                    break;
                                case 6:
                                    le5Var = ee5.g;
                                    break;
                                case 7:
                                    le5Var = he5.g;
                                    break;
                                case 8:
                                    le5Var = je5.g;
                                    break;
                                default:
                                    le5Var = null;
                                    break;
                            }
                            if (le5Var != null) {
                                sb.append("Q: " + jtVar.a(Integer.valueOf(le5Var.r())));
                                sb.append('\n');
                                sb.append("A: " + jtVar.a(Integer.valueOf(jjVar2.g())));
                                sb.append("\n\n");
                            }
                        }
                        ne5Var.g.a(new be5(sb.toString(), (String) jtVar.a(Integer.valueOf(ce5Var.g()))));
                    }
                }
                return og5Var;
        }
    }

    public /* synthetic */ ll2(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
    }
}
