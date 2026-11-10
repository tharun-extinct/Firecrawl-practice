package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn3 implements xy1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ rn3(byte b) {
        this.j = b;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        jj0 jj0Var;
        byte b = this.j;
        r40 r40Var = de3.y;
        r40 r40Var2 = de3.a;
        ju4 ju4Var = null;
        ju4Var = null;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                um2 um2Var = (um2) obj;
                if (um2Var.J()) {
                    um2Var.U(false);
                }
                return og5Var;
            case 1:
                um2 um2Var2 = (um2) obj;
                if (um2Var2.J()) {
                    um2Var2.U(false);
                }
                return og5Var;
            case 2:
                obj.getClass();
                return Boolean.valueOf(!((qn3) obj).A());
            case 3:
                return og5Var;
            case 4:
                return og5Var;
            case 5:
                bk2 bk2Var = (bk2) obj;
                bk2Var.g = (short) 6000;
                Float fValueOf = Float.valueOf(90.0f);
                bk2Var.g(fValueOf, 300).y = i83.y;
                bk2Var.g(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                bk2Var.g(fValueOf2, 1800);
                bk2Var.g(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                bk2Var.g(fValueOf3, 3300);
                bk2Var.g(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                bk2Var.g(fValueOf4, 4800);
                bk2Var.g(fValueOf4, 6000);
                return og5Var;
            case 6:
                lj4.j((nj4) obj, rz3.r);
                return og5Var;
            case 7:
                return false;
            case 8:
                return og5Var;
            case 9:
                kc3 kc3Var = (kc3) obj;
                kc3Var.getClass();
                ic3 ic3Var = kc3Var.g;
                ic3Var.r = r40Var2;
                ic3Var.g = true;
                ic3Var.n = null;
                ic3Var.y = true;
                return og5Var;
            case 10:
                kc3 kc3Var2 = (kc3) obj;
                kc3Var2.getClass();
                ic3 ic3Var2 = kc3Var2.g;
                ic3Var2.r = r40Var2;
                ic3Var2.g = true;
                ic3Var2.n = null;
                ic3Var2.y = true;
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                kc3 kc3Var3 = (kc3) obj;
                kc3Var3.getClass();
                ic3 ic3Var3 = kc3Var3.g;
                ic3Var3.r = r40Var;
                ic3Var3.n = -1;
                ic3Var3.y = true;
                return og5Var;
            case 12:
                ((ih) obj).getClass();
                return yj1.v(m50.e0(300, 0, null, 6), 2);
            case 13:
                ((ih) obj).getClass();
                return yj1.x(m50.e0(300, 0, null, 6), 2);
            case 14:
                kc3 kc3Var4 = (kc3) obj;
                kc3Var4.getClass();
                kc3Var4.g.r = m50.a;
                return og5Var;
            case kq2.x /* 15 */:
                kc3 kc3Var5 = (kc3) obj;
                kc3Var5.getClass();
                ic3 ic3Var4 = kc3Var5.g;
                ic3Var4.r = r40Var2;
                ic3Var4.g = true;
                ic3Var4.n = null;
                ic3Var4.y = true;
                return og5Var;
            case 16:
                kc3 kc3Var6 = (kc3) obj;
                kc3Var6.getClass();
                ic3 ic3Var5 = kc3Var6.g;
                ic3Var5.r = r40Var2;
                ic3Var5.g = false;
                return og5Var;
            case 17:
                kc3 kc3Var7 = (kc3) obj;
                kc3Var7.getClass();
                ic3 ic3Var6 = kc3Var7.g;
                ic3Var6.r = r40Var;
                ic3Var6.n = 0;
                ic3Var6.y = true;
                return og5Var;
            case 18:
                return new sc4((Map) obj);
            case 19:
                return obj;
            case 20:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                xy1 xy1Var = (xy1) qd4.j.a;
                Boolean bool = Boolean.FALSE;
                ju4 ju4Var2 = (yf2.p(obj2, bool) || obj2 == null) ? null : (ju4) xy1Var.a(obj2);
                Object obj3 = list.get(1);
                ju4 ju4Var3 = (yf2.p(obj3, bool) || obj3 == null) ? null : (ju4) xy1Var.a(obj3);
                Object obj4 = list.get(2);
                ju4 ju4Var4 = (yf2.p(obj4, bool) || obj4 == null) ? null : (ju4) xy1Var.a(obj4);
                Object obj5 = list.get(3);
                if (!yf2.p(obj5, bool) && obj5 != null) {
                    ju4Var = (ju4) xy1Var.a(obj5);
                }
                return new p75(ju4Var2, ju4Var3, ju4Var4, ju4Var);
            case 21:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (yf2.p(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((xy1) qd4.g.a).a(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new cj(list3, str);
            case 22:
                obj.getClass();
                return new l45(((Integer) obj).intValue());
            case 23:
                obj.getClass();
                List list4 = (List) obj;
                return new n65(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 24:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                o85[] o85VarArr = n85.y;
                xy1 xy1Var2 = qd4.o.t;
                Boolean bool2 = Boolean.FALSE;
                yf2.p(obj8, bool2);
                n85 n85Var = obj8 != null ? (n85) xy1Var2.a(obj8) : null;
                n85Var.getClass();
                long j = n85Var.g;
                Object obj9 = list5.get(1);
                yf2.p(obj9, bool2);
                n85 n85Var2 = obj9 != null ? (n85) xy1Var2.a(obj9) : null;
                n85Var2.getClass();
                return new o65(j, n85Var2.g);
            case 25:
                obj.getClass();
                return new qv1(((Integer) obj).intValue());
            case 26:
                obj.getClass();
                return new ry(((Float) obj).floatValue());
            case 27:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new u75(sp2.y(iIntValue, num2.intValue()));
            case 28:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i = jj0.t;
                Boolean bool3 = Boolean.FALSE;
                yf2.p(obj12, bool3);
                if (obj12 != null) {
                    jj0Var = yf2.p(obj12, Boolean.FALSE) ? new jj0(jj0.j) : new jj0(ra.n(((Integer) obj12).intValue()));
                } else {
                    jj0Var = null;
                }
                jj0Var.getClass();
                long j2 = jj0Var.g;
                Object obj13 = list7.get(1);
                pd4 pd4Var = qd4.k;
                yf2.p(obj13, bool3);
                wi3 wi3Var = obj13 != null ? (wi3) pd4Var.t.a(obj13) : null;
                wi3Var.getClass();
                long j3 = wi3Var.g;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new ym4(j2, j3, f.floatValue());
            default:
                obj.getClass();
                return new g35(((Integer) obj).intValue());
        }
    }
}
